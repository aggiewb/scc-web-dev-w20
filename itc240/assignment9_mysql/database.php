<?php
    $dsn = 'mysql:host=mysql.aggiewheelerbateman.com;dbname=my_guitar_shop_dusty_strings';
    $username = '';
    $password = '';

    try {
        $db = new PDO($dsn, $username, $password);
    } catch (PDOException $e) {
        $error_message = $e->getMessage();
        include('database_error.php');
        exit();
    }
?>