import pandas as pd

data = pd.read_csv("D:\수업파일\수업\박치효\pycode\data/score_noheader.csv", header = None)

print("컬럼명 : ", data.columns)
print("인덱스 : ", data.index)

print("====== 컬럼 부여 후 =====")
data.columns = ['name','kor','eng','mat']
print("컬럼 명 : " , data.columns)
print(data)

print("======필드 추가 후=====")
data['total'] = data['kor'] + data['eng'] + data['mat']
data['avg'] = data['total']/3

print(data)
