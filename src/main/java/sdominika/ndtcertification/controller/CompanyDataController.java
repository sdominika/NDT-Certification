package sdominika.ndtcertification.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sdominika.ndtcertification.entity.CompanyData;
import sdominika.ndtcertification.interfaces.CompanyDataService;


import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyDataController {
    private final CompanyDataService companyDataService;

    public CompanyDataController(CompanyDataService companyDataService) {
        this.companyDataService = companyDataService;
    }


    // odsyła do formularza z dodaniem firmy
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("newCompany", new CompanyData());
        return "/company/add";
    }

    //odpowiedź z formularza, zapisanie do bazy danych nową firmę, powrót do home
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("newCompany") CompanyData newCompany, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/company/add";
        }
        companyDataService.saveCompany(newCompany);
        return "company/saved";
    }

    @ModelAttribute(name = "companyAll")
    public List<CompanyData> showAll() {
        return companyDataService.showAll();
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id, Model model) {
        companyDataService.delete(id);
        model.addAttribute("companies", companyDataService.showAll());
        return "company/showAll";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("companyData", companyDataService.findById(id));
        return "/company/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute CompanyData companyData, Model model) {
        companyDataService.update(companyData);
        model.addAttribute("companies", companyDataService.showAll());
        return "/company/showAll";
    }

    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("companies", companyDataService.showAll());
        return "/company/showAll";
    }

//    @PostMapping("/formEdit")
//    public String update(@ModelAttribute CompanyData companyData, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "company/edit";
//        }
//        try {
//            this.companyDataService.update(companyData);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "redirect:/home";
//    }
}

