#실습문제 1번
subscriber <- c(68,32,36,29,39,44,81)
names(subscriber) <- c('sun','mon','tue','wed','thu','fri','sat')

#1. subscriber 값 출력
print(subscriber)
#2. 일주일간 총 가입자가 몇명인지 출력
print(sum(subscriber))
#3. 금,토,일 가입자가 총 몇명인지 출력
print(sum(subscriber[1]+subscriber[6:7]))
#4. 일주일간 가입자수의 평균
avg <- sum(subscriber)/7
print(avg)
#5. 하루에 가입자가 가장 많았을때를 출력
max_sub <- sort(subscriber, T)
print(max_sub[1])

#실습문제 2번
v1 <- 'We live in Korea'
#v1에서 live만 추출하여 v2에 저장하는 명령문 작성
v2 <- substr(v1, 4, 7)
print(v2)

#실습문제 3번
drink <- c(900,400,1100,1200,1800,1500)
names(drink) <- c('milk','water','coke','sprite','juice','coffee')

#1. milk와 coke를 골랐을때 총 가격을 출력
print(sum(drink[1]+drink[3]))
#2. coffee,juice, water를 골랐더니 총가격의 10퍼센트를 할인받았을때 총가격 출력
dis <- sum(drink[2]+drink[5:6])
print(dis)
print(dis-dis/10)
#3. water의 가격이 10%인상되었을 때 drink벡터에 반영하여 출력ink[2]+(drink[2]/10)
print(drink[2])
print(drink)