<?php
//get the data from the form
$product_description = filter_input(INPUT_POST, 'product_description');
$list_price = filter_input(INPUT_POST, 'list_price');
$discount_percent = filter_input(INPUT_POST, 'discount_percent');

//calculate the discount and discounted price
$discount = $list_price * $discount_percent * 0.01;
$discount_price = $list_price - $discount;

//calculate the sales tax amount
define("SALES_TAX_RATE", 8);
$sales_tax_amount = $discount_price * SALES_TAX_RATE * 0.01;

//calculate total amount due
$total_amount = $discount_price + $sales_tax_amount;

//apply currency formatting and pecent format
$list_price_f = "$" . number_format($list_price, 2);

$discount_percent_f = $discount_percent . "%";
$discount_f = "$" . number_format($discount, 2);
$discount_price_f = "$" . number_format($discount_price, 2);

$sales_tax_rate_f = SALES_TAX_RATE . "%";
$sales_tax_amount_f = "$" . number_format($sales_tax_amount, 2);

$total_amount_f = "$" . number_format($total_amount, 2);
?>


<!DOCTYPE html>
<html>
    <head>
        <title>Product Discount Calculator</title>
        <link rel="stylesheet" type="text/css" href="main.css">
    </head>
    <body>
        <main>
            <h1>Product Discount Calculator</h1>
            <label>Product Description:</label>
            <span><?php echo htmlspecialchars($product_description); ?></span>
            <br>
            <label>List Price:</label>
            <span><?php echo htmlspecialchars($list_price_f); ?></span>
            <br>
            <label>Standard Discount:</label>
            <span><?php echo htmlspecialchars($discount_percent_f); ?></span>
            <br>
            <label>Discount Amount:</label>
            <span><?php echo htmlspecialchars($discount_f); ?></span>
            <br>
            <label>Discount Price:</label>
            <span><?php echo $discount_price_f; ?></span>
            <br>
            <br>
            <label>Sales Tax Rate:</label>
            <span><?php echo $sales_tax_rate_f; ?></span>
            <br>
            <label>Sales Tax Amount:</label>
            <span><?php echo $sales_tax_amount_f ?></span>
            <br>
            <br>
            <label>Total Amount:</label>
            <span><?php echo $total_amount_f; ?></span>
            <div>
        </main> 
    </body>
</html>