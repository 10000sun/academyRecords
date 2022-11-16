#실습확인
#01 cerealsugar 데이터셋으로 다음 물음에 답하시오
install.packages("DAAG")
library(DAAG)
cerealsugar

#(1) 현재의 작업 폴더를 확인한 후 작업 폴더를 'D:/Rstudio/test1'으로 변경하시오. 
getwd()
setwd('D:/rStudioSave/test1')
getwd()
#(2) 출력하고자 하는 행의 개수를 입력받아 데이터셋의 첫 번째부터 
#입력한 행의 개수만큼 출력하시오. 
library(svDialogs)
input.row <- dlgInput('Input row')$res
input.row <- as.numeric(input.row)

head(cerealsugar, input.row)
#(3) cerealsugar의 최댓값(min), 최솟값(max), 평균(avg)을 구해 각각의 
#변수에 저장한 뒤 데이터프레임 result를 만드시오
#(각 변수명은 괄호 안의 영문명 사용).
cerealsugar
max <- max(cerealsugar)
min <- min(cerealsugar)
avg <- mean(cerealsugar)
result <- data.frame(max, min, avg)
result
#(4) result에 저장된 값을 csv 파일로 저장하시오(파일명은 result.csv).
write.csv(result, 'result.csv', row.names = T)
#(5) result.csv 파일을 불러와 화면에 내용을 출력하시오.
read.csv('result.csv', header=T)

#02 wages 데이터셋으로 다음 물음에 답하시오
install.packages("plm")
library(plm)
data(Wages)
#(1) 현재의 작업 폴더를 확인한 후 작업 폴더를 'D:/Rstudio/test2'로 변경하시오. 
getwd()
setwd('D:/rStudioSave/test2')
#(2) Wages 데이터셋의 열 이름을 출력하시오. 
colnames(Wages)
#(3) 열 이름 name을 팝업창에서 입력받는 명령문을 작성하고 실행하시오. 
library(svDialogs)
input.colname <- dlgInput('Input colname')$res
#(4) 입력받은 문자열로 Wages 데이터셋에서 그 열만 추출하여 변수 result에 
#저장하시오. 
result <- Wages[input.colname]
#(5) result의 exp 열의 값이 10 이상 15 이하인 데이터만 추출하여 변수 new에 
#저장하시오. 그리고 table() 함수를 사용하여 각 관측값의 빈도를 구해 
#변수 new.frq에 저장하시오. 
new <- subset(result, exp>=10&exp<=15)
new.frq <- table(new)
#(6) new.frq에 저장된 값을 탭으로 구분하여 파일로 저장하시오(파일명은 frq.txt).
write.table(new.frq, 'frq.txt', sep='\t')
#(7) frq.txt 파일을 불러와 출력하시오.
read.table('frq.txt', header = T)

#03 sleep 데이터셋으로 다음 물음에 답하시오.
#(1) 현재의 작업 폴더를 확인한 후 작업 폴더를 'D:/Rstudio/test3'로 변경하시오. 
setwd('D:/rStudioSave/test3')
#(2) sleep 데이터셋의 요약 정보를 출력하시오. 
str(sleep)
#(3) 그룹 ID를 팝업창에서 입력받아 변수 gid에 저장하는 명령문을 작성하고 
#실행하시오. 그리고 변수 gid를 정수형으로 변환하시오. 
library(svDialogs)
gid <- dlgInput('input group id(1 or 2)')$res
gid <- as.numeric(gid)
#(4) sleep 데이터셋의 group 열에서 gid에 해당하는 데이터만 추출하여 
#변수 result에 저장하시오. 
result <- subset(sleep, group==gid)
print(result)
#(5) sink() 함수를 사용해 result의 결과값을 result.txt에 저장하시오. 
#이때 cat() 함수를 사용할 수 없는 이유를 설명하시오
sink('result.txt')
print(result)
sink()
#2차원 배열이므로 cat함수로는 저장이 불가능하다.
