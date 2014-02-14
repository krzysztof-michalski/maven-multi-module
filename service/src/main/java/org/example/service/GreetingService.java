package org.example.service;

import org.example.core.IGreeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService
{
  @Autowired
  IGreeter greeter;

  public String greet(final String name)
  {
    return this.greeter.greet(name);
  }
}
