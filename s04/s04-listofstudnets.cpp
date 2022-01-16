#include <iostream>
#include <string>
#include <sstream>
#include <vector>
#include <algorithm>

using namespace std;

struct Student { 
	string imie;
	string nazwisko;
	string indeks;
	int semestr;

	Student(string a, string b, string c, int d) 
	{
		imie = a; 
		nazwisko = b;
		indeks = c;
		semestr = d;
	}
	void view() { 
		cout << "\n imie: " << imie << " nazwisko: " << nazwisko << " indeks: " << indeks << " semestr: " << semestr << endl;
	}

};
string imie(string a) { 
	cout << "podaj imie: \n";
	cin >> a;
	return a;
}

string nazwisko(string b) {
	cout << "podaj nazwisko: \n";
	cin >> b;
	return b;
}

string indeks(string c) {
	cout << "podaj indeks: \n";
	cin >> c;
	return c;
}

int semestr(int d) {
	cout << "Podaj semestr: \n";
	cin >> d;
	return d;
}



void listastudentow(vector<Student*> vectorStudent) {
	int k = 0;
	for (Student* student : vectorStudent) {
		cout << k << " ";
		student->view();
		k++;
	}
}

auto main() -> int
{
	vector<Student*>vectorStudent; //
	string n, sn, i, sm;
	int x, wybor, wielkoscwektora, del;


	do {

		cout << "1. Dodaj studenta \n";
		cout << "2. Zobacz cala liste studentow\n";
		cout << "3. Usun studenta\n";
		cout << "4. Zakoncz\n";
		cout << "Twoj wybor: ";

		cin >> wybor;

		switch (wybor) {
		case 1:
			vectorStudent.push_back(new Student{ imie(n),nazwisko(sn), indeks(i), semestr(sm) });

			wielkoscwektora = vectorStudent.size();
			cout << "Rozmiar listy studentow: " << wielkoscwektora << "\n";
			break;
		case 2:
			if (vectorStudent.empty())
				cout << " Lista jest pusta\n";
			else
				listastudentow(vectorStudent);
			break;
		case 3:
			cout << "Ktorego studenta usunac:  ";
			cin >> del;
			vectorStudent.erase(vectorStudent.begin() + (del - 1));
			cout << "Student numer: " << del << "zostal usuniety n";
			break;
		}

	} while (wybor != 4);
	return 0;

}