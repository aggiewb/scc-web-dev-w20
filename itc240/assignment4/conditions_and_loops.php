<?php
//total meal cost section variables
$meal_cost = 41.55;
$tip_percent = 20 / 100;
$tip_amount = $meal_cost * $tip_percent;
$tax_percent = 10.1 / 100;
$tax_amount = $meal_cost * $tax_percent;
$total_cost = $meal_cost + $tax_amount + $tip_amount;

//meal cost section formatted variables
$meal_cost_f = number_format($meal_cost, 2);
$tip_amount_f = number_format($tip_amount, 2);
$tax_amount_f = number_format($tax_amount, 2);
$total_cost_f = number_format($total_cost, 2);


//for loop for free meal
$random_number = rand(5, 7);
for($counter = 0; $counter < 11; $counter++){
    echo $counter;
    if($counter == $random_number){
        echo ' is your random number';
    }
    echo nl2br("\n");
}
?>

<html>
    <head></head>
    <body>
        <h1>Assignment 3</h1>
        <p>This is for a three part assignment to test my knowledge of conditions and loops.</p>
        <h2>Total Meal Cost:</h2>
        <ul>
            <li>Meal cost: <php? $meal_cost_f ?></li>
            <li>Tip: <?php $tip_amount_f ?></li>
            <li>Tax: <?php $tax_amount_f ?></li>
            <li>Total: <?php $total_cost_f ?></li>
        </ul>
        <h2>How pricey is this meal?!</h2>
        <p><?php
        //desicion tree for meal price
        if($total_cost < 20){
            echo 'Bargain price.';
        } elseif($total_cost > 20 || $total_cost < 40){
            echo 'Moderate price.';
        } elseif($total_cost > 40) {
            echo 'That is a pricey meal!';
        } else {
            echo 'Have you entered a valid number?';
        }
        ?></p>
        <h2>Random Drawing for a Free Meal!</h2>
    </body>
</html>