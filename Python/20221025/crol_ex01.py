import tweepy

api_key = "YOUR_API_KEY"
api_secret = "YOUR_API_SECRET"
access_token = "YOUR_ACCESS_TOKEN"
access_token_secret = "YOUR_ACCESS_TOKEN_SECRET"
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
