#적금 만기 금액 계산하기
name <- c(NA, NA, NA, NA, NA)
money <- c(5000000, 4500000, 4000000, 5500000, 6000000)
rate <- c(3.5, 3, 4, 5, 4.5)
day <- c(2,2,5,7,4)

names(name) <- c('kim','lee', 'park', 'choi', 'seo')

#복리계산식 만기금액 = 원금 * (1+원이율/100)^기간me[1] <- money[1]*(1+rate[1]/100)^day[1]
name[2] <- money[2]*(1+rate[2]/100)^day[2]
name[3] <- money[3]*(1+rate[3]/100)^day[3]
name[4] <- money[4]*(1+rate[4]/100)^day[4]
name[5] <- money[5]*(1+rate[5]/100)^day[5]

name 

print(name)