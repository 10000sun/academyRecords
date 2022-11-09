import pandas as pd

data = {
    'name' :['홍길동','임꺽정','장길산','홍경래','이상민','김수경'],
    'kor':[90,80,70,70,60,70],
    'eng':[99,98,97,46,77,56],
    'mat':[90,70,70,60,88,99],}

df = pd.DataFrame(data)

print(df.head())
print("-----지정한 열만 출력-----")
print(df['name'])
print(df['kor'])
print(df.columns)

print("-----iloc함수 사용-----")
print(df.iloc[0,0])
print(df.iloc[3,2])
print(df.iloc[2:4,2])
print(df.iloc[2:4,2:4])

print("-----loc함수 사용-----")
print(df.loc[0,'name'])
print(df.loc[3,'eng'])
print(df.loc[:,'name':'eng'])
