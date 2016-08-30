package com.kotlinchina.wechatserver;

import com.kotlinchina.wechatserver.webhook.controller.WebHookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}

