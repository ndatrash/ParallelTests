/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ноу-хау
 */
public class EasyThreadLocalNGTest {
    
    private ThreadLocal<Integer> instanceInt;
    
    public EasyThreadLocalNGTest() {
        instanceInt = new ThreadLocal<Integer>();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        instanceInt.set(new Random().nextInt());
        System.out.println("BeforeEasyThreadLocal " +Thread.currentThread().getId()+" uses "+instanceInt.get());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        System.out.println("AfterEasyThreadLocal " +Thread.currentThread().getId()+" uses "+instanceInt.get());
    }
    
    
    @Test
    public void instanceTest() {
        System.out.println("EasyThreadLocal " +Thread.currentThread().getId()+" uses "+instanceInt.get());
    }
    
    @Test
    public void instanceTest2() {
        System.out.println("EasyThreadLocal " +Thread.currentThread().getId()+" uses "+instanceInt.get());
    }

    @Test
    public void instanceTest3() {
        System.out.println("EasyThreadLocal " +Thread.currentThread().getId()+" uses "+instanceInt.get());
    } 
    
    @Test
    public void instanceTest4() {
        System.out.println("EasyThreadLocal " +Thread.currentThread().getId()+" uses "+instanceInt.get());
    }
     
    @Test
    public void instanceTest5() {
        System.out.println("EasyThreadLocal " +Thread.currentThread().getId()+" uses "+instanceInt.get());
    }        
    
    @Test
    public void instanceTest6() {
        System.out.println("EasyThreadLocal " +Thread.currentThread().getId()+" uses "+instanceInt.get());
    }        
    
    @Test
    public void instanceTest7() {
        System.out.println("EasyThreadLocal " +Thread.currentThread().getId()+" uses "+instanceInt.get());
    }        
    
}
