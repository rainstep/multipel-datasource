package com.example.multipledatasource;

import com.example.multipledatasource.mapper.a.TableA1Mapper;
import com.example.multipledatasource.mapper.a.TableA2Mapper;
import com.example.multipledatasource.mapper.b.TableB1Mapper;
import com.example.multipledatasource.model.a.TableA1;
import com.example.multipledatasource.model.a.TableA1Example;
import com.example.multipledatasource.model.a.TableA2;
import com.example.multipledatasource.model.a.TableA2Example;
import com.example.multipledatasource.model.b.TableB1;
import com.example.multipledatasource.model.b.TableB1Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BaseService {
    @Autowired
    TableA1Mapper tableA1Mapper;
    @Autowired
    TableA2Mapper tableA2Mapper;
    @Autowired
    TableB1Mapper tableB1Mapper;

    public List<TableA1> a1List() {
        List<TableA1> list = tableA1Mapper.selectByExample(new TableA1Example());
        return list;
    }

    public List<TableA2> a2List() {
        List<TableA2> list = tableA2Mapper.selectByExample(new TableA2Example());
        return list;
    }

    public List<TableB1> b1List() {
        List<TableB1> list = tableB1Mapper.selectByExample(new TableB1Example());
        return list;
    }

    public List<TableA1> addA1(String name) {
        TableA1 tableA1 = new TableA1();
        tableA1.setName(name);
        tableA1Mapper.insertSelective(tableA1);
        return a1List();
    }

    public List<TableA2> addA2(String name) {
        TableA2 tableA2 = new TableA2();
        tableA2.setName(name);
        tableA2Mapper.insertSelective(tableA2);
        return a2List();
    }

    public List<TableB1> addB1(String name) {
        TableB1 tableB1 = new TableB1();
        tableB1.setName(name);
        tableB1Mapper.insertSelective(tableB1);
        return b1List();
    }

    @Transactional
    public void save(String nameA1, String nameB1, String nameA2) {
        this.addA1(nameA1);
        this.addB1(nameB1);
        this.addA2(nameA2);
    }
}
