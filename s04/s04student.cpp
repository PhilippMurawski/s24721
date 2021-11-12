#include <iostream>

using namespace std;
struct Uczen 
{
		string imie;
		string nazwisko;
		string numer_indeksu;
		int aktualny_semestr;
		double srednia_ocen;
		Uczen(string imie, string nazwisko,string numer_indeksu, int aktualny_semestr, double srednia_ocen) :imie(imie), nazwisko(nazwisko), numer_indeksu(numer_indeksu), aktualny_semestr(aktualny_semestr), srednia_ocen(srednia_ocen)
		{
		
		}
		string to_string() const
		{
		return "imie:\n";
		}
		
};	
int main()
{
Uczen uczen("Philipp", "Murawski", "s24721",1,0);
}
