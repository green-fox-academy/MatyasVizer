#!bin/bash

sum_of_numbers=0

for input
do
sum_of_numbers=$(expr $sum_of_numbers + $input)
done

echo "$sum_of_numbers"