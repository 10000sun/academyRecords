import requests

##r=requests.request("get", "http://unico2013.dothome.co.kr/crawling/exam.html")
##r.encoding="utf-8"
##print(type(r))
##print(r.headers)
##if r.text:
##    print(r.text)
##else :
##    print("응답된 컨텐츠가 없습니다")


r=requests.head('http://unico2013.dothome.co.kr/crawling/exam.html')
print(type(r))
print(r.headers)
if r.text:
    print(r.text)
else :
    print('응답된 컨텐츠가 없습니다.')
