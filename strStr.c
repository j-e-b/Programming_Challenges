#include <stdio.h>
#include <string.h>

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
