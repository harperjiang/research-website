#include <iostream>

using namespace std;

string reverse(string in) {
    char buffer[in.length()]; 
    /* Insert your code of manipulating the buffer*/


    return string(buffer); 
}


int main(int argc, char** argv) {
    cout << "Input some string" << endl;

    string line;
    getline(cin, line, '\n');
   
    cout << reverse(line) << endl; 
}
