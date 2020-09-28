@download
Feature: As a PC user, I should be able to download Desktop version of the application.

  Background:
    Given User logged in to Bitrix24

  Scenario: User should be able to download Bitrix Desktop client for MacOS
    When User should be able to click on MacOs icon under Desktop Client
    Then User should see MacOS version of Bitrix downloaded

  Scenario: User should be able to download Bitrix Desktop client for Windows
    When User should be able to click on Windows icon under Desktop Client1
    Then User should see Windows version of Bitrix downloaded

  Scenario: User should be able to download Bitrix Desktop client for Linux
    When User should be able to click on Linux icon under Desktop Client
    Then User should see Linux version of Bitrix downloaded

