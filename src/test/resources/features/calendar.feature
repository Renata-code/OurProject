@calendar
Feature: Adding events in Calendar
    Agile User Story: User should be able login to Bitrix page
    then should be able to click on Calendar icon and should be able to fill out the pop-up window
    and then click on save button

    Given User is on login page
    Scenario: User is on the page

  Then User enters credentials
  Then User clicks on Calendar icon
  Then User fill out the event pop-up
  Then User should be able to click on save button

