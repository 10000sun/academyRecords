import pandas as pd

data = pd.read_csv("./data/score.csv")

print("컬럼명 : ", data.columns)
print("인덱스 : ", data.index)

data['total'] = data['kor'] + data['eng'] + data['mat']
data['avg'] = data['total']/3

print(data)
