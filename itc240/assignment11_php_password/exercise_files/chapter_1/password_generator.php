<?php
/* $lower= 'abcdefghijklmnopqrstuvwxyz';
$upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
$numbers = '0123456789';
$symbols = '$*?!-';
$chars= $lower . $upper .$numbers . $symbols;
variables moved to generate_password function */

//can also use PHP range()
$upper_array= range('A', 'Z');
$num_array = range(0, 9);
$lower_array = range('a', 'z');
$lower = implode('', $lower_array);
$upper = implode('', $upper_array);
$num = implode('', $num_array);

function random_char($string){
    $i = mt_rand(0, strlen($string)-1);
    return $string[$i];
}

function random_string($length, $char_set){
    for($i=0; $i < $length; $i++){
    $output .= random_char($char_set);
    }
return $output;
}

function generate_password($length){
    //define character sets
    $lower= 'abcdefghijklmnopqrstuvwxyz';
    $upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    $numbers = '0123456789';
    $symbols = '$*?!-';

    //extract configuration flags into variables
    $use_lower = isset($_GET['lower']) ? $_GET['lower']: '0';
    $use_upper = isset($_GET['upper']) ? $_GET['upper']: '0';
    $use_numbers = isset($_GET['numbers']) ? $_GET['numbers']: '0';
    $use_symbols = isset($_GET['symbols']) ? $_GET['symbols']: '0';

    $chars= '';
    if($use_lower === '1'){ $chars .= $lower; }
    if($use_upper === '1'){ $chars .= $upper; }
    if($use_numbers === '1'){ $chars .= $numbers; }
    if($use_symbols === '1'){ $chars .= $symbols; }
    return random_string($length, $chars);
}

$password = generate_password($_GET['length']);


?>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Password Generator</title>
        <link rel="stylesheet" type="text/css" href="../../../basic_style.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Poppins&display=swap" rel="stylesheet"> 
    </head>
    <body>
        <p><pre><?php print_r($lower_array) ?><p></pre>
        <p><?php echo $chars ?><p>
        <p><?php echo $lower . $upper . $num . $symbols?><p>
        <p><?php echo random_char($chars); ?><p>
        <p><?php echo random_string(10, $chars); ?><p>
        <p><?php echo generate_password(8); ?><p>

        <p>Generate a new password using the form options.</p>
        <form action="" method="get">
            Length: <input type="text" name="length" value="<?php if(isset($_GET['length'])) { echo $_GET['length']; } ?>" /><br />
            <input type="checkbox" name="lower" value="1" <?php if($_GET['lower'] == 1) { echo 'checked'; } ?> /> Lowercase<br />
            <input type="checkbox" name="upper" value="1" <?php if($_GET['upper'] == 1) { echo 'checked'; } ?> /> Uppercase<br />
            <input type="checkbox" name="numbers" value="1" <?php if($_GET['numbers'] == 1) { echo 'checked'; } ?> /> Numbers<br />
            <input type="checkbox" name="symbols" value="1" <?php if($_GET['symbols'] == 1) { echo 'checked'; } ?> /> Symbols<br />
            <input type="submit" value="Submit" />
        </form>

        <p>Generated Password: <?php echo $password; ?></p>

    </body>
  </html>