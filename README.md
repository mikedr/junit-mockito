# JUnit & Mockito

## JUnit
A method can be consider as a unit. With JUnit we try and test a specific unit. The unit can be a single method, a group of methods or also a set of clases. The advantaje of unit testing is that once I write an unit test for a particular method I'll be able to run unit test automatically whithn milliseconds and check all the conditions for tthat particular method are matching or not (are passing or not)

[Example of a test failing ](https://github.com/mikedr/junit-mockito/blob/main/src/test/java/com/junit/StringHelperTest.java)

**A test is successful if there are no failures.**

[Example of a successful test](https://github.com/mikedr/junit-mockito/blob/main/src/test/java/com/junit/StringHelperTest2.java)

### assertEquals
It is a method to check if a result is equals to the expected. 

[Example of a assert](https://github.com/mikedr/junit-mockito/blob/main/src/test/java/com/junit/StringHelperTest3.java)

Each test shoudl contain only one condition.

[Example of the refactored assert](https://github.com/mikedr/junit-mockito/blob/main/src/test/java/com/junit/StringHelperTest4.java)

### assertTrue assertFalse
These are methods to check a boolean condition. 

[Example assertTrue, assertFalse](https://github.com/mikedr/junit-mockito/blob/main/src/test/java/com/junit/StringHelperTest5.java)

### @Before @After
Everyting under @Before is executed before every test. Same for @After, but after every test.

[Example @Before, @After](https://github.com/mikedr/junit-mockito/blob/main/src/test/java/com/junit/StringHelperTest6.java)

### @BeforeClass @AfterClass

Same that @Before and @After but tu do it before (or after) in class only once.

[Example @BeforeClass, @AfterClass](https://github.com/mikedr/junit-mockito/blob/main/src/test/java/com/junit/StringHelperTest7.java)

### Comparing arrays

[Example @BeforeClass, @AfterClass](https://github.com/mikedr/junit-mockito/blob/main/src/test/java/com/junit/StringHelperTest8.java)