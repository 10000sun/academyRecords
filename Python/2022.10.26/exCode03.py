import pandas as pd

data = pd.read_csv("D:/수업파일/수업/박치효/pycode/data/iris.csv")

print(data)


print("앞에서부터 7개의 데이터 추출")

print(data.head(7))
