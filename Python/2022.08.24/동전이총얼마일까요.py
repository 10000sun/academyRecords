money, c500, c100, c50, c10=[0]*5 ##p100 예제

c500 = int(input("500원 동전의 개수 ==>"))#7
c100 = int(input("100원 동전의 개수 ==>"))#13
c50 = int(input("50원 동전의 개수 ==>"))#9
c10 = int(input("10원 동전의 개수 ==>"))#2

money=c500*500+c100*100+c50*50+c10*10

print("##동전의 합계 =>", money, '원')
