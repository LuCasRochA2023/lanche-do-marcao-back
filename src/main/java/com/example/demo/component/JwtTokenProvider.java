package com.example.demo.component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenProvider {

    private final String SECRET_KEY = "TOKEN_KEY"; // Use uma chave secreta mais forte

    // Gera um token JWT
    public String generateToken(Authentication authentication) {
        String username = authentication.getName();
        Map<String, Object> claims = new HashMap<>();

        // Aqui você pode adicionar claims adicionais, como roles
        // claims.put("role", "USER");

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 horas
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    // Valida o token JWT
    public boolean validateToken(String token, Authentication authentication) {
        try {
            final String username = getUsernameFromToken(token);
            return (username.equals(authentication.getName()) && !isTokenExpired(token));
        } catch (Exception e) {
            // Aqui você pode tratar exceções de forma mais específica se necessário
            return false;
        }
    }

    // Recupera o nome de usuário do token
    private String getUsernameFromToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
        return claims.getSubject();
    }

    // Verifica se o token está expirado
    private boolean isTokenExpired(String token) {
        Claims claims = Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
        return claims.getExpiration().before(new Date());
    }
}
