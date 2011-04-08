#include <stdio.h>

int main() {
	int n = 5;

	int i;
	int factorial = 1;
	for (i = 1; i <= n; i++) {
		factorial *= i;
	}

	printf("Factorial of %d is %d\n", n, factorial);
}
