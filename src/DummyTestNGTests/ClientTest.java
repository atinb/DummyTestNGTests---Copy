package DummyTestNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClientTest {

	@Test

    public void ClientTest1()
    {
        String str = "Firefox BVT";
        try {			
        	Thread.sleep(2000);		
        	} catch (InterruptedException e) {			
        		e.printStackTrace();
        	}	
        Assert.assertEquals(str, "Firefox BVT");        
    }

    @Test
    public void ClientTest2()
    {
        Assert.assertEquals(2, 2);
    	
    }

    @Test
    public void ClientTest3()
    {
    	Assert.assertEquals(3, 3);
    }

    @Test
    public void ClientTest4()
    {
    	Assert.assertEquals(4, 4);
    }

    @Test
    public void ClientTest5()
    {
    	Assert.assertEquals(5, 5);
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    }	
}
