import pandas as pd

data = pd.read_csv("D:/수업파일/수업/박치효/pycode/data/iris.csv")


import numpy as np

print("Setosa의 평균 : ", data[data.variety == 'Setosa']['sepal.length'].mean())
print("Versicolor의 평균 : ", data[data.variety == 'Versicolor']['sepal.length'].mean())
print("Virginica의 평균 : ", data[data.variety == 'Virginica']['sepal.length'].mean())

