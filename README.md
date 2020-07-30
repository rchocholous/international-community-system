# International Community System


Project could demonstrate how Clean architecture, DDD and CQRS written in Java with 
help of Spring framework could looks like.

System is evolution of ESN VSB-TUO BMS (Buddy system). Primary task of this project 
is to focus on system architecture and design and practice it on real-life 
project.

**Tech decisions** \
TDD, DDD, Clean architecture, CQRS, Event sourcing, maybe microservices, React UI & maybe CMD UI


**Problem introduction** \
Create system for local ESN (Erasmus Student Network) section to help them manage their 
tasks regarding foreign students. Allows matching of students and create them into 
a communities based on their interests, based on organized events etc. Allow communities to work together and help each other when they need.

Could be used also for expat groups.


**Goals**
- Clean architecture (onion/hexagonal)\
Clear separation of domain, use cases and other parts of core (input/output devices).
- Domain Driven Design (DDD)
- Command Query Request Separation (CQRS)\
Use cases are divided into commands, which modify system state but does not return 
values, and queries which return data but does not modify state.
- Event sourcing - probably not at the moment
- Test Driven Development\
Tests should be written first and should cover important parts of sources.

### ! Important
This is mainly learning project and many things is probably not optimal at the moment.
 I would be grateful for anyone giving me advices how could I do things more correctly.
 If you want to help me, feel free to contact me.


**Following parts are only informal at the moment...**

Modules
-

**Business**

Contain main logic of the system. Mainly have business domain, use cases (structured 
as queries and commands) and ports (interfaces) fo other modules. Frameworks should 
be avoided.

**Persistence**

Entity Gateways for Aggregate roots, implements interface from business layers to 
wherever however persist model entities.

**Web**

Presentation and infrastructure. Compose whole application together (a the moment) and 
provide HATEOAS API. Could also host webapp containing preferably React app.


**Domain**


**Use case**


