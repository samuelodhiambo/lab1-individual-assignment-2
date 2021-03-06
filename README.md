# OOSD LAB 1: Weeks 3-6




## Introduction
This assessment evaluates the following CLOs

- CLO3: Apply the UML design notation as part of the OO development process.
- CLO5: Apply the process of Refactoring to continuously improve a software product.
- CLO6: Apply Design by Contract to produce robust self-verifying software modules.


The following topics are assessed:

- Week 3: Refactoring (Practical)
- Week 4: Design by Contract
- Week 6: Creational Patterns




## Assignment Activities [MANDATORY]

### Task 1: src/main/java/task1 (10 marks)

The `StudentEnrol` class is designed to manage the enrolment of students. Students are allowed to take up to five courses made up of cores and electives selected from the list of cores (`coresOffered`) and electives (`electivesOffered`). There is an additional constraint that no student can be enrolled in more electives than core courses at any time.  

You are required to:
 
 **1.1.** Write the pre and post-conditions (if applicable) for all methods except `display()`
 
 **1.2.** Write the the class invariants. 
 
 **1.3.** Specify invariants, preconditions and post-conditions as comments using the Javdoc annotations `@invariant`, `@pre.condition` and `@post.condition` respectively (in the spaces provided). You may use the notation `OLD.cores` in the post-conditions to refer to the original value for cores.    




### Task 2: src/main/java/task2 (15 marks)

You are required to:

**2.1.** In the code located on `src/main/java/task2` the classes have a number of common features. You are required to apply _extract superclass_ refactoring and write the resulting code. You may use protected instance variables if appropriate.

**2.2.** In the same folder, there is a `Answers.md` file. Write in that file the answers to the following questions:

  * 2.2.A: Name at least 3 smells that you identified BEFORE making the change of point 2.1. Is there any specific smell that is solved with the extract superclass? _No less than 300 words_.
  
  * 2.2.B: Mention other refactorings that you did when you _extracted the superclass_. Were these refactorings needed for the _extract superclass_? Why? Could you have used _extract interface_ instead? _No less than 200 words_.




### Task 3: src/main/java/task3 (10 marks)

Write your answers to the following questions in `task3/Answers.md`:

**3.1.** What creational pattern is being used in `PrintSpooler`? Is it correctly implemented? Why or Why not? Could you implement it differently? Justify accordingly. 

**3.2** Not all Builders must construct visual objects. What might you use a Builder to construct? Why? Find a real-world example and explain why it is correct using it there. Your answer your have at least 500 words _without_ the code snippet.

**3.3.** If you are writing a program to track investments (namely: stocks, bonds, metal futures, derivatives, etc.), how might you use an _abstract factory_? Why? Complement your answer with a Class Diagram. You _must_ add it to the Answer file using markdown. Save it inside the `task3` folder.





## Rubric

Please, check the rubric detailed in Canvas.