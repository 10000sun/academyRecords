#연습문제

#04 a의 값중 3의 배수이면서 100보다 작은 수의 개수를 구하는 명령문
a <- 25:150
condi <- (a%%3==0)&(a<100)
sum(condi)

#05 벡터 a를 펙터 f로 만들고 f에 저장된 값의 종류를 구하는 명령문
a <- c('good','great','bad','okay','good','bad','good')
f <- factor(a) #펙터 생성
levels(f) #종류 출력
unique(f) #종류를 정렬한 후 출력

#06 운동화 바지 티셔츠 가격 76000, 52000, 36000. 각각 5%, 10%, 5%할인했을때
#최종 결제 금액
items <- c(76000, 52000, 36000)
names(items) <- c('shoes', 'pants', 'tshirts')
sum(items)
items.sale <- c((items[1]*0.95), (items[2]*0.9), items[3]*0.95) #할인
sum(items.sale) #최종 결제 금액

#07 명령문을 실행하니 [1]"black" "red" "white"의 결과가 출력되었다 A의 값은?
smartphone <- list(model = "iphone_se",
                   capacity = c(64,128,256),
                   display = 'Retina',
                   color = c('black', 'red', 'white'))
smartphone[4] #color 출력
smartphone$color

#08 엘레베이터 탑승가능 무게는 600kg, 마지막사람이 타니 초과하였다, 조건확인
#후 명령문 작성

#조건 1. 한사람을 내리게 하여 운행이 가능하도록 한다.
#조건 2. 내려야 하는 대상중 가장 몸무게가 적은 사람을 선택

weight <- c(56,23,89,46,76,14,97,72,68,62,35) #단위 kg
names(weight) <- c('a','b','c','d','e','f','g','h','i','j','k')
sum(weight) #총 무게
sort(weight) #정렬
people <- weight[weight>=(sum(weight)-600)] #총 무게에서 600kg을 뺀값보다 높은값 구하기
print(min(people)) #제일 낮은 값

#09 10명의 선호계절을 펙터에 저장하고 종류를 나타내시오

# 여름 봄 여름 겨울 봄 겨울 여름 여름 봄 가을
weather <- c('여름', '봄', '여름', '겨울', '봄', '겨울', '여름', '여름', '봄', '가을')
favorite <- factor(weather)
levels(favorite)
unique(favorite)

#10 20명의 출신국가를 팩터 country에 저장후 종류를 출력한 뒤, 
#as.integer(country)의 결과를 구하시오
survey <- c('호주', '독일', '영국', '일본', '미국', '중국', '호주', '영국', '중국', '일본', '터키', '미국', '중국', '중국', '호주', '터키', '독일', '일본', '중국', '독일')
country <- factor(survey)
as.integer(country)

#11 sns게시글을 하나의 자료구조에 저장, 자료구조 이름은 post
post <- list(user_id = 'mr_steve',
             post_id = 'p11010',
             view = 37,
             image = FALSE,
             like = c('creeper', 'alex', 'skeleton', 'enderman'))
print(post)

#12 은행 계좌 정보의 최근 거래내역의 입금과 출금이 각 몇건인지 구하시오
account <- list(name = '하늘',
                number = 123-456-120566,
                balance = 4128750,
                history = c(-50000, +20000, -32500, -79000, +42000))
money <- account$history
moneyin <- sum(money>0)
moneyout <- sum(money<0)
moneyin
moneyout
