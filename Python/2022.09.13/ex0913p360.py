inFp, outFp = None, None
inStr = ""

inFp = open(input("소스 파일명을 입력하세요. : "), "r")
outFp = open(input("타겟 파일명을 입력하세요. : "), "w") #w는 덮어쓰기 r은 이어쓰기

inList = inFp.readlines()
for inStr in inList:
    outFp.writelines(inStr)

inFp.close()
outFp.close()
print("---정상적으로 파일에 복사되었음---")
