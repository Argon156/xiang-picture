package com.xiangzi.xiangpicture.interfaces.assembler;

import com.xiangzi.xiangpicture.domain.space.entity.Space;
import com.xiangzi.xiangpicture.interfaces.dto.space.SpaceAddRequest;
import com.xiangzi.xiangpicture.interfaces.dto.space.SpaceEditRequest;
import com.xiangzi.xiangpicture.interfaces.dto.space.SpaceUpdateRequest;
import org.springframework.beans.BeanUtils;

public class SpaceAssembler {

    public static Space toSpaceEntity(SpaceAddRequest request) {
        Space space = new Space();
        BeanUtils.copyProperties(request, space);
        return space;
    }

    public static Space toSpaceEntity(SpaceUpdateRequest request) {
        Space space = new Space();
        BeanUtils.copyProperties(request, space);
        return space;
    }

    public static Space toSpaceEntity(SpaceEditRequest request) {
        Space space = new Space();
        BeanUtils.copyProperties(request, space);
        return space;
    }
}
