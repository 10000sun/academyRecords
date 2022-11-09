from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome('C:/Temp/chromedriver')
driver.implicitly_wait(3)

driver.get("http://www.yes24.com/Product/Goods/40936880")
import time
time.sleep(1)
readLinks = driver.find_elements(By.CSS_SELECTOR, '#infoset_reviewContentList > div:nth-child(3) > div.reviewInfoBot.crop > a > div > span')#펼쳐보기

for readlink in readLinks:
    readlink.click()
    time.sleep(1)
    
    reviewList = driver.find_elements(By.CSS_SELECTOR, '#infoset_reviewContentList div.reviewInfoBot.origin div.review_cont')

    temp_list = []
    time.sleep(2)

    for review in reviewList:
        temp_list.append(review.text)

stopFlag = False
while True :
    for n in range(4, 13):
        linkurl = '#infoset_reviewContentList > div.review_sort.sortBot > div.review_sortLft > div > a:nth-child('+str(n)+')'
        linkNum = driver.find_element(By.CSS_SELECTOR, linkurl)
        linkNum.click()
        time.sleep(1)

    readLinks = driver.find_elements(By.CSS_SELECTOR, '#infoset_reviewContentList > div:nth-child('+str(n)+') > div.reviewInfoBot.crop > a > div > span')

    for readlink in readLinks:
        driver.execute_script("arguments[0].click();", readlink)
        time.sleep(2)

    reviewList = driver.find_elements(By.CSS_SELECTOR, '#infoset_reviewContentList > div:nth-child('+str(n)+') > div.reviewInfoBot.crop > a > div')
    time.sleep(1)

    for review in reviewList:
        temp_list.append(review.text)
    if len(reviewList) < 5:
        stopFlag = True
        break
    if stopFlag == True:
        break

    nextPage = '#infoset_reviewContentList > div.review_sort.sortBot > div.review_sortLft > div > a.bgYUI.next'
    linkNum = driver.find_element(By.CLASS_NAME, 'bgYUI.next')
    linkNum.click()
    time.sleep(1)

    for item in temp_list:
        print(item)

wfile = open("C:/Temp/BookShopFile.txt", "w")
wfile.writelines(temp_list)
wfile.close()
