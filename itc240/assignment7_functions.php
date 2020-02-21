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
        <form method="post">
            <label for="userWordPhrase">Enter word or phrase:</label>
            <input type="text" id="userWordPhrase" name="userWordPhrase">
            <input type="submit" value="Submit">
        </form>

        <p><?php echo $isPalindrome ?></p>
    </body>
</html>