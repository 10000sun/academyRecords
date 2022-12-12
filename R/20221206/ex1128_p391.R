#1
#데이터정제, 데이터전처리
#2
#히스토그램
#3
#원그래프
#4
library(Ecdat)
str(Hdma)
#(1)
self <- table(Hdma$self)
barplot(
  self,
  main = '대출신청자의 직업이 자영업인경우와 아닌경우',
  col=c('black', 'green')
)
#(2)
single <- table(Hdma$single)
barplot(
  single,
  main = '대출신청자가 싱글인 경우와 아닌경우',
  col=c('black', 'green')
)
#(3)
#(3_1)
boxplot(
  Hdma$uria,
  main='대출신청자가 속한 직업군'
)
#(3_2)
volume <- boxplot.stats(Hdma$uria)
print(volume$stats)
#(3_3)
out <- boxplot.stats(Hdma$uria)
print(length(out$out))
#(4)
deny.yes <- mean(Hdma$hir[Hdma$deny=='yes'])
print(deny.yes)
deny.no <- mean(Hdma$hir[Hdma$deny=='no'])
check1 <- table(Hdma$deny)
print(check1)

cat('대출승인거절 : ', deny.no, ' 대출승인 : ', deny.yes, '\n')
#(5)
#승인된 경우 유지비용 0.25, 거절경우는 유지비용이 0.29이 되므로
#수입대비 유지비용이 높으면 대출이 불리하다.


#실습확인
#1
library(DAAG)
#(1):매우약하다.
plot(
  houseprices$area, houseprices$bedrooms,
  main = '주택면적과 방의개수 사이의 상관관계'
)
#(2)
#(2_1):방의 개수가 많을수록록 주택가격이 높아진다.
plot(
  houseprices,
  main = '세변수에 상관관계',
  col=c('red', 'blue', 'green')
)
#(2_2)
cor(houseprices)
#(2_3):방의 개수가 많을수록록 주택가격이 높아진다.

#2
library(DAAG)
str(dengue)
data(dengue)
ds <- dengue[,c('humid', 'temp', 'trees', 'NoYes')] # 필요한 변수만 선택
ds <- ds[complete.cases(ds),] 
#(1) : 댕기열은 온도, 습도, 숲의면적이 높으면 발생한다.
dengue.yes <- colMeans(ds[ds$NoYes==1, 1:3])
dengue.no <- colMeans(ds[ds$NoYes==0, 1:3])
tbl <- rbind(dengue.yes, dengue.no)
print(tbl)
#(2)
my.col <- c('black', 'red')
plot(
  ds[,1:3], 
  col=my.col[ds$NoYes+1]
)
#(3) : 습도와 상관계수 0.74로 가장높다.
cor(ds)




