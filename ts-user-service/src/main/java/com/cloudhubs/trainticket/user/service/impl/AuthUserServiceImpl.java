//package com.cloudhubs.trainticket.user.service.impl;
//
//import com.cloudhubs.trainticket.user.constant.AuthConstant;
//import com.cloudhubs.trainticket.user.constant.InfoConstant;
//import com.cloudhubs.trainticket.user.dto.AuthDto;
//import com.cloudhubs.trainticket.user.entity.AuthUser;
//import com.cloudhubs.trainticket.user.exception.UserOperationException;
//import com.cloudhubs.trainticket.user.repository.AuthUserRepository;
//import com.cloudhubs.trainticket.user.repository.UserRepository;
//import com.cloudhubs.trainticket.user.service.AuthUserService;
//import com.cloudhubs.trainticket.user.util.Response;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
////import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.text.MessageFormat;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//
///**
// * @author fdse
// */
//@Service
//public class AuthUserServiceImpl implements AuthUserService {
//    private static final Logger LOGGER = LoggerFactory.getLogger(AuthUserServiceImpl.class);
//
//    @Autowired
//    private AuthUserRepository authUserRepository;
//
//
//    @Override
//    public AuthUser saveUser(AuthUser user) {
//        return null;
//    }
//
//    @Override
//    public List<AuthUser> getAllUser(HttpHeaders headers) {
//        return (List<AuthUser>) authUserRepository.findAll();
//    }
//
//    /**
//     * create  a user with default role of user
//     *
//     * @param dto
//     * @return
//     */
//    @Override
//    public AuthUser createDefaultAuthUser(AuthDto dto) {
//        LOGGER.info("[createDefaultAuthUser][Register User Info][AuthDto name: {}]", dto.getUserName());
//        AuthUser user = AuthUser.builder()
//                .userId(dto.getUserId())
//                .username(dto.getUserName())
////                .password(passwordEncoder.encode(dto.getPassword()))
//                .roles(new HashSet<>(Arrays.asList(AuthConstant.ROLE_USER)))
//                .build();
//        try {
//            checkUserCreateInfo(user);
//        } catch (UserOperationException e) {
//            LOGGER.error("[createDefaultAuthUser][Create default auth user][UserOperationException][message: {}]", e.getMessage());
//        }
//        return authUserRepository.save(user);
//    }
//
//    @Override
//    @Transactional
//    public Response deleteByUserId(String userId, HttpHeaders headers) {
//        LOGGER.info("[deleteByUserId][DELETE USER][user id: {}]", userId);
//        authUserRepository.deleteByUserId(userId);
//        return new Response(1, "DELETE USER SUCCESS", null);
//    }
//
//    /**
//     * check Whether user info is empty
//     *
//     * @param user
//     */
//    private void checkUserCreateInfo(AuthUser user) throws UserOperationException {
//        LOGGER.info("[checkUserCreateInfo][Check user create info][userId: {}, userName: {}]", user.getUserId(), user.getUsername());
//        List<String> infos = new ArrayList<>();
//
//        if (null == user.getUsername() || "".equals(user.getUsername())) {
//            infos.add(MessageFormat.format(InfoConstant.PROPERTIES_CANNOT_BE_EMPTY_1, InfoConstant.USERNAME));
//        }
//
//        int passwordMaxLength = 6;
//        if (null == user.getPassword()) {
//            infos.add(MessageFormat.format(InfoConstant.PROPERTIES_CANNOT_BE_EMPTY_1, InfoConstant.PASSWORD));
//        } else if (user.getPassword().length() < passwordMaxLength) {
//            infos.add(MessageFormat.format(InfoConstant.PASSWORD_LEAST_CHAR_1, 6));
//        }
//
//        if (null == user.getRoles() || user.getRoles().isEmpty()) {
//            infos.add(MessageFormat.format(InfoConstant.PROPERTIES_CANNOT_BE_EMPTY_1, InfoConstant.ROLES));
//        }
//
//        if (!infos.isEmpty()) {
//            LOGGER.warn(infos.toString());
//            throw new UserOperationException(infos.toString());
//        }
//    }
//
//}
