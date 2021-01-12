#!/bin/bash

function myFunc() {
  CMT=$(cat /dev/random | LC_CTYPE=C tr -dc "[:alpha:]" | head -c 8)
  echo $CMT >> README.md
  git add .
  git commit -m "Add random string to README: $CMT"
  git push upstream my-pr
}

for ((i=1;i<=1000;i++)); do myFunc; sleep 5; done