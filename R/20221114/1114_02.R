accident <- c(31,26,42,47,50,54,70,66,43,32,32,22) #월별 사고율
names(accident) <- c("M1","M2","M3","M4","M5","M6","M7","M8","M9","M10","M11","M12")

sum(accident) #사고율 총합
max(accident) #가장 사고가 많은 달
min(accident) #가장 사고가 적은 달

accident*0.9 #사고율이 10퍼센트 감소

accident[accident>=50] #사고건수가 50건 넘는 달 출력

month.50 <- accident[accdent >= 50] #사고건수가 50건 넘는 달 이름 출력
names(month.50)
names(accident[accident >=50])

length(accident[accident<50])

M6.acc <- accident[6] #6월보다 사고가 많은 달과 사고건수
accident[accdent>M6.acc]
#아래 한줄 명령어로도 가능
accident[accident>accident[6]]