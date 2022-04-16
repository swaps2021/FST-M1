from typing import List


num = list(input("Enter list of comma separated values : ").split(", "))
sum=0
for n in num:
    sum += int(n)

print(f"Sum is {sum}")