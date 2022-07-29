@complete
Feature: Case Stori
  I want to navigate into rahulshettyacademy

  @case1
  Scenario: case one
    Given camilo want to navigate into rahulshettyacademy

  @case2
  Scenario: case two
    Given camilo want to navigate into rahulshettyacademy
    When enter the word Me and can select mexico

  @case3
  Scenario: case three
    Given camilo want to navigate into rahulshettyacademy
    When select option 2 and then option 3
    Then The user should be able to see the change

  @case4
  Scenario: case four
    Given camilo want to navigate into rahulshettyacademy
    When In the Switch Window click the Open Window button
    Then is not shown, fail the test

  @case5
  Scenario: case five
    Given camilo want to navigate into rahulshettyacademy
    When In the Switch Tab click the Open Tab button
    Then view boton view all courses
    And Return to the first window

  @case6
  Scenario: case six
    Given camilo want to navigate into rahulshettyacademy
    When In the Switch To Alert type this string Stori Card and click the Alert button
    Then Print the text in the alert and click on OK
    And type the same string and click on the Confirm button and print the text
    Then click on ok

  @case7
  Scenario: case seven
    Given camilo want to navigate into rahulshettyacademy
    When In the Web Table  print the number of courses that are $25
    Then print their course names

  @case8
  Scenario: case eight
    Given camilo want to navigate into rahulshettyacademy
    When Print the names of all the Engineers in the Web Table

  @case9
  Scenario: case nine
    Given camilo want to navigate into rahulshettyacademy
    When in the iFrame example get the text highlighted in blue and print it
