library(svDialogs)
library(xlsx)

carprice.new <- read.csv('carprice.csv', header=T)
str(carprice.new)

input.type <- dlgInput('Input type')$res
input.city <- dlgInput('Input MPG.city')$res

input.city <- as.numeric(input.city)

result <- subset(carprice.new, Type == input.type & MPG.city >=input.city)