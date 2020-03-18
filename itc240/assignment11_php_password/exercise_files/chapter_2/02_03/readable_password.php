<?php

// can use full path or relative path  
$dictionary_file = 'dictionaries/friendly_words.txt';
$lines = file($dictionary_file, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);

echo $lines[0] . "<br />";
echo $lines[1] . "<br />";
echo $lines[2] . "<br />";
echo $lines[3] . "<br />";
echo $lines[4] . "<br />";

?>