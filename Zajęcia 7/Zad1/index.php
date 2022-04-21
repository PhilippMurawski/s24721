<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<?php
$imagesDirectory = "img/";

if(is_dir($imagesDirectory))
{
    $opendirectory = opendir($imagesDirectory);

    while (($image = readdir($opendirectory)) !== false)
    {
        if(($image == '.') || ($image == '..'))
        {
            continue;
        }

        $imgFileType = pathinfo($image,PATHINFO_EXTENSION);

        if(($imgFileType == 'jpg') || ($imgFileType == 'png'))
        {
            echo "<img src='img/".$image."' width='200' .$image.' height='200' >";
        }
    }

    closedir($opendirectory);
}
?>
</body>
</html>