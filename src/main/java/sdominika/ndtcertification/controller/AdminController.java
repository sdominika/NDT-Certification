package sdominika.ndtcertification.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sdominika.ndtcertification.entity.Role;
import sdominika.ndtcertification.entity.User;
import sdominika.ndtcertification.interfaces.RoleService;
import sdominika.ndtcertification.interfaces.UserService;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private UserService userService;
    private RoleService roleService;

    public AdminController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("/panel")
    public String adminPanel() {
        return "/admin/panel";
    }

    @ModelAttribute(name = "users")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/addUser")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @ModelAttribute(name = "roles")
    public List<Role> getRoles() {
        return roleService.findAll();
    }

    @PostMapping("/addUser")
    public String save(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:/admin/panel";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "/editUser";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute User user) {
        userService.updateUser(user);
        return "redirect:/admin/panel";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        userService.delete(id);
        return "redirect:/admin/panel";
    }

    @GetMapping("/addAdmin")
    public String addAdmin(Model model) {
        model.addAttribute("user", new User());
        return "/admin/addAdmin";
    }

    @PostMapping("/addAdmin")
    public String addAdmin(@ModelAttribute User user) {
        userService.saveAdmin(user);
        return "redirect:/admin/panel";
    }
}
