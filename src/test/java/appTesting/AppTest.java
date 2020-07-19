package appTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;


public class AppTest {
AppForTest atest = new AppForTest();

@org.junit.jupiter.api.Test
public void testSum() {
        int res;
        res = atest.sumNbrs(1, 2);
        Assertions.assertEquals(res, 4,"sum mismatch");
        System.out.println("@Test1 method");
        }
@org.junit.jupiter.api.Test
public void test2() {
        System.out.println("@Test2 method");
        }
@Test
public void test3() {
        System.out.println("@Test3 method");
        }
}
