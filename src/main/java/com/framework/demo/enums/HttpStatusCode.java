package com.framework.demo.enums;

import lombok.Getter;

@Getter
public enum HttpStatusCode {

    ID_FAIL(1001,"ID_FAIL"),
    PASSWORD_FAIL(1002, "PASSWORD_FAIL"),
    REQUIRED_LOGIN_STEP_1(1003, "REQUIRED_LOGIN_STEP_1"),
    MISS_MATCH_SEND_TO(1004, "MISS_MATCH_SEND_TO"),
    USER_LOCK(1005, "USER_LOCK"),
    ALREADY_LOGIN(1006, "ALREADY_LOGIN"),
    EXPIRED_OTP(1007, "EXPIRED_OTP"),
    MISS_MATCH_OTP(1008, "MISS_MATCH_OTP"),
    JOIN_FAIL(1009, "JOIN_FAIL"),
    DUPLICATE_ID(1010, "DUPLICATE_ID"),
    SUCCESS_ID(1011, "SUCCESS_ID"),

    OK(200, "OK"),
    NO_CONTENT(204,"NO_CONTENT"),


    BAD_REQUEST(400, "BAD_REQUEST"),
    UNAUTHORIZED(401, "UNAUTHORIZED"),
    NOT_FOUND(404, "NOT_FOUND"),
    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR");

    int statusCode;
    String code;

    HttpStatusCode(int statusCode, String code) {
        this.statusCode = statusCode;
        this.code = code;
    }

}
