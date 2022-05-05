<?php
$pesel = "49040501580";

function Czytnik ($pesel)
{
    $rok = substr($pesel,0 ,2);
    $miesiac = substr($pesel,2,2);
    $dzien = substr ($pesel, 4, 2);

    $data = strtotime($rok.'-'.$miesiac.'-'.$dzien);
    $data = date('d F Y', $data);
    echo $data;

}
Czytnik($pesel);