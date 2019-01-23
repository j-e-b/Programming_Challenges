#include <stdio.h>
#include <string.h>

/*
Return the index of the first occurrence of needle in haystack, or -1 if needle
is not part of haystack.
--------------------------
Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
--------------------------
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
--------------------------
If either string is NULL or if the needle is the empty string, simply return 0;
*/

int strStr(char *haystack, char *needle)
{
	int hayLen;
	int needleLen;
	int i, j;

	if (haystack == NULL || needle == NULL)
	{
		return 0;
	}

	hayLen = strlen(haystack);
	needleLen = strlen(needle);

	if (needleLen == 0)
	{
		return 0;
	}

	for (i = 0; i <= hayLen; i++)
	{
		// At each index of the haystack, search for the needle by checking each
		// character from that index forward.
		for (j = 0; j < needleLen; j++)
		{
			if (needle[j] != haystack[i + j])
			{
				break;
			}

			// We have found the needle. Return the index it was found.
			if (j == needleLen - 1)
			{
				return i;
			}
		}
	}

	return -1;
}
