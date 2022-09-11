package com.example.springpatterns.patterns.behavioral.chain.processor;

import com.example.springpatterns.patterns.behavioral.chain.AuthenticacionProcessor;
import com.example.springpatterns.patterns.behavioral.chain.AuthenticacionProvider;
import com.example.springpatterns.patterns.behavioral.chain.provider.CSRFProvider;

public class CSRFAuthenticationProcessor extends AuthenticacionProcessor {

    public CSRFAuthenticationProcessor(AuthenticacionProcessor next) {
        super(next);
    }

    @Override
    public boolean isAuthorized(AuthenticacionProvider provider) {

        if(provider instanceof CSRFProvider){
            return true;
        }

        return next.isAuthorized(provider);
    }
}
