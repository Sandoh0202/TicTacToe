import java.util.*;
class TicTacToe
{
	char arr[][]=new int[3][3];int x,y;
	Scanner in=new Scanner(System.in);
	public TicTacToe()							//Initialises the content to blank
	{
		x=y=-1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				arr[i][j]=' ';
		}
	}
	public void workz()							//Decide who playes first
	{
		System.out.print("Who'll play first?\n1. You\n2. AI\nChoice: ");
		int ch=in.nextInt();
		if(ch==1)
			player();
		else if(ch==2)
			ai();
	}
	public void ai()							//If AI is to play first
	{
		arr[0][0]='X';
		display();
		input();
		arr[x-1][y-1]='O';
		display();
		if(x==3 && y==3)
		{
			arr[2][0]='X';
			display();
			input();
			arr[x-1][y-1]='O';
			display();
			check();
		}
		else if((x==2 && y==1)||(x==1 && y==2))
		{
			arr[1][1]='X';
		}
	}
	public void player()						//If player is to play first
	{
		
	}
	public void check()							//Checking if an immediate solution is possible
	{
		int data[][][]=new int[2];
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if()
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