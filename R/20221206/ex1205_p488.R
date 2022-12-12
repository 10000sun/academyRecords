#1
#(1)
library(HSAUR)
str(Forbes2000)
ds <- Forbes2000
high.company <- head(ds, 10)
low.company <- tail(ds, 10)
mean(high.company$sales)-mean(low.company$sales)

#(2)
ds <- Forbes2000
temp <- ds[order(ds$profits, decreasing = T), ]
temp <- temp[1:10, ]
temp[, c('rank', 'name', 'sales', 'profits')]

#(3)
ds <- Forbes2000
temp <- ds[order(ds$assets, decreasing = T), ]
temp <- temp[1:10, ]
barplot(
  temp$assets,
  main = '자산금액이 많은 상위 10개 기업',
  names.arg=temp$name,
  las=2
)

#(4)
ds <- Forbes2000
str(ds)
n.20 <-nrow(ds)*.2
print(n.20)

high.20 <- head(ds, n.20)
low.20 <- tail(ds, n.20)

print(high.20)
high.20$group <- 'high'
low.20$group <- 'low'
str(high.20)
mrg <- rbind(high.20[, c('sales', 'group')], low.20[, c('sales', 'group')])
boxplot(
  sales~group,
  data = mrg,
  ylim=c(0,80)
)

#(5)
ds <- Forbes2000
str(ds)
print(levels(ds$country))
canada <- subset(ds, country=='Canada')
korea <- subset(ds, country=='South Korea')

mrg <- rbind(canada, korea)
mrg$country <- factor(mrg$country)
boxplot(
  marketvalue~country,
  data = mrg,
  ylim=c(0, 40)
)

#(6)
ds <- Forbes2000
str(ds$name)
ins <- subset(ds, category=='Insurance')
print(ins)

ins.5 <- head(ins, 5)
print(ins.5)

par(mfrow=c(1, 2))
barplot(
  ins.5$sales,
  main = '매출액',
  names.arg=ins.5$name,
  las=2
)

barplot(
  ins.5$profits,
  main = '순익',
  names.arg=ins.5$name,
  las=2
)

par(mfrow=c(1, 1))










