<?php

function read_dictionary($filename=""){
    $dictionary_file = "dictionaries/{$filename}";
    return file($dictionary_file, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
}

$basic_words = read_dictionary('friendly_words.txt');
$brand_words = read_dictionary('brand_words.txt');

$words = array_merge($brand_words, $basic_words);
//could use array_unique() 
?>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Password Generator</title>
        <link rel="stylesheet" type="text/css" href="../../../basic_style.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Poppins&display=swap" rel="stylesheet"> </head>
    <body>
        <p><?php 
        echo $words[0]. "<br />";
        echo $words[1]. "<br />"; 
        echo $words[2]. "<br />"; 
        echo $words[3]. "<br />"; 
        echo $words[4]. "<br />"; 
        echo $words[5]. "<br />";
        echo $words[6]. "<br />";  
        echo $words[7]. "<br />";  
        echo $words[8]. "<br />";    
        ?></p>
    </body>
</html>