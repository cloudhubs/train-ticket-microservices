//package com.cloudhubs.trainticket.adminservice.controller;
//
//
//import com.cloudhubs.trainticket.adminservice.dto.BasicAuthDto;
//import com.cloudhubs.trainticket.adminservice.entity.AuthUser;
//import com.cloudhubs.trainticket.adminservice.exception.UserOperationException;
//import com.cloudhubs.trainticket.adminservice.service.AuthUserService;
////import com.cloudhubs.trainticket.adminservice.service.TokenService;
//import com.cloudhubs.trainticket.adminservice.util.Response;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///**
// * @author fdse
// */
//@RestController
//@RequestMapping("/api/v1/users")
//@CrossOrigin("/**")
//public class AuthUserController {
//
//    @Autowired
//    private AuthUserService authUserService;
//
//    /*@Autowired
//    private TokenService tokenService;*/
//
//    private static final Logger logger = LoggerFactory.getLogger(AuthUserController.class);
//
//    @GetMapping("/hello")
//    public Object getHello() {
//        return "Hello";
//    }
//
//    /*@PostMapping("/login")
//    public ResponseEntity<Response> getToken(@RequestBody BasicAuthDto dao , @RequestHeader HttpHeaders headers) {
//        logger.info("Login request of username: {}", dao.getUsername());
//        try {
//            Response<?> res = tokenService.getToken(dao, headers);
//            return ResponseEntity.ok(res);
//        } catch (UserOperationException e) {
//            logger.error("[getToken][tokenService.getToken error][UserOperationException, message: {}]", e.getMessage());
//            return ResponseEntity.ok(new Response<>(0, "get token error", null));
//        }
//    }*/
//
//    @GetMapping("/getAllUser")
//    public ResponseEntity<List<AuthUser>> getAllUser(@RequestHeader HttpHeaders headers) {
//        logger.info("[getAllUser][Get all users]");
//        return ResponseEntity.ok().body(authUserService.getAllUser(headers));
//    }
//
//    @DeleteMapping("/{userId}")
//    public ResponseEntity<Response> deleteUserById(@PathVariable String userId, @RequestHeader HttpHeaders headers) {
//        logger.info("[deleteUserById][Delete user][userId: {}]", userId);
//        return ResponseEntity.ok(authUserService.deleteByUserId(userId, headers));
//    }
//
//}
