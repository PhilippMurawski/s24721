#include <iostream>

using namespace std;

int main()
{
	int x;
	cout << "Podaj liczbe:\n";
	cin >> x;
	cout << "Podana liczba:" << x << "\n";
	
	if( x % 3 == 0 && x % 5 == 0)
	{
		cout << "FizzBuzz\n";
	}	
	else if(x % 5 == 0)
	{
		cout << "Buzz\n";
	}
	else if(x % 3 == 0)
	{
		cout << "Fizz\n";
	}
}

