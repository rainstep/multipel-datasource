package com.example.multipledatasource;

import com.example.multipledatasource.model.a.TableA1;
import com.example.multipledatasource.model.a.TableA2;
import com.example.multipledatasource.model.b.TableB1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultipleDatasourceApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private BaseService baseService;

    @Test
    public void list() {
        List<TableA1> a1List = baseService.a1List();
        List<TableA2> a2List = baseService.a2List();
        List<TableB1> b1List = baseService.b1List();
    }

    @Test
    public void addA1() {
        String name = "nameA1";
        baseService.addA1(name);
    }

    @Test
    public void addA2() {
        String name = "nameA2";
        baseService.addA1(name);
    }

    @Test
    public void addB1 () {
        String name = "nameB1";
        baseService.addA1(name);
    }

    @Test
    public void save() {
        String nameA1 = "nameA1";
        String nameB1 = "nameB1";
//        String nameA2 = "nameA2";
        String nameA2 = null; // nameA2为null时，程序报异常，但table_a1和table_b1还是插入了数据
        baseService.save(nameA1, nameB1, nameA2);
    }

}
