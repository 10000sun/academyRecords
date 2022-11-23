#20221123 실기시험

#01 자료를 벡터 subscriber에 저장하고 물음에 답하시오
subcriber <- c(62,32,36,29,39,44,81)
names(subscriber) <- c('sun','mon','tue','wed','thu','fri','sat')

#(1) subscriber의 값을 출력하시오.
print(subscriber)
#(2) 일주일동안 총 가입자가 몇명인지 출력하시오.
sum(subscriber)
#(3) 금, 토, 일 가입자가 총 몇명인지 출력하시오.
sum(subscriber[1], subscriber[6:7])
#(4) 일주일 동안 가입자수의 평균을 출력하시오.
mean(subscriber)
#(5) 하루에 가입자가 가장 많았을때는 몇명인지 출력하시오.
max(subscriber)

#02 자료를 drink에 저장하고 물음에 답하시오.
drink <- c(900,400,1100,1200,1800,1500)
names(drink) <- c('milk','water','coke','sprite','juice','coffee')

#(1) milk와 coke를 골랐을 때 총 가격을 출력하시오.
sum(drink['milk'], drink['coke'])
#(2) coffee, juice, water를 골랐더니 총 가격의 10%를 할인해준다고 했을때 최종 결제 금액을 출력하시오.
final <- sum(drink['coffee'], drink['juice'], drink['water']) * 0.9
final
#(3) water의 가격이 10% 인상됐을때 이를 drink 벡터에 반영하시오.
drink['water'] <- drink['water'] * 1.1
drink
