# Generics
* reusing code
* allow to use apply the same  interface, class, or method using **different data types** but still get strong type checking at the compile time

## Commonly used generic parameter:
The letters enclosed between angle brackets (< and >) are type parameters and, like many things in programming, there is a convention behind them (remember, following conventions help us write clean, readable code!). The letters below are commonly-used generic type parameters:

E - Element
K - Key
V - Value
N - Number
T - Type (e.g.: data type)
S,U,V, etc. These are second, third, and fourth types for when T is already in use. 

## Parameterized type:
* A parameterized type is basically a class or interface name that is immediately followed by a type parameter in angle brackets. 
* i.e. List, Map

### Once a data type is specified and an object is created, the specified type replaces every ocurrence of the generic type parameter in the instantiated class. The compiler also performs strict type checking to ensure you haven't tried to do anything not allowable for that data type (e.g.: trying to add an element to integerList that isn't of type Integer). 
