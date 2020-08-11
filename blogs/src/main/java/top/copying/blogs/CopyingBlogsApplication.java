package top.copying.blogs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Copying
 * @date 2020-08-07
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("top.copying.mapper")
public class CopyingBlogsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CopyingBlogsApplication.class,args);
    }
}
