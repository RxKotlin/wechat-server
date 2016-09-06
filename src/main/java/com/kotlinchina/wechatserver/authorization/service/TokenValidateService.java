package com.kotlinchina.wechatserver.authorization.service;

public interface TokenValidateService {
  Boolean validate(String token);
}
