// �����, ��Ģ����

#include <iostream>

int main() {
	int A, B;

	std::cout << "Hello World" << std::endl;
	std::cin >> A >> B;
	std::cout << A + B << std::endl;
	std::cout << A - B << std::endl;
	std::cout << A * B << std::endl;
	std::cout << A / B << std::endl;
	// ������ ������ �ϱ�
		// �Ҽ��� ���� 9�ڸ����� ���:
		/*
		std::cout.precision(12);
		std::cout << std::fixed;
		std::cout << A / B;
		*/
	std::cout << A % B << std::endl;

	return 0;
}