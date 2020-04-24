package cn.tll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author tll
 * @date 2020/4/23
 */
@SpringBootApplication
@MapperScan("cn.tll.mapper")
public class ServiceDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceDemoApplication.class,args);
    }
}
