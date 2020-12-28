package com.igor.controller;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.igor.service.UserService;

import javax.inject.Inject;

public class EntryLambda implements RequestHandler<String, String> {

  @Inject
  private UserService userService;

  @Override
  public String handleRequest(String input, Context context) {
    return String.join(", ", userService.getUserNames());
  }
}