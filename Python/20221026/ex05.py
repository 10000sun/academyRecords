import pandas as pd

data = pd.read_excel("D:/수업파일/수업/박치효/pycode/data/score.xlsx")

data['total'] = data['kor'] + data['eng'] + data['mat']
print(data)

data.to_excel("D:/수업파일/수업/박치효/pycode/data/score_result1.xlsx", index = False)
data.to_excel("D:/수업파일/수업/박치효/pycode/data/score_result2.xlsx")
print(data)
