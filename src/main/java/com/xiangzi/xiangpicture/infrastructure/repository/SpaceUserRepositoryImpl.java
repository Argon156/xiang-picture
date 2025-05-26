package com.xiangzi.xiangpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiangzi.xiangpicture.domain.space.entity.SpaceUser;
import com.xiangzi.xiangpicture.domain.space.repository.SpaceUserRepository;
import com.xiangzi.xiangpicture.infrastructure.mapper.SpaceUserMapper;
import org.springframework.stereotype.Service;

@Service
public class SpaceUserRepositoryImpl extends ServiceImpl<SpaceUserMapper, SpaceUser> implements SpaceUserRepository {
}
