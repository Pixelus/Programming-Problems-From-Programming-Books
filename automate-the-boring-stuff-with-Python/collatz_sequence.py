def collatz(number):
    if(number % 2 == 0):
        print(number // 2)
        return(number // 2)
    else: 
        print(3 * number + 1)   
        return(3 * number + 1)       

user_number = int(input("Enter number: "))
while user_number != 1:
    user_number = collatz(user_number)
