# PigGame
AP Computer Science
Final Project – Pig: A Game of Chance and Expectation 50 Points
  Description:
 Pig is a dice game of greed and strategy. There are many versions of Pig, but essentially the players try to obtain as many points as possible during each turn until either voluntarily quitting the turn, or a “skunk” roll comes up and sets the turn’s points to zero for being a “greedy pig”. The goal is to accumulate 100 points before your opponent does.
How to Play:
The game of Pig is played between two people who take turns rolling two six-sided dice. A player rolls both dice and accumulates a running sum for the current turn.
After each roll, the player may choose to pass the dice to the other player and bank his/her accumulated points for that turn, or the player may roll again (be a pig!) in an attempt to accumulate more points.
If, on any roll, a one appears on one die (skunk), the player forfeits all points accumulated during that turn and must pass the dice to the other player.
If both dice show a one (snake-eyes), the player forfeits all points accumulated up to that point in the game and must pass the dice to the other player.
Play continues until one player reaches 100 points.
For this project, you will write a program that supports one or two person play. In one person play, you will create a computerized opponent.
    
 The project must display the following items:

● The name of the game...something like Welcome to the Game of Pig!

● A statement showing whose turn it is...something like Your turn, Player 1 (using the
 person’s actual name instead of Player 1).

● Display the total points for the CURRENT turn.

● Display the value on each die that Is rolled such as Die 1: 2
Die 2: 4 (or draw the dice if you
feel like making a GUI!)

● An option for the player to ROLL

● An option for the player to PASS

● The RUNNING TOTAL points for Player 1

● The running total points for Player 2 (or the Computer if only one player)
As the game progresses, all information will be updated accordingly.
The entire design of this program is up to you!
Project Requirements:

● You MUST use multiple classes. You MUST have a minimum of 3 classes, including your client class. The possibilities are endless when you remember how to create classes as well as your inheritance hierarchies, if that is something you would like to incorporate as well!

● Take time to outline your class hierarchy and methods BEFORE you begin this project!

● Your client class, which contains the main method, should be called PigGame.

● Each class should have a fitting constructor, and/or overloaded constructors if necessary.

● All instance variables must be private.

● You MUST use multiple methods as well. Be sure to break your program up into meaningful tasks! Each task (method) should be defined for one specific task and can only return a single value.

● Display a message when switching turns between players.

● Display a message when one of the players wins...something like Player 1 WINS!

● The computer will randomly choose whether to roll again or hold. The algorithm for how this will work in your program is up to you.

● IMPORTANT....Document your code! You should have comments describing what your methods are doing and/or what sections of code are doing.
    
  ● Use meaningful names for variables, constants, classes and methods.

● Guard against all player input for ALL input values!
