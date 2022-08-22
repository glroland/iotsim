zookeeper-server-start zookeeper.properties

kafka-server-start server.properties

kafka-console-consumer --topic nasa --bootstrap-server localhost:9092

kafka-topics --bootstrap-server localhost:9092 --topic nasa --create


