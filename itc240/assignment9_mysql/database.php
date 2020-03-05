<?php
    $dsn = 'mysql:host=mysql.stanimeredith.dreamhosters.com;dbname=stanimeredithmy_guitar_shop1';
    $username = 'tester_stani';
    $password = 'tester12';

    try {
        $db = new PDO($dsn, $username, $password);
    } catch (PDOException $e) {
        $error_message = $e->getMessage();
        include('database_error.php');
        exit();
    }
?>