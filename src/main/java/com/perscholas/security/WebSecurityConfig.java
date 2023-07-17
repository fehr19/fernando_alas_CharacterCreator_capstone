package com.perscholas.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests(requests -> requests
                        .mvcMatchers("/login").permitAll()
                        .mvcMatchers("/signup").permitAll()
                        .mvcMatchers("/deletePlayer/**").hasAnyRole("ADMIN")
                        .mvcMatchers("/showUpdatePlayerForm/**").hasAnyRole( "ADMIN")
                        .mvcMatchers("/**").hasAnyRole("ADMIN")
                        .anyRequest().authenticated())
                .formLogin(login -> login
                        .loginPage("/login")
                        .permitAll())
                .logout(logout -> logout
                        .logoutSuccessUrl("/login"));

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        PasswordEncoder passwordEncoder
                = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        auth.inMemoryAuthentication()

                .withUser("admin")
                .password(passwordEncoder.encode("admin"))
                .roles("ADMIN");

//                To be added later
                /*.and()
                .withUser("user")
                .password(passwordEncoder.encode("user"))
                .roles("USER");*/

        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);


    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/static/**")
                .antMatchers("/h2-console/**");
    }
}