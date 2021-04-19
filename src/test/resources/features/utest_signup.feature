@utest
Feature: Utest registration form
  In order to use utest
  As a user
  I want to be able to register

  Scenario Outline: Diego is successfully registered
    Given that Diego is in the registration form
    When He fills all the registration form steps
      | firstName | lastName | email | birthDate | language | city | zip | country | computerOs | computerVersion | computerLanguage | mobile | mobileModel | mobileOs | password | isCheckedTerms | isCheckedPrivacyPolicy |
      |<firstName>|<lastName>|<email>|<birthDate>|<language>|<city>|<zip>|<country>|<computerOs>|<computerVersion>|<computerLanguage>|<mobile>|<mobileModel>|<mobileOs>|<password>|<isCheckedTerms>|<isCheckedPrivacyPolicy>|
    Then he sees the welcome message page

    Examples:
      | firstName | lastName  | email  | birthDate  | language  | city  | zip  | country  | computerOs | computerVersion | computerLanguage | mobile | mobileModel | mobileOs | password | isCheckedTerms | isCheckedPrivacyPolicy |
      | Diego | Alvarez  | test@dalvareztest.com  | August/17/1995  | Spanish  | Medellín  | 050021  | Colombia  | Windows | 10 64-bit | English | Xiaomi | Redmi Note 8 | Android 10 | The!RedHouse13* | true | true |