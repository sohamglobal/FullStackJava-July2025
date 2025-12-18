import requests

no=input('Enter account number : ')
url=f"http://localhost:8083/bank/api/search/{no}"

try:
    response=requests.get(url)

    #check status
    if response.status_code==200:
        print("\nAccount Details : ")
        print(response.json())
    else:
        print(f"\nFailed to fetch data from Java REST {response.status_code}")
        #print(response.text)
except Exception as e:
    print("Error ",e)