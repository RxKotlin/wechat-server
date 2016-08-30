package com.kotlinchina.wechatserver.webhook.model;

import com.kotlinchina.wechatserver.authorization.model.User;

public class Payload {
  private Action action;
  private User user;

  public Action getAction() {
    return action;
  }

  public void setAction(Action action) {
    this.action = action;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}

