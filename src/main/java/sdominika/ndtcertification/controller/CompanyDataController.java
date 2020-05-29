package sdominika.ndtcertification.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sdominika.ndtcertification.entity.CompanyData;
import sdominika.ndtcertification.service.CompanyDataServiceImpl;

import javax.validation.Valid;

@Controller
@RequestMapping("/company")
public class CompanyDataController {
 private final CompanyDataServiceImpl companyDataServiceImpl;

    public CompanyDataController(CompanyDataServiceImpl companyDataServiceImpl) {
        this.companyDataServiceImpl = companyDataServiceImpl;
    }

    // odsyła do formularza z dodaniem firmy
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("company", new CompanyData());
        return "/company/add";
    }

    //odpowiedź z formularza zapisanie do bazy danych nową firmę, powrót do formularza
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute CompanyData companyData, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "/company/add";
        } companyDataServiceImpl.saveCompany(companyData);
        return "redirect:/home";
    }
}


