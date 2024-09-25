package com.cloudhubs.trainticket.auth.config.jwt;

import com.cloudhubs.trainticket.auth.constant.InfoConstant;
import com.cloudhubs.trainticket.auth.entity.AuthUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.util.Base64;
import java.util.Date;

import javax.crypto.SecretKey;

/**
 * @author fdse
 */
@Component
public class JWTProvider {

    private String secretKey = "super_secret_used_to_sing_with_32_bits";

    private SecretKey key;

    private long validityInMilliseconds = 3600000;

    @PostConstruct
    protected void init() {
        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        key = Keys.hmacShaKeyFor(keyBytes);
    }

    public String createToken(AuthUser authUser) {

        Claims claims = Jwts.claims().setSubject(authUser.getUsername());
        claims.put(InfoConstant.ROLES, authUser.getRoles());
        claims.put(InfoConstant.ID, authUser.getUserId());

        Date now = new Date();
        Date validate = new Date(now.getTime() + validityInMilliseconds);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(validate)
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}