//menu.c - author fef

//include standard io library.
#include <stdio.h>

int menu() {
    char choice[1] = {'z',};

    printf("\n\nEvent File Management Menu - Select an "
        "option from the following:\n");
    printf("A - Re-initialise Program\n");
    printf("B - Create new Events File\n");
    printf("C - View existing Events File\n");
    printf("D - Create new Entrants File\n");
    printf("E - View existing Entrants File\n");
    printf("F - Create new Courses File\n");
    printf("G - View existing Courses File\n");
    printf("H - Quit the program\n");
    
    printf("\nPlease enter your choice: ");

    scanf(" %c", choice);
    
    if (*choice == 'a' || *choice == 'A'){

    } else if (*choice == 'b' || *choice =='B') {
        
    } else if (*choice == 'c' || *choice =='C') {
        
    } else if (*choice == 'd' || *choice =='D') {
        
    } else if (*choice == 'e' || *choice =='E') {
        
    } else if (*choice == 'f' || *choice =='F') {
        
    } else if (*choice == 'g' || *choice =='G') {
        
    } else if (*choice == 'h' || *choice =='H') {
        return 1;        
    } else {
        printf("Input not recgonised.\n");
    }
    return 0;
}