#include <stdio.h>

int gcd(int n1, int n2)
{
    if(n2 == 0) {
        return n1;
    } else {
        return (n2, n1 % n2);
    }
}

int main()
{
    int num1, num2;
    result = gcd(num1, num2);
    printf("GCD of %d and %d = %d", num1, num2, result);
    return 0;
}