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
$car2 = new samochod("", "Marka: Lancia", "Model: Delta integrale", "Rocznik: 1979", "Silnik: 2.0 Turbo", "Cena: 65.000,-");
echo $car2->get_id();
echo "<br>";
echo $car2->get_marka();
echo "<br>";
echo $car2->get_model();
echo "<br>";
echo $car2->get_rok();
echo "<br>";
echo $car2->get_pojemnosc();
echo "<br>";
echo $car2->get_cena();