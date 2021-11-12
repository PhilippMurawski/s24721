#include <iostream> // for std::cout, std::cerr, std::cin
#include <iostream>

auto main (int  argc, char* argv[1]) -> int
{
	auto const a = std::stoi(argv[1]);
	auto const b = std::stoi(argv[2]);
	std::cout << (a - b) << "\n";
	return 0;
}
