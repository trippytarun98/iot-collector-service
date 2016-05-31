<h2>Data Collection Server</h2>


<h3>Overview</h3>
	The Internet of Things (IoT) is the next technological revolution, expected to generate over $300 B by year 2020, 
	according to Gartner.

	The IoT will also generate unprecedented amounts of data and its impact will be felt across the entire big 
	data universe.

	In this project, I have built the data collector server, which can collect and store massive amount of data 
	from various devices. 
	
	The collected data can be used for various analysis.The high performance REST data collector service can 
	receive large amount of data and store it in Cassandra.
	
<h3>Architecture</h3>

![Architecture](https://cloud.githubusercontent.com/assets/16579865/15662865/761798c2-26a9-11e6-9b9f-bcd5022db19b.png "Architeture Image")


<h3>Project Structure</h3>
        The data collection server has below maven modules.

	iot-dcs-data
      		- Module responsible to read and writes data from cassandra.

   	iot-dcs-rest
      		- Module responsible to expose the data collector resting points

   	iot-dcs-server
      		- Module responsible to create a war file and integrate with a jetty server
    
   	iot-dcs-mobile
      		- Module for the demo android app

<h3>Tools/External Library</h3>

   Maven

   Cassandra

   Jetty

   Jersey

   Github

   IntelliJ

   Android Studio

   Arduino 
   

