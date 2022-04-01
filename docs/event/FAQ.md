## The Money Hack Hackathon
![Money Hack](./img/MoneyHack.png)
### Frequently Asked Questions

### General Questions
#### Q. Where can I get help during the hackathon event?
Virtual support will be available throughout the event.

The event will be hosting a Microsoft Team server. The technical team will be monitoring this server and responding to questions immediately.

Furthermore, each team will have a mentor assigned to them who will be available to help with conceptual questions. Mentors will set up a private channel for each team.

#### Q. Where do I find the U.S. Bank Developer Portal?
The developer portal for the Money Hack Hackathon is located at:<br> [hacktotrack-innovation.usbank.com](https://hacktotrack-innovation.usbank.com/).

Here are a few more resources:
- [Exploring the portal](../portal/explore.md)
- [Creating an account](../portal/gettingStarted.md)
- [Getting your API key](../portal/getAPIKey.md)

#### Q. Do I need to register on the U.S. Bank Innovation developer portal?
Yes, you will need to register for an account on the Developer Portal in order to view the API documentation and obtain an API key. Complete signup instructions are provided in this folder. Once you complete the signup process, a confirmation email will be sent to this address to activate your account.


### Technical Questions

#### Q. How can I use one of the APIs?
In order to use any of the U.S. Bank APIs, you will need to first request an API key from the developer portal. You will use this key, as well as any query data, to call these APIs.

#### Q. Will I have my own test data?
Each team will receive their own unique test account that will be pre-populated with test data.

For the **The Money Hack** hackathon, each team will receive their own *customer ID* that will be distributed on the day of the event. This account will provide you with a customer that has four different accounts:
- one checking account
- one savings account
- two credit card accounts
- each account will be pre-populated with unique transactions

#### Q. How do I use my test account?
The *customer ID* is the starting point to accessing all of your unique data, including the ability to create your own financial transactions.

The specific details about how to use your test account are provided in the sections about each API. Throughout this event, you will probably use the **Core Banking**, **Money Movement** and **Reference** APIs to create your product.

> Please let the hackathon team know if you require more than one test account.

#### Q. When do I use the Core Banking APIs?
The Core Banking APIs provide read-only access to account data. These are the methods that you will use to find account information and current balances. You can also look at the details for any of your transactions.

More detailed information is available [here](../APIs/core.md)

#### Q. When do I use the Money Movement APIs?
The Money Movement APIs provide all of the functionality for performing financial transactions including credit card purchases. You may want to set up a transfer to your savings account to reach a savings goal.

More detailed information is available [here](../APIs/money.md)

#### Q. When do I use the CAAS APIs?
The *Customer as a Service* (CAAS) APIs are the high level APIs for managing virtual cards. In this hackathon, you will have little reason to use this functionality.

However, you may be interested in setting up one of your credit cards to be used in a digital wallet. The CAAS API has methods for inserting a card into either an **Apple Pay** or **Google Pay** wallet. Then, you can use the *Money Movement* API to make a card purchase using your digital wallet.

More detailed information is available [here](../APIs/caas.md)

#### Q. When do I use the Reference APIs?
The main purpose of the Reference APIs is give you access to the standard industry codes for card purchases. These methods will only be useful for you if you need to classify card purchases based on their general category (*e.g.* restaurant purchases, gas purchases, etc.)

More detailed information is available [here](../APIs/reference.md)
