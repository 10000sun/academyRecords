import random

dice1, dice2, dice3, dice4 = [0]*4

dice1= random.randrange(1,7)
dice2= random.randrange(1,7)
dice3= random.randrange(1,7)
dice4= random.randrange(1,7)
A=dice1+dice2
B=dice3+dice4

print("A의 주사위 숫자는", dice1, dice2, "입니다.")



print("B의 주사위 숫자는", dice3, dice4, "입니다.")

if A > B :
    print("A가 이겼네요")
elif B > A :
    print("B가 이겼네요")
else :
    print("둘이 비겼네요")
