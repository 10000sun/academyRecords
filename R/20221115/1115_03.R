#연습문제

#04 매트릭스 m은 보기1과 같다, 보기2로 만들기 위해 필요한 명령문을 작성하시오.
m <- matrix(c(9,7,5,3,
              8,11,2,9), nrow=2, byrow=T)
print(m)

rownames(m) <- c('x', 'y')
colnames(m) <- c('a', 'b', 'c', 'd')

m

#05 다음 문제의 코드를 작성하시오
#(1) 매트릭스 m의 행과 열을 바꿔서 입력했다. 다시 바꾸시오
# 답 : t(m)
#(2) 매트릭스 m을 데이터 프레임으로 변경하여 df에 저장하시오.
# 답 : df <- as.data.frame(m)
#(3) df에 벡터 info를 마지막 열 뒤에 추가해, 새 데이터 프레임 df.new에 저장하시오
# 답 : df.new <- data.frame(df, info)
#(4) df.new의 자료구조를 출력하시오
# 답 : str(df.new)

#06 다음의 벡터가 있을때 문제의 코드를 작성하시오
blood <- c('A', 'O', 'AB', 'B', 'B')
rh <- c('+', '+', '-', '+', '+')
age <- c(21,30,43,17,26)

#(1)세 벡터를 하나로 묶어서 데이터프레임 df에 저장하시오
df <- data.frame(blood, rh, age)
df
#(2)df의 열 이름을 출력하시오
colnames(df)
#(3)blood 열 이름 값이 'B'가 아닌 행들을 추출해 df.nb에 저장하시오
df.nb <- subset(df, blood != 'B')
df.nb

#07 str(cars)명령문을 실행한 결과가 다음일때 물음에 답하시오
str(cars)
#(1) dim(cars)를 실행했을때 결과를 쓰시오
dim(cars) #50, 2
#(2) 변수의 이름과 자료형은 무엇인가?
#speed, dist, 자료형 num

#08 다음 명령문중 연산이 가능하면 T 불가능하면 F를 기입하시오
#(1)
matrix(1:12, nrow=3)%%3
#(2)
matrix(1:12, nrow=3)+3
#(3)
matrix(1:12, nrow=3)+matrix(1:12, nrow=3)
#(4)
rbind(matrix(1:12, nrow=3), c('1','2','3'))+3

#09 다음은 한 가수 앨범 수록곡 정보이다 물음에 답하시오.
#(1) 2차원 자료구조로 저장하고 변수명 love 열 이름은 표의 헤드를 쓰시오.
번호 <- 1:7
제목 <- c('그대랑', '다툼', '빨래', '두통', '보조개', '매듭', '이상해')
좋아요 <- c(16075,8218,12119,738,3200,16144,5110)
love <- data.frame(번호, 제목, 좋아요)
love

#(2) 좋아요가 가장 많은 수록곡만 추출하여 변수 best에 저장하시오.
sort(love$좋아요, decreasing=T)
best <- love[1,]
best

#10 다음은 어느 반의 중간, 기말 성적이다. 두 시험의 평균을 구하시오.
mid <- matrix(c(97,88,100,
                100,82,96,
                83,90,76,
                95,91,89,
                92,87,95), nrow=3, byrow=F)
colnames(mid) <- c('국어', '역사', '수학', '과학', '영어')
rownames(mid) <- c('스티브', '엔더맨','크리퍼')
mid <- as.data.frame(mid)
mid
str(mid)
colMeans(mid)
rowMeans(mid)

final <- matrix(c(94,92,100,
                  95,95,100,
                  90,87,85,
                  92,95,84,
                  89,94,96), nrow=3, byrow=F)
colnames(final) <- c('국어', '역사', '수학', '과학', '영어')
rownames(final) <- c('스티브', '엔더맨','크리퍼')
final <- as.data.frame(final)
final
str(final)
fm_mean <- (mid+final)/2
fm_mean 

#11 R에서 제공하는 cars 데이터셋의 문제해결을위한 코드를 작성하시오.
#(1) 데이터셋의 자료구조가 무엇인가
class(cars)
#(2) 데이터셋의 관측값과 컬럼의 개수를 구하시오
dim(cars)
#(3) 데이터셋의 앞쪽 일부분 내용을 보이시오
head(cars)
#(4) 데이터셋의 요약정보를 보이시오
str(cars)
#(5) 데이터셋의 컬럼별 평균을 구하시오
colMeans(cars)
#(6) 가장 긴 제동거리를 구하시오
max(cars$dist)
#(7) 제동거리가 가장 길때 속력과 제동거리를 구하시오
subset(cars, max(cars$dist)==cars$dist)

#12 R에서 제공하는 InsectSprays 데이터셋의 문제해결을 위한 코드를 작성하시오.
#(1) 데이터셋의 자료구조가 매트릭스인지 확인하시오
is.matrix(InsectSprays)
#(2) 데이터셋의 요약정보를 보이시오
str(InsectSprays)
#(3) 데이터셋의 뒤쪽 10개 정보를 보이시오
tail(InsectSprays, 10)
#(4) 데이터셋의 살충제 종류를 구하시오
levels(InsectSprays[,2])
#(5) 데이터셋의 데이터 빈도를 구하시오
table(InsectSprays$spray)
#(6) 살충제 E의 자료만 추출하여 InsectSpray.e에 저장하시오
InsectSpary.e <- subset(InsectSprays, InsectSprays$spray=='E')
#(7) 살충제 E가 박멸한 해충수의 평균을 구하시오
mean(InsectSpary.e$count)

