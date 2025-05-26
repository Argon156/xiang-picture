package com.xiangzi.xiangpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiangzi.xiangpicture.domain.space.entity.Space;
import com.xiangzi.xiangpicture.domain.space.repository.SpaceRepository;
import com.xiangzi.xiangpicture.infrastructure.mapper.SpaceMapper;
import org.springframework.stereotype.Service;

@Service
public class SpaceRepositoryImpl extends ServiceImpl<SpaceMapper, Space> implements SpaceRepository {
}
