package com.example.multipledatasource;

import com.example.multipledatasource.mapper.a.TableA1Mapper;
import com.example.multipledatasource.mapper.a.TableA2Mapper;
import com.example.multipledatasource.mapper.b.TableB1Mapper;
import com.example.multipledatasource.mapper.b.TableB2Mapper;
import com.example.multipledatasource.model.a.TableA1;
import com.example.multipledatasource.model.a.TableA2;
import com.example.multipledatasource.model.b.TableB1;
import com.example.multipledatasource.model.b.TableB2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BaseService {
    @Autowired
    TableA1Mapper tableA1Mapper;
    @Autowired
    TableA2Mapper tableA2Mapper;
    @Autowired
    TableB1Mapper tableB1Mapper;
    @Autowired
    TableB2Mapper tableB2Mapper;

    public void addA1(String name) {
        TableA1 tableA1 = new TableA1();
        tableA1.setName(name);
        tableA1Mapper.insertSelective(tableA1);
    }

    public void addA2(String name) {
        TableA2 tableA2 = new TableA2();
        tableA2.setName(name);
        tableA2Mapper.insertSelective(tableA2);
    }

    public void addB1(String name) {
        TableB1 tableB1 = new TableB1();
        tableB1.setName(name);
        tableB1Mapper.insertSelective(tableB1);
    }

    public void addB2(String name) {
        TableB2 tableB2 = new TableB2();
        tableB2.setName(name);
        tableB2Mapper.insertSelective(tableB2);
    }

    @Transactional("transactionManagerA")
    public void saveA(String nameA1, String nameA2) {
        this.addA1(nameA1);
        this.addA2(nameA2);
    }

    @Transactional("transactionManagerB")
    public void saveB(String nameB1, String nameB2) {
        this.addB1(nameB1);
        this.addB2(nameB2);
    }

    @Transactional
    public void save(String nameA1, String nameB1, String nameA2, String nameB2) {
        this.addA1(nameA1);
        this.addB1(nameB1);
        this.addA2(nameA2);
        this.addB2(nameB2);
    }
}
