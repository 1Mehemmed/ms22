package az.ingress.solidprinciplesapplication.SOLID.openclosedprinciple;

import org.springframework.stereotype.Component;

@Component
public class CategoryValidator implements AbstractValidator{
    @Override
    public boolean isValid(DriverLicenseDto dto) {
        if (dto.getCategory().equals("B")){
            return false;
        }
        return true;
    }
}
