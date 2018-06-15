package com.sprint;

import com.sprint.com.sprint.model.Tac;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.CollectionOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collection;

@SpringBootApplication
@EnableMongoRepositories
public class GsmaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GsmaApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(MongoOperations mongo) {
        return (String... args) -> {
            mongo.dropCollection(Tac.class);
            mongo.createCollection(Tac.class,  CollectionOptions.empty().size(1000000).capped());

            mongo.save(new Tac("1124500", "IPhone A1203","IPhone A1203","Apple Inc","GSM 1800,GSM 1900,GSM 900","22-Jun-07","310","MANU","205157"));
            mongo.save(new Tac("1124000", "J110A (AAA-10420410-BV)","J110A (AAA-10420410-BV)","Sony Ericsson","GSM 1800,GSM 850(GSM 800)","5-Jun-07","240","MANU","205093"));

        };
    }
}
