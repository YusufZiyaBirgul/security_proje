package yte.obs_proje.yte_obs_proje.common.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TcKimlikNoValidator.class)
public @interface TcKimlikNo {

    String message() default "TC kimlik numarası formatı uygun değildir";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
