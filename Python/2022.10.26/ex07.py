import pandas as pd

data = pd.read_csv("D:/수업파일/수업/박치효/pycode/data/auto-mpg.csv")

print("데이터의 기본 구조")
print(data.info())

print("데이터의 요약 정보 확인")
print(data.describe())
