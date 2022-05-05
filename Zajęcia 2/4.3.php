<?php
function simpleMultiplicationTable($size)
{
    echo '<table style="border: 2px solid black">';
    for ($i = 1; $i <$size; $i++)
    {
        echo "<tr>";
        for ($j = 1; $j <$size; $j++)
        {
            echo '<td style="border: 1px solid black">'.$j*$i."</td>";
        }
        echo "</tr>";
    }
    echo "</table>";
}
simpleMultiplicationTable(5);