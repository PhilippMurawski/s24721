<?php
$kraj = "Portugalia";
function narodowsc($kraj)
{
    $tablica["Portugalia"] = "Portugalczycy";
    $tablica["Jakuck"] = "Jakuci";
    $tablica["Japonia"] = "Japończycy";

    echo $tablica[$kraj];
}

return narodowsc($kraj);
