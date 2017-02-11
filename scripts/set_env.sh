#!/bin/bash

set -o allexport

MYSQL_USERNAME='root'
MYSQL_PASSWORD='TigerBit!2016'

# HOSTS fake public ip address
#vm0=15.142.84.135
#vm1=54.84.88.94
#vm2=135.71.85.121
#vm3=34.56.77.82

# set the roles here
# one master, two slaves and one candidate
# fake public ip address
MASTER=15.142.84.135
SLAVE=(54.84.88.94 135.71.85.121)
CANDIDATE=(34.56.77.82)

set +o allexport

