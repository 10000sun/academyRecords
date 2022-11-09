import pandas as pd

data = pd.read_csv("D:\수업파일\수업\박치효\pycode\data/score_header.csv", header = 3)
print(data)

print("컬럼명 : ", data.columns)
print("인덱스 : ", data.index)

data['total'] = data['kor'] + data['eng'] + data['mat']
data['avg'] = data['total']/3

print(data)

data.to_csv("D:/수업파일/수업/박치효/pycode/data/score_result.csv", mode = 'w', encoding = "cp949", index = False)
