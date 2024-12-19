Multi-Agent Systems Lab
This project contains a set of ASTRA-based lab tasks, each divided into different parts. These parts demonstrate the development of multi-agent systems and their functionalities using ASTRA language.

Project Structure
The project is divided into multiple parts. Each part contains specific tasks related to building towers and performing agent-based operations using the ASTRA programming language.

Part 1
This part can be executed using the basic Maven command:

python
Copy code
mvn clean compile astra:deploy
Part 2
This part contains two task files:

Maintask4.astra (default)
Mainuptotask3.astra
To run Maintask4, the default setup is provided in the pom.xml file. If you want to run Mainuptotask3, update the <astra.main> property in the pom.xml to point to Mainuptotask3 instead.

To compile and run, use:

python
Copy code
mvn clean compile astra:deploy
Part 3
This part demonstrates simple tower creation. You can execute this part using the same Maven command:

python
Copy code
mvn clean compile astra:deploy
Part 4
This part creates two towers with a gap of 2 seconds between each tower creation using inferences.

To run Part 4:

python
Copy code
mvn clean compile astra:deploy
Part 5
In this part, we extend the functionality to build towers of unlimited height. The agent creates random towers with heights ranging from 2 to 7 and continues building these towers infinitely with a 2-second delay between each construction.

To run Part 5:

python
Copy code
mvn clean compile astra:deploy
Prerequisites
Java JDK 1.8 or later
Maven 3.3+
ASTRA 1.4.0
How to Run
Each part of the project is a Maven-based ASTRA project. To compile and deploy a specific part, navigate to the corresponding directory (e.g., Part1, Part2, etc.) and use the Maven commands mentioned above