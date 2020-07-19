---
tags: [Coding]
title: Strings
created: '2020-07-18T18:29:37.120Z'
modified: '2020-07-19T06:51:19.851Z'
---

# Strings

Ways to create strings in Java: 
1. Character array/arraylist

Class Based: 
Advantage over normal array based = Many string specific functions, e.g. Search substring, occurence of substring, concat string, find Index, etc.




2. String Class : 
  * These create _immutable_ string. Cannot be changed.
  * For example, the methods return new object.

** For mutable string we have : **

3. String Buffer Class  - Thread Safe Class (Shared object being used by multiple threads.) It has a lot of unnecessary overhead.

4. StringBuilder Class : This is not thread safe. Used within a thread. It does not have overheads so it is preferred when we need mutable strings.

```
//Using readymade functions of the String class: 

N.B. :  If there are two same string names with different values, then due to internal orgainsation, they both point to the same point.

Class Test{
  public static void main(String args[]){
    String str = "Geeks";
    System.out.println(str.length());
    System.out.println(str.charAt()); // Gives the character at given index. Also cant use charAt() on the left side of a comparision.
    System.out.println(str.substring());  //  when passed one parameter, it contains the
    System.out.println(str.substring(2,5));// Characters from start to end-1 are returned. 
     }
}

```


```
//More readymade functions:
public static void main(String args[]){
  String s1 = "Geeksforgeeks";
  String s2 = "geeks";
  System.out.println(s1.contains(s2)); //Output wil be true
  String s2 = "geeksy";
  System.out.println(s1.contains(s2)); //Output wil be false

  System.out.println(s1.equals(s2)); //returns true if contents (characher by char are same. Then return true.)

  s1.compare(s2); // Lexicographical Comparision
  //if s1 == s2 then return 0
  // if s1>s1 (greater lexicographically) //return >0
  // if s2>s1( lesser lexicographically) //return <0


  s1.indexOf(s2)
  //THis returns negative if s2 is not preosent in s1. Otherwise, it returns index of first index of s2 in s1

  e.g. : s1 = "geeksforgeeks"
         s2 = "geeks"
         return value : 0 

  //;indexOf can take two parameters also:
  //if I want to check the occirence of the other string in the original string after a given index.
  For example:
  s1.indexOf(s2,2);
  // will return 8 since, after index 2, the answer is at 8 only


s1.lastIndexOf(s2);
  
  }
```

### In Place Algorithms : That do not make use of any auxiliary data structures. However, minor one or two variables are allowed.


### Constant Space Complexity 
---
Constant space means that the amount of space that your algorithm uses is independent of the input parameters. Say you are given an array of size n. If the amount of space your algorithm uses scales with n, then it's not constant. If your algorithm always uses a fixed amount of space (5 variables, an array of fixed size: 100, 300, 5000, etc..), you are golden.


