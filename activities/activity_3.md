# Activity 3

## Test Doubles - Mock

## Recap of our Acceptance Criteria

- **Given** a `BubbleTeaRequest`
  

- **When** the `BubbleTeaOrderService`'s `createOrderRequest()` method is called with that `BubbleTeaRequest`


- **Then** a `BubbleTeaOrderRequest` is created successfully, and the BubbleTeaOrderRequest is sent over email ✉️

---

### 🔎 Exercise 3.1 - Let's see a Mock in action!

- To recap, the constructor for the [BubbleTeaOrderService](../src/main/java/com/techreturners/bubbleteaordersystem/service/BubbleTeaOrderService.java)
  class needs two parameters (an object of type `SimpleLoggerImpl`, an object of type `BubbleTeaMessenger`).
  

- Now that we have a Dummy object to stand in place of our `SimpleLoggerImpl`, our next step is to find the appropriate
  Test Double type to stand in place of the `BubbleTeaMessenger`.
  
- The Test Double type we will be using to sit in place of the `BubbleTeaMessenger` is a Mock object.

---

## 🔎 Exercise 3.2 - Recap - What is a Mock?

Firstly, let's remind ourselves what a Mock is.

- Can you remember what a Mock means?

<details>
<summary>Click here to see the answer</summary>
<pre>

Mock objects enable you to check (verify) that expected calls and actions have been performed, 
e.g. checking a function/method has been called an expected number of times.

</pre>
</details>

---

#### Why are we using a Mock?

- On the [BubbleTeaOrderService](../src/main/java/com/techreturners/bubbleteaordersystem/service/BubbleTeaOrderService.java),
we send an email on line 32.


- Navigate to the [BubbleTeaMessenger.java](../src/main/java/com/techreturners/bubbleteaordersystem/service/BubbleTeaMessenger.java) file
which contains the `BubbleTeaMessenger` class.
  

- Why do you think we need to utilise a Mock for the `BubbleTeaMessenger` class?

<details>
<summary>Click here to see the answer</summary>
<pre>

- The `sendBubbleTeaOrderRequestEmail` method on line 14 doesn't return anything.

- The `sendBubbleTeaOrderRequestEmail()` method is a command type method.
  
- A Command is a word used to describe methods that don’t have a return value, but they perform an action which changes a system’s state.
  
- There is no way to test if the method worked as expected if nothing is being returned from it.
  
- Also, we don't really want to use the actual `BubbleTeaMessenger` in our unit tests, since we don't
want to be sending actual emails everytime we run our tests.
  
- This is why we can use Mock objects.

</pre>
</details>

---

### 🔎 Exercise 3.3 - 🏊 Deep Diving into Mocks

- Each programming language will have frameworks to enable developers to use out of the box methods to create
  and apply test doubles.
  

- For Java, one useful framework is [Mockito](https://site.mockito.org/).
  

- In the [BubbleTeaOrderServiceTest.java](../src/test/java/BubbleTeaOrderServiceTest.java) file, can you spot which line
creates the Mock for the `BubbleTeaMessenger`?
  
<details>
<summary>Click here to see the answer</summary>
<pre>

//BubbleTeaOrderServiceTest - Line 25

mockMessenger = mock(BubbleTeaMessenger.class);

</pre>
</details>

---

- We now have a Mock object of the `BubbleTeaMessenger` referenced by the reference variable `mockMessenger`.
  

- Thanks to the Mockito framework, we now have access to methods to check (verify) that expected calls and actions have 
  been performed on the `mockMessenger`.


- In the [BubbleTeaOrderServiceTest.java](../src/test/java/BubbleTeaOrderServiceTest.java) file, which line of code
verifies that the `mockMessenger`'s `sendBubbleTeaOrderRequestEmail()` method was called with the `BubbleTeaOrderRequest`?
  
<details>
<summary>Click here to see the answer</summary>
<pre>

// Line 53
verify(mockMessenger).sendBubbleTeaOrderRequestEmail(result);

</pre>
</details>

- We can also verify the number of times the `mockMessenger`'s `sendBubbleTeaOrderRequestEmail()` method was called on
our `mockMessenger`.
  
```

verify(mockMessenger, times(1)).sendBubbleTeaOrderRequestEmail(result);

```

All this means is that we aren't sending out real emails to our users when we run our tests! ✉️

---
### 🥳 Nice one! You finished Activity 3!

You can now head over to [Activity 4 - Test Doubles - Stub](activity_4.md).
