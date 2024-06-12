Feature: create a new device using Rest Assured Library
  @API_Test
  Scenario: send a post request to create a new device
    When user send post request with needed payload
    Then Validate the Response body