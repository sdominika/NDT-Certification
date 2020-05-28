package sdominika.ndtcertification.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sdominika.ndtcertification.entity.CompanyData;
import sdominika.ndtcertification.repository.CompanyDataRepository;

@Controller
@RequestMapping("/company")
public class CompanyDataController {
    private CompanyDataRepository companyDataRepository;

    public CompanyDataController(CompanyDataRepository companyDataRepository) {
        this.companyDataRepository = companyDataRepository;
    }

    @GetMapping("/add")
    public String add (Model model){
        model.addAttribute("company", new CompanyData());
        return "/company/add";
    }

//    @PostMapping("/add")
//    public String add (@Valid @ModelAttribute CompanyData companyData, BindingResult bindingResult){
//        if(bindingResult.hasErrors());
//        return "/company/add";
//    } companyDataRepository.save(companyData);
//        return "redirect:.........";
//    }
}


