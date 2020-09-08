# Generators in Python

One reason I love Python is its elegance with efficiency. Python provides us with many powerful tools that are intuitive to use thus making this language great for beginners. One such powerful tool is **Generator** which can be a little unintuitive at first. So let's talk about Generators and how to take advantage of them.



There are two types of generators:

- **Generator functions**.
- **Generator Expressions.**

Let's handle them one by one

## Generator Functions

A generator function is like a regular function with one difference -

- A regular function will **return** a collection of values at once.

A generator function is similar to a regular function, except that they return a values in a collection one by one instead of return a collection all at once.

*Generator functions are automatically turned into their own iterators by Python.*

Let's understand this with an example:

Suppose 