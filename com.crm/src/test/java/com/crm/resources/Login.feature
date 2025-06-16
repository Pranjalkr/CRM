
@tag
Feature:  Login Page

	Background:
	Given open the browser
	Given I click on loginbutton
	Given Enter UserName <username> and Password <password>
	
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I click on loginbutton

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
     
