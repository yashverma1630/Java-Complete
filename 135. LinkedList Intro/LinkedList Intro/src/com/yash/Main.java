// The LinkedList is not indexed at all.
// There is no array sorting the addresses in a neat, ordered way, as we saw with the ArrayList.
// Instead, each element that's added to a linked list forms a chain and the chain has links to the previous element, and the next element.
// This architecture is called a doubly linked list, meaning an element is linked to the next element, but it's also linked to a previous element, in this chain of elements.
// The beginning of the chain is called the head of the list, and the end is called the tail.
// for example : "First", "Second", "Third"
// here "First" is head and "Third" is tail.
// This can also be considered a queue, in this case, a double ended queue, because we can traverse both backwards and forwards, through these elements.

// Getting an element from the list or setting a value of element, isn't just simple math anymore with the LinkedList type.
// To find an element, you'd need to start at the head or tail, and check if the elemeent matches or keep track of the number
// of elements traversed, if we are matching by an index because the index isn't stored as part of the list.
// For example, even if you know you want to find the 5th element, you'd still have to traverse the chain this way to get that fifth element.
// This type of retrieval is considered expensive in computer currency, which is processing time and memory usage.
// On the other hand, inserting and removing an element, is much simpler for this type of collection.
// In contrast to an ArrayList, inserting or removing an item in a LinkedList is just a matter of breaking two links in the chain, and re-establishing two different links.
// no new array needs to be created, and elements don't need to be shifted into different positions.
// Reallocation of memory for all the existing elements is never required.

// For a LinkedList, inserting and removing elements is generally considered cheap in computer currency, compared to doing these functions in an ArrayList.

// ArrayList is preferred over LinkedList in most of the scenarios. but the size of ArrayList should be defined.
// because if the ArrayList is filled with elements and we try to add more elements to it. then it reallocates the memory for every single addition of element.

package com.yash;

public class Main {
    public static void main(String[] args) {
        System.out.println("Read comments to understand the linked list");
    }
}
