<?php

/* Assignment: Write a class to represent a basic artithmetic operations calculator. 
Your class should have the ability to add, subtract, multiply or divide two numbers. 
Be sure to add several tests for your calculator class. */

class Calculator {
    public $num1 = 0;
    public $num2 = 0;
    public $result = 0;
    public $operator = "";

    function add(){
        $this->result = $this->num1 + $this->num2;
        return $this->result; 
    }

    function subtract(){
        $this->result = $this->num1 - $this->num2;
        return $this->result;   
    }

    function divide(){
        $this->result = $this->num1 / $this->num2;
        return $this->result;   
    }

    function multiply(){
        $this->result = $this->num1 * $this->num2;
        return $this->result; 
    }
}
?>

<html>
    <head>
        <title>Assignment 8</title>
        <link rel="stylesheet" type="text/css" href="basic_style.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Poppins&display=swap" rel="stylesheet"> 
    </head>
    <body>
        <h1>Assignment 8: PHP Classes</h1>
        <p>This calculator tests my knowledge of PHP classes.</p>
        <form method="POST">
            <input type="number" name="num1">
            <select name="operations">
                <option value="">Select operator</option>
                <option value="add">PLUS(+)</option>
                <option value="sub">MINUS(-)</option>
                <option value="mult">TIMES(*)</option>
                <option value="div">DIVIDED BY(/)</option>
            </select>
            <input type="number" name="num2">
            <input type="submit" value="CALCULATE">
        </form>
        <?php
        $calc = new Calculator;
        $calc->num1 = $_POST['num1'];
        $calc->num2 = $_POST['num2'];

        if(isset($_POST['operations'])){
            if($_POST['operations'] == 'add'){
                $calc->result = $calc->add();
                $calc->operator = "+";
            } elseif($_POST['operations'] == 'sub'){
                $calc->result = $calc->subtract();
                $calc->operator = "-";
            } elseif($_POST['operations'] == 'mult'){
                $calc->result = $calc->multiply();
                $calc->operator = "*";
            } elseif($_POST['operations'] == 'div') {
                $calc->result = $calc->divide();
                $calc->operator = "/";
            } else {
                $calc->result = "Please select an operator.";
            }
            echo "<p>" . $calc->num1 . " " . $calc->operator. " " . $calc->num2 . " = " . $calc->result . "</p>";
        } 
        ?>
        <a href="https://github.com/aggiewb/scc-web-dev-w20/blob/master/itc240/assignment8_classes.php" target="_blank">GitHub PHP code for calculator</a>
    </body>
</html>