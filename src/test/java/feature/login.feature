Feature: User Authentication tests

  Scenario: Login should be success
    Given User browse fanniemae webpage
    Then User confirms that the page is loaded and I am able to see 'Fannie Mae' on the page
    When User hover over to 'Calculators & Tools' and click on 'Tools for Homeowners'
    Then click on 'Loan-to-Value Ratio Calculator'
    And confirms that page with correct title is displayed

