import pandas as pd

data = pd.read_excel("D:\수업파일\수업\박치효\pycode\data/score.xlsx")

data['total'] = data['kor'] + data['eng'] + data['mat']
data['avg'] = data['total']/3
print(data)

data.to_excel("score_result1.xlsx")
data.to_excel("score_result2.xlsx", index=False)
