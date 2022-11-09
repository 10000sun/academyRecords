import requests
from bs4 import BeautifulSoup
import re

req = requests.get('https://movie.daum.net/moviedb/crew?movieId=136859')
html = req.txt
soup = BeautifulSoup(html, 'html.parser')
titles = soup.select('.txt_tit')
points = soup.select('')
reviews = soup.select('td.title')
print(titles)

movie_title = []
movie_porint = []
movie_review = []

for dom in titles:
    movie_title.append(dom.text)
for dom in points:
    movie_point.append(dom.text)
for dom in reviews:
    content = dom.contents[6]
    content = re.sub("신고",'',content)
    movie_review.append(content)

commentLength=len(movie_title)

for i in range(commentLength):
    print("영화제목 : "+movie_title[i])
    print("평점 : " +movie_point[i])
    print("리뷰 글 : " + movie_review[i])
    print("-----------------------------------------------------------")
