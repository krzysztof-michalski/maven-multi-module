package org.example.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:springImplementationContext.xml", "classpath:springServiceContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class GreetingServiceTest
{
  @Autowired
  GreetingService service;

  @Test
  public void testGreet()
  {
    Assert.assertNotNull(this.service.greet("John"));
  }
}
