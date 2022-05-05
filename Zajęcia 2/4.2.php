<?php

function rollTheDice($numberOfRolls)
{
    $array = [];
    for ($i = 0; $i < $numberOfRolls; $i++) {
        $array[$i] = rand(1, 6);
    }
    return $array;
}

$arrayOfRolls = rollTheDice(6);
print_r($arrayOfRolls);