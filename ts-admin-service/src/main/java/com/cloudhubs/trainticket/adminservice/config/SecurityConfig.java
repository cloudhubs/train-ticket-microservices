package com.cloudhubs.trainticket.adminservice.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author fdse
 */


@Configuration
@EnableWebSecurity
//@Order(10)
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  // Disable CSRF protection
                .authorizeRequests(authorize -> authorize
                        .anyRequest().permitAll())  // Allow all requests
                .httpBasic().disable()  // Disable HTTP Basic authentication
                .formLogin().disable();  // Disable Form-based authentication

        return http.build();
    }
}


/**
     * load password encoder
     *
     * @return PasswordEncoder
     *//*


    */
/*@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*//*



    */
/**
     * allow cors domain
     * header  By default, only six fields can be taken from the header, and the other fields can only be specified in the header.
     * credentials   Cookies are not sent by default and can only be true if a Cookie is needed
     * Validity of this request
     *
     * @return WebMvcConfigurer
     *//*


    */
/*@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins(ALL)
                        .allowedMethods(ALL)
                        .allowedHeaders(ALL)
                        .allowCredentials(false)
                        .maxAge(3600);
            }
        };
    }*//*



    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic().disable()
                // close default csrf
                .csrf().disable()
                // close session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/v1/adminbasicservice/adminbasic/stations").permitAll()
                .antMatchers(HttpMethod.GET, "/api/v1/adminbasicservice/adminbasic/trains").permitAll()
                .antMatchers(HttpMethod.GET, "/api/v1/adminbasicservice/adminbasic/prices").permitAll()
                .antMatchers(HttpMethod.GET, "/api/v1/adminbasicservice/adminbasic/configs").permitAll()
                .antMatchers(HttpMethod.GET, "/api/v1/adminbasicservice/adminbasic/contacts").permitAll()
                .antMatchers("/api/v1/adminbasicservice/**").hasRole("ADMIN")
                .antMatchers("/swagger-ui.html", "/webjars/**", "/images/**",
                        "/configuration/**", "/swagger-resources/**", "/v2/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .addFilterBefore(new JWTFilter(), UsernamePasswordAuthenticationFilter.class);


        // close cache
        httpSecurity.headers().cacheControl();
    }
}

*/
