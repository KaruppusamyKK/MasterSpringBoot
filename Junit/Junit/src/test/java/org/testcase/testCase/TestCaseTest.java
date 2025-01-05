package org.testcase.testCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCaseTest {

    @Test
    public void test(){
        int a=10;
        int b=0;
        int c=a/b;
        assertEquals(c,10);
    }
}