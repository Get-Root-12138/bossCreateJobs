package org.gao;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JwtTest {

    @Test
    public void testGen(){

        Map<String, Objects> claims = new HashMap<>();

        String token = JWT.create()
                .withClaim("user", claims)
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 12))
                .sign(Algorithm.HMAC256("gao"));

        System.out.println(token);
    }


    @Test
    public void testParse(){
        String token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                ".eyJ1c2VyIjp7fSwiZXhwIjoxNzM3MjM0MzY5fQ" +
                ".xw04uKCU6IDZp6ata7yqwKFELUZB8ByWR6Z22N7un7o";

        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("gao")).build();
        DecodedJWT decodedJWT = jwtVerifier.verify(token);

        Map<String, Claim> claims = decodedJWT.getClaims();
        System.out.println(claims.get("user"));


    }


}
