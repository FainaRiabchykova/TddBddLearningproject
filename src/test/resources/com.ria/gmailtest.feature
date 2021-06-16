Feature: Checking Draft letter can be saved
  I want to check that draft email is saved
  So that I can be sure saving draft letters functionality works correctly

Scenario Outline:
  Given User signs in with '<email>' and '<password>'
  When User creates draft letter
  And User opens draft letter from the drafts folder
  Then User check that letter data is correct
  Examples:
    |email                |password|
    |qariatest@gmail.com  |Aaaa!111|
#    |qariatest2@gmail.com |Aaaa@222|
#    |qariatest3@gmail.com |Aaaa#333|
#    |qariatest4@gmail.com |Aaaa$444|
#    |qariatest5@gmail.com |Aaaa%555|



