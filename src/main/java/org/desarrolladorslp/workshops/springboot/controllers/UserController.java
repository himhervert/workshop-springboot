package org.desarrolladorslp.workshops.springboot.controllers;

import org.desarrolladorslp.workshops.springboot.models.User;
import org.desarrolladorslp.workshops.springboot.service.UserService;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping(value = "/user")
    public User user(@RequestParam(name="email")String email, @RequestParam(name="name")String name){
        return userService.createUser(email,name);
    }

    @GetMapping(value = "/user")
    //@RequestMapping(value = "/user",method = RequestMethod.GET)
    public String user(){
        return "Apestas leo!!!!";
    }
    @GetMapping(value = "/user/{id}")
    //@RequestMapping(value = "/user",method = RequestMethod.GET)
    public User user(@PathVariable(value = "id")Long id){
        return userService.findById(id);
    }
}
