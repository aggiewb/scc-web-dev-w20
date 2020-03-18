<?php
  
$lower = 'abcdefghijklmnopqrstuvwxyz';
$upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
$numbers = '0123456789';
$symbols = '$*?!-';

$chars = $lower . $upper . $numbers . $symbols;

echo $chars;
echo '<br />';

// can also use PHP range()

$lower = implode(range('a', 'z'));
$upper = implode(range('A', 'Z'));
$numbers = implode(range(0, 9));
$symbols = '$*?!-';

$chars = $lower . $upper . $numbers . $symbols;

echo $chars;
?>