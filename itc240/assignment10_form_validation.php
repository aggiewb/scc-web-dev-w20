<?php
$first_name = "";
$last_name = "";
$email = "";
$phone = "";

function user_input($data) {
    $data = trim($data);
    $data = stripslashes($data);
    $data = htmlspecialchars($data);
    return $data;
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (empty($_POST["first_name"])) {
        $first_nameErr = "First name is required";
    } else {
        $first_name = user_input($_POST["first_name"]);
        if (isset($_POST['email']) && !preg_match("/^[a-zA-Z-]*$/",$first_name)){
            $first_nameErr = "Only letters, hyphens and white space allowed";
        }
    }

    if (empty($_POST["last_name"])) {
        $last_nameErr = "Last name is required";
    } else {
        $last_name = user_input($_POST["last_name"]);
        if(isset($_POST['email']) && !preg_match("/^[a-zA-Z-]*$/",$last_name)){
            $last_nameErr = "Only letters, hyphens and white space allowed";
        }
    }

    if (empty($_POST["email"])) {
        $emailErr = "Email is required";
    } else {
        $email = user_input($_POST["email"]);
        if (isset($_POST['email']) && !filter_var($email, FILTER_VALIDATE_EMAIL)) {
            $emailErr = "Invalid email format";
        }
    }

    if (empty($_POST["phone"])) {
        $phoneErr = "Phone number is required";
    } else {
        $phone = user_input($_POST["phone"]);
        if(isset($_POST['phone']) && !preg_match("/^[0-9]{3}-[0-9]{4}-[0-9]{4}$/", $phone)) {
            $phoneErr = "Invalid phone number format. Please enter area code and six digit phone number with hyphens.";
          }
    }
}
?>

<html>
    <head>
        <title>Regex Validation</title>
        <link rel="stylesheet" type="text/css" href="basic_style.css">
        <meta charset="UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Poppins&display=swap" rel="stylesheet"> 
    </head>
    <body>
        <h1>Assignment 10: Regex Validation</h1>
        <p></p>
        <form method="POST" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            <label for="first_name">First Name:</label>
            <input type="text" id="first_name" name="first_name">
            <p><?php echo $first_nameErr;?></p>
            <label for="last_name">Last Name:</label>
            <input type="text" id="last_name" name="last_name">
            <p><?php echo $last_nameErr;?></p>            
            <label for="email">Email:</label>
            <input type="email" id="email" name="email">
            <p><?php echo $emailErr;?></p>
            <label for="phone">Phone Number:</label>
            <input type="tel" id="phone" name="phone">
            <p><?php echo $phoneErr;?></p>
            <input type="submit" value="Submit">
        </form>
    </body>
</html> 