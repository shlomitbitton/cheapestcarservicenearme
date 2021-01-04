package com.cheapestcarservicenearme;

import com.cheapestcarservicenearme.service.ProspectiveService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {

    // @Autowired
    // private ProspectiveService prospectiveService;

    @Override
    public void configure(WebSecurity web) throws Exception {
    // public void configure(WebSecurity web, AuthenticationManagerBuilder auth) throws Exception {
        web.ignoring().antMatchers("/**");
        // auth.userDetailsService(prospectiveService);
    }
}