'''
Example in Python on how to pull and read data from an API
In this example we're pulling data from cat facts api.

I'm using the "requests" library, install it via `pip install requests` in
your Python virtual environment.
'''


import requests

# Documentation found here: https://catfact.ninja/
url = 'https://catfact.ninja/fact'

data = requests.get(url=url).json()

# The data is returned as a dictionary so I just provide the key to get the value out of it.
print(data['fact'])
