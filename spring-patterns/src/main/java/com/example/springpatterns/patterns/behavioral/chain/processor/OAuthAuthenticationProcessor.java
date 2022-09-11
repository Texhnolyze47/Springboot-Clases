package com.example.springpatterns.patterns.behavioral.chain.processor;

import com.example.springpatterns.patterns.behavioral.chain.AuthenticacionProcessor;
import com.example.springpatterns.patterns.behavioral.chain.AuthenticacionProvider;
import com.example.springpatterns.patterns.behavioral.chain.provider.OauthProvider;

public class OAuthAuthenticationProcessor extends AuthenticacionProcessor {

    public OAuthAuthenticationProcessor(AuthenticacionProcessor next) {
        super(next);
    }

    @Override
    public boolean isAuthorized(AuthenticacionProvider provider) {
        //Comprobaciones particulares de este proceso
        if (provider instanceof OauthProvider ){
            return  true;
        }
        // llama al siguiente processor
        return next.isAuthorized(provider);
    }
}
