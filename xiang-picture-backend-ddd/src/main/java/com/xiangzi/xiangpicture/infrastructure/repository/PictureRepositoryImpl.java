package com.xiangzi.xiangpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiangzi.xiangpicture.domain.picture.entity.Picture;
import com.xiangzi.xiangpicture.domain.picture.repository.PictureRepository;
import com.xiangzi.xiangpicture.infrastructure.mapper.PictureMapper;
import org.springframework.stereotype.Service;

@Service
public class PictureRepositoryImpl extends ServiceImpl<PictureMapper, Picture> implements PictureRepository {
}
