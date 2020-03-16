<?php
#Add validation to the form fields, such as required fields and correct formats for name (all characters), 
#email and phone number with the correct format and permitted characters or number and special characters.
?>
<html>
    <head>
        <title>Regex Validation</title>
    </head>
    <body>
        <h1>Assignment 10: Regex Validation</h1>
        <p></p>
        <form action="assignment10_form_validation.php" method="POST">
            <label for="first_name">First Name:</label>
            <input type="text" id="first_name" name="first_name">
            <label for="last_name">Last Name:</label>
            <input type="text" id="last_name" name="last_name">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email">
            <label for="phone">Phone Number</label>
            <input type="tel" id="phone" name="phone">
            <input type="submit" value="Submit">
        </form>
    </body>
</html> 