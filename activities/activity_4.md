# Activity 4

## Test Doubles - Stub

### 🔎 Exercise 4.1 - Recap - What is a Stub?

Firstly, let's remind ourselves what a Stub is.

- Can you remember what a Stub means?

<details>
<summary>Click here to see the answer</summary>
<pre>

An object designed with methods returning hardcoded/pre-defined responses.
We replace the real-life functionality to provide the values we need for testing purposes.

</pre>
</details>

- In a similar train of thought, when say 'stubbed method', or a 'method has been stubbed',
  we mean that we have forced the return values of the method, so it is returning some pre-defined response.
  
---

### 🔎 Exercise 4.2 - Let's see the Stub in action!

- Head over to the [BubbleTeaRouletteService](../src/main/java/com/techreturners/bubbleteaordersystem/service/BubbleTeaRouletteService.java).

- `getRandomBubbleTeaType` method returns a random type of bubble tea from those available on the `BubbleTeaTypeEnum`.

#### 🤔 Why is this important to know?

- 😬 Oh no! There's an issue here, if the `getRandomBubbleTeaType` is random, we're in a bit of a pickle.
  

- For our testing, we want to make sure we get the same type of Bubble Tea every time we run our test
  (i.e. it's deterministic); however since the method chooses one at random,
  we have no way of ensuring if the method returns a type of Bubble Tea correctly.
  
- A way to resolve this is to use a Stub.
  
---

#### 🗺 Explore the `RandomStub`

- On [RandomStub](../src/test/java/testhelper/RandomStub.java), we control the return value of the `nextInt` method
using a pre-defined integer value.
  
TODO: KD to add a before and after here to show how the Random is stubbed (exercise)
  

- Navigate to the [BubbleTeaRouletteServiceTest](../src/test/java/BubbleTeaRouletteServiceTest.java) file.


- Can you add another unit test so that the `getRandomBubbleTeaType()` method is stubbed to return
`PeachIceTea`?

<details>
<summary>Click here to see a solution</summary>
<pre>

    @Test
    public void shouldGenerateARandomBubbleTeaTypePeachIceTeaWhenGetRandomBubbleTeaTypeIsCalled() {

        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnum.PeachIceTea.ordinal());
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.PeachIceTea;

        //Assert
        assertEquals(expectedResult, actualResult);

    }

</pre>
</details>

---
### 🥳 Wow! You finished Activity 4! The next activity is the final activity!

You can now head over to [Activity 5 - Test Doubles - Spy](activity_5.md).
