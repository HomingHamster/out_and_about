all: event_creation

event_creation: event_creation_menu src/event_creation/main.c
	gcc -Wall build/event_creation_menu.o src/event_creation/main.c -o bin/event_creation -std=c99

event_creation_menu: src/event_creation/menu.c
	gcc -Wall -c src/event_creation/menu.c -o build/event_creation_menu.o