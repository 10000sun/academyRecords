#소금물 농도 구하기
#소금 양을 변수 salt에 저장
#물의 양을 변수 water에 저장
#소금물의 농도를 계산하고 그 결과를 result에 저장
#결과를 다음과 같은 형식으로 출력(cat()함수 사용) "소금=( ), 물 = ( ): 농도 = ( )%

salt <- 50
water <- 100
result <- salt/(salt+water)*100
cat("소금 : ", salt, ", 물 : ", water, " : 농도 : ", result, "%")

salt <- 70
water <- 110
result <- salt/(salt+water)*100
cat("소금 : ", salt, ", 물 : ", water, " : 농도 : ", result, "%")
