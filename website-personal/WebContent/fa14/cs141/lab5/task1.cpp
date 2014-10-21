#include <iostream>

using namespace std;

int main(int argc, char** argv) {

	int number = 0;

	while(true) {
		cout << "Input a number between 10 and 15" << endl;
		if(cin >> number && number >= 10 && number <= 15)
			break;
		cin.clear();
		cin.ignore(5,'\n');
		cout << "Incorrect number, input again" << endl;
	}

	int limit = 2*number;
	while(number < limit) {
		number +=13;
        }	

	while(number > 0) {
		number -= 2;
	}
    	cout << number << endl;
}
