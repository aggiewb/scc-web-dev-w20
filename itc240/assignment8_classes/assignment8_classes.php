<?php

/* Assignment: Write a class to represent a basic artithmetic operations calculator. 
Your class should have the ability to add, subtract, multiply or divide two numbers. 
Be sure to add several tests for your calculator class. */

class Calculator {
    public var $num1 = 0;
    public var $num2 = 0;
    public var $result = 0;

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