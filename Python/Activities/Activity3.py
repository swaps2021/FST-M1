# Getting player names & choices
player1 = input("Enter Player1 name : ")
play_choice1 = input(f"{player1} ,Do you want Rock, paper or scissors ? ")
player2 = input("Enter Player2 name : ")
play_choice2 = input(f"{player2} , Do you want Rock, paper or scissors ? ")

if play_choice1 == play_choice2 :
  print("Both Win, it's a tie")
elif play_choice1=="rock" :
    if play_choice2 == "scissors" :
        print(f"{player1} wins!! Rock beats scissors")
    else :
        print(f"{player2} wins!!")
elif play_choice1=="scissors":
    if play_choice2=="paper":
        print(f"{play_choice1} wins!! Scissors beat paper")
    else:
        print("Rock wins!!")
elif play_choice1=="paper":
    if play_choice2 =="rock":
        print("paper Wins")
    else:
        print("Scissors win")
else :
    print("Invalid Input, you have not entered Rock, Paper or Scissors")




 

