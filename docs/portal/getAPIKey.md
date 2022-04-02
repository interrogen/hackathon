### U.S. Bank Innovation Developer Portal
![US Bank](../event/img/US_Bank_logo.png)

### Using the APIs - API Keys
In order utilize the APIs that are exposed through the developer portal, you will need to obtain an **API key**. This is a unique key code generated for you and will be used to authentication when calling a secure API.

The process for obtaining a key involves the creation of a project on the portal (which will generate an API key). Then, you link your project to other APIs which basically provisions them to your account.

- [Creating a project](#creating)
- [Viewing your API credentials](#viewing)
- [Adding more APIs to a project Project](#adding)

#### Creating a project {#creating}

The process for creating a project is done through the API products which are accessible from the title bar.

![API Products](./img/APIProducts.png)

**Step 1:** Select one of the APIs from the drop down menu for the *Innovation API Products*. In this case, we will choose the *Reference API*.

![Reference API](./img/ReferenceAPIMain.png)

**Step 2:** Click the *Add to project* button which will open up a modal dialog box.

![Add Project](./img/AddProjectDialog.png)

**Step 3:** Complete the new project form. You will also need to provide a URL (though it is not actually used at this time).

Then press the *Save* button.

![Project Form](./img/AddProjectDone.png)

This will bring you to a new page where you can see the details about the project that you just created.

![Project Created](./img/ProjectCreated.png)

#### Viewing your API credentials {#viewing}
The values for your API credentials are initially obfuscated but you can see them by clicking the *Show* link (in the above screen).

>Note: Use the *Copy* link in order to copy your exact credentials - and avoid accidentally missing a character or two.

![API Keys](./img/APIKeys.png)

**Alternative method:** If you want to view your existing projects and credentials later, go to the main menu and click on the triangle next to your user name.

Select *Credentials*.

![User Dropdown](./img/UserDropdown.png)

This will bring you to a list of all of your current projects.

![Project List](./img/ProjectList.png)

Select *View* next to the project that you want to see.

>Note: You can also create a new project from this screen. You will be required to select one API product to associate with your project. Otherwise, the process is identical to the one described above.

#### Adding more API products to your project {#adding}
In general, you will want to add all of the APIs to your project so that you can use the same API credentials within your application. There are two ways to do this.

**Method 1:**

In order to do this, you will need to go to each API product page and add it manually to your project. This is similar to the method to create a project.

Simply select the *Existing* radio button and then choose your project from the dropdown menu.

![Add Project](./img/AddExisting.png)

>Note: If your project is not available, then the check to see if the API product has already been added.


**Method 2:**
You can also API products from the Project detail page (accessible via the *Credentials* option under the User menu on the main page).

**Step 1:** Select *Add product* button on the bottom of the Project details page.

![Project Details](./img/ProjectDetails.png)

**Step 2:** Select the specific API product from the dropdown menu.

In this example, we are adding the *Core Banking API*


![Add API](./img/AddAPIDialog.png)

Upon submitting the request, you will see that the new API product has been added to your project.

![Complete Project](./img/ProjectAfterAdd.png)

You can repeat steps 1-2 to add all of the API products to your project.
