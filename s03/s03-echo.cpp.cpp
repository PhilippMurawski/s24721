#include <iostream>
#include <string>

using namespace std;

int opcje;
bool nie_drukowac;
bool odwrotnie;
bool po_jednym;

auto main(int argc, char* argv[]) -> int
{

    if (argc <= 1)
    {
        cout << "nie podano argumentu \n";
        return 1;
    }

    for (int i = 1; i < argc; i++)
    {
        if (string(argv[i]) == "-n")
            nie_drukowac = true;
            opcje++;
        }
        else if (string(argv[i]) == "-r")
            odwrotnie = true;
            opcje++;
        }
        else if (string(argv[i]) == "-l")
        {
            po_jednym = true;
            opcje++;
        }
    }

    if (po_jednym)
    {
        if (odwrotnie)
        {
            for (auto i = argc - 1; i >= 1 + opcje; i--)
            {
                cout << "\n" << argv[i];
            }
        }
        else
        {
            for (auto i = 1 + opcje; i <= argc; i++)
            {
                cout << "\n" << argv[i];
            }
        }
    }
    else
    {
        if (odwrotnie)
        {
            for (auto i = argc - 1; i >= 1 + opcje; i--)
            {
                cout << argv[i];
            }
        }
        else
        {
            for (auto i = 1 + opcje; i <= argc; i++)
            {
                cout << argv[i];
            }
        }
    }
    return 0;
}