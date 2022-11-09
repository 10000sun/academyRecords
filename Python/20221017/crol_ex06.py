import urllib.request
import urllib.parse
import requests

params=urllib.parse.urlencode({"category":"역사","page":25})
url="http://unico2013.dothome.co.kr/crawling/exercise.php?%s" %params

with urllib.request.urlopen(url) as f :
    print(f.read().decode("utf-8"))

print("-----------------------------------------------")

dicdata={"category":"여행","page":100}
url1="http://unico2013.dothome.co.kr/crawling/exercise.php"
r=requests.get(url1,params=dicdata)
r.encoding="utf-8"
print(r.text)
