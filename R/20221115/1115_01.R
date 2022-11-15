class(trees)
str(trees)

girth.mean <- mean(trees$Girth)

candi <- subset(trees, Girth >= girth.mean & Height > 80 & Volume > 50)
candi
nrow(candi)
