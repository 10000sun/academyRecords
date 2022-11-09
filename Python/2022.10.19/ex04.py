from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome('C:/Temp/chromedriver')
##print("webdriver 객체 : " , type(driver))

driver.get('http:///www.naver.com')
##target=driver.find_element(By.CSS_SELECTOR, "[name='query']") #css 선택자
##target=driver.find_element(By.CLASS_NAME, "input_text") #class 선택자
##target=driver.find_element(By.ID, "query") #id 선택자 

##print("태그 객체 : ",type(target))
target.send_keys('파이썬')
target.send_keys(Keys.ENTER)
driver.quit()
