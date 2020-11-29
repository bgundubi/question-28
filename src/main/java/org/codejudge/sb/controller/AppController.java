package org.codejudge.sb.controller;

import io.swagger.annotations.ApiOperation;
import org.codejudge.sb.model.InputNumbers;
import org.codejudge.sb.model.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AppController {

    @ApiOperation("This is the hello world api")
    @GetMapping("/")
    public String hello() {
        return "Hello World!!";
    }

    @ApiOperation("Sum of two numbers")
    @PostMapping("/api/add")
    @ResponseBody
    public Response sum(@RequestBody InputNumbers inputNumbers){

        Response response = new Response();
        response.setSum(inputNumbers.getNumber1() + inputNumbers.getNumber2());
        return response;
    }


}
