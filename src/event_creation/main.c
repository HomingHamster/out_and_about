//main.c - author fef

//standard io
#include <stdio.h>

// include the menu header
#include "h/menu.h"

int main (void) {
	//enter an indefinate loop until the user
	//causes the menu to return 1 (ie. exit).
	while (1) {
        int i = menu();
        if (i == 1){
            break;
        }
    }
}