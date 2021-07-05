# java-spring-aop-app
Project to show the key AOP concepts

#### Features
- Aspect oriented programming

## 

## Application Stack

Stack  | version |
--- | --- |  
*Java* | 11
*SpringBoot* |  2.3.12.RELEASE
*Frontend* | n/a
*DB* | n/a
*Server* | n/a
*Build Tool* | Maven
*CI* | n/a
*Code Coverage* | n/a

## Application Run

## Application GIT branches
- com.malik.ithar.main.MainDemo

## Notes:

### Pointcut expressions 
execution(modifiers? return-type package? method-name(params) throws?)

@Before("execution(public void saveNewUser(*))")

### Prams matching 
- () - no args
- (*) - one arg
- (..) - 0 or more args
- (package.class) - specific arg 

## Further enhancements 