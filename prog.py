board=[" "," "," ",
       " "," "," ",
       " "," "," ",]
player="X"
def check_winner():
   if(board[0]==board[1]==board[2]!=" "):
       return True
   if(board[3]==board[4]==board[5]!=" "):
       return True
   if(board[6]==board[7]==board[8]!=" "):
       return True 
   if(board[0]==board[3]==board[6]!=" "):
       return True
   if(board[1]==board[4]==board[7]!=" "):
       return True
   if(board[2]==board[5]==board[8]!=" "):
       return True
   if(board[0]==board[4]==board[8]!=" "):
       return True
   if(board[2]==board[4]==board[6]!=" "):
       return True
   
while True:       
    move =int(input("Enter the position(1 to 9):"))
    if (board[move-1]!=" "):
        print("place is already ocupied")
    else:
        
     board[move-1]=player

     print(board[0],"|",board[1],"|", board[2])
     print("----------")
     print(board[3],"|",board[4],"|", board[5])
     print("----------")
     print(board[6],"|",board[7],"|", board[8])
     print("----------")

     if check_winner():
        print(player,"wins!")
        break

     if player=="X":
       player="O"
     else:
       player="X"
     

