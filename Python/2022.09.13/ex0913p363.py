import os

inFp, outFp = None, None
inStr, outStr = "", ""
i = 0
secu = 0

secuYn = input(" 1. 암호화 2. 암호 해석 중 선택 : ")
inFname = input("입력 파일명을 입력하세요 : ")
outFname = input("출력 파일명을 입력하세요 : ")

if (os.path.exists(inFname)) and (os.path.exists(outFname)):

    if secuYn == "1" :
        secu = 100
    elif secuYn == "2" :
        secu = -100
    inFp = open(inFname, 'r' , encoding= 'utf-8')
    outFp = open(outFname, 'w', encoding = 'utf-8')

    while True :
        inStr = inFp.readline()
        if not inStr :
            break

        outStr = ""
        for i in range(0, len(inStr)) :
            ch = inStr[i]
            chNum = ord(ch)
            chNum = chNum + secu
            ch2 = chr(chNum)
            outStr = outStr + ch2

        outFp.write(outStr)

    outFp.close()
    inFp.close()
    print(inFname, "변환 완료", outFname)
else :
    print(inFname, outFname, "올바른 파일을 선택해주세요.")
