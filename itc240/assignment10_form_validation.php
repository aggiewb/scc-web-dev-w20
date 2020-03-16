<?php
#Add validation to the form fields, such as correct formats for name (all #characters), email and phone number with the correct format and permitted #characters or number and special characters.
$first_name = "";
$last_name = "";
$email = "";
$phone = "";
?>
<html>
    <head>
        <title>Regex Validation</title>
    </head>
    <body>
        <h1>Assignment 10: Regex Validation</h1>
        <p></p>
        <form method="POST" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            <label for="first_name">First Name:</label>
            <input type="text" id="first_name" name="first_name" required>
            <label for="last_name">Last Name:</label>
            <input type="text" id="last_name" name="last_name" required>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            <label for="phone">Phone Number</label>
            <input type="tel" id="phone" name="phone" required>
            <input type="submit" value="Submit">
        </form>
    </body>
</html> 