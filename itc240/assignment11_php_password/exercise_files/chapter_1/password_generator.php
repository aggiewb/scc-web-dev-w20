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
    $use_lower = true;
    $use_upper = true;
    $use_num = true;
    $use_symbols = true;

    $chars= '';
    if($use_lower === true){ $chars .= $lower; }
    if($use_upper === true){ $chars .= $upper; }
    if($use_num === true){ $chars .= $num; }
    if($use_symbols === true){ $chars .= $symbols; }
    return random_string($length, $chars);
}


?>
<html>
<p><pre><?php print_r($lower_array) ?><p></pre>
<p><?php echo $chars ?><p>
<p><?php echo $lower . $upper . $num . $symbols?><p>
<p><?php echo random_char($chars); ?><p>
<p><?php echo random_string(10, $chars); ?><p>
<p><?php echo generate_password(8); ?><p>
</html>