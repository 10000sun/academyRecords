#두 변수의 상관관계

str(pressure)
plot(pressure$temperature,
     pressure$pressure,
     main='온도와 기압',
     xlab='온도(화씨)',
     ylab='기압')

#상관관계가 인과관계를 의미하지는 않는다.

head(cars)
plot(cars$speed,
     cars$dist,
     main='자동차 속도와 제동거리',
     xlab='속도',
     ylab='제동거리')

cor(cars$speed, cars$dist)

str(longley)

ds <- longley[, c('GNP', 'Unemployed', 'Armed.Forces', 'Population', 'Employed')]
print(ds)
plot(ds)
cor(ds)
#cor = 두 데이터 사이의 상관계수

install.packages('Ecdat')
library(Ecdat)
str(Hdma)

tbl <- table(Hdma$deny)
tbl <- tbl/sum(tbl)
tbl

names(tbl) <- c('승인', '거절')
barplot(tbl, main='주택담보대출 승인/거절',
        col=c('green','yellow'),
        ylim=c(0,1),
        ylab='비율')

hist(Hdma$lvr, main='주택가격대비 대출금 비율',
     col=rainbow(10))

black.yn <- table(Hdma$black)
black.deney <- sum(Hdma$black=='yes' & Hdma$deny=='yes') / black.yn['yes']
non.black.deney <- sum(Hdma$black=='no' & Hdma$deny=='yes') / black.yn['no']
cat('흑인, 비흑인 거절율 : ', black.deney, non.black.deney, '\n')

black.credit <- mean(Hdma$ccs[Hdma$black=='yes'])
non.black.credit <- mean(Hdma$ccs[Hdma$black=='no'])
cat('흑인, 비흑인 신용 등급 : ', black.credit, non.black.credit, '\n')

df <- Hdma[,c('dir','hir','ccs','mcs')]
point.col <- c('green', 'red')
plot(df, col=point.col[Hdma$deny])

cor(df)
