package com.telusco.config;

import com.telusco.Alien;
import com.telusco.Computer;
import com.telusco.Desktop;
import com.telusco.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.telusco")
public class AppConfig {

    /*@Bean
    public Alien alien(Computer comp) { //@Qualifier("laptop")
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setComp(comp);
        return obj;
    }

    @Bean
    @Scope("singleton")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop() {
        return new Laptop();
    }*/


}
