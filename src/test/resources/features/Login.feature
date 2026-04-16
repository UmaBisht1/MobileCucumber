Feature: Settings Test
  @Verify_Title
  Scenario: Verify settings screen
    Given user launches the mobile app
    Then verify settings title is displayed

  @Verify_mobile_search
  Scenario: Verify search in settings
    Given user launches the mobile app
    When user searches for "about phone"
    Then results should be displayed

  @Verify_mobile_search_AboutPhone
  Scenario: Verify search in settings
    Given user launches the mobile app
    When user searches for "about phone"
    Then results should be displayed
    Then user naviagetes to "about phone" screen

