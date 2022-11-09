import pandas as pd

data = pd.read_csv("D:/수업파일/수업/박치효/pycode/data/iris.csv")

print(data[data.variety == 'Setosa'])
