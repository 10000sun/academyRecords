for n in range(3, 101):
    primeNum=True
    for i in range(2, n):
        if n%i==0:
            primeNum=False
    if primeNum:
        print(n, end="  ")
