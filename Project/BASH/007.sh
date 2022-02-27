#!bin/bash

first=$(wc -c $1 | cut -d' ' -f1)
second=$(wc -c $2 | cut -d' ' -f1)
if [ $first -gt $second ]
then echo "$1 has more chars"
else echo "$2 has more chars"
fi