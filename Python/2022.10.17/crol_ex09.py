import requests
from bs4 import BeautifulSoup

title = []
link = []
urlstr = "http://www.yes24.com/Product/Search?domain=ALL&query=python"
##urlstr = "http://www.yes24.com/SearchCorner/Search?domain=BOOK&query=python"
r = requests.get(urlstr)
##req.encoding - "utf-8"
bs = BeautifulSoup(r.text, 'html.parser')
titleList = bs.select('.gd_name')
linkList = bs.select('div.itemUnit > div.item_info > div.info_row > a.gd_name')

for titleDom in titleList :
    title.append(titleDom.string)
    
for linkDom in linkList:
    link.append(linkDom["href"])

listLength=len(titleList) #길이 체크
linkLength=len(linkList)


for i in range(listLength):
    print("도서 제목 : ", title[i])
    print("도서 링크 : ", link[i])
    print("----------------------------")

print(listLength)
print(linkLength)

##    print("도서 제목 : ", title[i])
##print("--도서제목--")
##print(title)
##print("--도서 링크 URL--")
##print(link)

