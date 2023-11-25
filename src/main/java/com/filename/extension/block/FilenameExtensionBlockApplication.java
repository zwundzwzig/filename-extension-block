package com.filename.extension.block;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FilenameExtensionBlockApplication {

  public static void main(String[] args) {
    SpringApplication.run(FilenameExtensionBlockApplication.class, args);
  }

}
