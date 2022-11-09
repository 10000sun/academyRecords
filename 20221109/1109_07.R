#벡터는 파이썬의 리스트, 자바의 배열과 비슷한 개념 c() 함수 사용

#벡터 사용x
score.1 <- 68;score.2 <- 95;score.3 <- 83;score.4 <- 76;score.5 <- 90
score.6 <- 80;score.7 <- 85;score.8 <- 91;score.9 <- 82;score.10 <- 70
total <- score.1+score.2+score.3+score.4+score.5+
  score.6+score.7+score.8+score.9+score.10
total
avg <- total/10
avg

#벡터 사용O
score <- c(68,95,83,76,90,80,85,91,82,70)
mean(score)

x <- c(1,2,3)
y <- c('a','b','c')
z <- c(T,T,F,T)
x
y
z

#하나의 벡터에는 동일한 자료형을 갖는 값만 저장 가능
w <- c(1,2,3,'a','b','c') #자동으로 문자형으로 변경
w

#(:)를 사용하여 a~b까지 숫자를 모두 출력 가능
v1 <- 50:90
v1

#seq함수를 사용하면 seq(시작값, 종료값, 간격)으로 출력가능
v2 <- seq(1,101,3)
v2

#rep함수를 사용하면 같은 숫자를 반복 가능
v3 <- rep(1, times=5) #숫자 1을 5번 반복
v3

v4 <- rep(c('a','b','c'), each=3) #문자도 반복 가능, each는 각각
v4

#names함수를 사용하여 벡터 값에 이름 붙이기 가능
absent <- c(8,2,0,4,1) #absent 변수에 결근 인원 저장
absent #absent 변수 출력
names(absent) #absent 변수 이름 출력(이름 없음)
names(absent) <- c('Mon','Tue','Wed','Thu','Fri') #absent 변수에 이름 저장
absent #absent 변수 출력(이름 포함)
names(absent) #absent 변수 이름 출력

#벡터의 일부분만 출력가능
d <- c(1,4,3,7,8)
d
d #r의 인덱스는 0이아닌 1부터 시작
d[2]
d[3]
d[4]
d[5]
d[6] #벡터에 값이 없으므로 NA 출력

#벡터의 일부분 출력도 c()함수로 여러 일부분 출력 가능
d[c(1,3,5)] #1,3,5번째 값만 출력
d[1:3] #첫번째부터 세번째 값까지만 출력

#마찬가지로 seq(시작값, 종료값, 간격)함수 사용 가능
d[seq(1,5,2)] #첫번째 값부터 다섯번째 값까지 2의 간격으로 출력(홀수값 출력)

d[-2] #-는 그 값만 제외하고 출력
d[-c(3:5)] #세번째 값부터 다섯번째 값 제외하고 출력

#이름을 붙인 벡터에 이름으로 추출도 가능
sales <- c(640,720,680,540)
names(sales) <- c('M1','M2','M3','M4')
sales
sales[1]
sales['M2'] #벡터 이름으로 값 출력
sales[c('M1', 'M4')] #c()함수로 여러개 출력