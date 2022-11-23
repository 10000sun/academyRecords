install.packages('plotrix')
library(plotrix)

ds <- table(science$State)
pie3D(ds, main='주별 학생 비율',
      labels=name(ds),
      labelcex=1.0,
      explode=0.1,
      radius=1.5,
      col=c('brown', 'green')
      )
