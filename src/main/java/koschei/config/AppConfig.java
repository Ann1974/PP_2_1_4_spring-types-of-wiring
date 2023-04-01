package koschei.config;

import koschei.models.Island2;
import koschei.models.Wood3;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration

@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static @NotNull Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

}
