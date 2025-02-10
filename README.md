# HamcrestTests
Example test case using Hamcrest Matchers


Test Setup:
The UserServiceTest class contains a method annotated with @Test from JUnit.
Inside the test method, an instance of the UserService class is created.

Test Execution:
The getUserById() method is called with a user ID ("123").
This method returns a User object, which contains the user ID, email, and status.

Test Validation:
The test uses JUnit's assertEquals() to compare the expected email ("user123@example.com") with the actual email retrieved from the User object.
If the values match, the test passes. If they don't, the test fails.

This test ensures that the UserService correctly retrieves the expected email for a given user ID.
