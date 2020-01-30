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

//desicion tree for meal price
if($total_cost < 20){
    echo 'Good price';
} elseif($total_cost > 20 || $total_cost < 40){
    echo 'Reasonably price';
} elseif($total_cost > 40) {
    echo 'That is a pricey meal!';
} else {
    echo 'Have you entered a valid number?';
}
?>