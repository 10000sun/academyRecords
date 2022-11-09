from bs4 import BeautifulSoup
import urllib.request as req

busNum = '360'
key='vDX%2FUI2gzJeT6CJM1otu39l%2Byx0prw9aeTusQVSZCK9QkcGOX9oViiRL8uZLh7ftTKTxfEjlAKtdRpbG%2BSk3WA%3D%3D'
url1 = 'http://ws.bus.go.kr/api/rest/busRouteInfo/getBusRouteList?serviceKey='+key+'&strSrch='+busNum
savename = 'C:/Temp/businfo.xml'
req.urlretrieve(url1, savename)

xml = open(savename, 'r', encoding='utf-8').read()
soup = BeautifulSoup(xml, 'xml')

busRouteId = '100100057'
for itemList in soup.find_all('itemList') :
    busRouteId = itemList.find('busRouteId').string
    busRouteNm = itemList.find('busRouteNm').string
    if busRouteNm == busNum :
        break

url2 = 'http://ws.bus.go.kr/api/rest/busRouteInfo/getStaionByRoute?ServiceKey='+key+'&busRouteId='+busRouteId

savename = 'C:/Temp/buspos.xml'
req.urlretrieve(url2, savename)

xml = open(savename, 'r', encoding='utf-8').read()
soup = BeautifulSoup(xml, 'xml')

busPos = []
busID = []
for itemList in soup.find_all('itemList') :
    gpsY = itemList.find('gpsY').string
    gpsX = itemList.find('gpsX').string
    busNm = itemList.find('busRouteNm').string
    busPos.append((gpsY, gpsX, busNm))

print('[ ' + busNum + '번 버스의 운행 위치 ]')
if len(busPos) != 0 :
    print(busNum + '번 버스 ' + str(len(busPos)) + '대 운행중...')
    for lat,lng, busNm in busPos :
        print(busNm+"번버스, "+ '위도:',lat+','+'경도:',lng)
else :
    print('현재 운행중인 ' + busNum + '번 버스가 없어요...')

