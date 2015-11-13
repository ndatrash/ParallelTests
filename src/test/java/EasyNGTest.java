/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author ноу-хау
 */
public class EasyNGTest {
    
    private Integer instanceInt;
    
    public EasyNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        instanceInt = new Random().nextInt();
        System.out.println("BeforeEasy " +Thread.currentThread().getId()+" uses "+instanceInt);
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
         System.out.println("AfterEasy " +Thread.currentThread().getId()+" uses "+instanceInt);
    }
    
    @Test
    public void instanceTest() {
        System.out.println("Easy " +Thread.currentThread().getId()+" uses "+instanceInt);
    }
    
    @Test
    public void instanceTest2() {
        System.out.println("Easy " +Thread.currentThread().getId()+" uses "+instanceInt);
    }
        
    @Test
    public void instanceTest3() {
        System.out.println("Easy " +Thread.currentThread().getId()+" uses "+instanceInt);
    }    
    
    @Test
    public void instanceTest4() {
        System.out.println("Easy " +Thread.currentThread().getId()+" uses "+instanceInt);
    }    
    
    @Test
    public void instanceTest5() {
        System.out.println("Easy " +Thread.currentThread().getId()+" uses "+instanceInt);
    }        
    
    @Test
    public void instanceTest6() {
        System.out.println("Easy " +Thread.currentThread().getId()+" uses "+instanceInt);
    }        
    
    @Test
    public void instanceTest7() {
        System.out.println("Easy " +Thread.currentThread().getId()+" uses "+instanceInt);
    }        
    
}
