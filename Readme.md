
# Java Lambda Expression

A lambda expression implements a functional interface.
A lambda expression is not another way of writing instances of anonymous classes.

# Functional Interface - 
> An interface That has only one abstract method.
> Default and static methods do not count.
> Methods from Object do not count.

Java.util.function package has more than 40 interfaces Organized in 4 categories
- Supplier
- Consumer
- Predicate
- Function
- Runnable

```java

# Supplier
public interface Supplier<T> {
	T get();
}
Supplier<String> supplier = 
	() -> "Hello!";

# Consumer
public interface Consumer<T> {
	void accept(T t);
}
Consumer<String> consumer = 
	s -> System.out.println(s);

# Predicate : filtering in Stream
public interface Predicate<T> {
	boolean test(T t);
}
Predicate<String> isEmpty = s -> s.isEmpty();

# Function : mapping in Stream
public interface Function<T, R> { 
	R apply(T t);
}
Function<User, String> getName = user -> user.getName();

# Runnable
public interface Runnable {
	void run();
}
Runnable alert = 
	() -> System.out.println("I am Groot");

```

Marker Interface (The Interface which doesn't have any method declaration):
Clonable & Serializable
https://www.youtube.com/watch?v=JruilTDcyGc
