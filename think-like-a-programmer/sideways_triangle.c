//
//  main.c
//  sideways_triangle
//
//  Created by PixelNew on 15/10/2018.
//  Copyright © 2018 PixelNew. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int number = 4;
    for(int i = 0; i < (number - 1); i++) {
        printf("#");
        for(int j = 0; j < i; j++){
            printf("#");
        }
        printf("\n");
    }
    for(int i = 0; i <= number; number--) {
        for(int j = 0; j < number; j++) {
            printf("#");
        }
        printf("\n");
    }
    return 0;
}
