#spring-boot-kafka-tutorial

#Installing Kafka
The application is configured to use a local Kafka broker. You can use a managed solution like Confluent by updating application.properties appropriately.

#Download Kafka from the Kafka website
Extract the archive
Start Zookeeper with bin/zookeeper-server-start.sh config/zookeeper.properties
Start the Kafka broker with bin/kafka-server-start.sh config/server.properties
#Running the application
Make sure you have Kafka running (see above)
Run the app with the included Maven wrapper ./mvnw, or by running the Application Java class.
