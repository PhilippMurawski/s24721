#include <iostream>
#include <stack>
#include <string>
#include <sstream>
#include <cmath>
using namespace std;

bool isOperator(const string& input);
void performOp(const string& input, stack<double>& calcStack);
int main()
{
	cout << "Witaj \n";

	stack<double> calcStack;
	string input;
	
	while (true)
	{
		//display prompt
		cout << ">>";
		
		//get input
		cin >> input;

		//check for numeric valude
		double num;
		if (istringstream(input) >> num)
		{
			calcStack.push(num);
		}

		//check for operator
		else if (isOperator(input))
		{
			performOp(input, calcStack);
		}
		//check for quit
		else if (input == "q")
		{
			return 0;
		}
		// incalid output
		else
		{
			cout << "Tak to niestety nie dziala ;)" << endl;
		}
	}
}

bool isOperator(const string& input)
{
	string ops[] = { "-", "+","*","/"};

	for (int i = 0; i < 4; i++)
	{
		if (input == ops[i])
		{
			return true;
		}
	}
	return false;
}

void performOp(const string& input, stack<double>& calcStack)
{
	double lVal, rVal, result;

	rVal = calcStack.top();
	calcStack.pop();

	lVal = calcStack.top();
	calcStack.pop();

	if (input == "-")
	{
		result = lVal - rVal;
	}
	else if (input == "+")
	{
		result = lVal + rVal;
	}
	else if (input == "*")
	{
		result = lVal * rVal;
	}
	else
	{
		result = lVal / rVal;
	}
	cout << result << endl;
	calcStack.push(result);

}