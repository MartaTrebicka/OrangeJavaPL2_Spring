package pl.sda.OrangeJavaPL2.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

@Configuration
public class BakerySecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

       http
               .csrf().disable()
               .headers().disable()
               .authorizeRequests()
               .mvcMatchers("/*/**")
               .permitAll();
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("adimin")
                .password("admin")
                .roles("ADMIN")
                .build();
        auth.inMemoryAuthentication()
                .withUser(user);
    }
}
