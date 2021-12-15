class Switch1 
{
	public static void main(String[] args) 
	{
		char value='h';
		switch(value)
		{
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
			case'A':
			case'E':
			case'I':
			case'O':
			case'U':
				System.out.println(value +" char is vowel");
			    break;	

				default: System.out.println(value +" char is consonant");
		}
	}
}
