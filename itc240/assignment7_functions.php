<?php
$userWord = "";
$userWord = $_POST['userWord'];

function isPalindrome($str){
    $str = strtolower(htmlspecialchars($str));
    $backwardsWord = strrev($str);
    $palindrome = strcmp($str, $backwardsWord);
    if($palindrome == 0){
        return true;
    } else {
        return false;
    }
}

$arr = [22, 15, -2, 4];
function sortArray($arr){
    for($i = 0; $i < count($arr); $i++){
        for($j = $i + 1; $j < count($arr); $j++){
            if($arr[$i] > $arr[$j]){
                $temp = $arr[$i];
                $arr[$i] = $arr[$j];
                $arr[$j] = $temp;
            }     
        }
    }
    return $arr;
}

?>
<html>
    <head>
        <title>Assignment 7</title>
        <link rel="stylesheet" type="text/css" href="basic_style.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Poppins&display=swap" rel="stylesheet"> 
    </head>
    <body>
        <h1>Assignment 7: PHP Functions</h1>
        <p>This is for a two part assignment to test my knowledge of functions.</p>
        <h2>To palindrome or not to palindrome, that is the question!</h2>
        <p>A palindrome is a word hat reads the same backward as forward, e.g., radar or kayak. Input a word that will be checked to see if it's a palindrome.</p>
        <form method="post">
            <label for="userWord">Enter a word:</label>
            <input type="text" id="userWord" name="userWord">
            <input type="submit" value="Submit">
        </form>
        <p><?php 
        if(isset($userWord)){
            if(isPalindrome($userWord) == true){
                echo "Congrats! Your word is a palindrome!";
            } elseif (isPalindrome($userWord) == false) {
                echo "Your word is NOT a palindrome.";
            }
        } 
        ?></p>
        <h2>Sorting an Array</h2>
        <p>This section demonstrates sorting an array with the use of a built in PHP function. Instead it uses a personally built function that takes an array as argument and return the sorted array. Both the unsorted and sorted array will be print using print_r function.</p>
        <p>The unsorted array is <pre><?php print_r($arr); ?></pre></p>
        <p>The sorted array is <pre><? print_r(sortArray($arr)); ?></pre></p>
    </body>
</html>