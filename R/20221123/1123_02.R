month = 1:12
late = c(5,8,7,9,4,6,12,13,8,6,6,4)
plot(month,
     late,
     main='지각생 통계',
     type='l',
     lty=7,
     lwd=1,
     xlab='Month',
     ylab='Late cnt'
)
