package com.example;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionMapperTest {

    private final ConditionMapper mapper = Mappers.getMapper(ConditionMapper.class);

    @Test
    void mapModel() {
        final var model = new Model();
        model.setName("test");

        var target = mapper.mapModel(model);

        assertAll(
                () -> assertNull(target.getName()),
                () -> assertNull(target.getName2())
        );
    }
}
