package opts;

import calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import opt.Opt;
import org.junit.Assert;

public class MyStepdefs {
    private Opt opt;
    private int value1;
    private String value2;
    private double result;
    @Given("^one input value and type of operation, <input> and <opt>$")
    public void oneInputValueAndTypeOfOperationInputAndOpt(int arg0, String arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I do the operation <opt>$")
    public void iDoTheOperationOpt() throws Exception {
       result = opt.opt(value1, value2);
       System.out.print(result);
    }

    @Then("^I expect the result <result>$")
    public void iExpectTheResultResult(double arg0) {
        Assert.assertEquals(arg0, result);
    }
}
