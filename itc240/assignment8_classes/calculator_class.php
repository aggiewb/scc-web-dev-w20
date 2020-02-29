<?php

class Calculator {
    var $num1 = 0;
    var $num2 = 0;
    var $result = 0;

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