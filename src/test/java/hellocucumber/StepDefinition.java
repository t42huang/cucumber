package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @Author: tina.huanght
 * @Date: 19/03/25 5:49 PM
 */
class IsItFriday{
    static String isItFriday(String today) {
        return "Tuesday".equals(today) ? "Yes" : "Nope";
    }
}
public class StepDefinition {
    private String today;
    private String actualAnswer;

    @Given("today is Sunday")
    public void todayIsSunday() {
        today = "Sunday";
        System.out.println("today is Sunday");
    }
    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        actualAnswer = IsItFriday.isItFriday(today);
        System.out.println("I ask whether it's Friday yet. the answer is {actualAnswer}".replace("{actualAnswer}", actualAnswer));
    }
    @Then("I should be told {string}")
    public void iShouldBeTold(String expectAnswer) {
        System.out.println("I should be told " + expectAnswer);
        assertThat(actualAnswer).isEqualTo(expectAnswer);
    }
}
