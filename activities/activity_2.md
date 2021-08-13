# Activity 2

## Test Doubles - Dummy

## 🔎 Exercise 2.1 - What are we testing for?


#### Can you remember what Arrange, Act, Assert means as a testing structure?

<details>
<summary>Click here to see the answer</summary>
<pre>

Arrange, Act, Assert is a useful structure to help you plan and write your tests.

#### Arrange
- Arranging any test data and objects you might need to run your unit test

#### Act
- This is your action, what you do to run your code to produce a result i.e. calling your method

#### Assert
- What you’re expecting to see i.e. what your function should(!) return
- The assertion compares your actual result vs. your expected result

</pre>
</details>

---

### What are we testing for?

- When we're figuring out what we would like to test, we start with what we are checking for,
  i.e. our assertion.
  
  
- Navigate to the [BubbleTeaOrderServiceTest.java](../src/test/java/BubbleTeaOrderServiceTest.java) file.
  

- Our System Under Test (SUT) is the `BubbleTeaOrderService`. This is the thing we are focusing on for our unit test.


- We would like to test that the `BubbleTeaOrderService` is working as expected. More specifically,
we would like a unit test to check that:
  
  - **Given** a `BubbleTeaRequest`
  - **When** the `BubbleTeaOrderService`'s `createOrderRequest()` method is called with that `BubbleTeaRequest`
  - **Then** a `BubbleTeaOrderRequest` is created successfully, and the BubbleTeaOrderRequest is sent over email ✉️
  
```
💡Top Tip!

Given, When, Then is an approach of writing business acceptance criteria.
It is helpful to specify the conditions we can check something against to ensure it has met some requirements.

```

- The acceptance criteria is captured by the test method called `shouldCreateBubbleTeaOrderRequestWhenCreateOrderRequestIsCalled()`

---

### What do we need for our test?

Here's a summary of what we need to do for Arrange, Act, Assert:

- **Assert**
  - Check that the result we get from calling the `BubbleTeaOrderService`'s `createOrderRequest` method 
produces the expected `BubbleTeaOrderRequest`.
  

- **Act** 
  - Call the `BubbleTeaOrderService`'s `createOrderRequest` method with a `BubbleTeaRequest`


- **Arrange** 
  - Set up the `BubbleTeaOrderService` along with the objects required to make a `BubbleTeaRequest` we can
  use for testing


---

## 🔎 Exercise 2.2 - Recap - What is a Dummy?

Firstly, let's remind ourselves what a Dummy is.

- Can you remember what a Dummy means?

<details>
<summary>Click here to see the answer</summary>
<pre>

It is an object that is there to make the code run, it doesn’t do anything.
Dummies can be used in place of when you’re trying to pass parameters into your function/object.

</pre>
</details>

---

## 🔎 Exercise 2.3 - Let's see a Dummy in action!

### 💭 Let's break it down!

- In the production code, the constructor for the [BubbleTeaOrderService](../src/main/java/com/techreturners/bubbleteaordersystem/service/BubbleTeaOrderService.java)
  class needs two parameters (an object of type `SimpleLoggerImpl`, an object of type `BubbleTeaMessenger`).
  
#### 🤔 Why is this important to know?

- Since our System Under Test (SUT), i.e. the thing we are focusing on for our unit test,
  is the [BubbleTeaOrderService](../src/main/java/com/techreturners/bubbleteaordersystem/service/BubbleTeaOrderService.java), we would like to use Test Doubles as pretend objects to
  stand in place of the real [SimpleLoggerImpl](../src/main/java/com/techreturners/bubbleteaordersystem/model/SimpleLoggerImpl.java) and
  [BubbleTeaMessenger](../src/main/java/com/techreturners/bubbleteaordersystem/service/BubbleTeaMessenger.java) objects for testing purposes.
  

- This is because we want to **isolate the [BubbleTeaOrderService](../src/main/java/com/techreturners/bubbleteaordersystem/service/BubbleTeaOrderService.java) from its dependencies.**
  

- Since the dependencies are external, we don’t have control on what this outside system might do. We want to make sure
our SUT is working as a component of our codebase.
  
---

#### What is the approach taken here?

- This is where you'll find a lot of discussion in the industry on how to test. Aside from the jargon and theory behind it, the main
point is that you understand what is needed to test against your acceptance criteria.


- For demonstration purposes, we've chosen to use a Dummy to substitute in place of the `SimpleLoggerImpl`. 
  

- In [Activity 1](activity_1.md), we identified the `DummySimpleLogger`
as a Dummy.
  
---

#### 👀 Let's trace through how this works!

- Navigate to the [BubbleTeaOrderServiceTest.java](../src/test/java/BubbleTeaOrderServiceTest.java) file.


- Can you identify the line of code where the `dummySimpleLogger` is being created?

<details>
<summary>Click here to see the answer</summary>
<pre>

//BubbleTeaOrderServiceTest - Line 24

dummySimpleLogger = new DummySimpleLogger();

</pre>
</details>

---

- Can you identify the line of code where the `dummySimpleLogger` is passed as an 
argument to the `BubbleTeaOrderService` constructor?

<details>
<summary>Click here to see the answer</summary>
<pre>

//BubbleTeaOrderServiceTest - Line 26

bubbleTeaOrderService = new BubbleTeaOrderService(dummySimpleLogger, mockMessenger);

👉 The `dummySimpleLogger` is a Dummy that's solely there to stand in for the `SimpleLoggerImpl` parameter.

</pre>
</details>

---

- Open up and explore the [DummySimpleLogger](../src/test/java/testhelper/DummySimpleLogger.java).


- In your own words can you describe what the `DummySimpleLogger` is doing?

<details>
<summary>Click here to see a summary</summary>
<pre>

The `DummySimpleLogger` implements the `SimpleLoggerImpl` interface.
It has a `addLoggingText` method.
You can see that it isn't doing anything with the method.

</pre>
</details>

---
### 🥳 Yippee! You finished Activity 2!

You can now head over to [Activity 3 - Test Doubles - Mock](activity_3.md).
Remember to take a break though 🍵!
