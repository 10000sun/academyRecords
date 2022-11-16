library(Stat2Data)

data('ChildSpeaks')
str(ChildSpeaks)

idx <- which(ChildSpeaks$Age<9)
ChildSpeaks[idx, 'm1'] <- 5
idx <- which(ChildSpeaks$Age>=9 & ChildSpeaks$Age<15)
ChildSpeaks[idx, 'm1'] <- 4
idx <- which(ChildSpeaks$Age>=15 & ChildSpeaks$Age<21)
ChildSpeaks[idx, 'm1'] <- 3
idx <- which(ChildSpeaks$Age>=21 & ChildSpeaks$Age<27)
ChildSpeaks[idx, 'm1'] <- 2
idx <- which(ChildSpeaks$Age>=27)
ChildSpeaks[idx, 'm1'] <- 1

idx <- which(ChildSpeaks$Gesell<70)
ChildSpeaks[idx, 'm2'] <- 1
idx <- which(ChildSpeaks$Gesell>=70 & ChildSpeaks$Gesell<90)
ChildSpeaks[idx, 'm2'] <- 2
idx <- which(ChildSpeaks$Gesell>=90 & ChildSpeaks$Gesell<110)
ChildSpeaks[idx, 'm2'] <- 3
idx <- which(ChildSpeaks$Gesell>=110 & ChildSpeaks$Gesell<130)
ChildSpeaks[idx, 'm2'] <- 4
idx <- which(ChildSpeaks$Gesell>=130)
ChildSpeaks[idx, 'm2'] <- 5

ChildSpeaks$total <- ChildSpeaks$m1 + ChildSpeaks$m2

idx <- which(ChildSpeaks$total<3)
ChildSpeaks[idx, 'result'] <- '매우느림'
idx <- which(ChildSpeaks$total>=3 & ChildSpeaks$total<5)
ChildSpeaks[idx, 'result'] <- '느림'
idx <- which(ChildSpeaks$total>=5 & ChildSpeaks$total<7)
ChildSpeaks[idx, 'result'] <- '보통'
idx <- which(ChildSpeaks$total>=7 & ChildSpeaks$total<9)
ChildSpeaks[idx, 'result'] <- '빠름'
idx <- which(ChildSpeaks$total>=9)
ChildSpeaks[idx, 'result'] <- '매우빠름'

ChildSpeaks
ChildSpeaks[which.min(ChildSpeaks$total),]