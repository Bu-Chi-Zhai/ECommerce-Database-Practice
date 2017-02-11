# ECommerce-Database-Practice

Side Project. This is an online music store

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### elasticDB node setup
*  set master and slaves in set_env.sh
*  make sure you have installed mysql on all the nodes in the queues. 
*  make sure those nodes in the queues have root access to each other without passwd

### elasticDB eclipse
*  import code to your eclipse
*  run mvn eclipse:eclipse and mvn dependency:resolve

### elasticDB property
*  modify the scripts/set_env.sh to set the MASTER, SLAVE and CANDIDATE
*  modify the tpcw.properties to set the read queue, write queue and candiate queues
*  modify the tpcw.properties to set the server that we would like to destroy (to test availability)

### elasticDB experiment setup
*  ./testConnection to test the access of each other
*  ./prepareMasterSlaves to get ready for master, slave and candidates.

### elasticDB run
*  From eclipse, just run without any parameter
*  From eclipse, in order to test scalability run with -c 
*  From eclipse, in order to test availability and scalability run with -c -d
*  You can also run from CommandLine accordingly

### elasticDB monitor
* run ./enableMonitors.sh, this will run dstats and open windows for MASTER, SLAVE and CANDIDATE
* open your browser to point to monitorIp:8080/WebContent/elasticdb.jsp

## Technologies

* Java 
* Maven
* Shell Scripts
* Eclipse
* AWS EC2
* MySQL
* Tomcat
* ChartJS


## Built With
* [Eclipse IDEA](https://www.jetbrains.com/idea/) - The IDE used
* [Maven](https://maven.apache.org/) - Dependency Management
* AWS EC2 Ubuntu v14 instances
* MySQL 5.7


## Authors

* **Yu Su** - *Initial work* - [Bu-Chi-Zhai](https://github.com/Bu-Chi-Zhai)


## License


## Acknowledgments

