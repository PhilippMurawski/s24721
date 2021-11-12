#!/bin/bash

path="Documents/copied"
if [ $# -eq 0 ]
then
	echo "Nie podano zadnych argumentow"
	exit 1
elif [ $# -gt 1 ]
then
	for filename in $@
	do
		cp $filename $path
	done
else
	 numberOfLines='find -name "*$1" | wc-1'
	 if [ $numberOfLines -eq 0 ]
