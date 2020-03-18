<?php

function read_dictionary($filename="") {
  // can use full path or relative path  
  $dictionary_file = "dictionaries/{$filename}";
  return file($dictionary_file, FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
}

function pick_random($array) {
  // array_rand() uses rand() & libc random number generator
  // which is slower, less random than mt_rand().
  // $i = array_rand($array);
  $i = mt_rand(0, count($array) -1);
  return $array[$i];
}

$basic_words = read_dictionary('friendly_words.txt');
$brand_words = read_dictionary('brand_words.txt');

$words = array_merge($brand_words, $basic_words);
// could use array_unique()

$password = "";
$password .= pick_random($words);
$password .= pick_random($words);
$password .= pick_random($words);

echo "Friendly password: " . $password . "<br />";

?>