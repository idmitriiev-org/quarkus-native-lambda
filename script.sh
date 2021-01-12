#!/bin/bash

CMT=$(cat /dev/random | LC_CTYPE=C tr -dc "[:alpha:]" | head -c 8)
echo $CMT >> README.md
git commit -m "Add random string to README: $CMT"
git push upstream my-pr