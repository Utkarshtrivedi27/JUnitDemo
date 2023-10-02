package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DemoTest {
    @Test
    public void test_isTriangle_1() {
        Assertions.assertTrue(Demo.isTriangle(3, 4, 5));
    }
    @Test
    public void test_isTriangle_2() {
        Assertions.assertTrue(Demo.isTriangle(5, 12, 13));
    }
    @Test
    public void test_isTriangle_3() {
        Assertions.assertTrue(Demo.isTriangle(5, 13, 12));
    }
    @Test
    public void test_isTriangle_4() {
        Assertions.assertTrue(Demo.isTriangle(12, 5, 13));
    }
    @Test
    public void test_isTriangle_5() {
        Assertions.assertTrue(Demo.isTriangle(12, 13, 5));
    }
    @Test
    public void test_isTriangle_6() {
        Assertions.assertTrue(Demo.isTriangle(12, 12, 12));
    }
    @Test
    public void test_is_NotTriangle_1() {
        Assertions.assertFalse(Demo.isTriangle(5, 7, 13));
    }
    @Test
    public void test_is_NotTriangle_2() {
        Assertions.assertFalse(Demo.isTriangle(5, 13, 7));
    }
    @Test
    public void test_is_NotTriangle_3() {
        Assertions.assertFalse(Demo.isTriangle(13, 5, 7));
    }
    @Test
    public void test_is_NotTriangle_4() {
        Assertions.assertFalse(Demo.isTriangle(13,7, 5));
    }
    @Test
    public void test_is_NotTriangle_5() {
        Assertions.assertFalse(Demo.isTriangle(13, 7, 5));
    }
    @Test
    public void test_is_NotTriangle_6() {
        Assertions.assertFalse(Demo.isTriangle(5, 9, 3));
    }
    @Test
    public void test_is_NotTriangle_7() {
        Assertions.assertFalse(Demo.isTriangle(1, 2, -1));
    }

//    @Test
    public void test_main_program(){
        String str1 = "3\n4\n5\n";
        ByteArrayInputStream inp = new ByteArrayInputStream(str1.getBytes());
        System.setIn(inp);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String expected_output = "Enter side 1: \n";
//        expected_output += "3\n";
        expected_output += "Enter side 2: \n";
//        expected_output += "4\n";
        expected_output += "Enter side 3: \n";
//        expected_output += "5\n";
        expected_output += "This is a triangle.\n";

        Assertions.assertEquals( expected_output, out.toString());


    }

}