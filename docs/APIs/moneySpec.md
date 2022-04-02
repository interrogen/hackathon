# Banking Node Money Movement Environment

Last updated June 29, 2021

**OVERVIEW**

The Money Movement API suite allows one to perform a variety of financial transactions into and out of different synthetic accounts in order to emulate real customer behavior - paying bills, depositing checks, purchasing items, etc. In general, one will perform these transactions from the perspective of a single customer using the assigned synthetic accounts.

Currently available transactions are -

- Deposit & withdrawl
- Card purchase or payment
- Digital wallet purchase
- Internal & external funds transfer
- Enter an account memo

## Version: 1.0.0

**Contact information:**  
U.S. Bank API Support  
apisupport@usbank.com  

**License:** [Subject to U.S. Bank Developer Portal Terms of Use.  © 2021 U.S. Bank](https://hacktotrack-innovation.usbank.com/terms)

[U.S. Bank API Developer Portal](https://hacktotrack-innovation.usbank.com)
### /activity/card-purchase

#### POST
##### Summary

Emulates a card purchase.

##### Description

This method attempts to create a card purchase and returns a valid receipt

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /activity/card-reverse

#### POST
##### Summary

Emulates the reversal of a card purchase.

##### Description

This method attempts to reverse an existing card purchase and credits the account

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /activity/deposit

#### POST
##### Summary

Emulates a deposit transaction.

##### Description

This method performs a deposit trasaction according business rules

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /activity/digital-wallet

#### POST
##### Summary

Emulates a card purchase through a digital wallet.

##### Description

This method attempts to create a card purchase through a digital wallet. A separate method can create the encrypted card data stream which is required for the digital wallet.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /activity/external-transfer

#### POST
##### Summary

Emulates an external funds transfer transaction.

##### Description

This method moves funds from a specific customer account to a different customer account. Only savings or checking accounts are allowed.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /activity/funds-transfer

#### POST
##### Summary

Emulates an internal funds transfer transaction.

##### Description

This method moves funds between two different accounts for the same customer according business rules.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /activity/memo

#### POST
##### Summary

Creates a memo for a given account.

##### Description

This method notates a specific account with a custom message

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /activity/payment

#### POST
##### Summary

Emulates a payment to a credit account from an external source.

##### Description

This method attempts to pay a credit account according business rules

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /activity/withdrawal

#### POST
##### Summary

Emulates a withdrawal transaction.

##### Description

This method performs a withdrawal transaction according business rules

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| Content-Type | header | Indicates body format of 'application/json' | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 201 | Success |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### Models

#### Model1

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| cardNumber | string | a valid credit card number | Yes |
| firstName | string | cardholder's first name | Yes |
| lastName | string | cardholder's last name | Yes |
| expMonth | string | expiration month (MM) | Yes |
| expYear | string | expiration year (YYYY) | Yes |
| zip | string | Postal code associated with this card | Yes |
| cvv | string | Security code | Yes |
| amount | number | Purchase amount | Yes |
| merchant | string | The merchant name | Yes |
| mcc | string | The corresponding merchant code | Yes |
| inPerson | boolean | Indicates if purchase was made in-person (true) or online (false) | No |

#### receipt

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| date | date | Purchase date | Yes |
| cardNumber | string | Masked value of the credit card used | Yes |
| transactionID | string | Masked value of the transaction identifier | Yes |
| type | string | Description of transaction | Yes |
| number | string | 16 digit card number | Yes |
| merchant | string | name of the maerchant | Yes |
| amount | string | purchase amount | Yes |

#### Model2

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| receipt | object |  | No |

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

#### Model3

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| status | object |  | No |

#### Model4

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| error | object |  | No |

#### Model5

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| accountID | string | the account ID | Yes |
| transactionID | string | the tranaction ID to be reversed | Yes |
| reason | string | Explanation for card reversal<br>_Enum:_ `"BILLING"`, `"DISPUTE"`, `"UNAUTHORIZED"` | Yes |

#### transactionID

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| transactionID | string | unique transaction identifier | No |

#### Model6

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| accountID | string | the account ID | Yes |
| amount | number | Deposit amount | Yes |
| checkNumber | string | The check number - if applicable | No |
| party | string | The payer name | Yes |

#### Model7

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| encryptedCardData | string | the encrypted card data | Yes |
| walletID | string | the digital wallet identifier<br>_Example:_ `"walletAccountID"` | Yes |
| merchant | string | The merchant name | Yes |
| mcc | string | The corresponding merchant code | Yes |
| amount | number | Purchase amount | Yes |

#### statusModel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| code | string | Status code returned by the API process<br>_Example:_ `"200.1057.2000"` | Yes |
| message | string | Detailed message<br>_Example:_ `"Success"` | Yes |

#### status

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| status | object |  | Yes |

#### Model8

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| customerID | string | Customer identifier for the owner of the account | Yes |
| accountID | string | Unique identifier for the account sending funds | Yes |
| routingNumber | string | Routing number for external account | Yes |
| externalAccountID | string | Unique identifier for the external account receiving funds | Yes |
| amount | number | Transfer amount | Yes |

#### Model9

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| customerID | string | Customer identifier for the owner of these accounts | Yes |
| toAccountID | string | Unique identifier for the account receiving funds | Yes |
| fromAccountID | string | Unique identifier for the account sending funds | Yes |
| amount | number | Transfer amount | Yes |

#### Model10

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| accountID | string | the account ID | Yes |
| memo | string | Memo string | Yes |

#### Model11

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| accountID | string | the account ID | Yes |
| amount | number | Payment amount | Yes |
| checkNumber | string | The check number - if applicable | No |

#### response

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| transactionID | string | unique transaction identifier | No |
| paymentAmount | number | actual amount paid | No |

#### Model12

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| accountID | string | the account ID | Yes |
| amount | number | Withdrawal amount | Yes |
| checkNumber | string | The check number - if applicable | No |
| party | string | The payer name | Yes |
