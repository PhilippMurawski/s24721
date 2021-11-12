#include <iostream>

int main()
{
	
std::srand(time(NULL));
int random = rand() % 100 + 1;	
int number;
	do{
		std::cout << "Guess:\n";
		std::cin >> number;
		if(number < random)
		{
			std::cout << "Number to small!\n";
			}
		if(number > random)
		{
			std::cout << "Number to big!\n";
			}
	}while(number != random);
	std::cout << "Just right!\n";
		
}
