// JwtResponse.java
package com.howard.backend.dto;

public class JwtResponse {
    private String jwtToken;
    private Long userId;

    public JwtResponse(String jwtToken, Long userId) {
        this.jwtToken = jwtToken;
        this.userId = userId;
    }

    // Getter and Setter
    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
