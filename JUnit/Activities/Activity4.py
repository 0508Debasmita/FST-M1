Player1 = input ("Player 1 choice (Rock,Paper,Scissor) :").lower()
Player2 = input("Player2 choice (Rock,Paper,Scissor) :").lower()

if Player1==Player2:
    print("Both win, it's a Tie ..!!")
elif Player1 == 'scissor':
    if Player2 == 'paper':
        print("scissor wins")
    else:
        print("rock wins")

elif Player1== 'rock':
    if Player2=='scissor':
        print("rock wins")
    else:
        print("paper wins")
elif Player1== 'paper':
    if Player2=='rock':
        print("paper wins")
    else:
        print("scissor wins")
else:
    print("Invalid input")

Decision= input("Do you want to play again? ( Yes/No:").lower()
if Decision== 'no' :
    print("Thank you for playing !!")
    raise SystemExit
elif Decision=='yes':
    print("Let's startover")
    pass
else:
    print("Invalid input")
    raise SystemExit

