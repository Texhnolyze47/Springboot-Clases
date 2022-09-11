package com.example.springpatterns.patterns.behavioral.chain;

import com.example.springpatterns.patterns.behavioral.chain.processor.CSRFAuthenticationProcessor;
import com.example.springpatterns.patterns.behavioral.chain.processor.JWTAuthenticationProcessor;
import com.example.springpatterns.patterns.behavioral.chain.processor.OAuthAuthenticationProcessor;
import com.example.springpatterns.patterns.behavioral.chain.provider.CSRFProvider;
import com.example.springpatterns.patterns.behavioral.chain.provider.JWTAuthProvider;
import com.example.springpatterns.patterns.behavioral.chain.provider.OauthProvider;

public class Main {
    public static void main(String[] args) {

        AuthenticacionProcessor jwt = new JWTAuthenticationProcessor(null);
        AuthenticacionProcessor oath = new OAuthAuthenticationProcessor(jwt);
        AuthenticacionProcessor csrf = new CSRFAuthenticationProcessor(oath);

        csrf.isAuthorized(new CSRFProvider());
        csrf.isAuthorized(new JWTAuthProvider());
        csrf.isAuthorized(new OauthProvider());



    }
}
