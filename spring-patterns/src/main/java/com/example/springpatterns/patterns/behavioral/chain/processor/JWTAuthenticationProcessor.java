package com.example.springpatterns.patterns.behavioral.chain.processor;

import com.example.springpatterns.patterns.behavioral.chain.AuthenticacionProcessor;
import com.example.springpatterns.patterns.behavioral.chain.AuthenticacionProvider;
import com.example.springpatterns.patterns.behavioral.chain.provider.JWTAuthProvider;

public class JWTAuthenticationProcessor extends AuthenticacionProcessor {


    public JWTAuthenticationProcessor(AuthenticacionProcessor next) {
        super(next);
    }

    @Override
    public boolean isAuthorized(AuthenticacionProvider provider) {

        if ( provider instanceof JWTAuthProvider){
            return true;
        }
        return next.isAuthorized(provider);
    }
}
