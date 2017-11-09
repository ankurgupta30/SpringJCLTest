This is to check how spring-JCL can be used; which is thin API which tries to see of log4j or slf4j libs are present; if No; default Java util logging will be used.

I think spring-jcl is the only spring library which does not depend upon any other spring library; however it just have spring in its name; it does not do anything related to spring (IOC or AOP)