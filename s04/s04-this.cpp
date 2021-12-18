#include <iostream>

struct obiekt
{
    std::string pole1;
    std::string pole2;

    void rfunkcja(){
        std::cout << this << "\n";     //this wskazuje na ten obiekt w pamieci
    }

};

auto main()-> int{

    auto cobiekt = obiekt();
    cobiekt.rfunkcja();     //cobiekt odpala rfunkcja
    std::cout << &cobiekt << "\n";

    std::cout << "\"this\" i \"&nazwaobiektu\" robi to samo \n";
    return 0;
}