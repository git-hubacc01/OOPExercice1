# OOPExercice

Lab Exercise 1.1

1. Extend the Bicycle class by adding the second data member tagNo of type String. Declare this data member as private.

2. Add a new method to the Bicycle class that assigns a tag number. This method will be called as follows:
   Bicycle bike; 
   bike = new Bicycle();
   ....
  
   bike.setTagNo ("2004-134R");

3. Add a another method to the Bicycle class that returns the bicycle's tag number. This method will be called as follows:
   Bicycle bike; 
   bike = new Bicycle(); 
   ....

   String tag = bike.getTagNo();

Lab Exercise 1.2

Modify the Bicycle class made on lab exercise 1.1 by adding another constructor that accepts two arguments, ownerName and tagNo
Modify the BicycleRegistration class by creating another object using the newly added constructor
