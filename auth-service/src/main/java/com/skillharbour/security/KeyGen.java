package com.skillharbour.security;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.util.Base64;

public class KeyGen {
    public static void main(String[] args) {

        byte [] key = Keys.secretKeyFor(SignatureAlgorithm.HS256).getEncoded();
        String base64 = Base64.getEncoder().encodeToString(key);
        System.out.println("JWT secret: " + base64 );

    }
}
