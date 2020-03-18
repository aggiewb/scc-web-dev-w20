<?php
  
$lower = 'abcdefghijklmnopqrstuvwxyz';
$upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
$numbers = '0123456789';
$symbols = '$*?!-';

$chars = $lower . $upper . $numbers . $symbols;

function random_char($string) {
  $i = mt_rand(0, strlen($string)-1);
  return $string[$i];
}

echo random_char($chars);

?>