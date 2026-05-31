PasteBin 

**Interface :** Web, SDUI App and  Headless API

**Actor :** End-User, Viewer, Admin

**_Functional Requirement:_**

Create paste
Retrieve paste
Unique short URL for paste
Expiry time
Public/private paste
Syntax highlighting
UserManagement

**_Non-Functional Requirements:_**

**Availability :** 99.999% (HA Solution( Multiple nodes AA,AP solution))(DR Set-Up)
**Scalability :** Horizontal + Vertical Scaling
**Security :** oAuth
**Performance:** : Api response : 500 ms
**Resilience:** _Fault Tolerance_ : Circuit-Breaker, Retry
**Logging**: Secure logging with proper log levels

**TechStack :**
**APIGateway**: Krakend
**Backend:** SpringBoot Microservice + R4J Circuit Breaker + Retry + JDK 26
**Cache:** Redis
**DB :** mySQL
**Web:** ReactJS
**App:** SDUI
**Logging:** Clickhouse
**CI/CD:** gitlab.ci.yml
**Container:** Docker
**Deployment :** Kubernetes


