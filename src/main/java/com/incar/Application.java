package com.incar;

import com.incar.util.ApplicationVariable;
import com.incar.util.OBDRunParameter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhouyongbo on 2017/5/31.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }


    @Override
    public void run(String... args) throws Exception {
        new OBDRunParameter().init();
        System.out.println("启动初始化");
    }



}
