package test.java.com.softserve.edu;

import main.java.com.softserve.edu.Calc;
import org.testng.Assert;
import org.testng.annotations.*;


public class CalcTest {
    private Calc calc;

    @BeforeClass
    public void setUpBeforeClass() throws Exception {
        calc = new Calc();
        System.out.println("CalcTest @BeforeClass setUpBeforeClass()");
    }

    @AfterClass
    public void tearDownAfterClass() throws Exception {
        System.out.println("CalcTest @AfterClass tearDownAfterClass()");
    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("\tCalcTest @Before setUp()");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("\tCalcTest @After tearDown()");
    }

    @DataProvider//(parallel = true)
    public Object[][] addData() {
        return new Object[][] {
                { 4, 4, 8 },
                { 4, 5 , 9 },
        };
    }
    
    @Test(dataProvider = "addData")
    public void testAdd(double arg0, double agr1, double expected) {
        double actual = calc.add(arg0, agr1);
        Assert.assertEquals(actual, expected, 0.001);
        System.out.println("\t\tCalcTest @Test testAdd()");
    }

    @DataProvider//(parallel = true)
    public Object[][] divData() {
        return new Object[][] {
                { 20, 4, 5 },
                { 20, 8 , 2.5 },
        };
    }
    
    @Test(dataProvider = "divData")
    public void testDiv(double arg0, double agr1, double expected) {
        double actual = calc.div(arg0, agr1);
        Assert.assertEquals(actual, expected, 0.001);
        System.out.println("\t\tCalcTest @Test testDiv()");
    }

}
