package com.xiangzi.xiangpicture.application.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiangzi.xiangpicture.domain.user.entity.User;
import com.xiangzi.xiangpicture.infrastructure.common.DeleteRequest;
import com.xiangzi.xiangpicture.interfaces.dto.user.UserLoginRequest;
import com.xiangzi.xiangpicture.interfaces.dto.user.UserQueryRequest;
import com.xiangzi.xiangpicture.interfaces.dto.user.UserRegisterRequest;
import com.xiangzi.xiangpicture.interfaces.vo.user.LoginUserVO;
import com.xiangzi.xiangpicture.interfaces.vo.user.UserVO;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Set;

/**
 * @author 82786
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2025-04-12 20:40:48
 */
public interface UserApplicationService {

    @Transactional
    long userRegister(UserRegisterRequest userRegisterRequest);

    LoginUserVO userLogin(UserLoginRequest userLoginRequest, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return 当前登录用户
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return 是否注销成功
     */
    boolean userLogout(HttpServletRequest request);

    long addUser(User user);

    User getUserById(long id);

    UserVO getUserVOById(long id);

    boolean deleteUser(DeleteRequest deleteRequest);

    void updateUser(User user);

    Page<UserVO> listUserVOByPage(UserQueryRequest userQueryRequest);

    List<User> listByIds(Set<Long> userIdSet);

    /**
     * 获取加密后的密码
     *
     * @param userPassword 用户密码
     * @return 加密后的密码
     */
    String getEncryptPassword(String userPassword);

    /**
     * 获取脱敏后的登录用户信息，从User变成LoginUserVO
     *
     * @param user 用户信息
     * @return 脱敏后的用户信息
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取脱敏后的用户信息
     *
     * @param user 用户信息
     * @return 脱敏后的用户信息
     */
    UserVO getUserVO(User user);

    /**
     * 获取脱敏后的用户信息列表
     *
     * @param userList 用户信息列表
     * @return 脱敏后的用户信息列表
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 获取查询条件
     *
     * @param userQueryRequest 用户查询请求
     * @return 用户列表
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);
}
