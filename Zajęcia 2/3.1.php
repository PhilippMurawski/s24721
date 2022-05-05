<?php
$a = 5;

echo tablica($a);

function tablica ($a)
{
   $tablica = array(1,2,3,4,5,6,7,8,9);

    return $tablica[$a];
}