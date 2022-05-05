 <?php
function isPrime($number)
{
global $checkIterations;
$checkIterations++;
if ($number == 0 || $number == 1) {
    return false;
}

if ($number == 2){
    return true;
}
if ($number % 2 == 0) {
    return false;
}

for($i=3; $i <= ceil(sqrt($number)); $i+=2)
{
    $checkIterations++;
    if ($number % $i == 0)
    {
        return false;
    }
}
return true;

    $numberToCheck = $_POST["n1"];
}
?>
<form method="post">
    <table align="center">
        <tr>
            <td><strong>
                    <?php
                    $numberToCheck = $_POST["n1"];
                    echo "Number $numberToCheck";
                    if (!(isPrime($numberToCheck)))
                    {
                        echo " is not prime";
                    }
                    else
                    {
                        echo " is prime";
                    }
                    ?>
                    <strong></td>
        </tr>
        <tr>
            <td>Enter your Number</td>
            <td><input type="text" name="n1"></td>
        </tr>

        </tr>

        <tr>
            <td></td>
            <td><input type="submit" name="submit" value="Check"></td>
        </tr>

    </table>
</form>