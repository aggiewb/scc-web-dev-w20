<?php

/* Assignment: Write a class to represent a basic artithmetic operations calculator. 
Your class should have the ability to add, subtract, multiply or divide two numbers. 
Be sure to add several tests for your calculator class. */

class Calculator {
    public $num1 = 0;
    public $num2 = 0;
    public $result = 0;

    function add(){
        $this->result = $this->num1 + $this->num2;
        return $this->result; 
    }

    function substract(){
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
    </head>
    <body>
        <h1>Assignment 8: PHP Classes</h1>
        <p>This calculator tests my knowledge of PHP classes.</p>
        <form>
            <input type="number" name="num1">
            <select name="operations">
                <option value="add">PLUS(+)</option>
                <option value="sub">MINUS(-)<option>
                <option value="mult">TIMES(*)<option>
                <option value="div">DIVIDED BY(/)</option>
            </select>
            <input type="number" name="num2">
            <input type="submit" value="equals">
        </form>
    </body>
</html>