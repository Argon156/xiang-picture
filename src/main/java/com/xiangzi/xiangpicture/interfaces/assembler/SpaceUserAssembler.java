package com.xiangzi.xiangpicture.interfaces.assembler;

import com.xiangzi.xiangpicture.domain.space.entity.SpaceUser;
import com.xiangzi.xiangpicture.interfaces.dto.spaceuser.SpaceUserAddRequest;
import com.xiangzi.xiangpicture.interfaces.dto.spaceuser.SpaceUserEditRequest;
import org.springframework.beans.BeanUtils;

public class SpaceUserAssembler {

    public static SpaceUser toSpaceUserEntity(SpaceUserAddRequest request) {
        SpaceUser spaceUser = new SpaceUser();
        BeanUtils.copyProperties(request, spaceUser);
        return spaceUser;
    }

    public static SpaceUser toSpaceUserEntity(SpaceUserEditRequest request) {
        SpaceUser spaceUser = new SpaceUser();
        BeanUtils.copyProperties(request, spaceUser);
        return spaceUser;
    }
}
