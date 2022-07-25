package controller;

import dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    final UserDaoImpl userDao;

    @Autowired
    public UserController(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping()
    public String showAllUsers(Model model) {
        model.addAllAttributes("users", userDao.getAllUsers());
        return "users";
    }

    @GetMapping("/{id}")
    public String showUserbyId(@PathVariable("id") int id, Model model) {
        model.addAllAttributes("showUserById", userDao.getUserById(id));
        return "showUserById";
    }

    @GetMapping("/remove/{id}")
    public String showUserbyId(@PathVariable("id") int id, Model model) {
        model.addAllAttributes("usersRemoveById", userDao.removeUserById(id));
        return "usersRemoveById";
    }

    @GetMapping("/update")
    public String updateUsers(Model model) {
        model.addAllAttributes("update", userDao.update(user));
        return "update";
    }

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAllAttributes("add", userDao.addUser(name, lastName, age));
        return "add";
    }
}
