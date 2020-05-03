package gcl.kzl.mybatis;

import gcl.kzl.mybatis.initializer.MyApplicationContextInitializer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gchliangcd
 */
@SpringBootApplication
@MapperScan("gcl.kzl.mybatis.mapper")
@EnableEurekaClient
public class MybatisApplication
{
    public static void main(String[] args)
    {
        SpringApplication springBootApplication = new SpringApplication(MybatisApplication.class);
        springBootApplication.addInitializers(new MyApplicationContextInitializer());
        springBootApplication.run(args);
    }
}
