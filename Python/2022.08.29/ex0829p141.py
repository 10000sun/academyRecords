import random
num=[]

for i in range(0,20) :
    num.append(random.randrange(1,21))
print("생성된 리스트", num)

for i in range(1,21) :
    if i in num :
        print("숫자", i, "는(은) 뽑혔습니다.")
    
