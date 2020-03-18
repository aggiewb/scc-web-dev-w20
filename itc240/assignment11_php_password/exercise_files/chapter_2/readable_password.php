<?php

$dictionary_file = 'dictionaries/friendly_words.txt';
$lines = file($dictionary_file, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);

?>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Password Generator</title>
        <link rel="stylesheet" type="text/css" href="../../../basic_style.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Poppins&display=swap" rel="stylesheet"> </head>
    <body>
        <p><?php 
        echo $lines[0]. "<br />";
        echo $lines[1]. "<br />"; 
        echo $lines[2]. "<br />"; 
        echo $lines[3]. "<br />"; 
        echo $lines[4]. "<br />"; 
        echo $lines[5]. "<br />";  
        ?></p>
    </body>
</html>