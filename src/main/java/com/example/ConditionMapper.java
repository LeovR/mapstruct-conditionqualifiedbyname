package com.example;

import org.mapstruct.Condition;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper
public interface ConditionMapper {

    // This does not work
    @Mapping(target = "name", source = "model", conditionQualifiedByName = "condition")
    // This works
    @Mapping(target = "name2", source = "name", conditionQualifiedByName = "condition")
    Target mapModel(Model model);

    default String map(Model value) {
        // Just a simple example for demonstration purposes.
        return value.getName();
    }

    @Condition
    @Named("condition")
    default boolean condition(Model model) {
        return false;
    }

}
