package com.xiangzi.xiangpicture.domain.space.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiangzi.xiangpicture.domain.space.entity.SpaceUser;
import com.xiangzi.xiangpicture.interfaces.dto.spaceuser.SpaceUserQueryRequest;

/**
 * @author 82786
 * @description 针对表【space_user(空间用户关联)】的数据库操作Service
 * @createDate 2025-04-21 10:30:00
 */
public interface SpaceUserDomainService {

    /**
     * 获取查询对象
     *
     * @param spaceUserQueryRequest
     * @return
     */
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);
}

