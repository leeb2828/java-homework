These are all the programming assignments I completed for the book "Starting out with Java", by Tony Gaddis<br />

<br />

<p align="center">Chapter 7 (ArrayLists) Programming Assignments</p>

<span>1.<span> Beauty Pageant<br />
In the final round of a beauty pageant, the performance of the final 5 contestants is judged
by 3 judges. Write a class named BeautyPageant that allows a user to input the scores
given by 3 judges for each contestant. The program should print the following:
• Total score of each contestant
• Average score of all the five contestants
<br />



<span>2.</span> Payroll Class <br />
Write a Payroll class that uses the following arrays as fields:
• employeeId. An array of seven integers to hold employee identification numbers. The
array should be initialized with the following numbers:<br />
5658845 4520125 7895122 8777541 8451277 1302850 7580489
• hours. An array of seven integers to hold the number of hours worked by each
employee
• payRate. An array of seven double s to hold each employee’s hourly pay rate
• wages. An array of seven double s to hold each employee’s gross wages

The class should relate the data in each array through the subscripts. For example, the
number in element 0 of the hours array should be the number of hours worked by the
employee whose identification number is stored in element 0 of the employeeId array. That
same employee’s pay rate should be stored in element 0 of the payRate array.
In addition to the appropriate accessor and mutator methods, the class should have a
method that accepts an employee’s identification number as an argument and returns the
gross pay for that employee.
<br />



<span>5.</span> Grocery List <br />
Write a program that accepts the total number of items that a person purchases at a grocery
store and the price of each grocery item purchased. The program should read the prices into
an array and display the total amount spent in purchasing the grocery items.
<br />



<span>8.</span> Grade Book <br />
A teacher has five students who have taken four tests. The teacher uses the following grading
scale to assign a letter grade to a student, based on the average of his or her four test scores:<br />
TEST SCORE      LETTER GRADE
____________________________
90-100          A
80-80           B
70-79           C
60-69           D
0-59            F
<br />
Write a class that uses a String array or an ArrayList object to hold the five students’ names,
an array of five characters to hold the five students’ letter grades, and five arrays of four
doubles each to hold each student’s set of test scores. The class should have methods that
return a specific student’s name, the average test score, and a letter grade based on the average.
Demonstrate the class in a program that allows the user to enter each student’s name and his
or her four test scores. It should then display each student’s average test score and letter grade.

Input Validation: Do not accept test scores less than zero or greater than 100.
<br />



<span>17.</span> Phone Book ArrayList <br />
Write a class named PhoneBookEntry that has fields for a person’s name and phone number.
The class should have a constructor and appropriate accessor and mutator methods. Then
write a program that creates at least five PhoneBookEntry objects and stores them in an
ArrayList . Use a loop to display the contents of each object in the ArrayList.
<br />