#include <iostream>

int main() {
	int n = 5;

	int factorial = 1;
	for (int i = 1; i <= n; i++) {
		factorial *= i;
	}

	std::cout << "Factorial of " << n << " is " << factorial << std::endl;
}
