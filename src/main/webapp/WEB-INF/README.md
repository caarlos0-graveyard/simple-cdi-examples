- `jboss-deployment-structure.xml`: You can use this file to force
JBoss/Wildfly to use its modules (like I do here for log4j);
- `beans.xml`: Unless you use Interceptors, Decorators and some
other stuff, this file can be empty;
- `web.xml`: you may want to create it and setup JAX-RS, for example.
