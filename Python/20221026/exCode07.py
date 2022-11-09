import pandas as pd
import numpy as np

data = pd.read_csv("D:/수업파일/수업/박치효/pycode/data/iris.csv")

print(data[np.logical_and(data['variety'] == 'Setosa', data['sepal.length'] >= 5)])

