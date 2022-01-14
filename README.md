# Word-Cloud-Generator
Application Purpose
--------------------
Word Clouds provide a visual representation of text, typically displaying words with the most frequent occurence prominently. This command line menu-driven Java application is capable of parsing a file or URL, the name of which is input by a user, and creating a PNG file with a word cloud displaying the most prominent words in decreasing font size, style and colour.

Main Features
--------------
* Allows a user to input the name of a file or url to be parsed. The user can select the maximum number of words to display and input their choice of file name for the resultant image to be saved as.
* Parses the file or URL and uses a HashMap to create a frequency table of words and their frequencies.
* Compares each word found with a list of words in a document ignorewords.txt.
These words are to be eliminated from the word cloud and include commonly occuring words such as and, the etc. 

Extras
-------
* ValidateAsParsable class to validate input as parsable.
* Use of enums Fonts and Colors.
* Use of an interface class InputHandler.
