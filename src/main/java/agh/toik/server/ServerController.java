package agh.toik.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by DAMIAN on 02.05.14.
 */
@Controller
public class ServerController {

    @RequestMapping(value = "getEcho/" + "{name}", method = RequestMethod.GET)
    @ResponseBody
    public String getEcho(@PathVariable String name) {

        return "echo"+name;
    }
}
