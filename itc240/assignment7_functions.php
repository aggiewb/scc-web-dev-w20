<?php

$userWordPhrase = $_POST['userWordPhrase'];

function isPalindrome($str){
    $backwardsWordPhrase = strrev($str);
    $palindrome = strcmp($userWordPhrase, $backwardsWordPhrase);
    if($palindrome == 0){
        return true;
    } else {
        return false;
    }
}


if(isPalindrome($userWordPhrase) == true){
    $isPalindrome = "Your word or phrase is a palindrome!";
} else {
    $isPalindrome = "Your word or phrase is not a palindrome."
}

?>
<html>
    <head></head>
    <body>
        <h1>Assignment 7: PHP Functions</h1>
        <p>This is for a two part assignment to test my knowledge of functions.</p>
        <h2>To palindrome or not to palindrome, that is the question!</h2>
        <p>Input a word or phrase that will be checked to see if it's a palindrome.</p>
        <form method="post">
            <label for="userWordPhrase">Enter word or phrase:</label>
            <input type="text" id="userWordPhrase" name="userWordPhrase">
            <input type="submit" value="Submit">
        </form>

        <p><?php echo $isPalindrome ?></p>
    </body>
</html>