Feature: Dynamic Element Component

  @template @feature_conversion
  Scenario: Page Component Template
    # ------------------ ACTION --------------------#
    #Button
    Given Click to dynamic "" button
    #Link
		Given Click to dynamic "" page
    #Dropdown
    When Select in dynamic dropdown "" with item ""
    # Textbox
    When Sendkey to dynamic textbox "" with value ""
    # Textarea
    When Sendkey to dynamic textarea "" with value ""
    # Radio
    When Click to dynamic "" radio
    # Checkbox
    When Click to dynamic "" checbox
    # ------------------ VERIFY --------------------#
    Then Verify text value "" in column "" in table
    
    Then Verify dynamic header or message "" is displayed
