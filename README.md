# Movie-Rental-Store
This was my final assignment for CS 242 - Data Structures and Algorithms. The task was to make a functional terminal that an employee at a movie rental store could use to keep track of movies that are rented out and all of the customers' accounts.


## Problem Description
We plan on having lots of customers. We need to be able to add customers. Each customer has a phone number, first name and last name.

We also plan on having lots of videos of course! We need a way to add videos. For each video, we have a barcode (exactly 12 digits) and the title of the movie. For instance Star Wars is 086162113031.

People can take out movies. When they do, we just want to type their phone number and the movie barcode number. Someone can take out more than 1 movie, but not more than 3. Obviously people can not take out a movie we do not have or someone else has already taken out!

When people return movies, we just want to type in their phone number and the bar code. Please double check they actually had that movie out.

We want to be able to type the name of a movie and then find out who has it rented right now. For instance, I should just type “star wars” and it should show me the information of who has it so I can call them.

## Solution
I used two separate linked lists to solve this problem, one for movies and one for customers. The two different nodes were then used to store all of the relevant information for the individual movie or customer, the nodes also contain a comparator to add preserve the sorted list when inserting new elements. The main file includes a menu for the user to select which operation they would like to perform.  
