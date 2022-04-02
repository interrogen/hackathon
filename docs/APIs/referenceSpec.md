# Banking Node Reference Environment

Last updated June 29, 2021

**OVERVIEW**

Provide access to both U.S. Bank common product definitions and industry standard *Merchant Category Codes*. These reference APIs are utilities for obtaining read-only information for use with other APIs.

A *Merchant Category Code* (MCC) is a four-digit code assigned by the major credit card networks (Visa, Mastercard, American Express and Discover) to every business that applies to accept credit cards. This code indicates the nature of the merchant's business (e.g. Airlines and Airline Carriers, Veterinary Sciences, Hardware Stores, etc.) They have become the standard for categorizing card purchases based on industry.

**FEATURES**

- Provides complete details of Merchant Category Codes
  - Able to look up MCC definition by code.
  - Able to find all related MCC values by searching with a key word (e.g. Restaurant)
  - Retrieve the complete list of all MCC values
- Provides a list of U.S. Bank products.

## Version: 1.0.0

**Contact information:**  
U.S. Bank API Support  
apisupport@usbank.com  

**License:** [Subject to U.S. Bank Developer Portal Terms of Use.  © 2021 U.S. Bank](https://hacktotrack-innovation.usbank.com/terms)

[U.S. Bank API Developer Portal](https://hacktotrack-innovation.usbank.com)
### /products

#### GET
##### Summary

Provides a list of main banking products.

##### Description

This method returns a JSON object with all known account products and their descriptions.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Product list |
| 400 | Invalid Request |
| 500 | System Error |

### /code/{mcc}

#### GET
##### Summary

Returns the description of a Merchant Category Code based on the supplied mcc value.

##### Description

This is method is useful to determine the category of a given purchase. An error is returned if no matching MCC is found.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| mcc | path | The MCC code to lookup - must be four digits | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Merchant Code |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### /codes/all

#### GET
##### Summary

Provides a complete list of all known MCC codes.

##### Description

This method returns a JSON object with all known Merchant Category Codes and their descriptions.

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Merchant codes |
| 400 | Invalid Request |
| 500 | System Error |

### /codes/search

#### GET
##### Summary

Searches merchant code repository based on input criteria.

##### Description

This method returns an array of MCC codes that match the search criteria

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| Accept | header | Indicates the acceptable response format of 'application/json' | Yes | string |
| Authorization | header | Basic authentication of base64 encoded key:secret including semi-colon | Yes | string |
| desc | query | A partial keyword to search | Yes | string |

##### Responses

| Code | Description |
| ---- | ----------- |
| 200 | Merchant Code |
| 400 | Invalid Request |
| 404 | Record not found |
| 500 | System Error |

### Models

#### product

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| accountType | string | Brief account type<br>_Example:_ `"SAVINGS"` | Yes |
| productCode | string | Three character alpha-numeric code identifying a specific banking product<br>_Example:_ `"DDA"` | Yes |
| description | string | Description of banking product<br>_Example:_ `"Savings"` | Yes |
| balanceType | string | Enum:[ASSET,LIABILITY]<br>_Example:_ `"ASSET"` | Yes |

#### productList

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| productList | array |  |  |

#### products

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| products | [ object ] |  | No |

#### detail

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| attributeName | string | attribute name<br>_Example:_ `"code"` | Yes |
| reason | string | reason why error occurred<br>_Example:_ `"Invalid format"` | No |

#### details

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| details | array |  |  |

#### error

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| code | string | Code associated to the specific error that can be used to trace error condition back to log information<br>_Example:_ `"400.1057.2000"` | Yes |
| message | string | Text message indicating information about error<br>_Example:_ `"Bad or Malformed Request"` | Yes |
| details | [ object ] |  | No |

#### Model1

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| error | object |  | Yes |

#### Model2

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| error | object |  | No |

#### mcc

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| mcc | string | Merchant Category Code<br>_Example:_ `"5300"` | Yes |
| edited_description | string | Common description<br>_Example:_ `"Wholesale Clubs"` | Yes |
| combined_description | string | Common description<br>_Example:_ `"Wholesale Clubs"` | Yes |
| usda_description | string | Applicable to US Department of Agriculture<br>_Example:_ `"Wholesale Clubs"` | Yes |
| irs_description | string | IRS-specific description<br>_Example:_ `"Wholesale Clubs"` | Yes |
| irs_reportable | string | Indicates if these purchases must be reported<br>_Example:_ `"Wholesale Clubs"` | Yes |
| id | number | Internal index | Yes |

#### code

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| code | object |  | No |

#### codes

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| codes | object |  | No |
