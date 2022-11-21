#연습문제

#04 1부터 20까지의 홀수를 모두 곱하시오 (for문 사용)
gop <- 1

for(i in 1:20){
  if(i %% 2 !=0){
    gop <- gop*i
  }
}
print(gop)

#05 1부터 20까지의 홀수를 모두 곱하시오 (while문 사용)
gop <- 1
i <- 1
while(i<=20){
  if(i %% 2 !=0){
    gop <- gop*i
  }
  i <- i+1
}
print(gop)

#06 mtcars 데이터 셋에서 mpg, hp, wt의 각 열에대한 평균을 apply를 사용해 구하시오.

print(mtcars)

avg <- apply(mtcars[c('mpg', 'hp', 'wt')], 2, mean)


#07 triangle.area()함수를 정의하고 밑변 5.2 높이 4.6인 삼각형 넓이를 구하시오.
triangle.area <- function(base, height){
  result <- (base*height)/2
  return(result)
}

triangle.area(5.2,4.6)

#09 mtcars에서 마력(mpg)이 가장 높은 자동차와 낮은 모델명을 구하시오

mtcars
carmax <- which.max(mtcars$mpg)
rownames(mtcars)[carmax]
carmin <- min(mtcars[,1])
carmax
carmin

#11 피보나치 수열을 20번째까지 구하는 for문을 작성하시오.
a <- 1
b <- -1
c <- 0
for(i in 1:20){
  c <- a+b
  b <- a
  a <- c
  print(c)
}

#12 USArrests 데이터셋으로 다음에 답하시오.
print(USArrests)
#(1) 살인 폭행 강간 범죄에 대한 체포건수의 합을 각각 구하시오
apply(USArrests[,-3], 1, sum)
#(2) 살인 폭행 강간 범죄에 대한 체포건수의 평균을 각각 구하시오
apply(USArrests[,-3], 1, mean)
#(3) 살인 범죄 체포가 가장 많이 발생한 주는 어디인지 구하시오
rownames(USArrests[which.max(USArrests$Murder), ])
#(4) 폭행 범죄 체포가 가장 적게 발생한 주의 살인 범죄 체포 건수를 구하시오.
USArrests[which.min(USArrests$Assault), 'Murder']


