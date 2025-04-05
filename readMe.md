### refer：
https://cucumber.io/docs/guides/browser-automation

Update the is_it_friday_yet.feature file.
Notice how we go from `Scenario` to `Scenario Outline` when we start using multiple `Examples`.

### 测试用例执行
- 执行顺序
- parallel execution
- multithrea execution
  - single api
  - case scenario
- 执行优先级
- 批量执行
- test report
- cicd





### parameterization
open browser
navigate to login page
enter user in username box
enter pw in password bo
click button
verify user navigates to home page

![img.png](img.png)
locator
![img_1.png](img_1.png)
- findElement(By.id())
- findElement(By.name())
- css
- xpath
- tagName
- linkText
- partialLinkText
- etc


### how to create xpath
> syntax
`//tagname[@attribute='value']`
eg: `//*[@id='primary']`
> method
- contains
- text()
- starts-with
- or, and
```aidl
//a[text()="Forgot?"]
//a[contains(text(), 'Forgot')]
//*[@name='name'][@type='email'
//表单signin 里面的password框
//div[@id='signin']   //*[@name='j_password'][@type='password'] 
//ul[@class='dropdown-menu']/li[3]
//*[@id="signin"] //div[contains(@class, 'visible-md')] //button[text()='Sign In'] 

```

#### tools:
- eskry
- chropath
-


### selenium page factory
POM - page object model
