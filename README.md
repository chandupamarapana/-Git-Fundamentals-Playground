# -Git-Fundamentals-Playground
This repository serves as a hands-on learning environment of the foundational concepts of Git version control.

What is version control?

version control is the practice of tracking and managing changes to software code. Version control systems are software tools that help software teams manage changes to source code over time. 

What is Git?

Git is a distributed version control system (VCS) that helps developers track changes in source code during software developement. It allows multiple developers to work on a project simultaneously without interfering with each other's work. 

why is git important ?

collaboration - it enables multiple developers to work on the same project simultaneously, 

version Control- Git tracks changes to the codebase, allowing you to revert to previous versions if necessory 

Branching and Merging - branches can be created to work on new features or fixes seperately from the main codebase and merge them back when ready 

backup - having a distributed system means that every developer has a complete copy of the repository, reducing the risk of data loss 

history and documentation - Git maintain a detailed history of changes, which is useful for understanding how and why the codebase is evolved over time. 

what if we did not have git ?

collaboration challengers - multiple developers workong on the same codebase can easily overwrite each others changes, leading to conflicts and loss of work 

lack of history - You wont have a detailed history of changes, making it difficult to understand the evolution of the codebase or revert to previous versions.

error Recovery - mistakes or bugs in the code can be hard to track down and fix without the ability to revert to previous versions 

inefficient workflows- manual processes for code review, testing

what is branching , Why is branching used ?

branching in git is the process of creating a seperate line of development within a repository. A branch allows you to isolate your work from the main line of development and start an independent line of development. 

branching is used for 
1) feature Development - developers can work on new features in seperate branches without disturbing the main codebase.

2) bug fixes - fixes can be made in isolated branches and merged back into the main codebase once they are verified.
3) Experimentation - Developers can experiment with new ideas ina branch, and if doesnt work out, the beanch can be discarded without affecting the main codebase.
4) parallel Development - Multiple developers can work on different tasks simultaneously without interfering with other's work.

what is a commit , why is it important - Commit is a Git snapshot of your repository at a specific point in time. Each commit records changes to the repository and includes a unique identifier(Hash), a commit message, author information and a timestamp 

commits are important because, 
1) Version history - Commits create a historical record of the project, allowing you to see what changes were made, when and by whom.
2) Reverting change - If a bug is introduces, you can revert to a previous commit where the code was stable.
3) Collaboration - commits allows multiple developers to contribute to the project while keeping track to the individual chanegs

Why is there a Build in jenkins from commit to commit 

Jenkins is a continous Intergration (CI) tool that automates the process of building and testing your code

Every commit triggers a build process to intergrate changes continously, ensuring that the codebase is always in a deployable state . 

Automated testing - builds often includes automated tests that verify the new changes that dont introduce bugs or break existing functionality 

Now lets edit this Repository 

 We must clone this repository in our local computer 
1) Go to the folder where we want to clone the Repository
2) Open git bash in that path
3) Type this command, 
  git clone <repository-url>
4) to create a new branch
  git checkout -b ＜new-branch＞
5) after making the changes to the code stage the changes using git add .
6) after the commit the changes with an appropriate commit message
 git commit -m "Add initial Java code"
7) after that we must push the changes to the remote branch from the local branch for that we use git push
   git push origin <branch-name>


   
  
