#include <iostream>
#include <string>
using namespace std;

int main()
{
	int liczba;
	
	cout << "Podaj liczbe od ktorej chesz odliczac:\n";
	cin >> liczba;
	
		while( liczba >= 0 )
		{
			cout << liczba << "\n";
			liczba--;
		}
}
