inStr, outStr = "",""
count, i=0,0

inStr=input("문자를 입력하세요 : ")
count=len(inStr)

for i in range(0,count):
    outStr+=inStr[count-(i+1)]

print("%s : 요세하력입 를자문"% outStr )
