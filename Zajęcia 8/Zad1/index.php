<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<?php
include "samochod.php";

$file_to_read = fopen('info.csv', 'r');

if($file_to_read !== FALSE){

    echo "<table>\n";
    while(($info = fgetcsv($file_to_read, 100, ',')) !== FALSE){
        echo "<tr>";
        for($i = 0; $i < count($info); $i++) {
            //echo "<td>".$info[$i]."</td>";
        }
        echo "</tr>\n";
    }
    echo "</table>\n";

    fclose($file_to_read);
}

 $siez = sizeof($info);
    $car = array();
    for ($i = 0; $i < $siez; $i++ ){
        $car[] = new samochod($info[$i][0],$info[$i][1],$info[$i][2],$info[$i][3],$info[$i][4],$info[$i][5]);
    }
$object = $car[0];

echo $object->get_id();
echo "<br>";
echo $car[0]->get_marka();
echo "<br>";
echo $car[0]->get_model();
echo "<br>";
echo $car[0]->get_rok();
echo "<br>";
echo $car[0]->get_pojemnosc();
echo "<br>";
echo $car[0]->get_cena();

echo '<h1>'."WYBIERZ FURE B)".'<h1/>';
echo '<a href="porshe.php?"><img src=img/1.jpg height="300"/></a>';
echo '<a href="Lancia.php?"><img src=img/2.jpg height="300"/></a>';
echo '<a href="Mazda.php?"><img src=img/3.jpg height="300"/></a>';
?>




