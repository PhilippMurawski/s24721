<?php
$destination = array('Germany' => 200, 'France' => 250, 'Belgium' => 300);

$price = 0;
$arrival = $_POST["arrival"];
$departure = $_POST["departure"];
$a = strtotime($arrival);
$d = strtotime($departure);
$people = (int)$_POST["people"];
$country = $_POST["country"];
$TimeOfVisit = (($d - $a)/86400);

if($a >= $d)
{
        echo "Error!";
}
else
{
    $price = ($people * $TimeOfVisit) * $destination[$country];
    echo "The price of your trip to " . $country . " cost: " . $price;
}

?>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Travel agencie</title>
    </head>
<form action="3.php" method="POST">

    <table>
        <tr>
            <td>Select your destination</td>
            <td><select name="country">
                    <?php
                    foreach ( $destination as $key => $name)
                    {
                        echo "<option name='  .$name . '>" . $key . "</option>";
                    }
                    ?>
                </select></td>
        </tr>
        <tr>
            <td>Arrival date</td>
            <td><input type="date" name="arrival"></td>
        </tr>
            <tr>
            <td>Departure date</td>
            <td><input type="date" name="departure"></td>
            </tr>
        <tr>
            <td>Number of people </td>
            <td><input type="number" min="1" name="people"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit"  value=" Submit "></td>
        </tr>

    </table>
</form>
</html>
