package org.example.web;

import org.example.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home page controller.
 */
@Controller
public class HomeController
{
  @Autowired
  GreetingService service;

  /**
   * Displays the home page.
   */
  @RequestMapping("/")
  public String show(final Model model)
  {
    model.addAttribute("greeting", this.service.greet("John"));

    return "home";
  }
}
