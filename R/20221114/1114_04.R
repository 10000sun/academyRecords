#실습문제
#01 다음 문제의 적절한 명령문을 작성하시오.
point <- c(7,7,8,8,9,10,10,10,11,20)
answer_sheet <- c(1,3,2,2,4,1,5,2,3,1)
mark <- c(1,3,1,2,4,2,5,2,5,1)
#(1)학생이 맞춘 문제는 몇개인가?
answer <- sum(answer_sheet == mark)
answer
#(2)학생의 시험 성적은 몇점인가?
sum(point[answer_sheet==mark])
#(3)시험 배점을 수정하려고 한다, 
#9점 이상 11점 이하를 모두 10점으로 변경한 뒤 시험성적은?
point[point >= 9 & point <= 11] <- 10
sum(point[answer_sheet==mark])

#02 초등학생 대상 어린이날 이벤트의 학년정보가 다음일때 물음에 답하시오.
event <- c(1,2,3,3,2,6,6,6,5)
#(1) 펙터 grade를 생성하시오
grade <- factor(event)
#(2) levels()함수를 사용하시오
levels(grade)
#(3)grade[6] <- 9를 실행하시오
grade[6] <- '3'
#(4) grade 내용을 출력하여 결과가 어떻게 변하였는지 확인하시오
print(grade)

#03 다음은 어떤 책의 정보이다. 물음에 답하시오.
#(1)하나의 자료구조에 저장하시오.
book <- list('제목' = '바람과 함께 나타나다',
               '저자' = '심훈',
               '가격' = 30000,
               '판매처' = c('한국문고', '가야서점', '길책방'))
#(2)book의 내용을 출력하시오.
print(book)
#(3)book에서 저자를 출력하시오
print(book$저자)
#(4)book에서 두번째 판매처를 출력하시오
print(book$판매처[2])



