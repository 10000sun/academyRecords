install.packages('svDialogs')
library(svDialogs)
user.input <- dlgInput('Input income')$res
print(user.input)

getwd()
setwd('D:\\rStudioSave')
air <- read.csv('airquality.csv', header = T)
head(air)
class(air)
print(air)

my.iris <- read.csv('iris.csv')
print(my.iris)

my.iris <- subset(iris, Species=='setosa')
write.csv(my.iris, 'my_iris.csv', row.names = F)

install.packages('xlsx')
library(xlsx)
air <- read.xlsx('D:/rStudioSave/airquality.xlsx', header=T, sheetIndex=1)
head(air)

