i, k, guguLine = 0, 0, ""

for i in range (9,1, -1) :
    guguLine = guguLine + (" # %d단 # " % i )

print(guguLine)

for i in range(1, 10) :
     guguLine = ""
     for k in range(9, 1, -1) :
          guguLine = guguLine + str("%2dX%2d=%2d " % (k, i, k*i))
     print(guguLine)
