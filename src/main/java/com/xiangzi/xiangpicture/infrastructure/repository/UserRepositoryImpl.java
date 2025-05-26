package com.xiangzi.xiangpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiangzi.xiangpicture.domain.user.entity.User;
import com.xiangzi.xiangpicture.domain.user.repository.UserRepository;
import com.xiangzi.xiangpicture.infrastructure.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl extends ServiceImpl<UserMapper, User> implements UserRepository {
}
