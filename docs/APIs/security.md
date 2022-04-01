### U.S. Bank Innovation Developer Portal
![US Bank](../event/img/US_Bank_logo.png)

#### API Security
Different types of security are available:
- Basic Auth (user ID, password)
- API Keys (unique generated values)
- OAuth (secondary system verifies user, provides token)

The U.S. Bank hackathon APIs use Basic Auth which leverages the keys that you obtained when creating a project within the developer portal. (This process is described [here](../portal/getAPIKey.md)).

This information is included in the header of your API request.
- Username = *Your Unique API Key*
- Password = *Your Unique API Secret*

>Image from Postman

Example of a code snippet

`Code sample`
