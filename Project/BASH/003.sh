#!bin/bash

if [ -w $1 ]
 then echo "writeable"
 else echo "need permissions to write"
fi