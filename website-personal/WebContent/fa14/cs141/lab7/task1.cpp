#include <iostream>

using namespace std;


int main(int argc, char** argv) {
     int number;
     cin >> number;
     if(number<=0) {
        return 1;
     } 
     cout << factorial1(number) << endl;
     cout << factorial2(&number) << endl;
}
