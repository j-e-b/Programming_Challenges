#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"

Example 2:

Input: "leetcode"
Output: "leotcede"

Note:
The vowels does not include the letter "y".
*/

typedef struct Node
{
	char data;
	struct Node *next;
} Node;

int isVowel(char c)
{
	return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')
  		|| (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U');
}

char *reverseVowels(char *s)
{
	int i, len = strlen(s);

	Node *head, *temp;

	for (i = 0; i < len; i++)
	{
		// Push this vowel on to the top of our stack.
		if (isVowel(s[i]))
		{
			temp = head;
			head = malloc(sizeof(Node));
			head->data = s[i];
			head->next = temp;
		}
	}

	for (i = 0; i < len; i++)
	{
		// Pop the top of the stack and place it's value into s.
		if (isVowel(s[i]))
		{
			s[i] = head->data;

			temp = head;
			head = head->next;
			free(temp);
		}
	}
}
