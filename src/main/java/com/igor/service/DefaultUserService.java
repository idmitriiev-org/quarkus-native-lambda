package com.igor.service;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@Transactional
@ApplicationScoped
public class DefaultUserService implements UserService {

  @Override
  public List<String> getUserNames() {
    return Arrays.asList(
        "Mike",
        "John",
        "Henry"
    );
  }

}
