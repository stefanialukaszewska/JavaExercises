Storage exercise using generics and abstract class - quick and simple example 

The idea is that we can create the storage for a certain type of item, like clothing, 
naming an object ,for example, tshirt, give it a fuller name in a constructor, like 'Black Plain T-Shirt', 
give it a clothing type - 'Top' and its category like kids/adults. 

While creating a storage, we provide its max capacity - how many items it can store. 

Storage has some functions - we can add an item, delete an item, display all items, 
check capacity (get an integer) or get percentage capacity.

Every created storage gets an id. 

Static method howManyStorages tells how many storages have been created.

Abstract class Item is to help create objects to store. It contains the basic fields like name and type, 
that will be used by any other classes we would create - e.g. to store some electronic ->
create class Electronic, think of an additional field for that class only (like category for Clothing class).
Create its object - for example _Electronic laptop = new Electronic("NoteBook Air 16gb", "laptop", "...")_.
Then create storage for electronic objects, give it a capacity and add created electronic(s). Try for yourself!!


