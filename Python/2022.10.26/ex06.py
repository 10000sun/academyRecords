import pandas as pd

data = pd.read_csv("D:/수업파일/수업/박치효/pycode/data/auto-mpg.csv")

print("앞에서부터 5개만 미리보기")
print(data.head())

print("뒤에서부터 5개만 미리보기")
print(data.tail())

print("앞에서부터 10개만 미리보기")
print(data.head(10))
print(data.shape)

row, col = data.shape

print("행의 개수", row)
print("열의 개수", col)
