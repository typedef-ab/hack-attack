package se.typedef.hackattack.ui.domain;

import org.apache.commons.lang3.Validate;

public final class User {
  public final String username;

  public User(final String username) {
    this.username = Validate.notBlank(username);
  }
}
