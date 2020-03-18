<?php

function read_dictionary($filename=""){
    $dictionary_file = "dictionaries/{$filename}";
    return file($dictionary_file, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
}

function pick_random($array){
    //array_rand() uses rand() and libc random number 
    //generator which is slower, then random than mt_rand().
    //$i = array_rand($array);
    $i = mt_rand(0, count($array)-1);
    return $array[$i];
}

function pick_random_symbol(){
    $symbols = '$*?!-';
    $i = mt_rand(0, strlen($symbols)-1);
    return $symbols[$i];
}

function pick_random_number($digits=1){
    $min = pow(10, ($digits-1)); //e.g. 1000
    $max = pow(10, $digits)-1; //e.g. 9999
    return strval(mt_rand($min, $max));
}

$basic_words = read_dictionary('friendly_words.txt');
$brand_words = read_dictionary('brand_words.txt');

$words = array_merge($brand_words, $basic_words);
//could use array_unique() 
$password = "";
$password .= pick_random($words);
$password .= pick_random_symbol($words);
$password .= pick_random_number(3);
$password .= pick_random($words);

?>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Password Generator</title>
        <link rel="stylesheet" type="text/css" href="../../../basic_style.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Poppins&display=swap" rel="stylesheet"> 
    </head>
    <body>
        <p><?php
        echo "Friendly password: " . $password . "<br />";  
        ?></p>
    </body>
</html>