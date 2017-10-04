# spring-cloud-netflix-ribbon-load-balancer

## Using discovery service
1) Start the discovery service
2) Start multiple instances of ribbon-time-service-using-discovery-server. 
   (Multiple instances (2). Override server.port to 4444 and 5555)
3) Start ribbon-time-app-using-discovery-server. 
4) Go to http://localhost:8080

## Without discovery service
1) Start multiple instances of ribbon-time-service-without-discovery-server. 
   (Multiple instances (2). Override server.port to 4444 and 5555)
2) Start ribbon-time-app-without-discovery-server or ribbon-time-app-without-discovery-server-custom-config. 
3) Go to http://localhost:8080
