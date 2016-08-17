package com.kotlinchina.wechatserver.webhook;

public enum ContentType {
  X_WWW_FORM_URLENCODED("application/x-www-form-urlencoded"),
  JSON("application/json");

  final public String value;

  ContentType(String value) {
    this.value = value;
  }
}
