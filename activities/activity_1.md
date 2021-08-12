# Activity 1

## 🗺 Exploration

## 🔎 Exercise 1.1 - Exploring the Code

For this exercise, spend some time familarising yourself with the code.
  
- Part of your journey to becoming a great Software Engineer
  is being able to read and understand code, as well as writing it.
- As children, we learn to read and speak in a language while we're learning how
  to write it; the same can be said about Software Engineering.

- 📖 Flex those reading muscles! 💪

- 💡 Top Tip: Try looking at the [README](../README.md) file first.
  Diagramming / sketching things out can be a handy way of
visualising a codebase that you haven't seen before. It can help you
  focus on the key information rather than getting lost in the details
  too soon.
  
---

## 🔎 Exercise 1.2 - Questions

- In the [test](../src/test) folder, can you identify the name of the file
  that contains the class that represents the test double type, 'Dummy'?

<details>
<summary>Click here to see the answer</summary>
<pre>

DummySimpleLogger.java

</pre>
</details>

---

- In the [test](../src/test) folder, can you identify the name of the file
  that contains the class that represents the test double type, 'Stub'?

<details>
<summary>Click here to see the answer</summary>
<pre>

RandomStub.java

</pre>
</details>

---

- Look at the [BubbleTeaOrderService](../src/main/java/com/techreturners/bubbleteaordersystem/service/BubbleTeaOrderService.java)
  class. What two dependencies are being injected into the constructor?

<details>
<summary>Click here to see the answer</summary>
<pre>

- An object of type `SimpleLoggerImpl`
- An object of type `BubbleTeaMessenger`

</pre>
</details>

---

- What types of Bubble Tea does the [BubbleTeaTypeEnum](../src/main/java/com/techreturners/bubbleteaordersystem/model/BubbleTeaTypeEnum.java) have?

<details>
<summary>Click here to see the answer</summary>
<pre>

OolongMilkTea 
JasmineMilkTea
MatchaMilkTea
PeachIceTea
LycheeIceTea

</pre>
</details>

---

### 🥳 Yay! Next Steps

You can now head over to [Activity 2 - Test Doubles - Dummy](activity_2.md).
Remember to take a break though 🍵!
