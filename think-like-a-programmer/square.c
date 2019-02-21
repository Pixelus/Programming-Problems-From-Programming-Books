//
//  main.c
//  square
//
//  Created by PixelNew on 14/10/2018.
//  Copyright © 2018 PixelNew. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int number = 5;
    for(int i = 0; i <= number; i++) {
        for(int j = 0; j < number; j++) {
            printf("#");
        }
        printf("\n");
    }
    return 0;
}
