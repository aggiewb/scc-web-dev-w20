<?php
$lower= 'abcdefghijklmnopqrstuvwxyz';
$upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
$numbers = '0123456789';
$symbols = '$*?!-';
$chars= $lower . $upper .$numbers . $symbols;

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


?>
<html>
<p><pre><?php print_r($lower_array) ?><p></pre>
<p><?php echo $chars ?><p>
<p><?php echo $lower . $upper . $num . $symbols?><p>
<p><?php echo random_char($chars); ?><p>
<p><?php echo random_string(10, $chars); ?><p>
</html>