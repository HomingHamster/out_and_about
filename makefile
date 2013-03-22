#makefile - author fef

#main: checkpoint_manager event_creation event_manager
main: event_manager

checkpoint_manager:
	ant compile
	ant jar

event_creation: event_creation_menu src/event_creation/main.c
	gcc -Wall build/event_creation_menu.o src/event_creation/main.c -o bin/event_creation -std=c99

event_creation_menu: src/event_creation/menu.c
	gcc -Wall -c src/event_creation/menu.c -o build/event_creation_menu.o

event_manager: event_manager_log src/event_manager/Main.cpp
	g++ -Wall -W -pedantic build/EveLog.o src/event_manager/Main.cpp -o bin/event_manager

event_manager_log: src/event_manager/EveLog.cpp
	g++ -Wall -W -pedantic -c src/event_manager/EveLog.cpp -o build/EveLog.o