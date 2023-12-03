package com.code.noi_that.convert;

import java.util.List;

public interface GeneralConvert<Entity, Dto> {
    Dto convertToDto(Entity entity);

    Entity convertToEntity(Dto dto);

    List<Dto> convertToListDto(List<Entity> entityList);

    List<Entity> convertToEntityList(List<Dto> dtoList);
}
