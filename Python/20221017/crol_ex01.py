import urllib.request
from urllib.parse import urlparse
from urllib.parse import urlencode

url1=urlparse("https://movie.daum.net/moviedb/main?movieId=147615")
print(type(url1))
print("도메인 정보 : ", url1.netloc)
print("경로 정보 : ", url1.path)
print("쿼리 정보 : ", url1.query)
print("스키마 정보 : ", url1.scheme)
print("포트 정보 : ", url1.port)
print("url 정보 : ", url1.geturl)



##res=urllib.request.urlopen("http://www.naver.com")
##print(type(res))
##print(res.status)
##print(res.version)
##print(res.msg)
##encoding=res.info().get_content_charset()
##print("인코딩 : ", encoding)
##res_header=res.getheaders()
##print("[header 정보==========]")
##for header in res_header:
##    print(header)
