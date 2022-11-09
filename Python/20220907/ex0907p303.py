from tkinter import*
from tkinter import messagebox

def myFunc1():
    messagebox.showinfo("개","개 입니다.")
def myFunc2():
    messagebox.showinfo("고양이","고양이 입니다.")
def myFunc3():
    messagebox.showinfo("안내창","안내창입니다.")

window = Tk()
window.title("윈도우창 연습")

label1=Label(window, text="홍길동")
photo1=PhotoImage(file="../GIF/dog.gif")
button1=Button(window, image=photo1, command=myFunc1)
photo2=PhotoImage(file="../GIF/cat.gif")
button2=Button(window, image=photo2, command=myFunc2)
button3=Button(window, text="버튼", command=myFunc3)

label1.pack()
button1.pack(side=LEFT)
button2.pack(side=LEFT)
button3.pack()

window.mainloop()
