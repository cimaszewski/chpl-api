package gov.healthit.chpl.auth;

import gov.healthit.chpl.auth.authorization.JWTUserConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
@Order(1)
public class CHPLAuthenticationSecurityConfig extends
		WebSecurityConfigurerAdapter {
	
	@Autowired
	private JWTUserConverter userConverter;
	
	public CHPLAuthenticationSecurityConfig() {
		super(true);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
				.exceptionHandling().and()
				.anonymous().and()
				.servletApi().and()
				//.headers().cacheControl().and()
				.authorizeRequests()
								
				//allow anonymous resource requests
				//.antMatchers("/").permitAll()
				.antMatchers("/favicon.ico").permitAll()
				.antMatchers("/resources/**").permitAll()
				
				//allow anonymous POSTs to login
				.antMatchers(HttpMethod.POST, "/api/login").permitAll()
				
				//allow anonymous GETs to API
				.antMatchers(HttpMethod.GET, "/api/**").permitAll()
				//defined Admin only API area
				//.antMatchers("/admin/**").hasRole("ADMIN")
				
				//all other request need to be authenticated
				//.anyRequest().hasRole("USER").and()
				//.anyRequest().authenticated().and()
				.antMatchers("/").permitAll().and()
				// custom Token based authentication based on the header previously given to the client
				.addFilterBefore(new JWTAuthenticationFilter(userConverter), UsernamePasswordAuthenticationFilter.class)
			.headers().cacheControl();
		
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected UserDetailsService userDetailsService() {
		//return userDetailsService;
		return null;
	}
	

}