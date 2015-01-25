This is a working implementation of @matthis-d tutorial of a REST web service
backend using:

- springboot (spring 4)
- postgresql

as seen at http://matthis-d.fr/build-a-rest-backend-with-spring-boot/

It was hard to find documentation (a.k.a. tutorials) of how to ideally
doing this mix without an embedded database, thank you very much.

I changed it a bit,

- application.properties instead of application.yml
- Generated a Tomcat 7 war instead of jar
- /bobsboots context
- boobsboots postgresql schema

I was using NetBeans (that's why there is an nb-configuration.xml)
New Maven > Java Application

TODO:
- Include HikariCP (hikari.properties)
- Exclude Hibernate, please.
- Add a REST client to the webapp folder

I'm also not sharing the database ddl, sorry. But I autoincrement the id
in the database and all columns are lowercase, character varying
and I used bigint for the id.