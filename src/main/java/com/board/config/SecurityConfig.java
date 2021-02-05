package com.board.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;

import com.board.login.service.LoginService;

import lombok.extern.java.Log;


@Log
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	LoginService loginService;
	
	
	/**
     * 스프링시큐리티 앞단 설정들을 할 수 있다.
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        // resources 모든 접근을 허용하는 설정을 해버리면
        // HttpSecurity 설정한 ADIM권한을 가진 사용자만 resources 접근가능한 설정을 무시해버린다.
        web.ignoring()
                .antMatchers("/resources/**");
        web.httpFirewall(defaultHttpFirewall());
        
    }
	
    @Bean
	public HttpFirewall defaultHttpFirewall() {
		// TODO Auto-generated method stub
		return new DefaultHttpFirewall();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//log.info("security config....");
		
		http.csrf().disable(); //<<이설정을 넣어야 하는 이유가 뭐지? 모르겠다.		
		
		http.authorizeRequests()
        	.antMatchers("/**/ajax/**").permitAll()
        	.antMatchers("/login", "/login/process").permitAll()
        	.antMatchers("/**").authenticated()
        	.and()
        	.formLogin()
        		//.loginPage("/login").defaultSuccessUrl("/").permitAll()
        		//.loginPage("/login").permitAll()
        		//.loginProcessingUrl("/login/process").usernameParameter("username").passwordParameter("password").defaultSuccessUrl("/")
        	.and()
        	.logout()
        		.logoutUrl("/logout").logoutSuccessUrl("/login")
        		.invalidateHttpSession(true)
            .and()
          .httpBasic(); // httpBasic 도 사용할 거임.
		
		
		
		http.userDetailsService(loginService);
	}
	
	
	@Bean
	public PasswordEncoder noOpPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(loginService);
    }
}
