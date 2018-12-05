package com.example.multipledatasource.mapper.a;

import com.example.multipledatasource.model.a.TableA2;
import com.example.multipledatasource.model.a.TableA2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TableA2Mapper {
    long countByExample(TableA2Example example);

    int deleteByExample(TableA2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableA2 record);

    int insertSelective(TableA2 record);

    List<TableA2> selectByExample(TableA2Example example);

    TableA2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableA2 record, @Param("example") TableA2Example example);

    int updateByExample(@Param("record") TableA2 record, @Param("example") TableA2Example example);

    int updateByPrimaryKeySelective(TableA2 record);

    int updateByPrimaryKey(TableA2 record);
}