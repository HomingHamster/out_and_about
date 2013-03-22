#include <iostream>
#include <fstream>
#include <string>
#include <ctime>

using namespace std;

class EveLog{
	public:
		EveLog (){};
		
		void addEntry(string message){
			time_t t = std::time(0);

			ofstream logfile;
			logfile.open ("../log.txt", std::ios_base::app);
			logfile << t << message;
			cout << t << message;
			logfile.close();
		}
};