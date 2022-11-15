#실습문제
#01 다음은 글로벌 기업 Top5의 시가 총액이다 물음에 답하시오.
#(1)위 자료를 매트릭스 자료구조로 corp에 저장, 열은 헤더, 기업열은 행이름으로 하시오.
corp <- matrix(c(12289,8921,17589,5389,12642,9463,
                 1460,1060,2091,652,1502,1125), nrow=6, byrow=F)
colnames(corp) <- c('USD', 'KRW')
rownames(corp) <- c('마이크로소프트', '구글', '사우디아람코', '알리바바', '애플', '아마존')
corp
str(corp)
#(2) corp의 열별 합계와 평균을 구하시오
colSums(corp)
colMeans(corp)
#(3) corp의 자료구조를 변경하여 아래 코드를 실행하시오
corp <- data.frame(corp)
subset(corp, KRW >= 1500)
#(4) corp에 국가와 순위 정보를 추가하려고 한다. 미화에따라 순위를 구하여 저장하시오.
country <- c('미국', '미국', '사우디', '중국', '미국', '미국')
ranking <- rank(corp[, 'USD'])
corp.exp <- data.frame(corp,country,ranking)
corp.exp
#02 robustbase 패키지의 carrot 데이터셋으로 물음에 답하시오.
install.packages("robustbase")
library(robustbase)
carrots
#(1) 데이터셋의 요약정보를 보고 관측값과 열의 개수, 컬렴명을 적으시오.
str(carrots) #관측값 4개, 열 24개, 컬럼명 success total logdose block
#(2) 당근을 제배한 토양의 종류를 구하시오
levels(carrots$block)
#(3) 당근 재베에 사용한 살충제의 사용정도별 빈도수를 구하시오
table(carrots$logdose)
#(4) 총당근개수에서 해충의 피해를 뺀 수확량을 변수 harvest에 저장하시오
harvest <- carrots$total-carrots$success
harvest
#(5) 최대 수확량을 구해 harvest.max에 저장하시오
harvest.max <- max(carrots$total)
#(6) carrots 데이터셋에 수확량 열을 추가하시오
carrots <- data.frame(carrots, harvest)
carrots
#(7) 수확량이 최대일때 살충제 사용 정도와 토양의 조건을 구하시오
max(carrots$harvest)
subset(carrots, carrots$harvest>=47)
