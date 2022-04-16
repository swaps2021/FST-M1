#Multiplication Table of any number
num = int(input("Enter a number to display multiplication table : "))
for n in range(1,11):
    print(f"{num} X {n} = {num*n}")