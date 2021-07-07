<h1>Doubly Linked List Assignment</h1>

<h3>Instructions</h3>
Create four Java classes:
- Main.java -> The start of the program.
- Menu.java -> Listening to user input for how to modify the linked list (insert item or delete item).
- LunchLine.java -> For the linked list
- Student.java -> For each "node" in the linked list

<br />
<br />
<br />


<h4>Student class</h3>
Each student created from this class is going to represent each "node" in your linked list. Using a real world example, this of
each node as each individual cart attached to the train.<br />

Create 5 instance variables (not class variables so don't include the 'static' keyword):
- String name
- int age
- int grade
- Student next -> stores the student object (behind this student object) in the linked list.
- Student previous -> the student object (in front of this student object) in the linked list.
<br />

<p>Create a class constructor method that takes in values for name, age, and grade and stores them in the object's instance variables.</p>

Create a displayPersonalInformation() method that that returns nothing. It should display:
- the name, age, and grade of the student.
- information about who is standing in front and behind him/her.


<br />
<br />
<br />


<h4>LunchLine class</h3>
The line created from this class is going to represent the linked list itself. Using a real world example, think of this as 
the engine to the train.

Create 2 class variables (include the 'static' keyword).
- Student first_student
- Student last_student
Create a class constructor to assign first_student and last_student to null.

Create these 6 methods:
- insertFirst() - insert new student to the front of the list
- insertLast() - insert new student to the back of the list
- isEmpty() - check if the list is empty
- deleteFirstStudent() - delete the first student in the list
- deleteLastStudent() - delete the last student in the list
- displayEntireList() - display the entire list (each student)

<br />
<br />
<br />

<h4>Menu class</h4>
This class is responsible for displaying the menu of options to the user. Such as creating a new student and adding it to
the list or removing a student from the list. Based on input from the user, the Menu class will call different methods, used 
for modifying the list, from the LunchLine class.<br />
Give the user the option to:
- Create and add a new student to the list. Give the user a choice whether to add the student to the front or the back of the list.
- Remove a student from the list. Give the user a choice whether to remove the first or last student in the list.


<br />
<br />
<br />

<h4>Main class</h4>
This is where the program starts. Have a while loop that keeps running until the user selects "quit program". I recommend importing Java's 
Scanner class to record user input. Initialize and create a linked list object from the LunchLine class. Such as
```
LunchLine cafe_line = new LunchLine();
```
Inside this loop:
- call the linked list displayEntireList() method.
- Call the Menu class displayMenu() method.
- Record the user's choice.

