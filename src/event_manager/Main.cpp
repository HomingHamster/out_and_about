#include <iostream>
#include <string>
#include <sstream>
#include <ctime>

#include "EveLog.hpp"

using namespace std;

int main() {

    EveLog logObj;
    logObj = new EveLog;
    string logmsg = "starting";
    logObj.addEntry(logmsg);

    string input = "";
    int choice = 0;

    while (true) {
        cout << "Please choose from the following options:" << endl;
        cout << "1 - Print competitors started" << endl;
        cout << "2 - Print competitors not started" << endl;
        cout << "3 - Produce results list" << endl;
        cout << "4 - Quit program" << endl;
        cout << "" << endl;
        cout << "Your choice: ";
        getline(cin, input);

        // This code converts from string to number safely.
        stringstream myStream(input);
        if (myStream >> choice){
            if ((0<choice) && (choice<5)){

                cout << "You entered: " << choice << endl << endl;
                
                if (choice == 1){

                } else if (choice == 2){

                } else if (choice == 3){

                } else if (choice == 4){

                    cout << "Thank-you! Come again!" << endl;
                    return 0;
                }
            }
        }
        cout << "Invalid choice, please try again" << endl;
    }

    return 0;
}