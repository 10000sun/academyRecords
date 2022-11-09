import pandas as pd

data = pd.read_csv("D:/수업파일/수업/박치효/pycode/data/auto-mpg.csv")

print(data['model-year'].value_counts())

print("연비 평균 : ", data['mpg'].mean())
print("연비 최대 : ", data['mpg'].max())
print("연비 최소 : ", data['mpg'].min())
print("연비 중간 : ", data['mpg'].median())
print("연비 분산 : ", data['mpg'].var())
print("연비 표준편차 : ", data['mpg'].std())

print("1사분위수 : ", data['mpg'].quantile(0.25))
print("2사분위수 : ", data['mpg'].quantile(0.5))
print("3사분위수 : ", data['mpg'].quantile(0.75))
