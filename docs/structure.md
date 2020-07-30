# Project structure


    international-community-system [maven project]
    |--persistence [dir - maven module] (implementations of ports) [DATA PROVIDERS] - repositories
    |
    |--web [dir - maven module] (rest api calling use cases - commands and queries) [ENTRY POINTS] - presenters
    |
    |--core [dir - maven module] (ubiquitus language here) [CORE]
    |  |--application (usecase handlers - service classes)
    |  |
    |  |--domain (entities in agregate roots interacting together)
    |  |
    |  |--ports (interfaces to implement by outside class - data providers)
    |  |
    |  |--usecase (usecase interfaces)
    |  |  |--command
    |  |  |--query
    |
    |--infrastructure [dir - maven module] (compose final application, handles DI) [CONFIGURATION]
    |
    |--docs [dir]
    |
    |--angular-ui [dir] (separate angular app using rest api from web module)
    |
    |--react-ui [dir] (separate react app using rest api from web module)
    |
    |--vue-ui [dir] (separate vue app using rest api from web module)

Adapter package will be in future moved to sepúarate modules.