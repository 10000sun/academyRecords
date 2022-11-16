#연습문제
#02 다음 조건문을 ifelse문으로 작성하시오
if(n<0){
  res <- -n
} else {
  res <- n
}

res <- ifelse(n<0, -n, n)

#04 1부터 20사이의 모든 홀수의 곱을 구하는 코드를 for문으로 작성하시오.
n <- seq(1, 20, by =2)
print(n)
res <- 1

for(i in n){
  res <- res*i
}
print(res)