#include <stdio.h>
//A simple calculator using switch case in C
int main(){
    int a,b,C;
    float result;
    char again;

    printf("Enter A ");
    scanf("%d", &a);
    printf("Enter B ");
    scanf("%d", &b);
    printf(" 1:ADD \n 2:SUB \n 3:MULTIPLY \n 4:DIVIDE \n");
    printf("Enter your choice ");
    scanf("%d",&C);

    switch (C){

    case 1:
        printf("%d",a+b);
        break;
    case 2:
        printf("%d",a-b);
        break;
    case 3:
        printf("%d", a*b);
        break;
    case 4:
        result=(float)a/(float)b;
        printf("%.2f",result);
        break;
    default:
        printf("Wrong choice\n");
        break;
    }
}