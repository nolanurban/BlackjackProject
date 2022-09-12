# BlackjackProject
This is the beginning of the Blackjack Project.

As you probably guessed, it is a program that will utilize classes and methods
to create the common BlackJack game (also known as 21)

It should be an interesting project and help me increase my knowledge on
class handoffs.

# Thoughts

I built quite a few classes in here that make me think this could be utilized
to add on additional games.  While I'm not an expert in the game of 21 and all
the optional moves, I recognize that the Player class has them.  So in our case, I created a participant abstract and a player class.  The player class
is currently empty but could be added to for moves like wantsToSplit() or perhaps purchaseInsurance().  Methods that needed to be accessible to both
dealer and player (isBust()) were placed in the participant class for access.

# Challenges

The programming has become a lot easier than I expected but the overall bulk
of interactions between class has been difficult to grasp.  I recognize the importance of OOP and how we can truly build easy to read code that flows
well.  I just have to take more time to see the bigger picture.

I spent a lot of time thinking about roles:

The dealer (Dealer ourDealer) is going to do things to our Deck (Deck ourDeck)
and so is the player (Player ourPlayer)  Classes like card need to be accessed
through deck and hand, etc.  It's a lot to take in.

# Future

While all the data types have been confusing, I really do see the power of
creating lists of objects for storage and access.  I have also seen a much
larger use of the foreach iteration as well as modifying toString to make
working with data easier.
