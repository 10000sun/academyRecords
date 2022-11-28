#실습 확인

#01 DAAG의 houseprices 데이터셋으로 다음에 답하시오.
library(DAAG)
data(houseprices)
#(1) 주택의 면적(area)과 방의 개수(bedrooms)에 대한 상관계수를 구하여 두 변수가
#상관이 있는지를 확인하시오.
df <- houseprices[,c('area', 'bedrooms')]
point.col <- c('green', 'red')
plot(df, col=point.col)

#plot(houseprices$area, houseprices$bedrooms,
#     main='주택면적과 방의 개수 사이의 상관관계')

cor(df)
#상관 없음.

# (2) 주택의 면적(area), 방의 개수(bedrooms) 중 어느 것이 더 주택 가격(sale.price)에
#영향을 미치는지 알아보고자 한다.

#① 세 변수에 대한 다중 산점도를 작성하시오. 
df <- houseprices[,c('area', 'bedrooms', 'sale.price')]
point.col <- c('green', 'red', 'blue')
plot(df, col=point.col)


#② 세 변수에 대한 다중 상관계수를 구하시오. 
cor(df)

#③ 주택의 면적, 방의 개수 중 어느 것이 더 주택 가격에 영향을 미치는지 판단하시오.

#방의 개수가 더 영향을 미침

# 02. DAAG 패키지에 포함된 dengue 데이터셋은 댕기열 발생에 대한 데이터를 저장하고
#있다. 온도(temp)와 습도(humid), 산림면적(trees)이 댕기열 발생(NoYes)에 미치는 
#영향을 알아보고자 한다. 다음과 같이 ds를 추출한 뒤, 다음의 문제를 해결하기 위한
#R 코드를 작성하시오.

library(DAAG)
data(dengue)
ds <- dengue[,c('humid', 'temp', 'trees', 'NoYes')] # 필요한 변수만 선택
ds <- ds[complete.cases(ds),] # 결측값 제거(11장에서 배움)

# (1) 댕기열이 발생한 지역(NoYes=1)과 발생하지 않은 지역(NoYes=0)의 평균 온도, 
#습도, 산림면적을 다음과 같은 형태의 테이블로 만들어 비교하시오. 또한 이 테이블에
#서 관찰할 수 있는 사실은 무엇인지 적으시오.
dengue.yes <- colMeans(ds[ds$NoYes==1, 1:3])
dengue.no <- colMeans(ds[ds$NoYes==0, 1:3])
tbl <- rbind(dengue.yes, dengue.no)
tbl

# (2) 온도(temp)와 습도(humid), 산림면적(trees)에 대해 산점도를 작성하되 댕기열 발생 지역은 빨강색
#으로, 발생하지 않은 지역은 검정색으로 표시하시오. 
my.col <- c('black', 'red')
plot(ds[, 1:3],
     col=my.col[ds$NoYes+1]
)


# (3) ds에 대해 다중 상관계수를 구하여 댕기열 발생 여부와 가장 상관도가 높은 
#변수는 무엇인지를 제시하시오
cor(ds)
#습도
