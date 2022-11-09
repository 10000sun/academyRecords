import pandas as pd

data1 = {'kor':50, 'eng':70 ,'mat':80}
data2 = {'kor':30, 'eng':70 ,'mat':80}
data3 = {'kor':20, 'eng':70 ,'mat':80}

data = pd.DataFrame()
data = data.append(data1, ignore_index=True)
data = data.append(data2, ignore_index=True)
data = data.append(data3, ignore_index=True)

data['total'] = data.kor + data.eng + data.mat
data['avg'] = data.total/3

print(data)
