#!/bin/bash

if [ $# -ge 5 ]
then
	 for wynik in $@
	 do 
			sum=$(($sum+$wynik))
	 done
		echo $sum
	 else echo error
fi
