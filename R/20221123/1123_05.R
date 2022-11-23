year = 1875:1972
ds <- data.frame(year, LakeHuron)

plot(ds$year,
     ds$LakeHuron,
     main='수위 변화',
     type='b',
     lty=1,
     col=c('blue', 'red'),
     xlab='연도',
     ylab='수위'
     )
