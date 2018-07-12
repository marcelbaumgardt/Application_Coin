package pl.marcelbaumgardt.applicationcoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.marcelbaumgardt.applicationcoin.model.User;
import pl.marcelbaumgardt.applicationcoin.service.UserService;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping (path = "/loginform")
    public String loginForm(Model model)
    {
       return "loginForm";
    }

    @GetMapping (path = "/register")
    public String registerUserForm(Model model)
    {

        model.addAttribute("user",new User());
        return "registerForm";
    }

    @PostMapping(path = "/register")
    public String registerUser(@ModelAttribute User user){

        userService.createUser(user);
        return "redirect:/login";
    }

    @GetMapping(path = "/home")
    public String mainPage(Model model){

        model.addAttribute("coinName",new String());
        return"mainPage";
    }

//    @PostMapping(path = "/home")
//    public String



}
