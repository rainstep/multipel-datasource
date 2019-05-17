package com.example.multipledatasource.mapper.b;

import com.example.multipledatasource.model.b.TableB2;
import com.example.multipledatasource.model.b.TableB2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TableB2Mapper {
    long countByExample(TableB2Example example);

    int deleteByExample(TableB2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableB2 record);

    int insertSelective(TableB2 record);

    List<TableB2> selectByExample(TableB2Example example);

    TableB2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableB2 record, @Param("example") TableB2Example example);

    int updateByExample(@Param("record") TableB2 record, @Param("example") TableB2Example example);

    int updateByPrimaryKeySelective(TableB2 record);

    int updateByPrimaryKey(TableB2 record);
}