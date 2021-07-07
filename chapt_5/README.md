These are all the programming assignments I completed for the book "Starting out with Java", by Tony Gaddis<br />

<br />

<p align="center">Chapter 5 Programming Assignments</p>

<span>1.</span> showChar Method <br />
Write a method named showChar . The method should accept two arguments: a reference to
a String object and an integer. The integer argument is a character position within the
String , with the first character being at position 0. When the method executes, it should
display the character at that character position. Here is an example of a call to the method: <br />
<span>showChar("New York", 2);</span> <br />
In this call, the method will display the character w because it is in position 2. Demonstrate
the method in a complete program. <br />


<span>2.</span>Retail Price Calculator <br />
Write a program that asks the user to enter an item’s wholesale cost and its markup percent-
age. It should then display the item’s retail price. For example:
• If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent, then the
item’s retail price is 10.00.
• If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent, then the
item’s retail price is 7.50.
The program should have a method named calculateRetail that receives the wholesale
cost and the markup percentage as arguments, and returns the retail price of the item.
<br />


<span>4.</span> Paint job Estimator <br />
A painting company has determined that for every 115 square feet of wall space, one gallon
of paint and eight hours of labor will be required. The company charges $18.00 per hour
for labor. Write a program that allows the user to enter the number of rooms to be painted
and the price of the paint per gallon. It should also ask for the square feet of wall space in
each room. The program should have methods that return the following data:
• The number of gallons of paint required
• The hours of labor required
• The cost of the paint
• The labor charges
• The total cost of the paint job
Then it should display the data on the screen.
<br />



<span>5.</span> Falling Distance <br />
When an object is falling because of gravity, the following formula can be used to determine
the distance the object falls in a specific time period:<br />

d = 1⁄2gt<sup>2</sup> <br />

The variables in the formula are as follows: d is the distance in meters, g is 9.8, and t is the
amount of time, in seconds, that the object has been falling.<br />
Write a method named fallingDistance that accepts an object’s falling time (in seconds) as
an argument. The method should return the distance, in meters, that the object has fallen
during that time interval. Demonstrate the method by calling it in a loop that passes the
values 1 through 10 as arguments, and displays the return value.
<br /> 


<span>7.</span> Test Average and Grade <br />
Write a program that asks the user to enter five test scores. The program should display
a letter grade for each score and the average test score. Write the following methods in
the program:
• calcAverage() —This method should accept five test scores as arguments and return the
average of the scores.
• determineGrade() —This method should accept a test score as an argument and return a
letter grade for the score, based on the following grading scale:<br />
Score           Letter Grade
----------------------------
90-100          A
80-89           B
70-79           C
60-69           D
Below 60        F
<br />



<span>13.</span> isPrime Method <br />
A prime number is a number that is evenly divisible only by itself and 1. For example, the
number 5 is prime because it can be evenly divided only by 1 and 5. The number 6, however,
is not prime because it can be divided evenly by 1, 2, 3, and 6.<br />
Write a method named isPrime , which takes an integer as an argument and returns true if
the argument is a prime number, or false otherwise. Demonstrate the method in a complete
program.<br />
TIP: Recall that the % operator divides one number by another, and returns the remainder of the division. In an expression such as num1 % num2 , the % operator will return 0 if
num1 is evenly divisible by num2. <br />
For example, 4 % 2 = 0 and 5 % 2 = 1.
<br />