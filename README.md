# RemoteMethodInvocation-Whiteboard
A distributed system application for a shared whiteboard 

Shared-Whiteboard
- Try to improve the design(the look of UI and Text addition or any other functionality you want to include), currently server is just for show, client works on its own. The problem is RMI. I am also working on it.

# Setting up the Project.

Open Intellij.
Goto VCS -> Checkout from Version Control -> Github
Select the Github Repo.

You're done. Intellij will clone the repo and setup the gradle environment (This may take a while!)

### The Project consist of 2 Modules
- Server: To run this module click on Server.java and Ctrl + shift + F10 (This will also make a Run Configuration which can be used later to all CL Arguments)
- Client: To run this module click on Client.java and Ctrl + shift + F10 (This will also make a Run Configuration which can be used later to all CL Arguments)

All the Java code should be added to the respective [client|server]/main/java directories.
Other files like icons, images, etc should be placed in the [client|server]/main/resources folder.

You should avoid Jar dependencies, instead use Gradle.
All the dependencies will go in the module level build.gradle file.
