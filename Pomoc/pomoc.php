<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<?php
$imgDir = "./img";

//Odczytywanie parametru
if (isSet($_GET['imgid'])){
    $imgId = $_GET['imgid'];
}
else{
    $imgId = 0;
}
//odczytywanie zawartosci katalogu
$dir = scandir($imgDir);
array_shift($dir);
array_shift($dir);

$count = count($dir);

//sprawdzenie poprawonosci parametru
if ($imgId < 0 || $imgId >= $count || !is_numeric($imgId)){
    $imgId =0;
}
// ustalenie nazwy biezacego obrazu oraz
// identyfikatorów obrazów dla odnosnikow
$imgName = $dir("$imgId");
$first = 0;
$last = $count - 1;
if ($imgId < $count - 1){
    $next = $imgId + 1;
}
else{
    $next = $count - 1;
}
if ($imgId > 0){
    $prev = $imgId - 1;
}
else{
    $prev = 0;
}
?>
<div>
    <div id="obraz" style="text-align: center">
        <?php
        echo "<img src=\"$imgDir/img\" style='height: 100px' />";
        ?>
    </div>
    <div id="opis" style="text-align: center">
        <?php
        $imgId++;
        echo "obraz $imgName ($imgId z $count)";
        ?>
    </div>
    <div id="nawigacja" style="text-align: center">
        <?php
        echo "<a href=\"galeria.php?midid=$first\">Pierwszy</a> ";
        echo "<a href=\"galeria.php?midid=$prev\">Poprzedni</a> ";
        echo "<a href=\"galeria.php?midid=$next\">Nastepny</a> ";
        echo "<a href=\"galeria.php?midid=$last\">Ostatni</a> ";
        ?>
    </div>
</div>
</body>
</html>
