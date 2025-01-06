### Here’s a comprehensive list of String methods in Java with a brief explanation for each:

## Basic String Methods
 # length()
Returns the length of the string.

String str = "Hello";
int len = str.length(); // 5

# charAt(int index)
Returns the character at the specified index.

char c = "Hello".charAt(1); // 'e'

# substring(int beginIndex)
Returns a new string starting from the specified index.

String sub = "Hello".substring(2); // "llo"

# substring(int beginIndex, int endIndex)
Returns a substring from beginIndex to endIndex (exclusive).

String sub = "Hello".substring(1, 4); // "ell"
indexOf(String str)
Returns the index of the first occurrence of the specified substring. Returns -1 if not found.


int index = "Hello".indexOf("l"); // 2
indexOf(String str, int fromIndex)
Searches for the substring starting from the specified index.


int index = "Hello".indexOf("l", 3); // 3
lastIndexOf(String str)
Returns the index of the last occurrence of the substring.


int index = "Hello".lastIndexOf("l"); // 3
lastIndexOf(String str, int fromIndex)
Searches backward for the substring starting at the specified index.


int index = "Hello".lastIndexOf("l", 2); // 2
Comparison Methods
equals(Object obj)
Compares the content of two strings for equality.


boolean isEqual = "Hello".equals("hello"); // false
equalsIgnoreCase(String anotherString)
Compares two strings, ignoring case considerations.


boolean isEqual = "Hello".equalsIgnoreCase("hello"); // true
compareTo(String anotherString)
Compares two strings lexicographically.


int result = "abc".compareTo("abd"); // -1
compareToIgnoreCase(String anotherString)
Lexicographically compares two strings, ignoring case.


int result = "abc".compareToIgnoreCase("ABD"); // -1
Case Conversion
toLowerCase()
Converts all characters to lowercase.


String lower = "Hello".toLowerCase(); // "hello"
toUpperCase()
Converts all characters to uppercase.


String upper = "Hello".toUpperCase(); // "HELLO"
Trimming and Stripping
trim()
Removes leading and trailing whitespace.


String trimmed = "  Hello  ".trim(); // "Hello"
strip()
Removes leading and trailing whitespace (supports Unicode).


String stripped = "  Hello  ".strip(); // "Hello"
stripLeading()
Removes leading whitespace.


String stripped = "  Hello".stripLeading(); // "Hello"
stripTrailing()
Removes trailing whitespace.


String stripped = "Hello  ".stripTrailing(); // "Hello"
Search and Matching
contains(CharSequence s)
Checks if the string contains the specified sequence.


boolean found = "Hello".contains("ell"); // true
startsWith(String prefix)
Checks if the string starts with the specified prefix.


boolean starts = "Hello".startsWith("He"); // true
endsWith(String suffix)
Checks if the string ends with the specified suffix.


boolean ends = "Hello".endsWith("lo"); // true
matches(String regex)
Tests if the string matches a regular expression.


boolean isMatch = "123".matches("\\d+"); // true
Replacement and Splitting
replace(char oldChar, char newChar)
Replaces all occurrences of a character with another character.


String replaced = "Hello".replace('l', 'p'); // "Heppo"
replace(CharSequence target, CharSequence replacement)
Replaces all occurrences of a substring with another substring.


String replaced = "Hello".replace("ll", "pp"); // "Heppo"
replaceAll(String regex, String replacement)
Replaces each substring matching the regex with the replacement.


String replaced = "abc123".replaceAll("\\d", "X"); // "abcXXX"
replaceFirst(String regex, String replacement)
Replaces the first substring matching the regex with the replacement.


String replaced = "abc123abc".replaceFirst("\\d", "X"); // "abcX23abc"
split(String regex)
Splits the string into an array based on the regex.


String[] parts = "a,b,c".split(","); // ["a", "b", "c"]
split(String regex, int limit)
Splits the string with a limit on the number of resulting substrings.


String[] parts = "a,b,c".split(",", 2); // ["a", "b,c"]
Joining
join(CharSequence delimiter, CharSequence... elements)
Joins elements with a specified delimiter.

String joined = String.join("-", "a", "b", "c"); // "a-b-c"
Other Methods
isEmpty()
Checks if the string is empty.


boolean empty = "".isEmpty(); // true
isBlank()
Checks if the string is empty or contains only whitespace.


boolean blank = "   ".isBlank(); // true
toCharArray()
Converts the string into a character array.


char[] chars = "Hello".toCharArray(); // ['H', 'e', 'l', 'l', 'o']
concat(String str)
Concatenates the specified string to the end of the current string.


String concat = "Hello".concat(" World"); // "Hello World"
valueOf(Object obj)
Converts an object into its string representation.


String str = String.valueOf(123); // "123"
format(String format, Object... args)
Formats the string using the specified format string and arguments.


String formatted = String.format("Hello %s", "World"); // "Hello World"
intern()
Returns the canonical representation of the string.


String interned = "Hello".intern();
This list covers almost all commonly used methods from the String class in Java. Let me know if you'd like an example or further clarification for any specific method!