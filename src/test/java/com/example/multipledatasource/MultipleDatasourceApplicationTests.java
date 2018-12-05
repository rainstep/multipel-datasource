package com.example.multipledatasource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MultipleDatasourceApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private BaseService baseService;

    @Test
    public void save() {
        String nameA1 = "nameA1";
        String nameA2 = "nameA2";
        String nameB1 = "nameB1";
        try {
            baseService.save(nameA1, nameA2, nameB1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
