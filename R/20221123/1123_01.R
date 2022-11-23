install.packages('plotrix')
library(plotrix)

ds <- table(favorite)

pie3D(ds, main = '선호 계절',
      labels=names(ds),
      labelcex=1.0,
      explode=0.1,
      radius=1.5,
      col=c('brown', 'green', 'red', 'yellow')
)
