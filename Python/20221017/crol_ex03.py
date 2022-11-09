import requests

r=requests.request("get", "http://unico2013.dothome.co.kr/crawling/exam.html")
r.encoding="utf-8"
print(type(r))

if r.text:
    print(r.text)
else :
    print("응답된 컨텐츠가 없습니다")
print("----------------------------------------------------")
r=requests.request('head', 'http://unico2013.dothome.co.kr/crawling/exam.html')
r.encoding="utf-8"
print(type(r))

if r.text:
    print(r.text)
else :
    print("응답된 컨텐츠가 없습니다")
print("----------------------------------------------------")
r=requests.request('post', 'http://unico2013.dothome.co.kr/crawling/post.php', data={'name':'백도','age':12})
r.encoding='utf-8'
print(type(r))
if r.text:
    print(r.text)
else :
    print('응답된 컨텐츠가 없습니다.')
