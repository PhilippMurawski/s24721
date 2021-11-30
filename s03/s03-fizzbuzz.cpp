#include <iostream>
#include <string>

using namespace std;

auto main(int argc, char *argv[]) -> int // argc oznacza liczbę argumentów, a argv oznacza wartości argumentów. Są to zmienne przekazywane do funkcji main, gdy program zaczyna ona wykonywać polecenia.
{
    if (argc <= 1) // Jeśli nie wpiszemy argumentu program wyrzuci cout << " Nie podano argumentu ! \n "
    {
        cout << "Nie podano argumentu! /n";
        return 1;
    }
    auto const a = stoi(argv[1]); // przypisuje do stałej const a (która jest typem automatycznym bo ma auto) i przypisuje do niej wartość z tabilicy arv[1] która jest zmieniana z stoi(string to int) 

    for (int i = 1; i <= a; i++) // i=a ustawia zmienna przed rozpoczeciem i<=a ustala warunek dla pętli zeby zadziałała jeśli warunek jest prawdziwy petla bedzie sie za pętlać jesli bedzie faszł to sie zakończy i++ to za kazdym razem jak  sie wykona bedzie zmniejszac wartosc
    {
        string output = "";

        if (i % 3 == 0) output += "Fizz"; // jeśli warunek zostanie spełniony to string output wydruguje fizz
        if (i % 5 == 0) output += "Buzz"; // jeśli warunek zostanie spełniony to string output wydruguje buzz
        else if (output == "") output = to_string(i); // instrukcja określająca nowy warunek, jeśli pierwszy warunek jest fałszywy 
        
        cout << output << "\n";
    }

    return 0;
}
