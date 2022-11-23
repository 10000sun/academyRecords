boxplot(Petal.Length~Species,
        data=iris,
        main='품종별 꽃잎의 길이',
        col=c('green','yellow','blue'))
boxplot.stats(iris$Petal.Length)
