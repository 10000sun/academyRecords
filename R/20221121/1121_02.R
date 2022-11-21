#실습확인
#01. 방사능 물질 중 요오드 131의 반감기는 8일이다. 반감기는 방사능 물질의 
#농도가 반으로 줄어드는 데 소요되는 시간으로 요오드 131의 경우 8일이 지나면 
#그 양이 1/2로 줄어들게 된다. 다음 물음에 답하시오. 


#(1) 원전 사고로 요오드 131이 80GBq만큼 누출되었다면 0.01GBq 미만으로 
#줄어들기 위해 얼마만큼의 시간이 필요한지 구하는 코드를 작성하시오((힌트: while문 사용).
iodine <- 80
i <- 0
while(iodine>=0.01){
  i <- i+1
  iodine <- 1/2*iodine
}
print(i*8)

#(2) 앞서 작성한 코드를 반감기가 달라져도 재사용할 수 있도록 함수 halflife()
#를 만드시오. 입력값은 ① 물질의 양(amount), ② 반감기(period), ③ 줄어들기 
#원하는 목표값(target)이며 결과값은 목표에 도달하기까지 걸리는 시간으로 한다.
#단 반감기를 입력하지 않았을 때 기본값으로 8을, 목표값을 입력하지 않았을 때 
#기본값은 0.01을 갖게 한다. 
halflife <- function(amount, period=8, target=0.01){
  i <- 0
  while(amount>=target){
    i <- i+1
    amount <- 1/2*amount
  }
  return(i*period)
}

halflife(80)

#(3) 작성한 halflife() 함수를 'myfunc.R'에 저장한 뒤 불러와 다음 조건으로 
#사용한 결과를 각각 구하시오.

halflife(80)
halflife(100, 5, 0.001)
halflife(200, 15, 0.0001)

#02. Stat2Data 패키지에 내장된 Diamonds 데이터셋은 다이아몬드 속성과 가격에
#대한 정보를 저장하고 있다. 구체적으로 다이아몬드의 크기(Carat), 색(Color),
#투명도(Clarity), 깊이(Depth), 캐럿당 가격(PricePerCt), 총 가격(TotalPrice)
#등 총 6개의 열로 구성되어 있다. 다음과 같이 데이터셋을 불러온 다음 주어진
#문제를 해결하시오.

library(Stat2Data)
data(Diamonds)
str(Diamonds)

#(1) 데이터 구조를 살펴보고 팩터형 자료구조로 된 열 이름을 찾아 각 팩터형 
#열 값의 종류를 구하시오. 
levels(Diamonds$Color)
unique(Diamonds$Clarity)

#(2) Diamonds 데이터셋에서 색과 투명도 값을 입력받아 해당되는 행들만 
#추출하여 돌려주는 함수 split.dataset()을 만드시오(단 subset() 함수는 
#사용하지 않음).
split.dataset <- function(color, clarity){
  idx <- which(Diamonds$Color==color & Diamonds$Clarity==clarity)
  return(Diamonds[idx, ])
}

#(3) 작성한 split.dataset() 함수를 'myfunc.R'에 저장한 뒤 불러와 다음 
#조건으로 사용한 결과를 각각 구하시오.
split.dataset('D', 'IF')
split.dataset('H', 'VS2')
split.dataset('I', 'VVS1')


#(4) split.dataset() 함수에 조건문을 사용하여 Color에 'ALL'이란 값을 입력하면 모든 컬러를 선택할 수 있
#도록 수정하려고 한다. 수정한 함수를 업데이트한 뒤 3번의 조건에서 Color만 'ALL'로 입력하여 결과를 
#비교하시오. 
split.dataset <- function(color, clarity){
 if(color==ALL){
   idx <- which(Diamonds$Color==color)
 }else{
   idx <- which(Diamonds$Color==color & Diamonds$Clarity==clarity)
 }
 return(Diamonds[idx, ])
}

#(5) split.dataset() 함수를 이용하여 색이 'D'이고 투명도가 'IF'인 다이아몬드
#를 추출해 변수 ds에 저장하시오. 그리고 이 데이터셋을 기준으로 깊이(Depth),
#캐럿당 가격(PricePerCt), 총가격(TotalPrice)에 대해 각각의 평균을 구하시오. 
ds <- split.dataset('D', 'IF')
print(ds)
apply(ds[4:6], 2, mean)


#(6) 다이아몬드 투명도별 개수를 for문을 사용해 구하시오
#(그 결과가 table(Diamonds$ Clarity)와 동일해야 함)
value <- levels(Diamonds$Clarity)
n <- length(value)
result <- c()

for(i in 1:n){
  idx <- which(Diamonds$Clarity==value[i])
  result[i] <- length(idx)
  
}
names(result) <- value
print(result)






