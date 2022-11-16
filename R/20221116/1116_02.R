#bmi 구하는 입출력문

library(svDialogs)
height <- dlgInput('Input height (cm) ')$res
weight <- dlgInput('Input weight (kg) ')$res
height <- as.numeric(height)
weight <- as.numeric(weight)
height <- height/100
bmi <- weight/(height^2)

sink('bmi.txt', append = T)
cat(height*100, weight, bmi)
cat('\n')
sink()

result <- read.table('bmi.txt', sep = ' ')
result

names(result) <- c('height', 'weight', 'bmi')
write.table(result, 'bmi_new.txt', row.names=F)
