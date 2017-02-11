--This file is a template for access to each database
--All the machine should run the same version of mysql db
--All mysql dbs should have the same config
STOP SLAVE;
CHANGE MASTER TO
MASTER_HOST='vader-1-vm3',
MASTER_USER='root',
MASTER_PASSWORD='UnifiedPassword',
MASTER_LOG_FILE='mysql-bin.000002',
MASTER_LOG_POS=445;
START SLAVE;

