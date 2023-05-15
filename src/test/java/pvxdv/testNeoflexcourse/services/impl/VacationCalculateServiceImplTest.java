package pvxdv.testNeoflexcourse.services.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pvxdv.testNeoflexcourse.services.VacationCalculateService;


import static org.junit.jupiter.api.Assertions.*;

class VacationCalculateServiceImplTest {

    VacationCalculateService vacationCalculateService;

    @BeforeEach
    public void setUp() throws Exception {
        vacationCalculateService = new VacationCalculateServiceImpl();
    }
    @Test
    void calculate() throws Exception{
        String result = vacationCalculateService.calculate("100000", 28);
        assertEquals(95563.13, Double.parseDouble(result), 0.05d);
    }
}