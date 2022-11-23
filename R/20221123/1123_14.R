install.packages('carData')
library(carData)

#연습문제

#01 carData패키지의 MpleStops를 사용해 물음에 답하시오.
#(1) 수상한 행동을 한 행ㅇ인의 인종비율을 원그래프로 나타내시오.
ds <- table(MplsStops$race)
pie(ds, main='수상한 행동을 한 행인의 인종 비율',
    col=c('red','green','blue'),
    radius=1
)

#(2)수상한 멈춤(빨강)인지 교통신호에 의한 멈춤(파랑)인지의 비율을 원그래프로 나타내시오.
ds <- table(MplsStops$problem)
pie(ds, main='멈춤 이유 비율',
    col=c('red','blue'),
    radius=1
)

#(3)수상한 멈춤을 한사람에 대한 수색여부 비율을 원그래프로 나타내시오.
ds <- table(MplsStops$personSearch)
pie(ds, main='수상한 멈춤 수색 여부 비율',
    col=c('red','blue'),
    radius=1
)

#(4)수상한 멈춤을 한 사람의 성별 비율을 3차원 원그래프로 나타내시오.(남성 주황, 여성 초록, 기타 노랑)
ds <- table(MplsStops$gender)
pie3D(ds, main='수상한 멈춤 성별 비율',
      labels=names(ds),
      labelcex=1.0,
      explode=0.1,
      radius=1,
      col=c('orange','green','yellow'))

#02 다음과 같이 ds를 생성한뒤 물음에 답하시오.
library(DAAG)
data(greatLakes)
ds <- data.frame(year=1918:2009, greatLakes)
str(greatLakes)

#(1)Erie호의 연도별 수위변화를 선그래프로 나타내시오.
plot(ds$year,
     ds$Erie,
     main='Erie호수 수위변화',
     type='l',
     lty=1,
     lwd=1,
     xlab='Year',
     ylab='Erie Lake')

#(2)michHuron호의 수위변화를 다음과같은 모양의 그래프로 작성하시오.
plot(ds$year,
     ds$michHuron,
     main='michHuron호수 수위변화',
     type='b',
     lty=2,
     lwd=1,
     col='red',
     xlab='Year',
     ylab='michHuron Lake')

#(3)Erie, michHuron, StClair 호수의 연도별 수위변화를 하나의 그래프로 작성하되, 호수별로 선의 색을 다르게 하시오.
plot(ds$year,
     ds$Erie,
     main='Erie호수 수위변화',
     type='b',
     lty=1,
     lwd=1,
     col='red',
     xlab='Year',
     ylab='Erie Lake',
     ylim=c(173,177.5))

lines(ds$year,
      ds$michHuron,
      type = 'b',
      col='green')

lines(ds$year,
      ds$StClair,
      type = 'b',
      col='blue')

#03 DAAG패키지의 cfseal데이터셋을 사용해 물음에 답하시오.
library(DAAG)
str(cfseal)

#(1) 물개의 체중 분포를 상자그림으로 나타내시오.
dist <- cfseal[,2]
boxplot(dist, main='물개 몸무게 분포')

#(2) 물개의 심장무게 분포에서 특이값을 찾아 출력하시오.
dist <- cfseal[,3]
boxplot(dist, main='물개 심장장무게 분포')
boxplot.stats(dist)$out

#(3) 물개를 나이에따라 young(초록색), old(주황색)로 나누고 몸무게 분포를 상자그림으로 나타내시오


boxplot(cfseal$weight~cfseal$age)
ahigh <- rep('old', nrow(cfseal))
ahigh[cfseal$age < mean(cfseal$age)] <- 'young'
boxplot(cfseal$weight~cfseal$age,
        main='물개 나이 및 몸무게 분포',
        col=c('green','blue'))

#(4) 물개를 세그룹으로 나누되 몸무게가 사분위수의 Q1미만이면 low, Q1~Q3 사이인 경우는 middle, Q3을
#초과하는 경우는 high로 하고 그룹에따라 위 무게 분포를 상자그림으로 나타내시오.


#04 DAAG패키지의 greatLakes 데이터셋으로 물음에 답하시오.
library(DAAG)
data(greatLakes)
ds <- data.frame(greatLakes)

