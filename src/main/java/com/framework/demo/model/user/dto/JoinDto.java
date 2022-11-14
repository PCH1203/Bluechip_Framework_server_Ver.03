package com.framework.demo.model.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.Data;

import javax.validation.constraints.Email;

@Schema(description = "회원가입 DTO")
@Data
public class JoinDto {

    @JsonIgnore
    private String uid;
    @Email
    @Schema(description = "이메일(계정아이디)", example = "chanho1203@naver.com")
    private String userEmail;
    @Schema(description = "비밀번호")
    private String password;
    @Schema(description = "유저 이름")
    private String name;
    @Schema(description = "전화번호")
    private String phone;
    @Schema(description = "계정타입 web/app")
    private String type;
    @Schema(description = "권한 user/admin")
    private String role;
    @Schema(description = "권한 general/master")
    private String subRole;



}
