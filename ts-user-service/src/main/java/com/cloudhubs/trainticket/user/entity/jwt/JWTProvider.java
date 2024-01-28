//package com.cloudhubs.trainticket.user.config.jwt;
//
//import com.cloudhubs.trainticket.user.constant.InfoConstant;
//import com.cloudhubs.trainticket.user.entity.AuthUser;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.stereotype.Component;
//
//import jakarta.annotation.PostConstruct;
//import java.util.Base64;
//import java.util.Date;
//
///**
// * @author fdse
// */
//@Component
//public class JWTProvider {
//
//    private String secretKey = "secret";
//
//    private long validityInMilliseconds = 3600000;
//
//    @PostConstruct
//    protected void init() {
//        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
//    }
//
//    public String createToken(AuthUser authUser) {
//
//        Claims claims = Jwts.claims().setSubject(authUser.getUsername());
//        claims.put(InfoConstant.ROLES, authUser.getRoles());
//        claims.put(InfoConstant.ID, authUser.getUserId());
//
//        Date now = new Date();
//        Date validate = new Date(now.getTime() + validityInMilliseconds);
//
//        return Jwts.builder()
//                .setClaims(claims)
//                .setIssuedAt(now)
//                .setExpiration(validate)
//                .signWith(SignatureAlgorithm.HS256, secretKey)
//                .compact();
//    }
//}