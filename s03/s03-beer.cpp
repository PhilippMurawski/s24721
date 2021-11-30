#include <iostream> 

using namespace std;

int main(int argc, char* argv[]) // argc oznacza liczbę argumentów, a argv oznacza wartości argumentów. Są to zmienne przekazywane do funkcji main, gdy program zaczyna ona wykonywać polecenia.
{
	if(argc <=1) // Jeśli nie wpiszemy argumentu program wyrzuci cout << " Nie podano argumentu ! \n "
	{
		cout << " Nie podano argumentu ! \n ";
		
		return 1;
	}
	
	auto const a = stoi(argv[1]); // przypisuje do stałej const a (która jest typem automatycznym bo ma auto) i przypisuje do niej wartość z tabilicy arv[1] która jest zmieniana z stoi(string to int) 

	for(auto i=a; i>=0; i--) // i=a ustawia zmienna przed rozpoczeciem i>=0 ustala warunek dla pętli zeby zadziałała jeśli warunek jest prawdziwy petla bedzie sie za pętlać jesli bedzie faszł to sie zakończy i-- to za kazdym razem jak  sie wykona bedzie zmniejszac wartosc
	{
			while( i > 0 )
		{
			cout << i << " Bottles of beer on the wall, "<< i <<" bottles of beer. Take on down pass it around... \n";
			i--;	
		}
			cout << " No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, " << a << " bottles of beer on the wall...\n ";
	}
}	

