package calculator;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class MyStepdefs {
    private Calculator calculator;
    private int value1, part2_value1;
    private int value2;
    private String part2_value2;
    private int result, part2_result;
    @Before
    public void before() {
        calculator = new Calculator();
    }
    @Given("^Two input values, (-{0,1}(?!0)\\d+) and (-{0,1}(?!0)\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }
    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.println(result);
    }
    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }



    // *************************************************************************

    @Given("^part2 Two inputs, (-{0,1}(?!0)\\d+) and (rvs|sqr)$")
    public void part2TwoInputValuesAnd(int arg0, String arg1) {
        part2_value1 = arg0;
        part2_value2 = arg1;
        System.out.println(part2_value1);
        System.out.println(part2_value2);
    }
    @When("^part2 I do the operation$")
    public void Part2IAddTheTwoValues() {
        System.out.println(part2_value1);
        System.out.println(part2_value2);
        try {
            part2_result = (int) calculator.sqr_rvs(part2_value1, part2_value2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }
    @Then("^part2 I expect the result (\\d+)$")
    public void Part2IExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, part2_result);
    }
}