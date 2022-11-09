import random

while True :
    a1=random.randrange(1,7)
    a2=random.randrange(1,7)
    b1=random.randrange(1,7)
    b2=random.randrange(1,7)

    if a1+a2>b1+b2 :
        print("값은",a1,a2,"대",b1,b2,"a가 승리!")
    elif a1+a2<b1+b2 :
        print("값은",a1,a2,"대",b1,b2,"b가 승리!")
    else :
        print("b김")

