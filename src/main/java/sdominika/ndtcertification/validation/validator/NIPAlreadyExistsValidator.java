package sdominika.ndtcertification.validation.validator;

import sdominika.ndtcertification.repository.CompanyDataRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NIPAlreadyExistsValidator implements ConstraintValidator<NIPAlreadyExists, String> {

    String exist;
    private CompanyDataRepository companyDataRepository;

    public NIPAlreadyExistsValidator(CompanyDataRepository companyDataRepository) {
        this.companyDataRepository = companyDataRepository;
    }

    @Override
    public void initialize(NIPAlreadyExists constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return !companyDataRepository.findOneByCompanyNIP(value).isPresent();
    }
}
