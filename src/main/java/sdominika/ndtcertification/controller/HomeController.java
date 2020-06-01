package sdominika.ndtcertification.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sdominika.ndtcertification.entity.User;
import sdominika.ndtcertification.interfaces.RoleService;
import sdominika.ndtcertification.interfaces.UserService;

@Controller
public class HomeController {
    private UserService userService;
    private RoleService roleService;

    public HomeController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }
    @GetMapping("/home")
    public String home() { return "home"; }

    @GetMapping("/companySaved")
    public String companySaved() { return "saved"; }

    @GetMapping("/form")
    public String save(Model model) {
        model.addAttribute("user", new User());
        return "/admin/userForm";
    }

    @PostMapping("/form")
    public String save(@ModelAttribute User user){
        user.setEnabled(1);
        userService.saveUser(user);
        return "redirect:/";
    }

//    @GetMapping("/panel")
//    public String panelRedirection(
//            @AuthenticationPrincipal CurrentUser currentUser
//    ) {
//        if (currentUser.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))){
//            return "redirect:/admin/panel";
//        } else if (currentUser.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_TRAINER"))) {
//            return "redirect:/trainer/panel";
//        } else {
//            return "redirect:/user/panel";
//        }
//    }

}
