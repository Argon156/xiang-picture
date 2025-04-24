package com.xiangzi.xiangpicturebackend.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xiangzi.xiangpicturebackend.model.dto.space.analyze.*;
import com.xiangzi.xiangpicturebackend.model.entity.Space;
import com.xiangzi.xiangpicturebackend.model.entity.User;
import com.xiangzi.xiangpicturebackend.model.vo.space.analyze.*;

import java.util.List;

/**
 * 空间分析服务
 */
public interface SpaceAnalyzeService extends IService<Space> {

    void checkSpaceAnalyzeAuth(SpaceAnalyzeRequest spaceAnalyzeRequest, User loginUser);

    SpaceUsageAnalyzeResponse getSpaceUsageAnalyze(SpaceUsageAnalyzeRequest spaceUsageAnalyzeRequest, User loginUser);

    List<SpaceCategoryAnalyzeResponse> getSpaceCategoryAnalyze(SpaceCategoryAnalyzeRequest spaceCategoryAnalyzeRequest, User loginUser);

    List<SpaceTagAnalyzeResponse> getSpaceTagAnalyze(SpaceTagAnalyzeRequest spaceTagAnalyzeRequest, User loginUser);

    List<SpaceSizeAnalyzeResponse> getSpaceSizeAnalyze(SpaceSizeAnalyzeRequest spaceSizeAnalyzeRequest, User loginUser);

    List<SpaceUserAnalyzeResponse> getSpaceUserAnalyze(SpaceUserAnalyzeRequest spaceUserAnalyzeRequest, User loginUser);

    List<Space> getSpaceRankAnalyze(SpaceRankAnalyzeRequest spaceRankAnalyzeRequest, User loginUser);
}
