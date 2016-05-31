<h2>Data Collection Server</h2>

The data collection server has the below maven modules

**Overview**

   The purpose of the project is to transfer the data inputed by consumers at high speeds to storage. The three ways for consumers to input data is through internet, mobile, and an iot device. The tools that are used in my project include the cassandra progam, an arduino device, and an installed mobile app. With these devices, consumers can input data from anywhere at high paces.

**Architecture**

	![Architecture]("https://cloud.githubusercontent.com/assets/16579865/15662865/761798c2-26a9-11e6-9b9f-bcd5022db19b.png)

**Design**

   I designed the project by downloading certain apps and programs.
   The data collection server has the below maven modules

Project Structure

   iot-dcs-data
      - Module responsible to read and writes data from cassandra.

   iot-dcs-rest
      - Module responsible to expose the data collector resting points

   iot-dcs-server
      - Module responsible to create a war file and integrate with a jetty server

    iot-dcs-mobile
      - Module for the demo android app


