# abstractfactorypattern
Lets assume I have two juice factories SevenDays that produce only juice with Banana and  Sochniy brand for Coconut juice (you can call it mild). Due to the high completion, I decided to extend the line. For example: CoconutStrawberry/CoconutGrape and BananaStrawberry/BananaGrape.
So: in order for our workers not to forget about the new lines that we are going to produce:
We create Juice Factory Interface and realize there Grape and Strawberry
Accordingly, in the child classes of the Juice Factory interface, these methods must also be implemented.
Note that the type of the returned value in the methods will be exactly the type common to the returned values - grape and strawberry
As you can easily guess from the above code, we should have some entities in the program that describe specific body types - grape and strawberry
Such entities will be interfaces.
And of course, these recipes’ must have a concrete embodiment in the form of juice created at a particular factory.
That's all, our "factory of factories" capable of producing juice of any brand and any type is ready
