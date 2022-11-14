espresso <- c(4,5,3,6,5,4,7) #에스프레소 판매량
americano <- c(63,68,64,68,72,89,94) #아메리카노 판매량
latte <- c(61,70,59,71,71,92,88) #라떼 판매량

sale.espresso <- 2*espresso #에스프레소 매출(에스프레소 가격*판매량)
sale.americano <- 2.5*americano #상동
sale.latte <- 3*latte #상동

sale.day <- sale.americano+sale.espresso+sale.latte #하루 총 판매량
names(sale.day) <- c('Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun') #요일별 판매량
sum(sale.day) #판매량 총합계
sale.mean <- mean(sale.day) #판매량 평균균

print(sale.day)
