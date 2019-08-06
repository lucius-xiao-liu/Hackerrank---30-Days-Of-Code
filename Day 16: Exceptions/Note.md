# Exceptions
* It is an **Object** or **Event**
* Occurs during execution of a program
* Disrupts normal flows and thrown wrongs, program errors OR exits abnormally.

Code Errors --> control flow halted & Exception object created --> control flows transfer to exception handlers --> writing handlers for exceptional conditions --> Solving issue

* Crashing program: result of an unhandled exception
* Exception handling is expensive.
    * avoid by anticipating and coding for all possible scenarios
 
 ## Exception Types:
 * Checked -> Occurs at compile time (Syntax): Something Java has no idea what's going on
 * Unchecked (Runtime exceptions) -> Occurs at the time program is excuted (Logic error)

### Try-Catch-Finally
* Try {
  Do This Until Get Exception
  } Catch (Type_Of_Error){
  Do this if ERROR comes up
  } Finally {
  Do This Anyway
  }
  * Try and Catch is must have. A catch must following Try. Finally is an Optional
  * Try -> Staging area for potentially error raising code
  * Catch -> must immediately following a Try. Can be multiples
  * Finally, must following Catch but optional for the logic. Cleanup function
  
  
### Try (Resource) {}
* useful when a resource  must be opened and closed like Scanner and BufferedReader



### Java parseInt(String s)
* convert a string that containing the int to the  integer
*returns Integer value
Throws: NumberFormatException (if the String could not convert to an integer)
