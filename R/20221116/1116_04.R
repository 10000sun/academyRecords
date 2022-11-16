#연습문제
#07 삼각형의 밑변과 높이를 입력받아 넓이를 출력하는 프로그램을 작성하시오.
library(svDialogs)

print('삼각형 넓이 구하는 프로그램')

input.bottom <- dlgInput('Input bottom')$res
input.height <- dlgInput('Input height')$res

input.bottom <- as.numeric(input.bottom)
input.height <- as.numeric(input.height)

result <- (input.bottom*input.height)/2
print(result)

#09 다음과같이 ds.txt.를 ds.csv로 변경하여 저장하기 위한 명령문을 작성하시오.
setwd('D:/rStudioSave/shine')
dstxt <- read.table('ds.txt', sep = ' ')
write.csv(dstxt, 'ds.csv', row.names=F)

#10 iris데이터셋을 iris.xlsx로 변환하시오
setwd('D:/rStudioSave/shine')
write.csv(iris, 'iris.csv', row.names = T)