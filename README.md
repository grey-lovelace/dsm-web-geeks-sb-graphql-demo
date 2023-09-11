# dsm-web-geeks-sb-graphql-demo

Project to showcase how to build a simple graphql API in spring boot with other features like DB connection, oauth2 security, and config injection.

# The Demo

- Project Boilerplate
    - start.spring.io
    - Full setup screenshot found [here](media/start-spring-setup.png)
- Quick tour of project layout
    - Main Application
    - configs in application.yml
    - graphql files in src/main/resources/graphql
- Graphql schema!
    - Not documentation, actually functional
    - Queries, mutations, and types
- Set up our DB
    - Postgres running in docker compose
    - Flyway
    - Spring Configs
    - Spring JPA
    - Entities
- Create graphql query
    - Controller
    - Query
- Resolving Schema Mappings
    - Does not matter what object is returned
    - All fields will follow the same pattern:
        - Is there a schema mapping method named the same as this field that takes the object I am currently in as a param?
            - Can also be accomplished with annotations
        - Is there a getter method on the object I am curently in?
- Mutations
- Adding Easy Pagination and Filtering
- N+1 Problem
    - Batch Mapping
    - Schema Mapping + Loaders
- Adding Security
    - Oauth2
