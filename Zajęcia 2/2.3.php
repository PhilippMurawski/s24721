<?php
$a = "lubie jeść Cytryny";
function cenzura($a)
{
    $owoce = array("Mandarynki", "Cytryny", "jabułka");
    $zdanie = str_replace($owoce, "*", $a);

    echo $zdanie;

}
cenzura($a);