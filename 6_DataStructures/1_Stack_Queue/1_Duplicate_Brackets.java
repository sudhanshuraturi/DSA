// 1. You are given a string exp representing an expression.
// 2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
// 3. But, some of the pair of brackets maybe extra/needless. 
// 4. You are required to print true if you detect extra brackets and false otherwise.

// e.g.'
// ((a + b) + (c + d)) -> false
// (a + b) + ((c + d)) -> true


      
Stack<Character> stk = new Stack<Character>();

for(int i=0;i<str.length();i++)
{
	if(str.charAt(i) == ')')
	{
		int count = 0;//or just check if stk.peek() == '('--> print true and return instead of count thing
		while(stk.peek()!='(')
		{
			stk.pop();
			count++;
		}
		if(count==0)
		{
			System.out.println("true");
			return;
		}
		stk.pop();
	}
	
	else{
		stk.push(str.charAt(i));
	}
}
System.out.println("false");