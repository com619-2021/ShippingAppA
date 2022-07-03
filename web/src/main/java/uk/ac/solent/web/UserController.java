package uk.ac.solent.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import uk.ac.solent.validator.UserValidator;
import uk.ac.solent.service.user.UserService;
import uk.ac.solent.model.user.UserDto;
import uk.ac.solent.model.user.UserRoles;
import org.springframework.validation.BindingResult;
import uk.ac.solent.service.user.SecurityService;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;

@Controller
@Transactional
public class UserController {

   final static Logger LOG = LogManager.getLogger(UserController.class);

    {
        LOG.debug("UserController created");
    }

   @Autowired
   private UserService userService;


   @Autowired
   private SecurityService securityService;

   @Autowired
   private UserValidator userValidator;


//   public UserController(UserService userService, UserValidator userValidator) {
//       this.userService = userService;
//       this.userValidator = userValidator;
//   }

   @RequestMapping(value = "/registration", method = RequestMethod.GET)
   public String registration(Model model) {
       model.addAttribute("userForm", new UserDto());
       return "registration";
   }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") UserDto userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.create(userForm);

        // if not logged in then log in as new party
        // if logged in, stay as present party (e.g. global admin)
//        if (!hasRole(UserRoles.ROLE_USER.name())) {
            LOG.debug("creating new user and logging in : " + userForm);
            securityService.autologin(userForm.getUsername(), userForm.getPassword());
//        } else {
            LOG.debug("creating new user : " + userForm);
//        }

        return "redirect:/viewModifyUser?username=" + userForm.getUsername();
    }

   @RequestMapping(value = "/denied", method = {RequestMethod.GET, RequestMethod.POST})
   public String denied(Model model) {
       return "denied";
   }

   @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
   public String login(Model model, String error, String logout) {
       if (error != null) model.addAttribute("error", "Your username and password is invalid.");
       if (logout != null) model.addAttribute("message", "You have been logged out successfully.");
       return "login";
   }

   // this redirects calls to the root of our application to index.html
   @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
   public String index(Model model) {
       return "redirect:/index.html";
   }

   @RequestMapping(value = {"/home"}, method = {RequestMethod.GET, RequestMethod.POST})
   public String home(Model model) {
       return "home";
   }

   @RequestMapping(value = {"/about"}, method = RequestMethod.GET)
   public String about(Model model) {
       return "about";
   }

   @RequestMapping(value = {"/contact"}, method = RequestMethod.GET)
   public String contact(Model model) {
       return "contact";
   }

   @RequestMapping(value = {"/users"}, method = RequestMethod.GET)
   public String users(Model model) {
       List<UserDto> userList = userService.findAll();

       LOG.debug("users called:");

       userList.forEach(x -> LOG.debug(" user:" + x));

       model.addAttribute("userListSize", userList.size());
       model.addAttribute("userList", userList);

       return "users";
   }


   private boolean hasRole(String role) {
       Collection<GrantedAuthority> authorities
               = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
       boolean hasRole = false;
       for (GrantedAuthority authority : authorities) {
           hasRole = authority.getAuthority().equals(role);
           if (hasRole) {
               break;
           }
       }
       return hasRole;
   }


//    @RequestMapping(value = {"/addUsersToParty"}, method = RequestMethod.POST)
//    public String addUsersToParty(Model model, @RequestParam(value = "partyuuid", required = false) String partyUuid) {
//        List<UserDto> userList = userService.findAll();
//
//        LOG.debug("addUsersToParty called:");
//        for (UserDto user : userList) {
//            LOG.debug(" user:" + user);
//        }
//
//        model.addAttribute("userListSize", userList.size());
//        model.addAttribute("userList", userList);
//        model.addAttribute("partyuuid", partyUuid);
//
//        return "addUsersToParty";
//    }


   /*
    * Default exception handler, catches all exceptions, redirects to friendly
    * error page. Does not catch request mapping errors
    */
   @ExceptionHandler(Exception.class)
   public String myExceptionHandler(final Exception e, Model model, HttpServletRequest request) {
       final StringWriter sw = new StringWriter();
       final PrintWriter pw = new PrintWriter(sw);
       e.printStackTrace(pw);
       final String strStackTrace = sw.toString(); // stack trace as a string
       String urlStr = "not defined";
       if (request != null) {
           StringBuffer url = request.getRequestURL();
           urlStr = url.toString();
       }
       model.addAttribute("requestUrl", urlStr);
       model.addAttribute("strStackTrace", strStackTrace);
       model.addAttribute("exception", e);
       //logger.error(strStackTrace); // send to logger first
       return "error"; // default friendly exception message for user
   }

}