### 1. Dependency Injection

##### How can a Spring bean specify dependencies on other beans?
With @Autowired notations or <property> elements in the XML configuration file.
See variable dependentIngredient in Recipe.java for code example with use of @Autowired.

##### How can a developer specify the configuration Spring should use to wire beans together in the so-called IoC container?
@Configuration can be use to wire beans together in the IoC container or with the help of <bean></bean> inside the Beans tag.
See  MainAnnotationExample.java for @Configuration example. 

##### How does Spring resolve references and create appropriate objects when there is one implementation of an interface? What happens if there are two?
They are created in the same way, the only thing that differs is the id. You can call a specific implemention of a bean with the @Qualifer annotation.
See Recipe.Java for the @Qualifer used for chefRamsey and MainAnnoationExample.java. 


###  2. Contexts

##### How can a developer switch between sets of related beans during deployment, so that, for instance, test implementations can be switched for real implementations?
With the usage of @Profiles or <beans profile="env"> you can easily switch between environments. You can configure the env you want to run in the application.properties file.

##### What is an ApplicationContext, and what is the purpose of an ApplicationContextAware bean?
Central interface to provide configuration for an application. This is read-only while the application is running, but may be reloaded if the implementation supports this.
The purpose of ApplicationContextAware bean is for the bean to know what is happenings arounds its environment. See example in ChefRamseyIsHere.class. 

###  3. Lifetime management

##### How can beans provide custom behavior during their initialization and destruction phases in Spring? Name three different methods.
Specify init-method and destroy-method in the XML bean element.
Implementing InitializingBean and DisposableBean interface. See MainAnnotatioNExample.java for an example implemention of this method (initProp and dispProp).
The final way is to use annotations PreConstruct and PostConstruct.

##### What is a bean scope in Spring? Name two different scopes and provide code examples to illustrate the difference between them.
Bean scope is used to decide which type of bean instance that should be returned from the container back to the caller.
Two different scopes are singleton, prototype. An example of these two different scopes can be found in MainAnnotationExample.Java.
