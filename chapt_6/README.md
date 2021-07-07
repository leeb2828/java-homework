These are all the programming assignments I completed for the book "Starting out with Java", by Tony Gaddis<br />

<br />

<p align="center">Chapter 6 (Java Classes) Programming Assignments</p>


<span>1.</span> Employee Class <br />
Write a class named Employee that has the following fields::
• name. The name field references a String object that holds the employee’s name.
• idNumber. The idNumber is an int variable that holds the employee’s ID number.
• department. The department field references a String object that holds the name of
  the department where the employee works.
• position. The position field references a String object that holds the employee’s
  job title.

The class should have the following constructors:
• A constructor that accepts the following values as arguments and assigns them to the
appropriate fields: employee’s name, employee’s ID number, department, and position.
• A constructor that accepts the following values as arguments and assigns them to the
appropriate fields: employee’s name and ID number. The department and position
fields should be assigned an empty string ( "" ).
• A no-arg constructor that assigns empty strings ( "" ) to the name , department , and
position fields, and 0 to the idNumber field.
Write appropriate mutator methods that store values in these fields and accessor methods
that return the values in these fields. Once you have written the class, write a separate pro-
gram that creates three Employee objects.
The program should store this data in the three objects and then display the data for each
employee on the screen.

<br />



<span>2.</span> Car Class <br />
Write a class named Car that has the following fields:
• yearModel. The yearModel field is an int that holds the car’s year model.
• make. The make field references a String object that holds the make of the car.
• speed. The speed field is an int that holds the car’s current speed.Programming Challenges
In addition, the class should have the following constructor and other methods.
• Constructor. The constructor should accept the car’s year model and make as argu-
ments. These values should be assigned to the object’s yearModel and make fields. The
constructor should also assign 0 to the speed field.
• Accessors. Appropriate accessor methods should get the values stored in an object’s
yearModel , make , and speed fields.
• accelerate. The accelerate method should add 5 to the speed field each time it is called.
• brake. The brake method should subtract 5 from the speed field each time it is called.<br />

Demonstrate the class in a program that creates a Car object, and then calls the accelerate
method five times. After each call to the accelerate method, get the current speed of the car
and display it. Then call the brake method five times. After each call to the brake method,
get the current speed of the car and display it.

<br />



<span>3.</span> Personal Information Class <br />
Design a class that holds the following personal data: name, address, age, and phone num-
ber. Write appropriate accessor and mutator methods. Demonstrate the class by writing a
program that creates three instances of it. One instance should hold your information, and
the other two should hold your friends’ or family members’ information.

<br />



<span>8.</span> Temperature Class <br />
Write a Temperature class that will hold a temperature in Fahrenheit, and provide meth-
ods to get the temperature in Fahrenheit, Celsius, and Kelvin. The class should have the
following field:
• ftemp – A double that holds a Fahrenheit temperature.
The class should have the following methods:
• Constructor – The constructor accepts a Fahrenheit temperature (as a double ) and
stores it in the ftemp field.
• setFahrenheit – The setFahrenheit method accepts a Fahrenheit temperature (as a
double ) and stores it in the ftemp field.
• getFahrenheit – Returns the value of the ftemp field, as a Fahrenheit temperature (no
conversion required).
• getCelsius – Returns the value of the ftemp field converted to Celsius.
• getKelvin – Returns the value of the ftemp field converted to Kelvin.

Use the following formula to convert the Fahrenheit temperature to Celsius:
Celsius = (5/9) X (Fahrenheit - 32)

Use the following formula to convert the Fahrenheit temperature to Kelvin:
Kelvin = ( (5/9) X (Fahrenheit - 32) ) + 273

Demonstrate the Temperature class by writing a separate program that asks the user for a
Fahrenheit temperature. The program should create an instance of the Temperature class,
with the value entered by the user passed to the constructor. The program should then call
the object’s methods to display the temperature in Celsius and Kelvin.

<br />



<span>9.</span> Days in a Month <br />
Write a class named MonthDays . The class’s constructor should accept two arguments:

• An integer for the month (1 = January, 2 = February, etc.).
• An integer for the year
The class should have a method named getNumberOfDays that returns the number of days
in the specified month. The method should use the following criteria to identify leap years:
1. Determine whether the year is divisible by 100. If it is, then it is a leap year if and if
only it is divisible by 400. For example, 2000 is a leap year but 2100 is not.
2. If the year is not divisible by 100, then it is a leap year if and if only it is divisible by 4. 
For example, 2008 is a leap year but 2009 is not.

Demonstrate the class in a program that asks the user to enter the month (letting the user
enter an integer in the range of 1 through 12) and the year. The program should then dis-
play the number of days in that month. Here is a sample run of the program:<br />

Enter a month (1-12): 2 [ENTER]
Enter a year: 2008 [ENTER]
29 days

<br />

