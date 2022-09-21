## Practice Statement - Unique Arrays

**A company has revamped the health insurance policy for all its insured employees and has increased their health cover by 20%. In order to provide them this facility, the human resource department needs to collect the data of all insured employees and prepare a unique list of their employee ids.​ Write a program to help the HR manager to create a unique list of employee ids to avoid duplication.​​**

### Example 

    Sample Input :
        int[] salesDepartmentEmpIds = {101,105,106,107,108,109};
    Sample Output:
        true
    ---------------------------------------------
    Sample Input :
        int[] accountDepartmentEmpIds = {201,205,206,207,208,209,201};
    Sample Output:
        false



# Practice Statement - Shortest word 

**Write a Java program to get the strings as input from the user and push them to an array. Find the shortest word in the list of strings and display the same on the screen.**

**Sample Input**

	words[] = {"Atrocity", "Pensive", "Imperceptible", "Discordant" }

**Sample Output**

	Shortest word is Pensive
	
	
# Practice Statement: Calorie Tracker

**Anne is using a calorie tracker app that helps her keep a record of all her physical activities and her daily intake of calories**
**The calories burned by her doing some of the common physical activities are:**

1. 30 minutes of cycling burns around 300 calories
2. 30 minutes of swimming burns around 200 calories
3. 30 minutes of running burns around 500 calories

**Anne can lose one pound of weight for each 1000 calories burned. Her daily extra calorie intake tracked by the app is 100**
**Write a java program to calculate the number of pounds Anne can lose in a month if she does each of the above mentioned activities
once a week for 1 hour and chooses to do one activity per day.**


**Sample Input:**

    Calorie burnt by cycling : 200
    Calorie burnt by running : 200
    Calorie burnt by swimming: 200
    Calorie intake in a day  : 100

**Sample Output:**

    Weight lost by Anne in a month is : 5.0 pounds
    
## Spring MVC Exercise

```text

Food Ordering App

Develop a Food Ordering App using Spring Boot. Refer to the class diagram below to develop required classes.
You can use either MySQL or an embedded H2 Database to store the data.

MenuItem
	- menuItemId:long
	- itemName:String
	- status:(available/not-available)
	- price:double
	- category (Veg/Nonveg)

Implement the following operations

Add a new item to the menu
Delete an item from the menu
Update the price of an item
Search an Item by Name
Display all the available items
Filter items category wise

Hints:
Create enums for status and category
use @Enumerated for fields of enum types

```
