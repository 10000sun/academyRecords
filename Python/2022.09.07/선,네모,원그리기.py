from tkinter import *
from tkinter import ttk, colorchooser
from tkinter import simpledialog

# x1, y1: 시작점
x1 = None
y1 = None

# 선택=0, 점=1, 선=2, 네모=3, 원=4, 텍스트=5
draw_mode = 0
# 그리는 색
draw_color = "black"
# 객체 리스트
obj_array = []

tSize=2

# 도형 클래스 만들기
class Object:
    # 생성자
    def __init__(self, color, width=tSize):
        self.color = color
        self.width = width


# 점 클래스 만들기
class Point(Object):
    # 생성자
    def __init__(self, x, y, color, width=tSize):
        self.x = x
        self.y = y
        self.color = color
        self.width = width

    # 그리기 함수
    def draw(self, canvas):
        canvas.create_oval(self.x-self.width, self.y-self.width, self.x+self.width, self.y+self.width, fill=self.color, outline=self.color)

    
# 선 클래스 만들기
class Line(Object):
    # 생성자
    def __init__(self, x1, y1, x2, y2, color, width=tSize):
        self.x1 = x1
        self.y1 = y1
        self.x2 = x2
        self.y2 = y2
        self.color = color
        self.width = width

    # 그리기 함수
    def draw(self, canvas):
        canvas.create_line(self.x1, self.y1, self.x2, self.y2, width=self.width, fill=self.color)

# 네모 클래스 만들기
class Rectangle(Object):
    # 생성자
    def __init__(self, x1, y1, x2, y2, color, width=tSize):
        self.x1 = x1
        self.y1 = y1
        self.x2 = x2
        self.y2 = y2
        self.color = color
        self.width = width

    # 그리기 함수
    def draw(self, canvas):
        canvas.create_rectangle(self.x1, self.y1, self.x2, self.y2, width=self.width, outline=self.color)

# 원 클래스 만들기
class Circle(Object):
    # 생성자
    def __init__(self, x1, y1, x2, y2, color, width=tSize):
        self.x1 = x1
        self.y1 = y1
        self.x2 = x2
        self.y2 = y2
        self.color = color
        self.width = width

    # 그리기 함수
    def draw(self, canvas):
        canvas.create_oval(self.x1, self.y1, self.x2, self.y2, width=self.width, outline=self.color)

# 글씨 클래스 만들기
class Text(Object):
    # 생성자
    def __init__(self, x, y, text, color, width=tSize):
        self.x = x
        self.y = y
        self.text = text
        self.color = color
        self.width = width

    # 그리기 함수
    def draw(self, canvas):
        canvas.create_text(self.x, self.y, text=self.text, font=("Courier", self.width*5), fill=self.color)

# 선택 메뉴 함수
def selectM():
    global draw_mode
    draw_mode = 0

# 점 그리기 메뉴 함수
def pointM():
    global draw_mode
    draw_mode = 1

# 라인 그리기 메뉴 함수
def lineM():
    global draw_mode
    draw_mode = 2

# 네모 그리기 메뉴 함수
def rectangleM():
    global draw_mode
    draw_mode = 3

# 원 그리기 메뉴 함수
def circleM():
    global draw_mode
    draw_mode = 4

# 글씨 쓰기 메뉴 함수
def textM():
    global draw_mode
    draw_mode = 5

#==색상매뉴=============================

# 흰색 메뉴 함수
def whiteM():
    global draw_color
    draw_color = "white"

# 검은색 메뉴 함수
def blackM():
    global draw_color
    draw_color = "black"

# 빨간색 메뉴 함수
def redM():
    global draw_color
    draw_color = "red"

# 노랑색 메뉴 함수
def yellowM():
    global draw_color
    draw_color = "yellow"

# 파란색 메뉴 함수
def blueM():
    global draw_color
    draw_color = "blue"

# 녹색 메뉴 함수
def greenM():
    global draw_color
    draw_color = "green"

# 마우스 왼쪽 버튼 눌렀을 때
def mouseLDown(event):
    global x1, y1, obj_array, tSize

    # 점 그리기 모드라면
    if draw_mode == 1:
        # Point class 인스턴스를 생성하고,
        point = Point(event.x, event.y, draw_color, tSize)
        # obj_array에 집어 넣는다.
        obj_array.append(point)

    # 글씨 쓰기 모드라면
    elif draw_mode == 5:
        # Text class 인스턴스를 생성하고,
        input_text=simpledialog.askstring ("그림판 문자입력", "문자입력 : ")
        text = Text(event.x, event.y, input_text, draw_color, tSize)
        # obj_array에 집어 넣는다.
        obj_array.append(text)  

    # 선, 네모, 원 그리기 모드이면
    elif draw_mode >= 2 and draw_mode <= 4:
        # L Button Down 좌표만 기억
        x1 = event.x
        y1 = event.y

    render()

# 마우스 움직일때
def mouseMove(event):
    global x1, y1

    render()

# 마우스 왼쪽 버튼 뗄 때
def mouseLUp(event):
    global x1, y1

    # 선 그리기 모드라면
    if draw_mode == 2:
        # Line class 인스턴스를 생성하고,
        line = Line(x1, y1, event.x, event.y, draw_color, tSize)
        # obj_array에 집어 넣는다.
        obj_array.append(line)
      

    # 네모 그리기 모드라면
    elif draw_mode == 3:
        # Rectangle class 인스턴스를 생성하고,
        rectangle = Rectangle(x1, y1, event.x, event.y, draw_color, tSize)
        # obj_array에 집어 넣는다.
        obj_array.append(rectangle)
       
    # 원 그리기 모드라면
    elif draw_mode == 4:
        # Circle class 인스턴스를 생성하고,
        circle = Circle(x1, y1, event.x, event.y, draw_color, tSize)
        # obj_array에 집어 넣는다.
        obj_array.append(circle)

    render()

# 그리기 함수
def render():
    # 일단 화면을 지우고
    canvas.create_rectangle(0, 0, 400, 300, fill="white")    

    # 가지고 있는 객체들을 다 그린다
    for i in range(len(obj_array)):
        obj_array[i].draw(canvas)
        
# 두껍게 함수
def widthPlusM():
    # 아이템을 두껍게 만든다
    global tSize
    tSize=tSize+2

    render()

# 얇게 함수
def widthMinusM():
    # 선택한 아이템을 얇게 만든다
    global tSize
    tSize=tSize-2

    render()

def tClear():
    # 객체 리스트에 뭔가 들어있는 경우에만 지울 수 있다.
    if len(obj_array) > 0:
        #모든 아이템을 지운다
        shape=obj_array.clear() #마지막것 부터 순차적을 지우려면 pop() 사용
        del(shape)

        render()

def preClear():
    # 객체 리스트에 뭔가 들어있는 경우에만 지울 수 있다.
    if len(obj_array) > 0:
        #이전 아이템을 지운다
        shape=obj_array.pop()
        del(shape)

        render()        

def change_color():  
         global draw_color
         draw_color=colorchooser.askcolor()[1]

        
##===etc==================================
          
        
# 윈도우를 생성한다
window = Tk()
window.title("그림판")

canvas = Canvas(window, width=400, height=300, bg="white")

menu=Menu(window)
window.config(menu=menu)

drawM=Menu(menu)
menu.add_cascade(label="그리기", menu=drawM)
drawM.add_command(label="점", command=pointM)
drawM.add_separator()
drawM.add_command(label="선", command=lineM)
drawM.add_separator()
drawM.add_command(label="사각형", command=rectangleM)
drawM.add_separator()
drawM.add_command(label="원", command=circleM)
drawM.add_separator()
drawM.add_command(label="텍스트", command=textM)

colorM=Menu(menu)
menu.add_cascade(label="색상", menu=colorM)
colorM.add_command(label="펜 색깔(멀티)", command=change_color)
colorM.add_separator()
colorM.add_command(label="흰색", command=whiteM)
colorM.add_separator()
colorM.add_command(label="검정색", command=blackM)
colorM.add_separator()
colorM.add_command(label="빨강색", command=redM)
colorM.add_separator()
colorM.add_command(label="노랑색", command=yellowM)
colorM.add_separator()
colorM.add_command(label="파랑색", command=blueM)
colorM.add_separator()
colorM.add_command(label="초록색", command=greenM)
colorM.add_separator()

etcM=Menu(menu)
menu.add_cascade(label="기타", menu=etcM)
etcM.add_command(label='굵게',command=widthPlusM)
etcM.add_separator()
etcM.add_command(label='얇게',command=widthMinusM)
etcM.add_separator()
etcM.add_command(label='모두지우기',command=tClear)
etcM.add_separator()
etcM.add_command(label='이전지우기',command=preClear)
etcM.add_separator()
etcM.add_command(label='종료',command=window.destroy)

# 마우스 이벤트 연결
canvas.bind("<Button-1>", mouseLDown)
canvas.bind("<Motion>", mouseMove)
canvas.bind("<ButtonRelease-1>", mouseLUp)
canvas.pack()


window.mainloop()
