from tkinter import*
from tkinter.simpledoialeg import*

window=TK()
window.geometry("400x400")

##label1=Label(window, text="입력된 값")
##label1.pack()
##
##value=askinterger("확대배수", "주사위 숫자(1~6)을 입력하세요"), minvalue=1, maxvalue=6
##
##Label1.configure(text=str(value))
##window.mainloop()

label1=Label1(window,text="선택된 파일 이름")
label1.pack()

f1lename=askopenfilename(parent=window,filtertyle=(("GIF파일", ".GIF")
    ("모든파일):, :*.*)))
