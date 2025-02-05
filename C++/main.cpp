#include <iostream>
#include <vector>
#include <limits>
#include <string>

using namespace std;

int main()
{
    // Comments are double slashes
    // To output in terminal, cout is used with <<
    cout << "Greetings, this is an average calculator in C++ for three test scores." << endl;
    cout << "Please enter your name and three test scores." << endl;
    cout << "-------------------------------------------\n"
         << endl;

    // Declare
    string name;
    double score_1, score_2, score_3;
    cout << "Name: ";

    // Input
    //  getline is used to acknowledge white spaces compared to cin only that stop reading at a white space
    getline(cin, name);

    // Notice how << is utilized before and after the variable
    cout << "\nHello, " << name << ", enter your test scores" << endl;
    cout << "Score 1: ";
    cin >> score_1;
    cout << "Score 2: ";
    cin >> score_2;
    cout << "Score 3: ";
    cin >> score_3;
    cout << "-------------------------------------------" << endl;

    // Process
    double average = (score_1 + score_2 + score_3) / 3;

    // Output
    // fixed is used to round result in a set of decimal places
    cout << name << ", your average score is: " << fixed << average << endl;
    cout << "-------------------------------------------" << endl;

    return 0;
}
