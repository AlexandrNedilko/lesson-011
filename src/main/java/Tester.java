/*1. Create a new Maven project;
        2. Add TestNG dependency and Selenium Web Driver;
        3. Add several test classes and 4-5 tests to each class.
        4. Write @BeforeTest method where you should create your instance of a
        WebDriver.
        5. Write @AfterTest method where you should close your browser.
        6. Add a testng.xml configuration file.
        7. Configure the test suite to run all tests from the first class and only two from the second.
        8. Create a @DataProvider method to generate some data for your tests.
        9. Add your data provider to any test you wish.

        1) You can write your tests for any web site or for your project.
        2) You can use dataProvider to generate login information.*/

/*
//import edu.dmytroqa.testng.Calculator;
//import edu.dmytroqa.testng.Listener;
//import edu.dmytroqa.testng.Operation;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.class)
public class Tester {

    @Test
    public void checkAddition() {

        Calculator calculator = new Calculator(Operation.ADDITION, 5, 10);
        double result = calculator.calculate();
        Assert.assertEquals(Double.compare(result, 15), 0);
    }

    @Test
    public void checkSubtraction() {
        Calculator calculator = new Calculator(Operation.SUBTRACTION, 10, 5);
        double result = calculator.calculate();
        Assert.assertEquals(Double.compare(result, 5), 0);
    }

    @Test
    public void checkMultiplication() {
        Calculator calculator = new Calculator(Operation.MULTIPLICATION, 5, 10);
        double result = calculator.calculate();
        Assert.assertEquals(Double.compare(result, 51), 0);
    }

    @Test
    public void checkDivision() {
        Calculator calculator = new Calculator(Operation.DIVISION, 10, 5);
        double result = calculator.calculate();
        Assert.assertEquals(Double.compare(result, 2), 0);
    }

    @Test
    public void checkModulus() {
        Calculator calculator = new Calculator(Operation.MODULUS, 5, 10);
        double result = calculator.calculate();
        Assert.assertEquals(Double.compare(result, 5), 0);
    }
}
*/
