package test.hello;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by SONY on 2016/8/27.
 */
public class HelloJunitTest  {

    @Test
    public void test(){
        System.out.println(" i am in test");
    }

    @Before
    public void tearDown()  {
        System.out.println(" i am before");
    }

    @After
    public void testTest1()   {
        System.out.println(" i am after");
    }

}