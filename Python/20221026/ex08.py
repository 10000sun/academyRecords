import pandas as pd

data = pd.read_csv("D:/수업파일/수업/박치효/pycode/data/auto-mpg.csv")

print("조건식 적용하기")
print(data[data.cylinders==4])

print(data[data.mpg>=27])

print(data[data['model-year']==70])

import numpy as np
print(data [np.logical_and(data['model-year']==70, data['mpg']>=25)])

      
