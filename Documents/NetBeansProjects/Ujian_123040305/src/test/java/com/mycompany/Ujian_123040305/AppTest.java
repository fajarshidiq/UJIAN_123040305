package com.mycompany.Ujian_123040305;

import com.mycompany.Ujian_123040305.Soal;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static junit.framework.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    private static Soal s;
    
    public void awalTest() {
        s = new Soal();
        System.out.println("Mengawali Test");
    }

    /**
     * @return the suite of tests being tested
     */
    public void test1() {
        s.faktorial(2);
        assertNotNull("Seharusnya empat");
    }
    
    public void test2() {
        s.faktorial(0);
        assertNull("Seharusnya Null");
    }
    
    public void test3() {
        s.pangkat(2, 2);
        assertNotNull("Seharusnya empat");
    }
    
    public void test4() {
        s.pangkat(2, 1);
        assertNotNull("Seharusnya dua");
    }
    
    public void test5() {
        s.perkalian(4, 4);
        assertNotNull("Seharusnya enam belas");
    }
    
    public void test6() {
        s.perkalian(2, 2);
        assertNotNull("Seharusnya empat");
    }
    
    public void akhirTest() {
        System.out.println("Mengakhiri Test");
    }

}
