# kincarta-challenge

1) I modified the original proposed BDD structure to give a bit more clarity to the Spec File.
Also I changed the search from "Alexa" to "laptop" since most of "Alexa" first results related products are out of stock. So they cannot be added to the cart, which is the intention of the test.

2) There are many ways to resolve this or different complexity levels. For the challenge I just checked that when the user clicks on the Add-To-Cart button the slider opens and there is a sucessful message.
We could also checking the checking the cart-icon, checkmark-icon, the checkout page, etc. It is a matter of adding more code.

3) Regarding the driver there could be more sophisticated (or easier) implementations, such as share context (and driver) between steps using dependency injection but for the excerise this is enough.
I just made a Manager to avoid repeating code in the step files.

4) I used Edge as driver as there was no browser required. I usually use Chrome but I've just set up an very old laptop with a new copy of windows 10 and I used the default browser to not overload it.
Funny story: I can say setting up the laptop was the most challenging of all since it originally had Windows XP in 2008 :p.