## The Hackathon APIs
![US Bank](../event/img/US_Bank_logo.png)

This section will provide important technical details about the U.S. Bank APIs as well as useful tools that can be leveraged when working with these APIs.

This includes:
- Explanation of how to best use the APIs
- Details of test data parameters
- Postman files and environment
- Sample code snippets
- Detailed technical specifications (i.e. swagger files) are located on the Hackathon portal

We have four APIs that collectively create a **Bank in a Box**. They emulate the backend of a financial institution and allow you to interact with banking accounts and perform normal transactions.


| Hackathon | API Name | Description |
| ----------- | --- | ----------- |
|![Core Banking](./img/CoreIcon.png) | **[Core_Banking_API](./core.md)** | Allow your users to review past transactions with the Core Banking API. You can retrieve a user's transaction history for a number of U.S. Bank products, including checking, savings, and different credit products |
| ![Money Movement](./img/MoneyIcon.png) | **[Money_Movement](./money.md)** | The Money Movement API suite allows one to perform a variety of financial transactions into and out of different synthetic accounts to emulate real customer behavior: paying bills, depositing checks, purchasing items, etc |
| ![Virtual Card](./img/CAASIcon.png) | **[CaaS_API](./caas.md)** | Allow a company administrator to manage its portfolio of virtual cards. It includes the ability to assign cards and review card usage |
| ![Reference](./img/ReferenceIcon.png) | **[Reference_API](./reference.md)** | This API provides methods to look up both the definitions of Merchant Category Codes and popular U.S. Bank product types. |

#### Additional Resources
- Setting up API Security
- Using the U.S. Bank Innovation developer portal
  - [Exploring the portal](../portal/explore.md)
- using the Postman files
