These are all the programming assignments I completed for the book "Starting out with Java", by Tony Gaddis<br />

<br />

<p align="center">Chapter 4 Programming Assignments</p>


<span>1.</span> Multiplication Table <br />
Write a program that displays a multiplication table. The program should ask the user to
enter a number and also the range up to which the user wants to display the multiplication
table. For example, the multiplication table for the number 3 up to range 2 would look like:<br />
3 X 1 = 3 <br />
3 X 2 = 6
<br />



<span>2.</span> Distance Traveled <br />
The distance a vehicle travels can be calculated as follows:<br />
Distance = Speed * Time <br />
For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is
120 miles. Write a program that asks for the speed of a vehicle (in miles-per-hour) and the
number of hours it has traveled. It should use a loop to display the distance a vehicle has
traveled for each hour of a time period specified by the user. For example, if a vehicle is
traveling at 40 mph for a three-hour time period, it should display a report similar to the
one that follows:<br />
```
Hour       Distance Traveled
--------- -----------------
1          40
2          80
3          120
```
Input Validation: Do not accept a negative number for speed and do not accept any value
less than 1 for time traveled.
<br />




<span>3.</span> Distance File <br />
Modify the program you wrote for Programming Challenge 2 (Distance Traveled) so it
writes the report to a file instead of the screen. Open the file in Notepad or another text
editor to confirm the output.<br />
If you get this error message: <br />
```
DistanceFile.java:21: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
PrintWriter outputfile = new PrintWriter("Data.txt");
                         ^
1 error
```
it means you have to tell the compiler there is a chance to throw a FileNotFoundException if
the file does not exist. An object of the PrintWriter class requires it. Use a try and catch block.
<br />




<span>4.</span> Pennies for Pay <br />
Write a program that calculates the amount a person would earn over a period of time if his
or her salary is one penny the first day, two pennies the second day, and continues to double
each day. The program should display a table showing the salary for each day, and then
show the total pay at the end of the period. The output should be displayed in a dollar
amount, not the number of pennies.<br />
<i>Input Validation: Do not accept a number less than 1 for the number of days worked.<i>
<br />




<span>5.</span> Unicode Characters <br />
Write a program that asks the user to enter a Unicode decimal value that must lie either in
the range of 65 to 90 or 97 to 122. The program must use a user controlled loop to display
the letter (i.e. from A to Z or a to z) corresponding to the Unicode decimal value.
<br />



<span>6.</span> File Letter Counter <br />
Write a program that asks the user to enter the name of a file, and then asks the user to
enter a character. The program should count and display the number of times that the
specified character appears in the file. Use Notepad or another text editor to create a simple
file that can be used to test the program.
<br />



<span>22.</span> Slot Machine Simulation <br />
A slot machine is a gambling device that the user inserts money into and then pulls a lever
(or presses a button). The slot machine then displays a set of random images. If two or more
of the images match, the user wins an amount of money that the slot machine dispenses
back to the user.<br />
Create a program that simulates a slot machine. When the program runs, it should do
the following:
• Asks the user to enter the amount of money he or she wants to enter into the slot machine.
• Instead of displaying images, the program will randomly select a word from the
following list:<br />
Cherries, Oranges, Plums, Bells, Melons, Bars <br />
To select a word, the program can generate a random number in the range of 0
through 5. 
- If the number is 0, the selected word is Cherries. 
- If the number is 1, the selected word is Oranges; and so forth. 
The program should randomly select a word from this list three times and display all three of the words.
<br />