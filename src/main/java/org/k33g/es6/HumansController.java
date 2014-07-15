package org.k33g.es6;

import org.wisdom.api.DefaultController;
import org.wisdom.api.annotations.Controller;
import org.wisdom.api.annotations.Route;
import org.wisdom.api.http.HttpMethod;
import org.wisdom.api.http.Result;

import java.util.LinkedList;
import java.util.List;

@Controller
public class HumansController extends DefaultController {

  private class Human {
    public String firstName;
    public String lastName;

    private Human(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }
  }

  private List<Human> humansList = null;

  @Route(method = HttpMethod.GET, uri = "/humans")
  public Result getHumansList() {
    this.humansList =new LinkedList<Human>();
    this.humansList.add(new Human("John", "Doe"));
    this.humansList.add(new Human("Jane", "Doe"));
    this.humansList.add(new Human("Bob", "Morane"));
    this.humansList.add(new Human("Sam", "Le Pirate"));

    this.humansList.forEach((Human human) -> {
      System.out.println(human.firstName + " " + human.lastName);
    });

    return ok(this.humansList).json();

  }
}