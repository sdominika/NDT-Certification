package sdominika.ndtcertification.validation.validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = NIPAlreadyExistsValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NIPAlreadyExists {
    //String value() default "";
    String message() default "{validation.NIPAlreadyExist}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload()  default {};
}
