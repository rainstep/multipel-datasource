package com.example.multipledatasource.mapper.a;

import com.example.multipledatasource.model.a.TableA1;
import com.example.multipledatasource.model.a.TableA1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TableA1Mapper {
    long countByExample(TableA1Example example);

    int deleteByExample(TableA1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableA1 record);

    int insertSelective(TableA1 record);

    List<TableA1> selectByExample(TableA1Example example);

    TableA1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableA1 record, @Param("example") TableA1Example example);

    int updateByExample(@Param("record") TableA1 record, @Param("example") TableA1Example example);

    int updateByPrimaryKeySelective(TableA1 record);

    int updateByPrimaryKey(TableA1 record);
}