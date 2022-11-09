import os
import sys
import urllib.request
import json
client_id = "9mJ993S7IP7qz4G7Ts96"
client_secret = "e2w0kySr6b"

query = '치맥'
encText=urllib.parse.quote_plus(query)

num = 100
naver_url = "https://openapi.naver.com/v1/search/blog?query=" + encText +'&display='+str(num)
# url = "https://openapi.naver.com/v1/search/blog.xml?query=" + encText # XML 결과
request = urllib.request.Request(naver_url)
request.add_header("X-Naver-Client-Id",client_id)
request.add_header("X-Naver-Client-Secret",client_secret)
response = urllib.request.urlopen(request)
rescode = response.getcode()

if(rescode==200):
    response_body = response.read()
    dataList = json.loads(response_body)
    count = 1
    print('['+query+'에 대한 블로그 글]')
    for data in dataList['items']:
        print(str(count)+':'+data['title'])
        print('['+data['description']+']')
        count+=1
else:
    print("오류 코드:" + rescode)
