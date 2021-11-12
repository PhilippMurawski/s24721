#!/bin/bash
licznik=1
while [ $licznik -le 10 ]
do
	echo obejście petli numer: $licznik
	((licznik++))
done
