import java.util.*;
class TicTacToe
{
	char arr[][]=new char[3][3];int x,y;
	Scanner in=new Scanner(System.in);
	public TicTacToe()							//Initialises the content to blank
	{
		x=y=-1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				arr[i][j]='*';
		}
	}
	public void workz()							//Decide who playes first
	{
		System.out.print("Who'll play first?\n1.AI\n2.You\nChoice: ");
		int ch=in.nextInt();String str="";
		if(ch==1)
			str=ai();
		/*else if(ch==2)
			str=player();*/
		System.out.println("Game over!\n"+str);
	}
	public String ai()							//If AI is to play first
	{
		System.out.println("Computer's Move - ");
		arr[0][0]='X';
		display();
		input();int a,b;
		System.out.println("Your Move - ");
		arr[x][y]='O';
		display();
		if(x==2 && y==2)						//Response 3
		{
			System.out.println("Computer's Move - ");
			arr[2][0]='X';
			
			display();
			input();
			System.out.println("Your Move - ");
			arr[x][y]='O';
			display();
			if(x==1 && y==0)
			{
				System.out.println("Computer's Move - ");
				arr[0][2]='X';
				display();
				input();
				System.out.println("Your Move - ");
				arr[x][y]='O';
				display();
				x=x==0?1:0;
				System.out.println("Computer's Move - ");
				arr[x][1]='X';
				display();
				return "Computer Wins!";
			}
			else
			{
				System.out.println("Computer's Move - ");
				arr[1][0]='X';
				display();
				return "Computer Wins!";
			}
		}
		else if((x==0 && y==1)||(x==1 && y==0)||(x==1 && y==2)||(x==2 && y==1))			//Response 1 & Response 4
		{
			System.out.println("Computer's Move - ");
			arr[1][1]='X';
			
			display();
			input();
			System.out.println("Your Move - ");
			arr[x][y]='O';
			a=x;b=y;
			display();
			if(x==2 && y==2)
			{	
				if(a==0||a==2)
				{
					x=2;y=0;
				}
				else
				{
					x=0;y=2;
				}
				System.out.println("Computer's Move - ");
				arr[x][y]='X';
				display();
				input();
				System.out.println("Your Move - ");
				arr[x][y]='O';
				display();
				if(a==0)					//use value of 'a' for further reponse!
				{
					if(x==0 && y==2)
					{
						x=1;y=0;
					}
					else
					{
						x=0;y=2;
					}
				}
				else
				{
					if(x==2 && y==0)
					{
						x=0;y=1;
					}
					else
					{
						x=2;y=0;
					}
				}
				System.out.println("Computer's Move - ");
				arr[x][y]='X';
				display();
				return "Computer Wins!";
			}
			else
			{
				System.out.println("Computer's Move - ");
				arr[2][2]='X';
				display();
				return "Computer Wins!";
			}
		}
		
		else if((x==0 && y==2)||(x==2 && y==0))			//Response 2
		{
			System.out.println("Computer's Move - ");
			arr[2][2]='X';
			
			display();
			input();
			System.out.println("Your Move - ");
			arr[x][y]='O';
			a=x;
			display();
			if(x==1 && y==1)
			{
				if(a==0)
				{
					x=2;y=0;
				}
				else
				{
					x=0;y=2;
				}
				System.out.println("Computer's Move - ");
				arr[x][y]='X';
				display();
				input();
				System.out.println("Your Move - ");
				arr[x][y]='O';
				display();
				if(a==0)
				{
					if(x==1)
					{
						x=2;y=1;
					}
					else
					{
						x=1;y=0;
					}
				}
				else
				{
					if(x==1)
					{
						x=0;y=1;
					}
					else
					{
						x=1;y=2;
					}
				}
				System.out.println("Computer's Move - ");
				arr[x][y]='X';
				display();
				return "Computer Wins!";
			}
			else
			{
				System.out.println("Computer's Move - ");
				arr[1][1]='X';
				display();
				return "Computer Wins!";
			}
		}
		else										//Response 5
		{
			System.out.println("Computer's Move - ");
			arr[2][0]='X';
			display();
			input();
			System.out.println("Your Move - ");
			arr[x][y]='O';
			display();
			if(x==1 && y==0)
			{
				System.out.println("Computer's Move - ");
				arr[1][2]='X';
				display();
				input();
				System.out.println("Your Move - ");
				arr[x][y]='O';
				display();
				b=y;
				if(x==0)
					a=2;
				else
					a=0;
				System.out.println("Computer's Move - ");
				arr[a][1]='X';
				display();
				input();
				System.out.println("Your Move - ");
				arr[x][y]='O';
				display();
				if(x!=a)
				{
					System.out.println("Computer's Move - ");
					arr[a][2]='X';
					display();
					return "Computer Wins!";
				}
				else
					return "Draw!";
			}
			else
			{
				System.out.println("Computer's Move - ");
				arr[1][0]='X';
				display();
				return "Computer Wins!";
			}
		}
	}
	/*public void player()						//If player is to play first
	{
		
	}*/
	public void check()							//Checking if an immediate solution is possible
	{
		int data[][]=new int[2][8];
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				
			}
		}
	}
	public void input()
	{
		System.out.print("Enter location: ");
		x=in.nextInt();y=in.nextInt();
	}
	public void display()						//Function to display
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		TicTacToe o=new TicTacToe();
		o.workz();
	}
}