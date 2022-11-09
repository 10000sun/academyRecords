import urllib.request
from bs4 import BeautifulSoup

server = urllib.request.urlopen("https://www.starbucks.co.kr/store/store_map.do")

response = server.read().decode()
bs=BeautifulSoup(response, "html.parser")
li = bs.find_all('li', class_="quickResultLstCon")
print(li)
