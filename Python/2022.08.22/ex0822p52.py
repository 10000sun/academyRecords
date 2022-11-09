##import turtle 모듈이름을 적어야 사용가능 turtle.shape()
##from tyrtle import * 변수만 적어도 사용가능 shape()

##turtle.shape("turtle")
##turtle.forward(200)
##turtle.right(90)
##turtle.forward(200)
##turtle.right(90)
##turtle.forward(200)
##turtle.right(90)
##turtle.forward(200)
##turtle.right(90)
##turtle.done()



import turtle   #p56 코드
import random

#함수 선언 부분

pSize, tSize = 10, 0
r, g, b = 0.0, 0.0, 0.0

def screenLeftClick(x,y) :
    global r, g, b
    turtle.pencolor((r, g, b))
    turtle.pendown()
    turtle.goto(x, y)

def screenRightClick(x, y) :
    turtle.penup()
    turtle.goto(x, y)

def screenMidClick(x, y) :
        global r, g, b
        tSize = random.randrange(1, 10)
        turtle.shapesize(tSize)
        r = random.random()
        g = random.random()
        b = random.random()

#변수 선언 부분

turtle.title('거북이로 그림그리기')
turtle.shape('turtle')
turtle.pensize(pSize)

turtle.onscreenclick(screenLeftClick, 1)
turtle.onscreenclick(screenMidClick, 2)
turtle.onscreenclick(screenRightClick, 3)

turtle.done()
