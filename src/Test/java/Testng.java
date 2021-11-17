import HomeWork7.ExceptionArrayLength;
import HomeWork7.ExceptionForLucky;
import HomeWork7.Lucky;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng {
    Lucky lucky= new Lucky();
    @DataProvider
    public Object[][] integerDataLucky()
    {
        int [] array  = {2,8,87,85,7,9,5};
        int [] array1  = {8,81,87,85,7,9,5};
        int [] array2  = {45,8,87,85,7,9,5};

        return new Object[][]
        {
                {array, 3, false},
                {array1, 0, true},
                {array2, 2, false}

        };
    }

    @Test (dataProvider = "integerDataLucky")
    public void isInteger(int[] array, int index, boolean result )throws ExceptionForLucky, ExceptionArrayLength
    {

        Assert.assertEquals(lucky.checkInteger(array, index), result) ;
    }


    @BeforeTest
    public void print(){
        System.out.println("this is before test");
    }
    @AfterTest
    public void printAfter(){
        System.out.println("This is after test");
    }


}
