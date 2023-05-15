package pvxdv.testNeoflexcourse.services.impl;

import org.springframework.stereotype.Service;
import pvxdv.testNeoflexcourse.services.VacationCalculateService;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class VacationCalculateServiceImpl implements VacationCalculateService {

    @Override
    public String calculate(String averageAnnualIncome, int durationOfVacation) {

        BigDecimal result = new BigDecimal(averageAnnualIncome).
                divide(new BigDecimal(AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH), 2, RoundingMode.CEILING).
                multiply(new BigDecimal(durationOfVacation));

        return result.toString();
    }
}

