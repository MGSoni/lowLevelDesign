# lowLevelDesign

#Prototype Implementation Steps: 
1. For Prototype patterns for the class which can create a copy of the object we often declare the clone method in an interface and let the class implement that
   interface. That interface is named as clonable or prototype.
2. A registry should have those methods which allows you to store as well as fetch.
3. In case of child class overriding the clone doesn't work as some elements may be private without getters. 
3. Now to solve that we need to use copy constructors and for both parent and child and clone method should call copy constructors instead of doing copy work
   themselves.
Resource: Refactoring and SourceMaking.
