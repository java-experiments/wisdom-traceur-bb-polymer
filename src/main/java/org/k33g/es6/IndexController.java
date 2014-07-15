package org.k33g.es6;

import org.wisdom.api.DefaultController;
import org.wisdom.api.annotations.Controller;
import org.wisdom.api.annotations.Route;
import org.wisdom.api.annotations.View;
import org.wisdom.api.http.HttpMethod;
import org.wisdom.api.http.Result;
import org.wisdom.api.templates.Template;

//import gloo.*;

@Controller
public class IndexController extends DefaultController {

  @View("index")
  Template index;

  @Route(method = HttpMethod.GET, uri = "/")
  public Result index() {
    return ok(render(index));
  }
}
