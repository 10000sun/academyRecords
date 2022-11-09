#기업 월별 매출 액 분석하기

sales <- c(750,740,760,680,700,710,850,890,700,720,690,730)
names(sales) <- paste(1:12, '월', sep="")
sales

#7월의 매출액
sales['7월']

#1월과 2월의 매출액
sales['1월']+sales['2월']

#sort()함수로 매출액이 가장 많은 달 확인
max_mon <- sort(sales, T)
max_mon[1]

#sum()함수로 상반기 매출액 총합 확인(sales[1:6])


