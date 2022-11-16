#회원드급 분류하고 혜택 부여하기
library(svDialogs)
price <- dlgInput('enter your price during 3month')$res
price <- as.numeric(price)

grade <- NULL
rate <- NULL

if(price >= 300000){
  grade <- 'platinum'
  rate <- 0.07
} else if (price >= 200000){
  grade <- 'gold'
  rate <- 0.05
} else if (price >= 100000){
  grade <- 'silver'
  rate <- 0.03
} else {
  grade <- 'friends'
  rate <- 0.01
}

cat('고객님은', grade, '등급이므로 구매액의', rate*100, '%가 적립됩니다.')
