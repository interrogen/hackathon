## Technical Resources

A collection of technical resources to help you develop your own solutions based on the U.S. Bank Innovation APIs.

#### Postman Collection
The Postman collection contains examples for all of the methods within the suite of U.S. Bank Innovation APIs being used for the hackathon.

The accompanying *environment* file contains all of the endpoints. However, you will need to add specific values corresponding to your own unique data sets.

For additional information, please see:
- [Using Postman files](https://interrogen.github.io/hackathon/APIs/using_postman.html)
- [Using authentication](https://interrogen.github.io/hackathon/APIs/security.html)

## Sample Code
Code snippets in different languages

### Api Interaction Code Samples

Here you can find some code snippets for Python and Java on how to set up your code to pull data from an API
using headers and auth tokens.

If you have any questions about this reach out to me or one of the mentors at the hackathon.

Please note that the authorization token does not work but to showcase where one would go when building your API call.

### Java Sample

Open the Java folder in an IDE of your choice.  The Java project is managed by Maven and a `mvn compile` will pull all the
needed dependencies for you to work on.

#### Other Notes

* The `GitHub.java` file has a better pattern to use for your API call.
* The `CatFact.java` file works but it's an anti-pattern.

### Python Example

The two Python files showcase the same pattern for calling an API with headers needed and a way without headers.
I am using the **requests** library for both of them, so once you've created your virtual environment and activated it
you can simply run `pip install -r requirements.txt` to get all the libraries I've used in this example.  Otherwise for your
project `pip install requests` will work.

### Node Example

In both examples I'm using the **axios** library to help build my request.  To run this project locally, just run `npm install` to
have node install the needed libraries.  To use this in your own library, make sure to run `npm install axios`.

### .NET (C#)

In this example I've showcased the same examples as above.  One with headers and one without headers.  This is using .NET 6
and should work across all platforms.  I'm using NewtonSoft Json to help parse the data.  To install this nuget package,
run the command `dotnet add package Newtonsoft.Json` in the terminal


### PHP Example

The recommended way to consume APIs in PHP is using the Guzzle HTTP client. To use it, first add it as a dependency in composer.

```php
composer require guzzlehttp/guzzle:^7.0
```

Next, follow the example in php/src/guzzle-example.php.
#### Notes

These examples are merely guides to help you get started.  There are much better ways to handle your calls and handle the data
that you want to send/consume.
