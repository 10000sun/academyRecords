import urllib.request
import urllib.parse

params=urllib.parse.urlencode({'name':'빅데이터','age':20})
url="http://unico2013.dothome.co.kr/crawling/get.php?%s" %params
with urllib.request.urlopen(url) as encodeParam:
    print(encodeParam.read().decode("utf-8"))
