package pvxdv.testNeoflexcourse.services;

public interface VacationCalculateService {
    double AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH = 29.3d;
    String calculate(String AverageAnnualIncome, int durationOfVacation);
}
