package com.workintech.security.secureApp.dto;


import com.workintech.security.secureApp.entity.Member;

public class LoginResponse {
    private String token;
    private Member member;
    private boolean isSuccess;
    private String errorMessage;

    public Member getMember() {
        return member;
    }
    public LoginResponse(Member member, String token, boolean isSuccess, String errorMessage) {
        this.isSuccess = isSuccess;
        this.errorMessage = errorMessage;
        this.token = token;
        this.member = member;
    }

    public String getToken() {
        return token;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
