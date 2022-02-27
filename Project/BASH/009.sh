#!bin/bash

instances=$(cat $1 | grep -o $2 | wc -l)
echo "There are $instances instances of the pattern."