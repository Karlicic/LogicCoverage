import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class LogicCoverageText {
    private int inputMonth1;
    private int inputDay1;
    private int inputMonth2;
    private int inputDay2;
    private int inputYear;
    private int expectedResult;
    private LogicCoverage logicCoverage;

    @Before
    public void initialize(){
        logicCoverage = new LogicCoverage();
    }

    public LogicCoverageText(int inputMonth1,
                             int inputDay1,
                             int inputMonth2,
                             int inputDay2,
                             int inputYear,
                             int expectedResult) {
        super();
        this.inputMonth1 = inputMonth1;
        this.inputDay1 = inputDay1;
        this.inputMonth2 = inputMonth2;
        this.inputDay2 = inputDay2;
        this.inputYear = inputYear;
        this.expectedResult = expectedResult;
    }

    //(3, 7), (4, 7), (4, 6)
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][] { { 1, 1, 3, 1, 2001, 59}, { 1, 1, 3, 1, 2012, 60}, { 1, 1, 3, 1, 1900, 59}, { 1, 1, 3, 1, 2000, 60} });
    }

    @Test
    public void testCalTest(){
        assertEquals(expectedResult, logicCoverage.cal(inputMonth1, inputDay1, inputMonth2, inputDay2, inputYear));
    }

}
