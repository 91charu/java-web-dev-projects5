package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void testBalancedBrackets1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void testBalancedBrackets2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void testBalancedBrackets3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testUnBalancedBrackets1() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void testUnBalancedBrackets2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]Code]"));
    }

    @Test
    public void testUnBalancedBrackets3() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]"));
    }
    @Test
    public void testBalancedBrackets4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }
    @Test
    public void testUnBalancedBrackets4() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]LaunchCode]]"));
    }

    @Test
    public void testUnBalancedBrackets5() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[[Code]]"));
    }
    @Test
    public void testUnBalancedBrackets6() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[La]unch[Code]]"));
    }
    @Test
    public void testBalancedBrackets5() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch[]Code]]"));
    }
    @Test
    public void testBalancedBrackets6() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[La[un[chC]ode]]]"));
    }
}