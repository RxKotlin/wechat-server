package com.kotlinchina.wechatserver.webhook.model;

public class Webhook {
  String payloadURL;
  String secret;

  public String getPayloadURL() {
    return payloadURL;
  }

  public void setPayloadURL(String payloadURL) {
    this.payloadURL = payloadURL;
  }

  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }
}
