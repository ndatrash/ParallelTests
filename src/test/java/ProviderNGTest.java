/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author ноу-хау
 */
public class ProviderNGTest {
    
    public ProviderNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @DataProvider
    public Object[][] getData() {
        Object[][] ret = new Object[][] {
            {"ids", new HashMap<String, UUID>()}};
        ((Map<String, UUID>)ret[0][1]).put("clientId", new UUID(1L,0L));
        ((Map<String, UUID>)ret[0][1]).put("productId", new UUID(1L,1L));
        
        return ret;
    }
    
    @Test(dataProvider="getData")
    public void testMe(String x, Map<String, UUID> y) {
        System.out.println("******");
        for(Entry<String, UUID> entry : y.entrySet()) {
            System.out.println("Print "+entry.getKey()+" : "+entry.getValue().toString());
        }
        System.out.println("******");
    }
    
    
}
