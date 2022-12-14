library(DAAG)
str(carprice)
carprice$Price

range(carprice$Price)
mean(carprice$Price)

hist(carprice$Price, main='자동차 가격',
    xlab='가격대',
    ylab='빈도',
    col='green')

tbl <- table(carprice$Type)

barplot(tbl, main='자동차 타입별 빈도수',
        xlab='타입',
        ylab='빈도수',
        col=rainbow(length(tbl)))

idx <- which(carprice$Price==max(carprice$Price))
carprice[idx, c('Type','Price')]
