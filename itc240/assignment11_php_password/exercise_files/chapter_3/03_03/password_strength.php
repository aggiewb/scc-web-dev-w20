<?php
  
function password_strength($password) {
  $strength = 0;
  $possible_points = 5;
  
  $strength_percent = $strength / (float) $possible_points;
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
