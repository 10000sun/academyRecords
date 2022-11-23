library(DAAG)
str(tinting)

plot(tinting$it, tinting$csoa)

group <- tinting$tint
color <- c('red','green','blue')
plot(tinting$it, tinting$csoa,
     pch=19,
     col=color[group])

group <- tinting$agegp
color <- c('red','green')
plot(tinting$it, tinting$csoa,
     pch=19,
     col=color[group])
