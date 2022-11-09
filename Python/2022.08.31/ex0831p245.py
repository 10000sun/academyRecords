aa=input("문자열 입력 : ")

if aa.isalpha():
    print("글자 입니다.")
elif aa.isdigit():
    print("숫자 입니다.")
elif aa.isalnum():
    print("문자+숫자입니다.")
else:
    print("몰?루?")
