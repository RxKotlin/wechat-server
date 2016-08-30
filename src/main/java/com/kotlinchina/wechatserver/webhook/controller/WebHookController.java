package com.kotlinchina.wechatserver.webhook.controller;

import com.kotlinchina.wechatserver.authorization.service.TokenValidateService;
import com.kotlinchina.wechatserver.webhook.model.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebHookController {

  private final TokenValidateService tokenValidateService;

  @Autowired
  public WebHookController(TokenValidateService tokenValidateService) {
    this.tokenValidateService = tokenValidateService;
  }

  @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
  @ResponseBody String request(@RequestParam("token") String token, @RequestBody Payload payload) {
    if (!tokenValidateService.validate(token)) {
      return "{error: invalid token}";
    }

    return String.format("{\"action\": \"%s\", \"username\": \"%s\"}", payload.getAction(), payload.getUser().getUsername());
  }
}

