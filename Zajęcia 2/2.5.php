<?php
Kalkulator (1,5,5,5);

function prostokąt($a,$b)
{
    return ($a*$a) + ($b*$b);
}
function trójkąt ($a,$b)
{
    return ($a*$b)/2;
}
function trapez ($a,$b,$h)
{
    return (($a + $b)*$h)/2;
}
function kalkulator ($figura,$a, $b, $h)
{
    echo "twoj wynik to ";

    switch ($figura) {
        case "1":
           echo prostokąt($a,$b);
            break;
        case '2':
           echo trójkąt($a,$b);
            break;
        case '3':
           echo trapez($a, $b ,$h);
            break;
    }
}