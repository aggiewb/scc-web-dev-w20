<?php

function detect_any_uppercase($string){
    //true is lowercasing changes string
    return strtolower($string) != $string;
}

function detect_any_lowercase($string){
    //true is uppercasing changes string
    return strtoupper($string) != $string;
}

function count_numbers($string){
    return preg_match_all('/[0-9]/', $string);
}

function count_symbols($string){
    //You have to decide which symbols count
    //Regex \W is any non-letter, non-number: too broad
    //Better to list the ones that count
    //Escape regex symbols to get their literal values
    $regex = '/[' . preg_quote('!@#$%^&*-_+=?') . ']/';
    return preg_match_all($regex, $string);
}

function password_strength($password){
    $strength = 0;
    $possible_points = 6;

    if(detect_any_uppercase($password)){
        $strength += 1;
    }

    if(detect_any_lowercase($password)){
        $strength += 1;
    }

    $strength += min(count_numbers($password), 2);
    $strength += min(count_symbols($password), 2);

    $strength_percent = $strength / (float)$possible_points;
    $rating = floor($strength_percent * 10);
    return $rating;
}

$password = $_POST['rate'];
$rating = password_strength($password);
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Password Strength Meter</title>
    <link rel="stylesheet" type="text/css" href="../../../basic_style.css">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans|Poppins&display=swap" rel="stylesheet"> 
  </head>
  <body>
    <p>Your password rating is: <?php echo $rating; ?>
    <p>Rate the strength of your password:</p>
    <form action="" method="post">
      Password: <input type="text" name="rate" value="" /><br />
      <input type="submit" value="Submit" />
    </form>
  </body>
</html>