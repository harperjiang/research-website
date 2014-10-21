#include <iostream>

using namespace std;

int main() {

    int a = 1;
    int b = 1;
        
    while(a < 9) {
        while(b < 9) {
            cout << a << "*" << b << a*b << "\n";
        }
	a++;
        b++;
    }        
}
