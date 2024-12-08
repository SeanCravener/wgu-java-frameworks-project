# Sean Cravener - D287 Project

B. Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.

    1. Created README file to record changes for parts C to J.

C. Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts. Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

    1. File: mainscreen.html - Line 14 - Changed "My Bicycle Shop" to "Sean's Skateboard Warehouse".
    2. File: mainscreen.html - Line 19 - Changed "Shop" to "Sean's Skateboard Warehouse".
    3. File: mainscreen.html - Line 21 - Changed "Parts" to "Skateboard Parts".
    4. File: mainscreen.html - Line 53 - Changed "Products" to "Skateboards".

D. Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

    1. File: about.html - Entire file - Added html to display About page with text describing Sean's Skateboard Warehouse. Including link in navigate back to the mainscreen.
    2. File: AboutController.java - Entire file - Added contoller for about.html to enable navigation to the About page from the mainscreen.
    3. File: mainscreen.html - Line 24 - Added a link to navigate to the About page.
    4. File: mainscreen.html - Line 25 - Added an extra divider below the About page link.

E. Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database. Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

    1. File: BootStrapData.java - Line 59 to Line 113 - Added if statement block that only executes if there are no parts or products already in the database.
    2. File: BootStrapData.java - Line 61 to Line 71 - Created five sample products and saved them to the product repository.
    3. File: BootStrapData.java - Line 73 to Line 112 - Created five sample parts and saved them to the part repository.

F. Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters: The “Buy Now” button must be next to the buttons that update and delete products.; The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.; Display a message that indicates the success or failure of a purchase.

    1. File: AddProductController.java - Line 177 to Line 187 - Added mapping to handle navigation for displaying whether the product purchase was a success or error.
    2. File: Product.java - Line 94 to Line 103 - Added boolean check method in Product class that substracts one from the inventory if the inventory is greater than 0.
    3. File: buyfailed.html - Added file - Added html to display the purchase failur message.
    4. File: buysuccessfull.html - Added file - Added html to display the purchase success message.
    5. File: mainscreen.html - Line 129 to Line 134 - Added buy button next to the update and delete button for the products table.

G. Modify the parts to track maximum and minimum inventory by doing the following:; -Add additional fields to the part entity for maximum and minimum inventory.; -Modify the sample inventory to include the maximum and minimum fields.; -Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.; -Rename the file the persistent storage is saved to.; -Modify the code to enforce that the inventory is between or at the minimum and maximum value.

    1. File: Part.java - Line 31 to Line 33 - Added additional fields for minimum and maximum inventory values.
    2. File: Part.java - Line 47 to Line 48 - Added default minimum and maximum inventory values to constructor.
    3. File: Part.java - Line 56 to Line 57 - Added default minimum and maximum inventory values to constructor.
    4. File: Part.java - Line 92 to Line 107 - Added getters and setters for newly added fields, minInv and maxInv.
    5. File: Part.java - Line 120 to Line 126 - Added method to enfore that the inventory is at the minimum or maximum values.
    6. File: BootStrapData.java - Line 108 to Line 117 - Modified the sample parts invetory to include minimum and maximum inventory values.
    7. File: InhousePartForm.html - Line 45 to Line 59 - Added fields for setting minimum and maximum inventory values.
    8. File: OutsourcedPartForm.html - Line 43 - Line 59 - Added fields for setting minimum and maximum inventory values.
    9. File: application.properties - Line 5 - Renamed file for the persistant storage from "spring-boot-h2-db102" to "skateboard-warehouse-inventory".
    10. File: OutsourcedPartServiceImpl.java - Line 52 - Added call to enforceValidInventory() to enfore that the inventory is set at either the minimum or maximum invetory values.
    11. File: InhousePartServiceImpl.java - Line 54 - Added call to enforceValidInventory() to enfore that the inventory is set at either the minimum or maximum invetory values.

H. Add validation for between or at the maximum and minimum fields. The validation must include the following:; -Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.; -Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.; -Display error messages when adding and updating parts if the inventory is greater than the maximum.

    1. File: EnufPartsValidator.java - Line 36 - Added OR condition to existing if statement for checking if invetory drops below the set minimum inventory value.
    2. File: MinimumInventoryValidator.java - Added File - Added validator for the set minimum inventory.
    3. File: ValidMinimumInventory.java - Added File - Error message for minimum inventory validator.
    4. File: MaximumInventoryValidator.java - Added File - Added validator for the set maximum inventory.
    5. File: ValidMaximumInventory.java - Added File - Error message for maximum inventory validator.
    6. File: Part.java - Line 4 to Line 5 - Imported validators for minimum and maximum inventory.
    7. File: Part.java - Line 21 to Line 22 - Added reference to ValidMinimumInventory and ValidMaximumInventory validators.

I. Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

    1. File: PartTest.java - Line 104 to Line 138 - Added tests for the minimum and maximum field getters and setters.

J. Remove the class files for any unused validators in order to clean your code.
