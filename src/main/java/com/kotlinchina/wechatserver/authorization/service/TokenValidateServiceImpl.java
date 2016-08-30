package com.kotlinchina.wechatserver.authorization.service;

import org.springframework.stereotype.Service;

@Service
public class TokenValidateServiceImpl implements TokenValidateService {

  @Override
  public Boolean validate(String token) {
    return !token.isEmpty();
  }
}

