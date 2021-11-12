#include <iostream>

int main()
{
std::string haslo;
std::string haslo_do_zgadniecia;
	std::cout<<"Podaj haslo do zgadniecia: \n";
	std::cin>>haslo_do_zgadniecia;

do{
	std::cout<<"Podaj haslo: \n";
	std::cin>>haslo;
	if(haslo != haslo_do_zgadniecia){
		std::cout<<"Haslo nie prawidłowe\n";
		}
	}while(haslo != haslo_do_zgadniecia);
	std::cout<<"Zgadles haslo!\n";
	
}
