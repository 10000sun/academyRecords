boxplot(mtcars$mpg)

boxplot(mtcars$mpg~mtcars$gear)

boxplot(mtcars$mpg~mtcars$vs)

boxplot(mtcars$mpg~mtcars$am)

grp <- rep('high', nrow(mtcars))
grp[mtcars$wt < mean(mtcars$wt)] <- 'low'
boxplot(mtcars$hp~grp)
