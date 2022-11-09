import pandas as pd

data1 = {'X1':2.9,'X2':9.2,'X3':13.2,'X4':2}
data2 = {'X1':2.4,'X2':8.7,'X3':11.5,'X4':3}
data3 = {'X1':2,'X2':7.2,'X3':10.8,'X4':4}
data4 = {'X1':2.3,'X2':8.5,'X3':12.3,'X4':2}
data5 = {'X1':3.2,'X2':9.6,'X3':12.6,'X4':3}
data6 = {'X1':10,'X2':20,'X3':30,'X4':40}

data = pd.DataFrame()
data = data.append(data1, ignore_index=True)
data = data.append(data2, ignore_index=True)
data = data.append(data3, ignore_index=True)
data = data.append(data4, ignore_index=True)
data = data.append(data5, ignore_index=True)
data = data.append(data6, ignore_index=True)

data['total'] = data.X1 + data.X2 + data.X3 + data.X4


print(data)
