class IsPalindromeList
{
	public boolen IsPalindrome(ListNode head)
	{
		long num = 0;

		if (head == null)
			return true;

		ListNode temp = head;
		int length = 0;

		while (temp != null)
		{
			length++;
			temp = temp.next;
		}

		temp = head;
		int pow = (int)Math.pow(10, length - 1);

		while (temp != null)
		{
			num += pow * temp.val;
			pow /= 10;
			temp = temp.next;
		}

		long reverseNum = 0;

		if (num < 0)
			return false;

		if (num % 10 == 0 && num != 0)
			return false;

		// Take half of num and reverse it.
		while (num > reverseNum)
		{
			reverseNum *= 10;
			reverseNum += num % 10;
			num /= 10;
		}

		// Avoid overflow.
		if (reverseNum > Integer.MAX_VALUE)
			return false;

		return (num == (int)reverseNum || num == (int)reverseNum / 10);

	}
}
