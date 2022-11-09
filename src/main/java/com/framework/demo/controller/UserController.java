package com.framework.demo.controller;

import com.framework.demo.model.user.dto.JoinDto;
import com.framework.demo.service.user.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/framework/api/user")
@RequiredArgsConstructor
@Tag(name = "[USER] Account", description = "User Controller")
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    @Operation(description = "회원가입을 진행 합니다.", summary = "회원가입 API")
    public ResponseEntity<?> join(@RequestBody JoinDto joinDto
//                                  @RequestHeader(value = 'serviceId', defaultValue = "bluchipFramework") String value
    ) {
        log.info("회원가입 API 호출");
        return userService.join(joinDto);
    }

    @PostMapping("/login")
    @Operation(description = "로그인 성공시 Access Token, Refresh Token 발급", summary = "로그인 API")
    public ResponseEntity<?> login (
            HttpServletRequest request,
            @RequestParam(required = true) @Parameter(description = "아이디")String userEmail,
            @RequestParam(required = true) @Parameter(description = "비밀번호")String password
    ) {
        log.trace("로그인 API 호출");
        System.out.println("sesson_id2: " + request.getRequestedSessionId());
        return userService.login(request, userEmail, password);
    }

    @PostMapping("/logout")
    @Operation(description = "로그아웃시 IsLogin status 값 변경 및 RefreshToken 삭제", summary = "로그아웃 API")
    public ResponseEntity<?> logout (HttpServletRequest request) {
        log.trace("로그아웃 API 호출");
        System.out.println("request.AccessToken: " + request.getHeader("Authorization"));
        return userService.logout(request);
    }

    @PostMapping("/force-logout")
    @Operation(description = "관리자 권한이 필요한 강제 로그아웃 API입니다.", summary = "강제 로그아웃 API")
    public ResponseEntity<?> forceLogout (
            @RequestParam(required = true) @Parameter(description = "uid")String uid
            ) {
        System.out.println("강제 로그아웃 API") ;
        System.out.println("uid: " + uid) ;
        return userService.forceLogout(uid);
    }

    @GetMapping("/my-account")
    @Operation(description = "나의 프로필 조회.", summary = "MY PROFILE 조회 API")
    public ResponseEntity<?> findMyAccount (
            HttpServletRequest request
    ) {
        System.out.println("나의 계정 정보 조회 API");
        return userService.findMyAccount(request);
    }

/*    // 시큐리티 필터 테스트 API
    @PostMapping("/test")
    @Operation(description = "로그인을 통해 발급 받은 Access token을 통해 접근 가능하다.", summary = "Access 토큰 테스트 API")
    public String test () {
        System.out.println("token test API 호출");
        return "<h1>test 통과</h1>";
    }*/


}
