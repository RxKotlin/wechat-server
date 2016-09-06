package com.kotlinchina.wechatserver.webhook.model;

public enum Action {
  ON_CONNECT("ON_CONNECT"),
  ON_DISCONNECT("ON_DISCONNECT"),
  ON_MESSAGEPOSTFail("ON_MESSAGEPOSTFail");

  private final String value;

  Action(String value) {
    this.value = value;
  }
}
