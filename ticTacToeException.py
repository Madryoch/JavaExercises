#A function that creates a GUI for the board and explains the positions
def displayBoard(myBoard):
    print("     |     |     "+"\t\t"+"     |     |")
    print("  0  |  1  |  2  "+"\t\t"+"  "+myBoard[0]+"  |  "+myBoard[1]+"  |  "+myBoard[2])
    print("     |     |     "+"\t\t"+"     |     |")
    print("_________________"+"\t\t"+"_________________")
    print("     |     |     "+"\t\t"+"     |     |")
    print("  3  |  4  |  5  "+"\t\t"+"  "+myBoard[3]+"  |  "+myBoard[4]+"  |  "+myBoard[5])
    print("     |     |     "+"\t\t"+"     |     |")
    print("_________________"+"\t\t"+"_________________")
    print("     |     |     "+"\t\t"+"     |     |")
    print("  6  |  7  |  8  "+"\t\t"+"  "+myBoard[6]+"  |  "+myBoard[7]+"  |  "+myBoard[8])
    print("     |     |     "+"\t\t"+"     |     |")
    
#A function that checks if playerX or playerO has won
def checkWin(myBoard,playerSymbol):
    return (
        #Top Row
        (myBoard[0] == playerSymbol and myBoard[1] == playerSymbol and myBoard[2] == playerSymbol) or
        #Mid Row
        (myBoard[3] == playerSymbol and myBoard[4] == playerSymbol and myBoard[5] == playerSymbol) or
        #Bottom Row
        (myBoard[6] == playerSymbol and myBoard[7] == playerSymbol and myBoard[8] == playerSymbol) or
        #Left Column
        (myBoard[0] == playerSymbol and myBoard[3] == playerSymbol and myBoard[6] == playerSymbol) or
        #Middle Column
        (myBoard[1] == playerSymbol and myBoard[4] == playerSymbol and myBoard[7] == playerSymbol) or
        #Right Column
        (myBoard[2] == playerSymbol and myBoard[5] == playerSymbol and myBoard[8] == playerSymbol) or
        #Left to Right Top to Bottom Diagonal
        (myBoard[0] == playerSymbol and myBoard[4] == playerSymbol and myBoard[8] == playerSymbol) or
        #Right to Left Top to Bottom Diagonal
        (myBoard[2] == playerSymbol and myBoard[4] == playerSymbol and myBoard[6] == playerSymbol)
        )

#A function that checks if there are any available moves to be had still
def checkBoard(myBoard):
    result= (
            myBoard[0]==" " or
            myBoard[1]==" " or
            myBoard[2]==" " or
            myBoard[3]==" " or
            myBoard[4]==" " or
            myBoard[5]==" " or
            myBoard[6]==" " or
            myBoard[7]==" " or
            myBoard[8]==" ")
    print((not result)*"\n\nThere are no more available moves...")
    return (not result)

#A function that allows playerX or playerO to play
def playerMove(playerSymbol,pos):
    if (0<=pos<9 and myBoard[pos]==" "):
        myBoard[pos]=playerSymbol 
    else:
        pos=int(input("Invalid Move. Try again: "))
        playerMove(playerSymbol,pos)
        

#Initialization of Variables
myBoard=[" "," "," "," "," "," "," "," "," "]
status=1
player=("X","O")
turn=0

while(status):
              displayBoard(myBoard)
              print("\n\n\nPlayer "+player[turn]+" 's turn:")
              myMove=input("Please enter your move: ")
              try:
                  int(myMove)
              except:
                  print("This is not a number.")
                  continue
              myMove=int(myMove)
              playerMove(player[turn],myMove)
              status =(checkWin(myBoard,player[turn]))
              if (status):
                  displayBoard(myBoard)
                  print(status*("\n\n\nPlayer "+player[turn]+" wins!!!!"))
              status=not status
              if (checkBoard(myBoard)):
                  displayBoard(myBoard)
                  status=False
              turn=(1+turn)%2
              

            
              







