Feature: Add to basket

  @smoke
  Scenario:Add to basket and delete product from basket

    Given The user visits HepsiBurada homepage
    And The user verifies redirected to homepage
    And The user fills "iphone" in the searchbox and click
    And The user verifies redirected to "/ara?q=iphone" page
    Then The user clicks any product
    And The user clicks Degerlendirmeler tab button
    And The user clicks Yes button of first comment
    And The user verifies "Teşekkür Ederiz." message


