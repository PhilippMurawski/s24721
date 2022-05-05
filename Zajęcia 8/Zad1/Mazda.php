<?php
class samochod
{
    private $marka, $id, $model, $rok, $pojemnosc, $cena;

    function __construct($id, $marka, $model, $rok, $pojemnosc, $cena)
    {
        $this->id = $id;
        $this->marka = $marka;
        $this->model = $model;
        $this->rok = $rok;
        $this->pojemnosc = $pojemnosc;
        $this->cena = $cena;
    }

    function get_id()
    {
        return $this->id;
    }

    function get_marka()
    {
        return $this->marka;
    }

    function get_model()
    {
        return $this->model;
    }

    function get_rok()
    {
        return $this->rok;
    }

    function get_pojemnosc()
    {
        return $this->pojemnosc;
    }

    function get_cena()
    {
        return $this->cena;
    }
}
$car3 = new samochod("", "Marka: Mazda", "Model: MX-5", "Rocznik: 1990", "Silnik: 1.8 L", "Cena: 15.000,-");
echo $car3->get_id();
echo "<br>";
echo $car3->get_marka();
echo "<br>";
echo $car3->get_model();
echo "<br>";
echo $car3->get_rok();
echo "<br>";
echo $car3->get_pojemnosc();
echo "<br>";
echo $car3->get_cena();