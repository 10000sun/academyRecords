outFp = None
outStr = ""

outFp = open("C:/Temp/data2.txt", "w") #w는 덮어쓰기 r은 이어쓰기

while True :
    outStr = input("내용입력 : ")
    if outStr != "":
        outFp.writelines(outStr + "\n")
    else :
        break

outFp.close()
print("---정상적으로 파일에 씀---")
