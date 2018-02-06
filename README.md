# SOLID Principles ![badge-education](https://img.shields.io/badge/objective-education-red.svg) ![badge-education](https://img.shields.io/badge/syntax-markdown-blue.svg)

This project get code from <https://github.com/mikeknep/SOLID>, For **education** only.
I recommend you to read this manual inside [Github](https://github.com/kamontat/SOLID) website for better view.

## Description

### [Dependency Inversion](./src/com/kamontat/dependency_inversion)

> In high-level modules should not depend on low-level modules.

As you see in bad design, Inside [WeatherTracker](./src/com/kamontat/dependency_inversion/bad/src/WeatherTracker.java) class have [Phone](./src/com/kamontat/dependency_inversion/bad/src/Phone.java) and [Emailer](./src/com/kamontat/dependency_inversion/bad/src/Emailer.java) class, which bad design because if I try to create new receiver like `SMS` class, I need to modify code 2 place (in `SMS.java` and `WeatherTracker.java`). To fix this issue, in good code it use [Notifier](./src/com/kamontat/dependency_inversion/good/src/Notifier.java) which contain action method if it receive message. Now instead of have client code ([Phone](./src/com/kamontat/dependency_inversion/bad/src/Phone.java) and [Emailer](./src/com/kamontat/dependency_inversion/bad/src/Emailer.java)) inside server code ([WeatherTracker](./src/com/kamontat/dependency_inversion/bad/src/WeatherTracker.java)), we use [Notifier](./src/com/kamontat/dependency_inversion/good/src/Notifier.java) pass as parameter to notify. So that [Notifier](./src/com/kamontat/dependency_inversion/good/src/Notifier.java) became to `interface` that allow another class to implement it.

### [Interface Segregation](./src/com/kamontat/interface_segregation)

> Clients should not be forced to depend on any interfaces they do not use.

For example of this is [Bird](./src/com/kamontat/interface_segregation/bad/src/Bird.java) class, The bad design will auto appear since no all of bird can fly so like in the bad code design [Eagle](./src/com/kamontat/interface_segregation/bad/src/Eagle.java) and [Penguin](./src/com/kamontat/interface_segregation/bad/src/Penguin.java) that in [Penguin](./src/com/kamontat/interface_segregation/bad/src/Penguin.java) fly method throw [UnsupportedOperationException](https://docs.oracle.com/javase/7/docs/api/java/lang/UnsupportedOperationException.html). In new design ([the good one](./src/com/kamontat/interface_segregation/good/src)) it separate all of action as new interface.

For example:

- [FlyingCreature](./src/com/kamontat/interface_segregation/good/src/FlyingCreature.java)
- [FeatheredCreature](./src/com/kamontat/interface_segregation/good/src/FeatheredCreature.java)
- [SwimmingCreature](./src/com/kamontat/interface_segregation/good/src/SwimmingCreature.java)

## Images

![run-result](./images/run-result.png)

## Creator

Kamontat Chantrachirathumrong 5810546552