import pandas as pd
data = [10,20,30,40,50,60]
s = pd.Series(data)
print(s[0])
s[1]=200
print(s)
print(s[:5])
print(s[2:5])
print(s[3:])
