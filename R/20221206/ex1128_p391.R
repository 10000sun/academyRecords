#1
#����������, ��������ó��
#2
#������׷�
#3
#���׷���
#4
library(Ecdat)
str(Hdma)
#(1)
self <- table(Hdma$self)
barplot(
  self,
  main = '�����û���� ������ �ڿ����ΰ��� �ƴѰ��',
  col=c('black', 'green')
)
#(2)
single <- table(Hdma$single)
barplot(
  single,
  main = '�����û�ڰ� �̱��� ���� �ƴѰ��',
  col=c('black', 'green')
)
#(3)
#(3_1)
boxplot(
  Hdma$uria,
  main='�����û�ڰ� ���� ������'
)
#(3_2)
volume <- boxplot.stats(Hdma$uria)
print(volume$stats)
#(3_3)
out <- boxplot.stats(Hdma$uria)
print(length(out$out))
#(4)
deny.yes <- mean(Hdma$hir[Hdma$deny=='yes'])
print(deny.yes)
deny.no <- mean(Hdma$hir[Hdma$deny=='no'])
check1 <- table(Hdma$deny)
print(check1)

cat('������ΰ��� : ', deny.no, ' ������� : ', deny.yes, '\n')
#(5)
#���ε� ��� ������� 0.25, �������� ��������� 0.29�� �ǹǷ�
#���Դ�� ��������� ������ ������ �Ҹ��ϴ�.


#�ǽ�Ȯ��
#1
library(DAAG)
#(1):�ſ���ϴ�.
plot(
  houseprices$area, houseprices$bedrooms,
  main = '���ø����� ���ǰ��� ������ �������'
)
#(2)
#(2_1):���� ������ �������Ϸ� ���ð����� ��������.
plot(
  houseprices,
  main = '�������� �������',
  col=c('red', 'blue', 'green')
)
#(2_2)
cor(houseprices)
#(2_3):���� ������ �������Ϸ� ���ð����� ��������.

#2
library(DAAG)
str(dengue)
data(dengue)
ds <- dengue[,c('humid', 'temp', 'trees', 'NoYes')] # �ʿ��� ������ ����
ds <- ds[complete.cases(ds),] 
#(1) : ��⿭�� �µ�, ����, ���Ǹ����� ������ �߻��Ѵ�.
dengue.yes <- colMeans(ds[ds$NoYes==1, 1:3])
dengue.no <- colMeans(ds[ds$NoYes==0, 1:3])
tbl <- rbind(dengue.yes, dengue.no)
print(tbl)
#(2)
my.col <- c('black', 'red')
plot(
  ds[,1:3], 
  col=my.col[ds$NoYes+1]
)
#(3) : ������ ������ 0.74�� �������.
cor(ds)



