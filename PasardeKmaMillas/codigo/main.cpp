/*
 * main.cpp
 *
 *  Created on: 11 oct. 2017
 *      Author: Pequitas
 */

// Programa conversor de kilometros a millas ( 1 milla = 1'609 km)

#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{

	float kms, mls;
	cout <<"Escribe una cantidad en kilometros: \n";
	cin >> kms;
	mls =  kms*1.609;
	cout << kms << " kilometros son " << mls << " millas.\n ";
	system ("PAUSE");
	return 0;
}




