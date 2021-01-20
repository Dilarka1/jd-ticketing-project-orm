package com.cybertek.mapper;

import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;

public class MapperUtil {

    private ModelMapper modelMapper;

    public MapperUtil(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

//    public <T> T convertToEntity(Object objectToBeConverted, T convertedObject) {
//        return modelMapper.map(objectToBeConverted, (Type) convertedObject.getClass());
//    }
//
//    public <T> T convertToDTO(Object objectToBeConverted, T convertedObject) {
//        return modelMapper.map(objectToBeConverted, (Type) convertedObject.getClass());
//    }

    public <T> T convert(Object objectToBeConverted, T convertedObject) {
        return modelMapper.map(objectToBeConverted, (Type) convertedObject.getClass());
    }
}
