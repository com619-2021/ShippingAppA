package uk.ac.solent.request;

import lombok.Data;

@Data
public class AuthRequest {

    private String email;

    private String password;

}