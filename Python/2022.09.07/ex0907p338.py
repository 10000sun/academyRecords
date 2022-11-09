from tkinter import *
from tkinter.filedialog import*

def func_open():
    global photo
    filename=askopenfilename(parent=window, filetypes=(("GIF 파일", "*.gif"),("모든파일", "*.*")))
    photo=PhotoImage(file=filename)
    width=photo.width()
    height=photo.height()
    pLabel.configure(image=photo)
    pLabel.image=photo

def func_exit():
    window.quit()
    window.destroy()

def func_zoom(event):
    global photo, value
    value=value+1
    photo=photo.zoom(value, value)
    pLabel.configure(image=photo)
    pLabel.image=photo
    
def func_sub(event):
    global photo, value
    value=value+1
    photo=photo.subsample(value, value)
    pLabel.configure(image=photo)
    pLabel.image=photo
    

window=Tk()
window.geometry("1500x1500")
window.title("연습문제")

value=1
photo=PhotoImage()
pLabel=Label(window, image=photo)
pLabel.pack(expand=1, anchor=CENTER)

window.bind("<Up>",func_zoom)
window.bind("<Down>",func_sub)
mainMenu=Menu(window)
window.config(menu=mainMenu)
fileMenu=Menu(mainMenu)
mainMenu.add_cascade(label="파일", menu=fileMenu)
fileMenu.add_command(label="파일 열기",command=func_open)
fileMenu.add_separator()
fileMenu.add_command(label="프로그램 종료", command=func_exit)

window.mainloop()
