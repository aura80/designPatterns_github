# designPatterns_github

--- SW DESIGN PRINCIPLES ---

DRY - Don't Repeat Yourself - avoid duplicate code;

KISS - Keep It Stupid Simple - code as simple as possible;

YAGHI - You Aren't Gonna Need It - we have to delete what we do not use;

Manifesto - similar to Agile Manifesto; 
                    * well-crafted sw, over working sw;       
                    * adding value, over being responsive to changes;       
                    * community of professionals, over interactions between individuals;       
                    * partnerships, over customer collaboration;

--- SOLID PRINCIPLES ---

SINGLE RESPONSIBILITY - each class should have a single responsibility in the project;

OPEN CLOSED - classes should be open for extension but closed for modification;

LYSKOV's SUSTITUTION - any base type can be substituted by a derived one;

INTERFACE SEGREGATION - interfaces should not have too many methods;

DEPENDENCY INVERSION - high-level modules should not depend on low-level module, both should depend on abstraction (abstract classes, interfaces and parent classes);


SINGLETON

    - one single object that can be accessed public;
    - it saves memory;
    - eager singleton: object created at the beginning of the application;
    - lazy singleton: object created only when the application wants to use it;
    - static singleton field, static method to access the static field, private constructor;  

FACTORY

    - 