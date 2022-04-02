# Banking Node Core Environment

Last updated June 29, 2021

**OVERVIEW**

"Banking Node" is a banking simulation service for use during U.S. Bank hackathons. This service provides fundamental banking services for creating banking application demonstrations, proofs-of-concept, simulations, etc.

Each API user is provided with their own unique set of synthetic data with for a mock customer including balances, transactions, and account history.

The available APIs are

- Customer profiles
- Account management
- Transaction reporting

Account products include

- personal checking accounts
- savings accounts
- consumer credit cards
- business credit cards
- lines of credit

## Version: 3.0.0

**Contact information:**  
U.S. Bank API Support  
apisupport@usbank.com  

**License:** [Subject to U.S. Bank Developer Portal Terms of Use.  © 2021 U.S. Bank](https://hacktotrack-innovation.usbank.com/terms)

[U.S. Bank API Developer Portal](https://hacktotrack-innovation.usbank.com)
### /account/{accountID}

#### GET
##### Summary

Provides the complete detailed listing for a single account.

##### Description

This method returns a single account record.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| accountID | path | the unique account ID | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /customer/{customerID}

#### GET
##### Summary

Retrieves a single customer record.

##### Description

This method returns a single customer record associated with this Customer ID

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| customerID | path | a unique customer ID | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /transaction/{transactionID}

#### GET
##### Summary

Retrieves a specific transaction record.

##### Description

This method returns a JSON object of a single transaction

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| transactionID | path | a unique transaction ID | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /account/{accountID}/cards

#### GET
##### Summary

Retrieves all the cards issued to a specific account.

##### Description

This method returns a JSON array of card objects for a specific account

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| accountID | path | the unique account ID | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /customer/{customerID}/accounts

#### GET
##### Summary

Retrieves all accounts for a single customer record.

##### Description

This method returns an array of accounts associated with this Customer ID

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| customerID | path | the customer ID | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /account/{accountID}/trans/{type}

#### GET
##### Summary

Retrieves transactions for a given account.

##### Description

This method returns a JSON array of transactions for a specific account based on the input values. It can be limited to certain transaction types and date ranges

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| accountID | path | the unique account ID | Yes | string |
| type | path |  | Yes | string |
| start | query | The start date for searching by a date range | No | date |
| end | query | The end date for searching by a date range | No | date |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /account/{customerID}/credit

#### POST
##### Summary

Creates a new credit card account.

##### Description

This method generates a new credit card account for a specific customer account

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |
| customerID | path | the unique customer ID | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /account/{customerID}/dda

#### POST
##### Summary

Creates a new deposit account.

##### Description

This method generates a new deposit account for a specific customer account

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |
| customerID | path | the unique customer ID | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### Models

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

#### cardCount

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| total | number | Total number of cards | Yes |
| unassigned | number | Number of unassigned cards | No |
| active | number | Number of active cards | No |
| inactive | number | Number of inactive cards | No |
| closed | number | Number of closed cards | No |
| cancelled | number | Number of cancelled cards | No |
| suspended | number | Number of suspended cards | No |

#### Model1

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| account | object |  | No |
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
| status | object |  | Yes |

#### Model2

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| status | object |  | No |

#### Model3

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| error | object |  | No |

#### name

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| prefix | string | Name title (e.g. DR) | No |
| firstName | string | Customer first name | Yes |
| middleName | string | Customer middle name | No |
| lastName | string | Customer last name | Yes |
| suffix | string | Any name suffix (e.g. JR) | No |
| company | string | Customer employer | No |

#### email

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| email | string | Customer email | Yes |

#### emails

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| emails | array |  |  |

#### address

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| addressType | string | Address type | Yes |
| line1 | string | Street address | Yes |
| line2 | string | Second line of address | No |
| line3 | string | Third line of address | No |
| city | string | City name | Yes |
| state | string | State name | Yes |
| zip | string | Postalcode | Yes |
| country | string | Country name | Yes |
| lastUpdateDate | date | Last date the address was updated | Yes |

#### addresses

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| addresses | array |  |  |

#### telephone

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| type | string | Phone type | Yes |
| country | string | Country name | Yes |
| number | string | Telephone number | Yes |

#### telephones

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| telephones | array |  |  |

#### customer

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| customerID | string | Unique customer identifier | Yes |
| associatedEmail | string | User record associated with this customer record | Yes |
| name | object |  | No |
| dateOfBirth | dateTime | Customer Date and Time of Birth.<br>_Example:_ `{}` | No |
| taxID | string | SSN or federal tax ID | Yes |
| governmentID | string | Government ID used | Yes |
| emails | [ object ] |  | No |
| addresses | [ object ] |  | No |
| telephones | [ object ] |  | No |
| dependents | string | Number of dependents | No |
| relationshipStatus | string | Marital status | No |
| createdDate | date | Date record was created | Yes |

#### customers

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| customer | object |  | No |

#### transactionModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| accountID | string | Account associated with this transaction | Yes |
| transactionID | string | Unique transaction identifier | Yes |
| cardNumber | string | Specific card number used for this transaction | No |
| maskedCardNumber | string | Masked value of card number | No |
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

#### transaction

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| transaction | object |  | No |

#### cardControls

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| cardControls | object |  |  |

#### cardModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| paymentAccountID | string | Parent account responsible for this card | Yes |
| cardID | string | Account ID associated this card | Yes |
| cardBrand | string | Card issuer | Yes |
| number | string | 16 digit card number | Yes |
| firstName | string | First name of card user | Yes |
| lastName | string | Last name of card user | Yes |
| zip | string | Postal code associated with the account owner | Yes |
| cvv | string | Card security code | Yes |
| expirationDate | date | Expiration date | Yes |
| activateBy | date | Date to activate card | Yes |
| status | string | Card status | Yes |
| type | string | Card type | Yes |
| cardControls | object |  | No |

#### cards

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| cards | array |  |  |

#### accountShortModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| nickname | string | Customer defined nickname | No |
| accountID | string | Unique account identifier | Yes |
| paymentAccountID | string | Identifier of parent account | Yes |
| accountType | string | Account type code | Yes |
| description | string | Account type description | Yes |
| status | string | Current status | Yes |
| availableBalance | number | Funds available for use | No |
| lineOfCredit | number | Total line of credit - LOC | No |
| availableCredit | number | Available credit line - LOC | No |
| currentBalance | number | Amount owed - credit | No |

#### accounts

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| accounts | array |  |  |

#### transactions

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| transactions | array |  |  |

#### Model4

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| nickname | string | Account nickname | No |
| accountType | string | type of mock account; enum[CCD, BCD] | Yes |
| creditLimit | number | Credit limit for new card account | Yes |

#### account

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| account | object |  | No |

#### Model5

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| nickname | string | Account nickname | No |
| accountType | string | type of mock account; enum[DDA, SAV] | Yes |
| openBalance | number | Initial balance for new account | Yes |
