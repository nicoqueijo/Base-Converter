# Base Converter

Converter class provides the following four methods:
binToDec: Takes a binary value, returns it decimal equivalent.
hexToDec: Take a hexadecimal value, returns its decimal equivalent.
decToBin: Takes a decimal value, returns its binary equivalent.
decToHex: Takes a decimal value, returns its hexadecimal equivalent.

Tester class accepts a number in binary, decimal, and hex which takes from the user a number in any of these three bases (binary, decimal or hex) and prints out all three representations.  If the number begins with a ‘%’ assume it is binary and if it starts with a $ assume hex.  Here is an example output (user input has been underlined):

Enter an integer in either binary, decimal or hex: $B30

%101100110000 = 2864 = $B30
