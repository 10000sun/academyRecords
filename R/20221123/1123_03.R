install.packages('DAAG')
library(DAAG)

ds <- table(science$like)
pie(ds, main='선호 점수별 비율',
    col=rainbow(length(ds)),
    radius=1
    )

