# Inheritance in Java

## Inheritance
* class hierarchy
### Subclass/Derived Class/Extened Class/Child Class
* A class that inherits from some other class (superclass)
* being able to **inherits** superclass, **declare new fields & methods**, and **override** superclasds methods

*SubclassB extends SuperclassA*
* Java **ONLY** supports **single** inheritance: subclass can only extend one supereclass

### Ways to call a superclass constructor
* explicit
  * super(superclass_variable);
* implicit call
  * subclass automaticlly makes a *behind-the -scenes* calls to super();

### Overriding Methods
* precede with @Override annoion
  * for better understanding
  * help check the work
  * use *getName* method to calls the superclass;
