package pvxdv.testNeoflexcourse.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pvxdv.testNeoflexcourse.services.VacationCalculateService;


@RestController
@AllArgsConstructor
@RequestMapping("/vacation")
public class VacationPayController {

    private final VacationCalculateService calculateService;
    @GetMapping("/calculate")
    public ResponseEntity<String> getVacationPay(@RequestParam("averageAnnualIncome") String averageAnnualIncome,
                                         @RequestParam("durationOfVacation") int durationOfVacation) {
        String response = calculateService.calculate(averageAnnualIncome, durationOfVacation);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
