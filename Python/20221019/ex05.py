from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome('C:/Temp/chromedriver')
driver.implicitly_wait(3)
driver.get("https://www.starbucks.co.kr/store/store_map.do")
##target=driver.find_element_by_class_name("quickResultLstCon")
import time
time.sleep(1)

loca=driver.find_element(By.CLASS_NAME, "loca_search")
loca.click()
time.sleep(1)

f_link = driver.find_element(By.CSS_SELECTOR, "div.loca_step1_cont > ul > li:nth-child(6) > a")
f_link.click()
time.sleep(1)

s_link = driver.find_element(By.CSS_SELECTOR, "#mCSB_2_container > ul > li:nth-child(1) > a")
s_link.click()
time.sleep(2)

shopList = driver.find_elements(By.CSS_SELECTOR, "#mCSB_3_container > ul > li")

temp_list = []
time.sleep(2)
count = 0
total = shopList
for shop in shopList:
    count+=1
    shoplat=shop.get_attribute("data-lat")
    shoplong=shop.get_attribute("data-long")
    shopname=shop.find_element(By.TAG_NAME, "strong")
    shopinfo=shop.find_element(By.TAG_NAME, "p")
    splitinfo=shopinfo.text.split('\n')
    
    if(len(splitinfo) == 2 ):
        addr = splitinfo[0]
        phonenum = splitinfo[1]

    temp_list.append([count, shopname.text, shoplat, shoplong, addr, phonenum])
    if count != total and count % 3 == 0:
        driver.execute_script("var su=arguments[0]; var dom=document.querySelectorAll('#mCSB_3_container > ul > li')[su]; dom.scrollIntoView();", count)

with open("C:/Temp/starbucks_shop.txt", "wt", encoding="utf-8") as f:
    for item in temp_list:
        f.write(str(item)+"\n")

##print(type(target))
##print(type(target.text))
##print(target.text)
driver.quit()


