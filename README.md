# TAF-WALLETHUB

![Logo](https://www.insart.com/wp-content/uploads/WalletHub.png)

## Author

- [YANA DANKO ](https://github.com/ydanko)

## Position: Senior Automation QA Engineer (Remote) at WalletHub


## ASSIGNMENT #1:


1. Login to Facebook Username and Password should be on a variable we can change
2. Post a status message “Hello World”

## SOLUTION:

**It's not recommended to log into sites like Gmail and Facebook using WebDriver** because it's against their usage terms and is slow and unreliable. It's better to use the APIs provided by these sites for speed, reliability, and stability. Logging in with WebDriver can make your tests longer and more fragile. W3C conformant WebDriver implementations annotate the navigator object to mitigate Denial of Service attacks.

Gmail, email and Facebook logins [Selenium Documentation](https://www.selenium.dev/documentation/test_practices/discouraged/gmail_email_and_facebook_logins/)

## ASSIGNMENT #2:

Create a light user account in [URL](https://wallethub.com/join/light)  and uncheck the checkbox to get your free credit score and report. This is the account you should be using for this test. Then simulate the following actions:
1. Go to this [URL](https://wallethub.com/profile/13732055i)

2. On the reviews section of the page, hover over the stars and click on the fourth star. Your code should actually (a) do the hover and (b) make sure the stars inside get lit up when you hover over them, then (c) click on the fourth star. Simply redirecting the WebDriver to the next page isn’t an option.

3. On the page you get redirected to, click on the Policy dropdown and change the value to
   “Health Insurance”

4. Click on the link “Write a review" and write some random text (minimum of 200 characters).
5. Press submit

6. If you are successful, you should see a confirmation screen saying you have reviewed the
   institution. You then have to go to your profile and confirm that the “review feed” got updated

7. Go to [URL](https://wallethub.com/profile/) and assert that you can see the review.

## SOLUTION:


### 1.Tech Stack

**- Testing Tools & Technologies:** Selenium, TestNG, Allure Report, Log4j

**- Programming Languages:** Java

**- Build Tool:** Gradle

### 2.Environment Variables


To run this project, you will need to add the following environment variables to your .properties file

`db.login`

`db.password`


### 3.Running Tests

To run tests, run the following command

```bash
  gradle task testSmoke
```




## Feedback

If you have any feedback, please reach out to us at dankoyanka@gmail.com 