package com.xiangzi.xiangpicturebackend.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiangzi.xiangpicturebackend.model.dto.space.SpaceAddRequest;
import com.xiangzi.xiangpicturebackend.model.dto.space.SpaceQueryRequest;
import com.xiangzi.xiangpicturebackend.model.entity.Space;
import com.xiangzi.xiangpicturebackend.model.entity.User;
import com.xiangzi.xiangpicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 82786
 * @description 针对表【space(空间)】的数据库操作Service
 * @createDate 2025-04-18 13:44:40
 */
public interface SpaceService extends IService<Space> {
    /**
     * 获取空间列表查询条件
     *
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 获取脱敏空间信息，一个封装类
     *
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 分页查询空间列表（脱敏）
     *
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 校验空间
     *
     * @param space
     */
    void validSpace(Space space, boolean add);

    void fillSpaceBySpaceLevel(Space space);

    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    void checkSpaceAuth(User loginUser, Space space);
}
