#include <stdio.h>

int main()
{   
    int number,sum=0,greatest_num=0,smallest_num=1000,NTF,count=0;
    
    printf("enter number of terms: ");
    scanf("%d", &number);
    
    int AR[number];
    
    for(int i=0;i<=number-1;i++){
        printf("Enter value: ");
        scanf("%d", &AR[i]);
    }
    //to enter values
    for(int i=0;i<=number-1;i++){
        printf("%d ",AR[i]);
    }
    //to print array
    for (int i=0;i<=number-1;i++){
        sum+=AR[i];
        
    }
    //to print sum of array
    for(int i=0;i<=number-1;i++){
    
        if(AR[i]>greatest_num){
            greatest_num=AR[i];
        }
    }
    // to print greatest number
    for(int i=0;i<=number-1;i++){
    
        if(AR[i]<smallest_num){
        smallest_num=AR[i];
        }
    }
    // to print smallest number
    
    printf("\nthe greatest number in the array is %d", greatest_num);
    printf("\nthe smallest number in the array is %d", smallest_num);
    printf("\nthe sum of the terms above is %d",sum );
    
    printf("\nEnter value for the element you are looking for ");
    scanf("%d",&NTF);
    
    for(int i=0;i<=number-1;i++){
        if(NTF==AR[i]){
            count+=1;
            break;
        }
    }
    //to find if element is present in the array
    
    if(count==1){
        printf("\nthe element %d is present in the array",NTF);
    }else{
        printf("\nthe element %d is not present in the array",NTF);
    }
    
    return 0;
}
