package com.balde.beans;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddSubTest.class, CalculatorTest.class, DivTest.class })
public class AllTests {

}
