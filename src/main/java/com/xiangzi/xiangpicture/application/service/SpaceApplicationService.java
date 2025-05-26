package com.xiangzi.xiangpicture.application.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiangzi.xiangpicture.domain.space.entity.Space;
import com.xiangzi.xiangpicture.domain.user.entity.User;
import com.xiangzi.xiangpicture.interfaces.dto.space.SpaceAddRequest;
import com.xiangzi.xiangpicture.interfaces.dto.space.SpaceQueryRequest;
import com.xiangzi.xiangpicture.interfaces.vo.space.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 82786
 * @description 针对表【space(空间)】的数据库操作Service
 * @createDate 2025-04-18 13:44:40
 */

public interface SpaceApplicationService extends IService<Space> {

    /**
     * 创建空间
     *
     * @param spaceAddRequest
     * @param loginUser
     * @return
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    /**
     * 获取空间包装类（单条）
     *
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取空间包装类（分页）
     *
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

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
