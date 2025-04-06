# Task-Practice-SQT

The not so distant land of ✨Brainrottingham✨is being considered to be added to the list of the Wonders of the World. Thanks to its brilliant minds, the technological advancements just keep pouring left and right. In order to keep up with all the advancements, Professor Imnot Ateacher decided to invent the one thing others did not dare even think of: the Mobile Phone. To do this, he needs your help! Here are his requirements.

Phone attributes (Mandatory):

String identifier
String version Phone features/add-ons (Optional attributes of the class derived from AFeature)
Battery
Antenna
Compass
Speaker
- My brain is overwhelmed with ideas! Unfortunately our factories can't keep up with the flow of my genius and I keep breaking their production line each time I add/modify the framework of the phone features... (Battery, Antenna, etc.) Is there anything you can do to decouple this dependency so my new ideas and changes for features do not affect the creation/usage of other add-ons? (All features extend the AFeature abstract class)
- We want to use this invention to communicate between each other using our voices, but at far greater distances and without other people eavesdropping on us. I came up with the idea of using a GSMConnection between phones to achieve this. For now, I don't want to be wasting resources needlessly, so let's make sure that we only provide one connection that will be shared by everyone who has a phone. After all, not many people have one, how bad can it be? (The class shall implement the interface IGSMInterface)
- *After some time...* In hindsight, that was a terrible idea... EVERYONE in this town was talking over each other. Tell you what, let's create a provider that can offer different connections: one for URGENT calls, one for PRIORITY and for REGULAR ones. Each connection will be unique in its kin, but at least we will be able to make urgent calls and understand each other...
- The word has spread about my invention! Everyone wants a Phone now, but no two orders are the same... Some clients want a battery, others want a Compass and Speaker and so on. Can you come up with an idea that will allow us to create custom phones based on the client's needs? We have to also make sure that 1. all of them will have at least an identifier and a version; and 2. once they ordered/created the phone, they can't possibly modify it, since we can't send it back to the factory...
- This is madness! Some influencer made a bad review of their phone. He was complaining about the Operating System. Our sales plummeted because of this! Luckily I managed to write a new version of it, but building it from scratch takes a lot of resources and feels like molasses in January... Is there any way in which we can get many instances of the same Operating System without having to wait for the build time? We already have the new version created...
- It seems like I had to develop 2 more versions of this OS... Can we find a solution that will allow everyone to copy very fast whichever version of OS they want?
The solution you write shall:

Identify and properly implement the Design Patterns presented in the Lab/Course/GoF book
Respect SOLID, DRY, KISS and YAGNI principles.
Be Clean
NOT have compiler errors
Choose the implementation variants (Eager or Lazy) that best suit the described scenario. Should the scenario not require a specific implementation, then you are free to choose any of them.
