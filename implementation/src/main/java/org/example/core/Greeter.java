package org.example.core;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Greeter implements IGreeter
{
  private static final DateFormat FORMATTER = new SimpleDateFormat("hh:mm:ss");

  @Override
  public String greet(final String name)
  {
    return String.format("Hello, %s!  Current time is %s.", name, FORMATTER.format(new Date()));
  }
}
