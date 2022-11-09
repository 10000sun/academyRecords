import pandas as pd

data = pd.read_csv("D:/수업파일/수업/박치효/pycode/data/iris.csv")

print("데이터의 요약정보 확인")
print(data.describe())

