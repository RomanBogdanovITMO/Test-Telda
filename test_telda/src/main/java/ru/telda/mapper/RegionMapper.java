package ru.telda.mapper;

import org.apache.ibatis.annotations.*;
import ru.telda.model.RegionModel;

import java.util.List;

@Mapper
public interface RegionMapper {

    @Select("select * from directoryReg")
    List<RegionModel> findAll();

    @Insert("insert into directoryReg(id,name,shortName) values(#{id},#{name},#{shortName})")
    void insert(RegionModel regionModel);

    @Select("select id,name,shortName from directoryReg where id in(#{id})")
    RegionModel getById(int id);

    @Update("update directoryReg set name=(#{name}), shortName=(#{shortName})")
    void update(int id,String name,String shortName);

    @Delete("delete from directoryReg")
    void deleteAll();

    @Delete("delete from directoryReg where id in(#{id})")
    void deleteById(int id);
}
