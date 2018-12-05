package com.example.multipledatasource.mapper.b;

import com.example.multipledatasource.model.b.TableB1;
import com.example.multipledatasource.model.b.TableB1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TableB1Mapper {
    long countByExample(TableB1Example example);

    int deleteByExample(TableB1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TableB1 record);

    int insertSelective(TableB1 record);

    List<TableB1> selectByExample(TableB1Example example);

    TableB1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TableB1 record, @Param("example") TableB1Example example);

    int updateByExample(@Param("record") TableB1 record, @Param("example") TableB1Example example);

    int updateByPrimaryKeySelective(TableB1 record);

    int updateByPrimaryKey(TableB1 record);
}