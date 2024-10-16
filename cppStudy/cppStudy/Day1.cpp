// 입출력, 사칙연산

#include <iostream>

int main() {
	int A, B;

	std::cout << "Hello World" << std::endl;
	std::cin >> A >> B;
	std::cout << A + B << std::endl;
	std::cout << A - B << std::endl;
	std::cout << A * B << std::endl;
	std::cout << A / B << std::endl;
	// 나머지 나오게 하기
		// 소수점 이하 9자리까지 출력:
		/*
		std::cout.precision(12);
		std::cout << std::fixed;
		std::cout << A / B;
		*/
	std::cout << A % B << std::endl;

	return 0;
}