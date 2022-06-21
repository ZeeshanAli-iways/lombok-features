package com.lombok.features;

import com.lombok.features.model.*;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
@Slf4j
public class LombokFeaturesApplication implements CommandLineRunner {
  private final Logger logger = LoggerFactory.getLogger(getClass());

  public static void main(String[] args) {
    SpringApplication.run(LombokFeaturesApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    log.info("++++++++++++++++++++++++++++++++++");
    // Example POJO
    ExamplePOJO examplePOJO = new ExamplePOJO("dummy name");
    examplePOJO.setScore(123);
    logger.info("ExamplePOJO: {}", examplePOJO);
    logger.info("hashCode {}", examplePOJO.hashCode());
    logger.info("equals {}", examplePOJO.equals(examplePOJO));
    logger.info("");
    logger.info("----------------------------------");

    // @Data example
    // why taking 3 params even though we have 3 member variables
    DataExample dataExample = new DataExample("dummy name", 25, 34d);
    logger.info("DataExample: {}", dataExample);
    String[] tags = new String[1];
    tags[0] = "Sample tag";
    dataExample.setTags(tags);
    // Can we set age?
    logger.info("DataExample: {}", dataExample);
    logger.info("hashCode {}", dataExample.hashCode());
    logger.info("equals {}", examplePOJO.equals(dataExample));
    logger.info("----------------------------------");


    // @AllArgsConstructor example
    AllArgsConstructorExample allArgsConstructorExample = new AllArgsConstructorExample("dummy name", 30, 100d, tags);
    logger.info("allArgsConstructorExample: {}", allArgsConstructorExample);
    logger.info("hashCode {}", allArgsConstructorExample.hashCode());
    logger.info("equals {}", allArgsConstructorExample.equals(allArgsConstructorExample));
    logger.info("----------------------------------");


    // @With example
    WithExample withExample = new WithExample("dummy name", 30, 100d, tags);
    WithExample withExampleUpdated = withExample.withAge(45).withScore(50);
    logger.info("withExample: {}", withExample);
    logger.info("withExampleUpdated: {}", withExampleUpdated);
    logger.info("equals {}", withExample.equals(withExampleUpdated));
    logger.info("----------------------------------");

    // @Builder example
    BuilderExample builderExample = BuilderExample.builder().name("dummy name").age(35).score(100).interest("java").interest("react").interests(List.of("php", "blockchain")).build();
//        BuilderExample.builder().interestScore("java",95).build();
    logger.info("builderExample: {}", builderExample);
    logger.info("equals {}", builderExample.equals(builderExample));
    logger.info("----------------------------------");

    // @NonNull
    RandomExample randomExample = new RandomExample();
    randomExample.setName("name");
//        randomExample.setTags(null);
    logger.info("randomExample: {}", randomExample);
    logger.info("equals {}", randomExample.equals(randomExample));
    logger.info("----------------------------------");

    val valExample = new ArrayList<String>();
    valExample.add("Hello Val!");
//        valExample = new HashMap<String,String>();
    var varExample = valExample.get(0);
    logger.info("varExample {}", varExample);
    logger.info("----------------------------------");


    log.info("+++++++++++++++++++++++++++++++++++++++");
//        cleanupExample();
//        log.info("+++++++++++++++++++++++++++++++++++++++");
  }
//    public void cleanupExample() throws IOException {
//
//            @Cleanup
//            InputStream in = new FileInputStream("./infile.txt");
//            @Cleanup
//            OutputStream out = new FileOutputStream("./outfile.txt");
//            byte[] b = new byte[10000];
//            while (true) {
//                int r = in.read(b);
//                if (r == -1) break;
//                out.write(b, 0, r);
//            }
//    }
}
