import turtle
t=turtle

swidth, sheight = 500, 500

t.title('무지개색 원그리기')
t.shape('turtle')
t.setup(width = swidth + 50, height = sheight + 50)
t.screensize(swidth, sheight)
t.penup()
t.goto(0, -sheight /2)
t.pendown()
turtle.speed(100)

for radius in range(1, 2500) :
    if radius % 7 == 1 :
        t.pencolor('red')
    elif radius % 7 ==2 :
        t.pencolor('orange')
    elif radius % 7 ==3 :
        t.pencolor('yellow')
    elif radius % 7 ==4 :
        t.pencolor('green')
    elif radius % 7 ==5 :
        t.pencolor('blue')
    elif radius % 7 ==6 :
        t.pencolor('navyblue')
    else :
        t.pencolor('purple')

    t.circle(radius)

turtle.done()
