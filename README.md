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
