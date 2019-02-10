Q A-1 : Can you implement the sing() method for the bird?
Answer: As per the code snippet provided in assignment pdf cannot support because it is not declared and defined it. However I have refactored the code in below path.
	Re-factored the java class of Package path:	com.singtel.behavior.impl.Bird
		
Q A-1a : How did you unit test it?
Answer:	Junit test class: SolutionTest.java

Q A-1b :How did you optimize the code for maintainability? 
Answer: To make code maintainable I have created interface and abstract class to implement fly(), walk(), sing(), swim() methods.


Q A-2 : Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?

Answer for 2a,2b,2c,2d: 
	Implemented Junit test class: ChickenTest.java, DuckTest.java

Q A-3 : Now how would you model a rooster?
Answer for 3a,3b,3c: Implemented Junit test class: RoosterTest.java

Q A-4d)How do you keep the parrot maintainable? What if we need another parrot lives near a Duck? Or near a phone that rings frequently?

Answer : Modeled parrot using Composition (Has-A relationship) contains interface. Here the parrot has a relationship with cat,dog,duck,rooster and phone.
	Implemented Junit test class: ParrotTest.java

Q B. Model fish as well as other swimming animals.

Ans: For B1, B2, B3 
Implemented Junit test class: ClownFishTest.java, SharkFishTest.java, DolphinTest.java

