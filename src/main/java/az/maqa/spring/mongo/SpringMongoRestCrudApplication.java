package az.maqa.spring.mongo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "az.maqa.spring.mongo.repository")
public class SpringMongoRestCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoRestCrudApplication.class, args);
    }


    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
