<?php

$userWordPhrase = $_POST['userWordPhrase'];

function isPalindrome($str){
    $backwardsWordPhrase = strrev($str);
    $palindrome = strcmp($userWordPhrase, $backwardsWordPhrase);
    if($palindrome == 0){
        return true;
    }
}


?>
<html>
    <head></head>
    <body>
        <form method="post">
            <label for="userWordPhrase">Enter word or phrase:</label>
            <input type="text" id="userWordPhrase" name="userWordPhrase">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>