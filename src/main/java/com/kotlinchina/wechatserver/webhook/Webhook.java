package com.kotlinchina.wechatserver.webhook;

public class Webhook {
  String payloadURL;
  String contentType;
  String secret;

  Webhook(String payloadURL, String contentType, String secret) {
    this.payloadURL = payloadURL;
    this.contentType = contentType;
    this.secret = secret;
  }
}
