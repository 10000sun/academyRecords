import tweepy

api_key = "NSqhMeDEomt137lkcVSnDgnRu"
api_secret = "kBpysRISRuLYzim5r7N4ZIsC7J7TjbERPZNvvM2lTw3Xxl7Xg3"
access_token = "1584705794364559360-uAz6NyqXaQWm3x8DO8YrgVIEuJ1SFQ"
access_token_secret = "HxF7biywKfTxRc8e3UC7x2t0SXnAwpOdyBACHZbcnXASB"
auth = tweepy.OAuthHandler(api_key, api_secret)
auth.set_access_token(access_token,access_token_secret)

api = tweepy.API(auth)

keyword = '치맥'
search = []
cnt = 1
while(cnt<=10):
    tweets = api.search_tweets(q=keyword, count=100)
    for tweet in tweets:
        search.append(tweet)
    cnt+=1

data = {}
i = 1
print('['+keyword+'에 대한 트윗 글]')
for tweet in search:
    data['text'] = tweet.text
    print(i , ":", data)
    i += 1
    if i == 100:
        break
