package com.tao.core;

import javafx.application.Application;
import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
//@EnableAutoConfiguration
public class CoreApplication {
    @RequestMapping("/")
    String home(){
        return "hello world !";
    }

    /**
     * graceful close
     * @return
     */
    @Bean
    public ExitCodeGenerator exitCodeGenerator(){
            return () -> 42;
    }

    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(CoreApplication.class);
//        application.setLogStartupInfo(false);
//        application.setApplicationStartup(new BufferingApplicationStartup(2048));
//        application.run(args);

//        System.exit(SpringApplication.exit(SpringApplication.run(CoreApplication.class, args)));

        SpringApplication application = new SpringApplication(CoreApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.setBannerMode(Banner.Mode.OFF);  // 关闭默认横幅
        application.run(args);
//        new SpringApplicationBuilder()
//                .sources(Parent.class)
//                .child(Application.class)
//                .bannerMode(Banner.Mode.OFF)
//                .run(args);
    }

}
