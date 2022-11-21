favorite <- c('WINTER', 'SUMMER', 'SPRING', 'SUMMER', 'SUMMER', 'FALL', 'FALL', 'SUMMER', 'SPRING', 'SPRING')
favorite
table(favorite)

ds <- table(favorite)
ds
barplot(ds, main='favorite season', 
        col=rgb(0,0,0,255, maxColorValue = 255))


par(mfrow=c(1, 1),mar=c(5.1,4.1,4.1,2.1))

age.A <- c(13709,10974,7979,5000,4550)
age.B <- c(17540,29701,36209,33947,24487)
age.C <- c(991,2195,5366,12980,19007)

ds <- rbind(age.A, age.B, age.C)
colnames(ds) <- c('1970','1990','2010','2030','2050')
ds

barplot(ds, main='인구 추정')