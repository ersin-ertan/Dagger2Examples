#### TLDR; Everything is pretty old except for androiddagger2 module, where I take a look at greg kick's second talk on the more advanced features of dagger, I consider this to be the most clearest representation of how it works, however you may benefit from seeing my code-thought process/errors/notes along the way via the older modules.

Culmination of projects by other members, the app module was my first attempts xx months ago.

Other modules are part of the learning process that range from simple to complex, some involve different architectural pattern which could throw off developers who have not worked within that system, thus it is recommended to study the topics individually prior to bringing them together.

Almost all modules lead up to practice02 which tries to cover as much of the api as possible.

practice03 covers the question of multi scoped object from nested components, using both @Provides and an @Inject constructor to return instances.

See [activity graphs png](https://raw.githubusercontent.com/ersin-ertan/Dagger2Examples/master/activitygraphs/Dagger2ActivityGraphs.png) for a detailed visualization.
but please note that it should be used initially to understand the object, component, module, relationship, and not so much about getting objects, and exposing objects and injecting and component construction and class extension, as most of these concerns are documented within practice02.

For more references, but not necessarily better ones, goto [my android blog post](http://ersinandroid.blogspot.ca/2015/01/dagger-2-preliminary-notes-part-1.html) which provides a link to my java blog post describing DI in general for java, then continue reading the android ones. Do not expect posts to be that helpful, as they are simply an aggregation of condensed regurgitations from other sources and are personally directed.

Also note that some practice projects improperly inject the activity in to the app component instead of the the activity components, this was realized at practice04.

This source is currently my best documentation, once past the initial conceptualization.
I may/or not present the concepts simply and thoroughly in the future, pending on my motivations and other projects that are engaging.


![Activity Graphs](https://raw.githubusercontent.com/ersin-ertan/Dagger2Examples/master/activitygraphs/Dagger2ActivityGraphs.png "Object-Module-Component")
