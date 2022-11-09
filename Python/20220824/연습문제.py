##print("%d / %d = %d" %(5, 10, 5/10)) 2번문제
##print("%1.1f" % 123.45) #3번문제 2번
##print("{2:d} {0:d} {1:d}".format(111,222,333)) #4번문제

##num=input("(2/8/10/16)진수 입력 :") ##p92 16번 심화문제
##if('0'<=num and num<='1'): 
##    print("2진수 또는 8진수 또는 10진수 또는 16진수 입니다.")
##elif('2'<=num and num<='7'):
##    print("8진수 또는 10진수 또는 16진수 입니다.")
##elif('8'<=num and num<='9'):
##    print("10진수 또는 16진수 입니다.")
##elif('a'<=num and num<='f') or ('A'<=num and num<='F'):
##    print("16진수 입니다.")
##else:
##    print("숫자가 아닙니다.")


money, c50000, c10000, c5000, c1000, c500, c100, c50, c10=[0]*9 ##p100 예제

money = int(input("교환할 돈은 얼마인가요?"))

c50000 = money // 50000
money %= 50000

c10000 = money // 10000
money %= 10000

c5000 = money // 5000
money %= 5000

c1000 = money // 1000
money %= 1000

c500 = money // 500
money %= 500

c100 = money // 100
money %= 100

c50 = money // 50
money %= 50

c10 = money // 10
money %= 10

print("\n 50000원 지폐 => %d개" % c50000)
print("\n 10000원 지폐 => %d개" % c10000)
print("\n 5000원 지폐 => %d개" % c5000)
print("\n 1000원 지폐 => %d개" % c1000)
print("\n 500원 동전 => %d개" % c500)
print("\n 100원 동전 => %d개" % c100)
print("\n 50원 동전 => %d개" % c50)
print("\n 10원 동전 => %d개" % c10)
print("\n 바꾸지 못한 잔돈 => %d원 \n" % money )
