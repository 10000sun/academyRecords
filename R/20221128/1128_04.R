#연습문제

#03 다음 Hdma 데이터셋으로 물음에 답하시오.
library(Ecdat)
data(Hdma)
Hdma
#(1) 대출신청자의 직업이 자영업인 경우와 아닌경우의 빈도를 막대그래프로 나타내시오. (self열)
selfjob <- table(Hdma$self)
selfjob

names(selfjob) <- c('자영업 O', '자영업 X')
barplot(selfjob, main='대출 신청자 직업',
        col=c('green', 'yellow'),
        xlab='자영업자 여부',
        ylab='빈도')

#(2) 대출 신청자가 미혼인 경우와 아닌경우의 비율을 원그래프로 나타내시오. (single열)
sing <- table(Hdma$single)
sing <- sing / sum(sing)
sing

names(sing) <- c('기혼', '미혼')
barplot(sing,main='미혼 여부',
        col=c('green','yellow'),
        ylab='비율')
#(3) 대출신청자가 속한 직업군의 실업율 데이터에 대해 다음 물음에 답하시오. (uria)
#(3-1) 실업률의 분포를 상자그림으로 작성하시오.
Hdma$uria

rate <- Hdma$uria
boxplot(rate, main='실업률')
#(3-2) 데이터의 분포에서 정상범위는 어디부터 어디까지인지를 보이시오,
boxplot.stats(rate)$stats

#(3-3) 데이터의 분포에서 정상범위를 벗어나는값들은 몇개인지를 보이시오.
out <- boxplot.stats(rate)$out
print(length(out))
#(4) 대출승인과 거절에대한 케이스별로 수입대비 주택유지비용 비율의 평균을 구하시오. (deny 별로 hir 평균)
deny.yes <- mean(Hdma$hir[Hdma$deny=='yes'])
deny.no <- mean(Hdma$hir[Hdma$deny=='no'])
cat('대출 승인/거절 : ', deny.no, deny.yes, '\n')
#(5) (4)번의 결과를 볼때 수입대비 주택 유지비용 비율이 높으면 대출에 유리한지 불리한지를 판단하시오.
#불리하다.

