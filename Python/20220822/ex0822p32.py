##print("안녕, 파이썬")
##print(100*200) #코드에서 곱하기 연산기호는 *이다
##print("아... 파이썬 너무 재미있어요.^^")
##print ("11+22-33")
##print(안녕? 파이썬)
##a="3"
##b=5
##result a+b
##print("type(a)=", type(a))
##a=input("숫자를 입력하세요 : ")
##print("type(a)=", type(a))
from turtle import *
color('black', 'black')
begin_fill()
while True:
    forward(200)
    left(170)
    if abs(pos()) < 1:
        break
end_fill()
done()
