Feature: Fragrance

Feature: Fragrance Selection

  Scenario: End-to-End Flow for Fragrance Selection
    Given the User is on the Login or Register page
    When the User enters their Login name as "Gurpreet152512" and password as "Password@123"
    And clicks on the login button
    Then the User should be redirected to the My Account page
    And the User hovers over the Fragrance category
    And selects the Men's option
    Then the User should be on the Men's Fragrance page
    When the User selects a perfume
    And adds it to the cart
    And proceeds to checkout
    And confirms the order
    Then the User should see a confirmation message stating "Your Order Has Been Processed!"
