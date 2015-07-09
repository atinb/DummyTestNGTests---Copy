package DummyTestNGTests2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ServerTest {

	@Test

    public void ServerTest1()
    {
        String str = "Firefox BVT";
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Assert.assertEquals(str, "Firefox BVT");
       	
    }

    @Test
    public void ServerTest2()
    {
        Assert.assertEquals(2, 2);
    	
    }

    @Test
    public void ServerTest3()
    {
    	Assert.assertEquals(3, 3);
    }

    @Test
    public void ServerTest4()
    {
    	Assert.assertEquals(4, 4);
    }

    @Test
    public void ServerTest5()
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
