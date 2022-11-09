import turtle

## 전역변수
num1, num2, num3 = [0]*3
swidth, sheight = 1000, 300
curX, curY = 0, 0

##메인 코드
if __name__ == "__main__" :
    turtle.title('거북이로 2개의 수 논리합  표현하기')
    turtle.shape('turtle')
    turtle.setup(width = swidth + 50, height = sheight + 50)
    turtle.screensize(swidth, sheight)
    turtle.penup()
    turtle.left(90)

    num1 = int(input("2진수를 입력하세요. :"), 2)
    num2 = int(input("2진수를 입력하세요. :"), 2)
    num3 = num1 | num2
    binary = bin(num1)
    print("입력값확인 : ", binary)
    curX = swidth / 2
    curY = 100
    for i in range(len(binary) - 2) :
        turtle.goto(curX, curY)
        if num1 & 1 :
            turtle.color('red')
            turtle.turtlesize(2)
        else :
            turtle.color('blue')
            turtle.turtlesize(1)
        turtle.stamp()
        curX -=50
        num1 >>= 1

    binary = bin(num2)
    print("입력값확인 : ", binary)
    curX = swidth / 2
    curY = 0
    for i in range(len(binary) - 2) :
        turtle.goto(curX, curY)
        if num2 & 1 :
            turtle.color('red')
            turtle.turtlesize(2)
        else :
            turtle.color('blue')
            turtle.turtlesize(1)
        turtle.stamp()
        curX -=50
        num2 >>= 1

    binary = bin(num3)
    print("입력값확인 : ", binary)
    curX = swidth / 2
    curY = -100
    for i in range(len(binary) - 2) :
        turtle.goto(curX, curY)
        if num3 & 1 :
            turtle.color('red')
            turtle.turtlesize(2)
        else :
            turtle.color('blue')
            turtle.turtlesize(1)
        turtle.stamp()
        curX -=50
        num3 >>= 1
        
turtle.done()
