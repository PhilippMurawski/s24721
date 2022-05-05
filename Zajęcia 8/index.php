<?php

class samochod
{
    private $marka, $id, $model, $rok, $pojemnosc,$cena;

    function __construct($id, $marka, $model, $rok, $pojemnosc, $cena) {
        $this->id = $id;
        $this->marka = $marka;
        $this->model = $model;
        $this->rok = $rok;
        $this->pojemnosc = $pojemnosc;
        $this->cena = $cena;
    }
    function get_id() {
        return $this->id;
    }
    function get_marka() {
        return $this->marka;
    }
    function get_model() {
        return $this->model;
    }
    function get_rok() {
        return $this->rok;
    }
    function get_pojemnosc(){
        return $this->pojemnosc;
    }
    function get_cena()
    {
        return $this->cena;
    }
}

$car1 = new samochod("1", "Porshe","911", "1980","3.3 Turbo","119.911,-");
echo $car1->get_marka();
echo "<br>";
echo $car1->get_id();
echo "<br>";
echo $car1->get_model();
echo "<br>";
echo $car1->get_rok();
echo "<br>";
echo $car1->get_pojemnosc();
echo "<br>";
echo $car1->get_cena();
?>
