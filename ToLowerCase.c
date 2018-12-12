#include <stdio.h>
#include <string.h>
/*
Implement function ToLowerCase() that has a string parameter str, and returns
the same string in lowercase.
*/
char* toLowerCase(char* str)
{
	int i;
	int len = strlen(str);
	for (i = 0; i < len; i++)
	{
		if (str[i] > 64 && str[i] < 91)
		{
			str[i] += 32;
		}
	}

	return str;
}
