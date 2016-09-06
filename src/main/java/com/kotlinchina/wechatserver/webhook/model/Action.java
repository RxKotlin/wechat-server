package com.kotlinchina.wechatserver.webhook.model;

public enum Action {
  ON_CONNECT("ON_CONNECT");

  private final String value;

  Action(String value) {
    this.value = value;
  }
}
