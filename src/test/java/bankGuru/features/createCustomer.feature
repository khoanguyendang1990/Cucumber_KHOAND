@newCustomer
Feature: Dynamic Page Component

  Scenario Outline: Create new customer
    Given Sendkey to dynamic textbox "uid" with value "mngr251894"
    And Sendkey to dynamic textbox "password" with value "supusan"
    When Click to dynamic "LOGIN" button
    And Click to dynamic "New Customer" page
    And Sendkey to dynamic textbox "name" with value "<Customer Name>"
    And Click to dynamic "m" radio
    And Sendkey to dynamic textbox "dob" with value "<Date Of Birth>"
    And Sendkey to dynamic textarea "addr" with value "<Address>"
    And Sendkey to dynamic textbox "city" with value "<City>"
    And Sendkey to dynamic textbox "state" with value "<State>"
    And Sendkey to dynamic textbox "pinno" with value "<PIN>"
    And Sendkey to dynamic textbox "telephoneno" with value "<Phone>"
    And Sendkey to dynamic textbox "emailid" with value "<Email>"
    And Sendkey to dynamic textbox "password" with value "<Password>"
    And Click to dynamic "Submit" button
    Then Verify dynamic header or message "Customer Registered Successfully!!!" is displayed
    And Verify text value "<Customer Name>" in column "Customer Name" in table
    And Verify text value "<Gender>" in column "Gender" in table
    And Verify text value "<Date Of Birth>" in column "Birthdate" in table
    And Verify text value "<Address>" in column "Address" in table
    And Verify text value "<City>" in column "City" in table
    And Verify text value "<State>" in column "State" in table
    And Verify text value "<PIN>" in column "Pin" in table
    And Verify text value "<Phone>" in column "Mobile No." in table
    And Verify text value "<Email>" in column "Email" in table

    Examples: 
      | Customer Name | Gender | Date Of Birth | Address          | City        | State   | PIN    | Phone      | Email    | Password |
      | Kingsley      | male   | 05-28-1990    | 54 Tran Quang Co | Ho Chi Minh | Sai Gon | 280590 | 0938992805 | kingsley |   123123 |
