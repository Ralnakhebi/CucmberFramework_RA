@UI_Test
Feature: Validate the Subscription Packages
  Background: stctv subscription page should be displayed and language should set to English
    Given user at stctv subscription page
    And page displayed with English language


#   -------- Saudi Arabia Behavior-driven development (BDD) Scenarios --------
  Scenario: Validate the Subscription Classic package for SA for
    When user choose "KSA" Country
    And user choose "Classic" package
    And Payment Method page should be displayed
    Then paying using "stc" is "25.00" "SAR"
    And  paying using "visa" is "40.00" "SAR"
    And close the page

  Scenario: Validate the Subscription Premium package for SA for
    When user choose "KSA" Country
    And user choose "Premium" package
    And Payment Method page should be displayed
    Then paying using "stc" is "60.00" "SAR"
    And  paying using "visa" is "60.00" "SAR"
    And close the page

  Scenario: Validate the Subscription Lite package for SA for
    When user choose "KSA" Country
    And user choose "Lite" package
    And Payment Method page should be displayed
    Then paying using "stc" is "15.00" "SAR"
    And  paying using "visa" is "20.00" "SAR"
    And close the page


#   -------- Kuwait Behavior-driven development (BDD) Scenarios --------
  Scenario: Validate the Subscription Classic package for Kuwait
    When user choose "Kuwait" Country
    And user choose "Classic" package
    And Payment Method page should be displayed
    Then paying using "stc" is "2.50" "KWD"
    And  paying using "visa" is "2.94" "KWD"
    And close the page

  Scenario: Validate the Subscription Premium package for Kuwait
    When user choose "Kuwait" Country
    And user choose "Premium" package
    And Payment Method page should be displayed
    Then paying using "stc" is "4.80" "KWD"
    And  paying using "visa" is "4.41" "KWD"
    And close the page

  Scenario: Validate the Subscription Lite package for Kuwait
    When user choose "Kuwait" Country
    And user choose "Lite" package
    And Payment Method page should be displayed
    Then paying using "stc" is "1.20" "KWD"
    And  paying using "visa" is "1.47" "KWD"
    And close the page

#   -------- Bahrain Behavior-driven development (BDD) Scenarios --------
  Scenario: Validate the Subscription Classic package for Bahrain
    When user choose "Bahrain" Country
    And user choose "Classic" package
    And Payment Method page should be displayed
    Then paying using "stc" is "3.00" "BHD"
    And  paying using "visa" is "3.62" "BHD"
    And close the page

  Scenario: Validate the Subscription Premium package for Bahrain
    When user choose "Bahrain" Country
    And user choose "Premium" package
    And Payment Method page should be displayed
    Then paying using "stc" is "6.00" "BHD"
    And  paying using "visa" is "5.43" "BHD"
    And close the page

  Scenario: Validate the Subscription Lite package for Bahrain
    When user choose "Bahrain" Country
    And user choose "Lite" package
    And Payment Method page should be displayed
    Then paying using "stc" is "2.00" "BHD"
    And  paying using "visa" is "1.81" "BHD"
    And close the page