package org.example.service;

import org.example.core.Greeter;
import org.example.core.IGreeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService
{
  @Autowired
  IGreeter greeter;
  
  // TODO: Uncomment the following line and launch mvn clean install on the whole project in order to see the compilation failure:
//  private Greeter greeterFromImplementation;

  public String greet(final String name)
  {
    return this.greeter.greet(name);
  }
}
