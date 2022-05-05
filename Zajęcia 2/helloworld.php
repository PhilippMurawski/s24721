<?php

$a = 3;
$b = 4;
$c = 5;

if (($a * $a) + ($b * $b) == ($c * $c))
{
    echo 'Liczby Spelniaja twierdzenie pitagorasa!';
}
elseif (($c * $c) + ($a * $a) == ($b * $b))
{
    echo 'Liczby Spelniaja twierdzenie pitagorasa!';
}
elseif (($c * $c) + ($b * $b) == ($a * $b))
{
    echo 'Liczby Spelniaja twierdzenie pitagorasa!';
}
else
{
    echo 'Liczby niespelniaja twierdzenia pitagorasa!';
}
