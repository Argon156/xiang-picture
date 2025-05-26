package com.xiangzi.xiangpicture.domain.space.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiangzi.xiangpicture.domain.space.entity.Space;
import com.xiangzi.xiangpicture.domain.user.entity.User;
import com.xiangzi.xiangpicture.interfaces.dto.space.SpaceQueryRequest;
import org.springframework.stereotype.Service;

/**
 * @author 82786
 * @description 针对表【space(空间)】的数据库操作Service
 * @createDate 2025-04-18 13:44:40
 */
@Service
public interface SpaceDomainService {

    /**
     * 获取查询对象
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 根据空间级别填充空间对象
     *
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);

    /**
     * 校验空间权限
     *
     * @param loginUser
     * @param space
     */
    void checkSpaceAuth(User loginUser, Space space);
}