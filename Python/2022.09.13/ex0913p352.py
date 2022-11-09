InFp=None
inStr=""

inFp=open("C:/Temp/data1.txt", "r", encoding='utf-8')

##while True :
##    inStr=inFp.readline()
##    if inStr=="":
##        break;
##    print(inStr, end="") #readline()이용

inList = inFp.readlines()
print(inList) #readlines()이용

inFp.close() #close()사용하고 싶지 않을 때는 첫줄에 with open("경로") as inFp: 사
