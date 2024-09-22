from random import random

a=int(random()*100)+1
c =int(input("請猜數字"))
for x in range(1,5):
    if c <a :
        print("大一點")
        c = int(input("請猜數字"))
        x+=1
    elif a < c:
        print("小一點")
        c = int(input("請猜數字"))
        x += 1
if a==c:
    print("恭喜答對")
if x==5:
    print("五次了 還沒對")
