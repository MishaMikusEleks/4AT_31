package itstep_aqa.unit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import task.day_2.Calculator;


public class CalcTest {


    @Test
    void divideTest(){
    Assert.assertEquals(Calculator.divide(1,1),new Double(1d),
            " invalid dividing operation");
}

    @Test(dataProvider = "addingDataProvider")
    void addTest(Double a,Double b,Double expectedResult){
        Assert.assertEquals(Calculator.add(a,b),expectedResult,
                " invalid adding operation");
    }

    @DataProvider
    public static Object[][] addingDataProvider() {
         Object[][] res= new Object[4][3];

        res[0][0]= 1.0; res[0][1]=2.0; res[0][2]=3.0;
        res[1][0]=-5.0; res[1][1]=5.0; res[1][2]=0.0;
        res[2][0]=0.0; res[2][1]=0.0; res[2][2]=0.0;
        res[3][0]=0.0; res[3][1]=-3.0; res[3][2]=3.0;

        return res;
    }


}
