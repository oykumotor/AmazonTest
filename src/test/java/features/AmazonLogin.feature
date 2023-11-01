Feature: Amazon Login Page

        Background: Login with valid credentials
                Given : I clicked the login button on the home page.
                And : I am on the login page.
                When :  I write my e-mail address in the e-mail text field.
                And : I click continue button.
                And : I type the password in the password text field.
                And : I click login button.
                Then I should be on the users home page

        Scenario: Search for a product

                Given : I'm on the home page.
                When : Write the product name in the search box.
                When : Click the search button.
                And : Filter products by price from low to high
                And : Click to the first product on the listing.
                And : I add the first product to my cart.
                And : Click to my cart button.
                Then : I should see the product that I added on my cart.




