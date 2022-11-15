is.matrix(tips)

class(tips)

str(tips)

head(tips)

table(tips$day)

dinner <- subset(tips, time == 'Dinner')
lunch <- subset(tips, time == 'Lunch')

table(dinner$day)
table(lunch$day)

colMeans(dinner[c('total_bill', 'tip', 'size')])
colMeans(lunch[c('total_bill', 'tip', 'size')])

tip.rate <- tips$tip/tip$total.bill
mean(tip.rate)