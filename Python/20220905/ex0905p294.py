def base2(num):
    if num <2:
        print(numberChar[num], end='')
    else:
        base2(num//2)
        print(numberChar[num%2], end='')

def base8(num):
    if num <8:
        print(numberChar[num], end='')
    else:
        base8(num//8)
        print(numberChar[num%8], end='')

def base16(num):
    if num <16:
        print(numberChar[num], end='')
    else:
        base16(num//16)
        print(numberChar[num%16], end='')

numberChar=['0','1','2','3','4','5','6','7','8','9']
numberChar=numberChar+['A','B','C','D','E','F']

number=int(input("10진수 입력 : "))
print("\n 2진수 : ", end='')
base2(number)

print("\n 8진수 : ", end='')
base8(number)

print("\n 16진수 : ", end='')
base16(number)
