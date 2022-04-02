# Banking Node Virtual Environment

Last updated June 29, 2021

**OVERVIEW**

"Virtual Environment" refers to a comprehensive platform of virtual credit card capabilities. A virtual card is issued electronically, instead of physically as a plastic card, but is otherwise equivalent to a physical card. This enables applications to issue payments via digital card, as well as manage cards and report on their transactions.

A virtual card can be issued and used independent of a digital wallet. Or, it can be securely added to a wallet for in-store, app, and online purchases. A virtual card has these key attributes

- Card system ID
- 16-digit Card number, aka Primary Account Number
- Card Verification Value, or CVV security code
- Expiration date
- Credit limit
- Card status

**RESOURCES**
- **Company** - represents a business with a line-of-credit that issues payments in the form of virtual cards.
- **LOC Account** - The line-of-credit account is extended to a company, and is the source of funds for virtual cards issues by the company.
- **Virtual Card** - is a digital credit card issued for a specific amount and a specific expiration date.
- **Digital Wallet** - refers to a vendor-specific card management application that can be loaded with tokenized-cards for making online and contactless purchases.

**WORKFLOW**

Developers are given a companyID for their assigned company. Each company has a funded line-of-credit LOC account, and a pre-allocated pool of cardnumbers. Developers can then:

- Create a virtual card, debited from their LOC account
- Pay a card balance, credited to their LOC account
  
## Version: 1.0.0

**Contact information:**  
U.S. Bank API Support  
apisupport@usbank.com  

**License:** [Subject to U.S. Bank Developer Portal Terms of Use.  © 2021 U.S. Bank](https://hacktotrack-innovation.usbank.com/terms)

[U.S. Bank API Developer Portal](https://hacktotrack-innovation.usbank.com)
### /company/{companyID}

#### GET
##### Summary

Retrieves a single company record.

##### Description

This method returns a JSON object of a single company record.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| companyID | path | the unique identifier for a company | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /company/{companyID}/card-info

#### GET
##### Summary

Retrieves all the different card info categories defined for this company.

##### Description

This method allows the company to retrieve an array of all the defined categories for their virtual cards. These include: employeeID, customerID, projectID and eventID. It is then possible to search for other data using these values.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| companyID | path | unique company identifier | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /company/{companyID}/account

#### GET
##### Summary

Retrieves the LOC account associated with this company.

##### Description

The Line of Credit account is the credit account that backs all of the virtual cards and contains an overview of the current financial exposure.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| companyID | path | unique company identifier | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /account/{accountID}/cards/{status}

#### GET
##### Summary

Retrieves the cards for this account.

##### Description

This method returns an array of card objects based on the LOC account and card status (active, closed, cancelled)

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| accountID | path | the account ID for the LOC | Yes | string |
| status | path | Status of the card | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /account/make-payment

#### POST
##### Summary

Payoff a closed virtual card.

##### Description

Payoff a closed virtual card which will increase the available credit for the company to allocate to other virtual cards. The amount paid will be equal to the final closed balance.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /company/cards/search

#### POST
##### Summary

Retrieves an array of virtual cards based on search criteria.

##### Description

Able to search for virtual cards that have been assigned to specific activities. Search is limited to 'employeeID', 'customerID', 'projectID' or 'eventID'. Will return an empty array if no transactions are found.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /company/transactions/search

#### POST
##### Summary

Retrieves an array of virtual card purchases based on search criteria.

##### Description

Able to search for virtual card purchase transactions based on virtual card information including 'employeeID', 'customerID', 'projectID' or 'eventID'. Will return an empty array if no transactions are found.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /vcard

#### POST
##### Summary

Create a virtual card.

##### Description

For the given client and specified payment account, create a single-use virtual card. If successful, the essential details needed to use the card are returned. If the card is not activiated by the provided 'effectiveUntil' date, it will be automatically closed and its funding deallocated.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /vcards/{cardNumber}/balance

#### GET
##### Summary

Returns the available balance for a virtual card.

##### Description

This method can be used to determine how much money is still available on a virtual card

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| cardNumber | path | the 16 digit card number for a virtual card | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /vcards/{cardID}/details

#### GET
##### Summary

Retrieves the detailed information for a virtual card.

##### Description

This method returns all the details for the account associated with a single virtual card

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| cardID | path | the unique account ID assigned to this virtual card | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /vcards/{cardID}/cvv

#### GET
##### Summary

Read virtual card security code.

##### Description

This can be used when the CVV ws not returned when the card was created

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| cardID | path | the unique account ID assigned to this virtual card | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /vcards/{cardID}/cancel

#### POST
##### Summary

Cancel a virtual card.

##### Description

Cancel the specified card. An active, unassigned card can be cancelled before its expiration date. `Card can only be cancelled if there no charge on the card.`

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |
| cardID | path | the unique account ID assigned to this virtual card | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /vcards/{cardID}/close

#### POST
##### Summary

Close a virtual card.

##### Description

Close the specified card. An active card can be cancelled before its expiration date

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |
| cardID | path | the unique account ID assigned to this virtual card | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /cards/{cardID}/digital-wallet/eligibility

#### POST
##### Summary

Determine if a card is eligible for digital wallets.

##### Description

For a given card, determine if its eligibility for a digital wallet. This can be used to determine if "Add to Wallet" should be displayed.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |
| cardID | path | the unique account ID assigned to this virtual card | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /cards/{cardID}/digital-wallet/apple-pay

#### POST
##### Summary

Package card for Apple Pay wallet.

##### Description

For a given card, return card details for submitting to Apple Pay. Subsequently the returned payload is used by the caller to invoke a wallet purchase.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |
| cardID | path | the unique account ID assigned to this virtual card | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /cards/{cardID}/digital-wallet/google-pay

#### POST
##### Summary

Package card for Google Pay wallet.

##### Description

For a given card, return card details for submitting to Google Pay. Subsequently the returned payload is used by the caller to invoke a wallet purchase.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |
| cardID | path | the unique account ID assigned to this virtual card | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### Models

#### address

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| country | string | Country | Yes |
| street | string | Street address | Yes |
| city | string | City | Yes |
| state | string | State | Yes |
| zip | string | Postal code | Yes |

#### contact

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| name | string | Company contact name | Yes |
| email | string | Company contact email | Yes |

#### companyModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| companyName | string | Name of company | No |
| companyID | string | Unique company identifier | Yes |
| associatedEmail | string | User email associated with this company record | Yes |
| address | object |  | No |
| contact | object |  | No |
| taxID | string | Federal tax identifier | Yes |
| EIN | string | Employer Identification Number | Yes |
| createdDate | date | Date account created | Yes |

#### countModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| total | number | Total number of cards. | No |
| unassigned | number | Total unassigned Card in the company. | No |
| active | number | Number of acitve Cards. | No |
| inactive | number | Number of inactive Cards. | No |
| closed | number | Number of closed Cards. | No |
| cancelled | number | Number of cancelled Card records. | No |

#### Model1

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| company | object |  | No |
| cards | object |  | No |

#### detail

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| attributeName | string | attribute name<br>_Example:_ `"code"` | Yes |
| reason | string | reason why error occurred<br>_Example:_ `"Invalid format"` | No |

#### details

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| details | array |  |  |

#### errorModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| code | string | Code associated to the specific error that can be used to trace error condition back to log information<br>_Example:_ `"400.1057.2000"` | Yes |
| message | string | Text message indicating information about error<br>_Example:_ `"Bad or Malformed Request"` | Yes |
| details | [ object ] |  | No |

#### error

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| error | object |  | Yes |

#### Model2

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| error | object |  | No |

#### employeeID

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| employeeID | string | Employee identifier | No |

#### employeeIDs

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| employeeIDs | array |  |  |

#### customerID

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| customerID | string | Customer identifier | No |

#### customerIDs

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| customerIDs | array |  |  |

#### projectID

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| projectID | string | Project identifier | No |

#### projectIDs

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| projectIDs | array |  |  |

#### eventID

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| eventID | string | Event identifier | No |

#### eventIDs

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| eventIDs | array |  |  |

#### cardInfoModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| employeeIDs | [ object ] |  | No |
| customerIDs | [ object ] |  | No |
| projectIDs | [ object ] |  | No |
| eventIDs | [ object ] |  | No |

#### cardInfo

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| cardInfo | object |  | No |

#### balances

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| openingDayBalance | number | Initial balance | No |
| availableBalance | number | Available balance | No |
| lineOfCredit | number | Credit limit - CREDIT only | No |
| availableCredit | number | Available credit - CREDIT only | No |
| currentBalance | number | Balance owed (CREDIT) or available (ASSET) | No |
| principleBalance | number | Principle balance owed | No |
| allocatedActiveBalance | number | Total allocated to active virtual cards | No |
| allocatedPendingBalance | number | Total allocated to inactive virtual cards | No |
| actualClosedBalance | number | Total amount spent by closed virtual cards - not yet paid | No |
| outstandingPurchases | number | Total amount spent by active virtual cards | No |

#### accountModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| nickname | string | Customer defined nickname | No |
| accountID | string | Unique account identifier | Yes |
| paymentAccountID | string | Identifier of parent account | Yes |
| routingTransitNumber | string | Bank routing number | No |
| accountType | string | Account type code | Yes |
| displayName | string | DIsplay name | Yes |
| description | string | Account type description | Yes |
| lineOfBusiness | string | Line of business | No |
| status | string | Current status | Yes |
| interestRate | number | Interest rate | Yes |
| annualPercentageYield | number | Annual percentage rate | Yes |
| balanceType | string | ASSET, LIABILITY, VIRTUAL | Yes |
| lastActivityDate | date | Date of last payment | No |
| lastPaymentAmount | number | Amount of last payment | No |
| balanceAsOf | date | Date balance was last changed | Yes |
| balances | object |  | No |

#### account

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| account | object |  | No |

#### balance

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| balance | number |  | No |

#### cardDetails

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| cardID | string | Unique identifier for this card account | No |
| number | string | The 15-16 digit card number | No |
| cardBrand | string | UType of card | No |
| cvv | string | Security code | No |
| zip | string | Postal code associated with this account | No |
| expirationDate | date | Expiration date for this card (YYYY-MM-DD) | Yes |

#### virtualCardInfo

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| firstName | string | First name associated with this card | Yes |
| lastName | string | Last name associated with this card | Yes |
| email | string | Email associated with this card | No |
| phone | string | Phone number associated with this card | No |
| employeeID | string | Internal employee identifier | No |
| customerID | string | Internal customer identifier | No |
| projectID | string | Internal project identifier | No |
| eventID | string | Internal event identifier | No |
| notes | string | General note | No |

#### comment

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| comment | string | Optional comment | Yes |

#### comments

An array containing up to 5 optional comments

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| comments | array | An array containing up to 5 optional comments |  |

#### customAttribute

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| name | string | Attribute name | Yes |
| value | string | Attribute value | Yes |

#### customAttributes

Optional user-specified name:value pairs associated with the card

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| customAttributes | array | Optional user-specified name:value pairs associated with the card |  |

#### cardBalances

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| lineOfCredit | number | Credit limit for this card | No |
| availableCredit | number | Available credit | No |
| currentBalance | number | Balance owed | No |
| principleBalance | number | Principle balance owed | No |

#### cardModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| paymentAccountID | string | Identifier of parent account | Yes |
| accountID | string | Unique account identifier | Yes |
| status | string | Card status | Yes |
| cardDetails | object |  | No |
| cardInfo | object |  | No |
| comments | [ object ] | An array containing up to 5 optional comments | No |
| customAttributes | [ object ] | Optional user-specified name:value pairs associated with the card | No |
| balanceAsOf | date | Date on which account balance has been checked.<br>_Example:_ `{}` | No |
| balances | object |  | No |

#### virtualCard

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| vcard | object |  | No |

#### cvv

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| cvv | string |  | No |

#### shortCardModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| cardID | string | Unique identifier associated to card account | No |
| firstName | string | First name associated with this card | Yes |
| lastName | string | Last name associated with this card | Yes |
| expirationDate | date | Expiration date for this card (YYYY-MM-DD) | Yes |
| status | string | Card status | Yes |

#### cards

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| cards | array |  |  |

#### Model3

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| firstName | string | Cardholder first name | Yes |
| lastName | string | Cardholder last name | Yes |
| email | string | Cardholder email address | No |
| phone | string | Cardholder phone | No |
| employeeID | string | Employee identifier | No |
| customerID | string | Customer identifier | No |
| projectID | string | Project identifier | No |
| eventID | string | Event identifier | No |
| notes | string | General notes | No |

#### Model4

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| comment | string |  | Yes |

#### Model5

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| Model5 | array |  |  |

#### Model6

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| name | string |  | Yes |
| value | string |  | Yes |

#### Model7

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| Model7 | array |  |  |

#### Model8

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| amount | number | The maximum available for payment via this card | Yes |
| cardInfo | object |  | Yes |
| effectiveUntil | date | The card must be activated before this date or the request is terminated. The format is YYY-MM-DD. A valid date can be upt o 365 days after the current date | Yes |
| paymentAccountID | string | Funding account | Yes |
| comments | [ object ] |  | No |
| customAttributes | [ object ] |  | No |
| returnCVV | boolean | true - CVV included in response | No |

#### virtualCardModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| ID | string | Unique identifier associated to each Virtual Card | Yes |
| number | string | 16 digit card number | Yes |
| CVV | string | Security Code, returned when requested by returnCVV=true | No |
| zip | string | Postal code associated with this card | Yes |
| expirationDate | date | Expiration date for this card (YYYY-MM-DD) | Yes |

#### Model9

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| virtualCard | object |  | No |

#### Model10

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| cardID | string | Card identifier for the card to pay off | Yes |
| externalAccountID | string | External account making this payment | Yes |
| routingNumber | string | Routing number for external account | Yes |

#### payoffModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| transactionID | string | Unique identifier for the payoff transaction associated with the LOC account | No |
| referenceTransactionID | string | Identifier for the payoff transaction directly to the virtual card account | No |
| amount | number | Amount of the payoff | Yes |

#### payoff

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| payoff | object |  | No |

#### Model11

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| companyID | string | unique company identifier | Yes |
| key | string | Search key<br>_Enum:_ `"CARDID"`, `"CUSTOMERID"`, `"EMPLOYEEID"`, `"EVENTID"`, `"PROJECTID"` | Yes |
| value | string | Search value | Yes |
| activeOnly | boolean | Indicates whether only active cards will be returned. (TRUE - return only ACTIVE cards; FALSE - return all cards) | No |

#### virtualCards

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| virtualCards | array |  |  |

#### Model12

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| companyID | string | unique company identifier | Yes |
| key | string | Search key<br>_Enum:_ `"CARDID"`, `"CUSTOMERID"`, `"EMPLOYEEID"`, `"EVENTID"`, `"PROJECTID"` | Yes |
| value | string | Search value | Yes |

#### transaction

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| accountID | string | Account associated with this transaction | Yes |
| transactionID | string | Unique transaction identifier | Yes |
| cardID | string | Specific card number used for this transaction | No |
| maskedCardID | string | Masked value of card number | No |
| referenceTransactionID | string | Transaction identifier of any related transaction | No |
| postedTimestamp | date | Time when transaction was posted | Yes |
| transactionTimestamp | date | Time when transaction occurred | Yes |
| transactionType | string | Type of transaction | Yes |
| channel | string | Channel used for this transaction | Yes |
| description | string | Brief description of transaction | Yes |
| memo | string | Annotated message | No |
| debitCreditMemo | string | Credit Debit or Memo | Yes |
| category | string | Indicates if MCC is known | No |
| subcategory | string | MCC for merchant - purchases only | No |
| reference | string | merchant name - purchases only | No |
| status | string | status | Yes |
| amount | number | transaction amount | Yes |
| payee | string | name of payee - Check | No |
| checkNumber | string | Check number - Check only | No |
| foreignAmount | number | Amount in foreign currency - if used | No |
| foreignCurrency | string | Type of foreign currency - if used | No |

#### transactions

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| transactions | array |  |  |

#### statusModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| code | string | Status code returned by the API process | Yes |
| message | string | Detailed message<br>_Example:_ `"Success"` | Yes |
| details | [ object ] | Detail description. | No |

#### success

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| status | object |  | Yes |

#### Model13

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| status | object |  | No |

#### Model14

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| deviceID | string | the 11-digit device ID<br>_Example:_ `"40010075001"` | Yes |
| walletID | string | the digital wallet identifier<br>_Example:_ `"walletAccountID"` | Yes |

#### encryptedData

Encrypted data stream of card data

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| encryptedData | string |  | No |

#### isEligible

true if eligible; false if ineligible

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| isEligible | boolean |  | No |

#### statusModel_details

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| attributeName | string | _Example:_ `"Card '938320221468' was closed."` | No |

**Example**
<pre>{}</pre>
