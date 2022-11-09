##a=int(input("a?")) p60 7번문제
##b=int(input("b?"))
##c=int(input("c?"))
##print(a+b+c)
##print(a*b*c)

import turtle
import random

def screenRightClick(x, y) :
    tSize = random.random(1, 10)
    turtle.shapesize(tSize)
    r=random.random()
    g=random.random()
    b=random.random()
    turtle.color((r,g,b))
    tAngle=random.randrange(0,360)
    turtle.pendown()
    turtle.goto(x,y)
    turtleleft(tAngle)
    turtle.stamp()

    r, g, b= 0.0, 0.0, 0.0
    tSize, tAngle= 0,0
    
    turtle.title('랜덤거북이')
    turtle.shape('turtle')
    turtle.pensize(tSize)

    turtleonscreenclick(screenRightClick, 3)
    turtle.done()

    
