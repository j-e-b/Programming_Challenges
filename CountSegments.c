#include <stdio.h>
#include <string.h>

/*
Count the number of segments in a string, where a segment is defined to be a
contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
*/

int countSegments(char *s)
{
	int i, len = strlen(s), flag = 1, count = 0;

	for (i = 0; i < len; i++)
	{
		if (flag && s[i] != ' ')
		{
			count++;
		}

		if (s[i] == ' ')
		{
			flag = 1;
		}
		else
		{
			flag = 0;
		}
	}

	return count;
}
