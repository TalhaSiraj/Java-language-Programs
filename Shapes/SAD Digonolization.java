package assi;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
	static ArrayList <String> index  = new ArrayList<>();
	static ArrayList <String> DI     = new ArrayList<>();
	static ArrayList <String> COL    = new ArrayList<>(); 
	static ArrayList <String> CL     = new ArrayList<>(); 
	public static int AA , BB;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int size1=0 , size2=0,smallest,total_Zeros = 0;
		System.out.println("\t\t\tTHE PROGRAM ");
		System.out.println("Enter Row Size :- ");
		size1=input.nextInt();
		System.out.println("Enter Column Size :- ");
		size2=input.nextInt();
		int ARR[][] = new int [size1][size2];
		int TEMP[][] = new int [size1][size2];
		AA=size1;
		BB = size2;
		System.out.println("Now Put Values :- ");
		for(int i = 0 ; i < size1 ; i++)
		{
			for(int j = 0 ; j < size2; j++)
			{
				ARR[i][j] = input.nextInt();
			}
		}
		System.out.println("The Question :- ");
		for(int i = 0 ; i < size1 ; i++)
		{
			for(int j = 0 ; j < size2; j++)
			{
				TEMP[i][j] = ARR[i][j];
			System.out.print(ARR[i][j]+"\t");
			}
			System.out.println("");	
		}
		for(int  I = 0 ; I < size1 ; I++)
		{
			smallest = ARR[I][0];	
			for(int J = 0 ; J < size2; J++)
			{
			if(smallest>ARR[I][J])
			{
				smallest=ARR[I][J];
			}
			}			
			for(int k = 0 ; k <size2 ; k++)
			{
				ARR[I][k] -=smallest;
			}
		}
		smallest=ARR[0][0];
		for(int i = 0 ; i < size1 ; i++)
		{
			smallest = ARR[0][i];
			for(int j = 0 ; j < size2; j++)
			{
				if(smallest == 0)
				{	
				}
				else
				{
					if(smallest > ARR[j][i])
					{
						smallest = ARR[j][i];
					}	
				}
			}
			for(int k = 0 ; k <size2 ; k++)
			{
				ARR[k][i] -=smallest;
			}
		}
		String J = null;
		System.out.println("\nThe Row Scanning Result :-");
		int ZERO=0; 
		String	k = null , L = null;
		for(int i = 0 ; i < size1 ; i++)
		{
			for( int j = 0 ; j < size2; j++)
			{
				if(COL.contains(String.valueOf(j)))
				{
				}
				else
				{
					if(ARR[i][j] == 0)
					{
						ZERO +=1;
						k = String.valueOf(j);
						L = String.valueOf(i);
					}	
				}	
			}
			if(ZERO==1)
			{
				total_Zeros +=1;
				COL.add(k);
				index.add(L);
				DI.add(k);
			}
			ZERO = 0;
			k=null;
			L=null;
		}
		for(int i = 0 ; i < size1 ; i++)
		{
			for(int j = 0 ; j < size2; j++)
			{
				
			System.out.print(ARR[i][j]+"\t");
			}
			System.out.println("");
		}
		if(total_Zeros == size1)
		{
			bubble();
			System.out.println("\nProcess \t Value");
			for(int i = 0 ; i < size1 ; i++)
			{
				int j=Integer.valueOf(COL.get(i));
				int k1 = Integer.valueOf(index.get(i));
			System.out.println("P"+i+" \t "+TEMP[k1][j]);		
			}
		}
		else
		{
			ZERO = 0;
			System.out.println("\nThe Column Scanning Result :-");
			ArrayList<String> V = new ArrayList<>();
			ArrayList<String> H = new ArrayList<>();	
			k=null;
			L=null;	
			for(int j = 0 ; j< size2 ; j++)
			{
				if(COL.contains(String.valueOf(j)))
				{
				}
				else
				{
					for(int x= 0 ; x<size1 ; x++)
					{
						if(V.contains(String.valueOf(x)))
						{
						}else
						{
							if(ARR[x][j] == 0)
							{
								ZERO +=1;
								k = String.valueOf(x);
								L = String.valueOf(j);
							}	
						}				
					}	
				}
				if(ZERO==1)
				{
					total_Zeros +=1;
					V.add(L);
					H.add(k);
					COL.add(L);
					index.add(k);
				}
				ZERO = 0;
				k=null;
				L=null;	
			}
			int MAX = 0;
			for(int i = 0 ; i < size1 ; i++)
			{
				for(int j = 0 ; j < size2; j++)
				{
					if(MAX<ARR[i][j])
					{
						MAX = ARR[i][j];
					}
				}	
			}
			if(total_Zeros == size1)
			{
				bubble();
				System.out.println("\nProcess \t Value");
				for(int i = 0 ; i < size1 ; i++)
				{
					int j1=Integer.valueOf(COL.get(i));
					int k1 = Integer.valueOf(index.get(i));
				System.out.println("P"+i+" \t\t "+TEMP[k1][j1]);	
				}
			}
			else
			{
				for(int i = 0 ; i < size1 ; i++)
				{
					for(int j = 0 ; j < size2; j++)
					{
						System.out.print(ARR[i][j]+"\t");
					}
					System.out.println("");
				}
				System.out.println("\nNow Diagonalization Performed.");
				System.out.println("Finded Minimium Value And Subtract From Column :-");
				for(int i = 0 ; i < size1 ; i++)
				{
					for(int j = 0 ; j < size2; j++)
					{
						if(index.contains(String.valueOf(i)))
						{
						}
						else
						{
							if(COL.contains(String.valueOf(j)))
							{
							}else
							{
								if(ARR[i][j]<MAX)
								{
								smallest=ARR[i][j];	
								}	
							}
						}
					}
				}
				if(smallest == 0)
				{
					for(int i = 0 ; i < size1 ; i++)
					{
						for(int j = 0; j < size2 ; j++)
						{
							if(total_Zeros == size1)
							{
								bubble();
								System.out.println("\nProcess \t Values");
								for(int i1 = 0 ; i1 < size1 ; i1++)
								{
									int j1=Integer.valueOf(COL.get(i1));
									int k1 = Integer.valueOf(index.get(i1));
									System.out.println("P"+i1+" \t\t "+TEMP[k1][j1]);
							}
								break;
							}
							if(COL.contains(String.valueOf(j)))
							{	
							}
							else
							{
								if(ARR[i][j] == 0)
								{
									total_Zeros +=1;
									COL.add(String.valueOf(j));
									index.add(String.valueOf(i));
									i++;
								}
							}
						}
						if(i>size1)
						{
							break;
						}
					}
					}
				else
					{
					for(int i = 0 ; i < size1 ; i++)
					{
						for(int j = 0 ; j < size2; j++)
						{	
							if(DI.contains(String.valueOf(j)))
							{	
							}
							else
							{		
								if(ARR[i][j]>0)
								{
									 ARR[i][j] -= smallest;										 											
								}
							}
						}	
					}
					System.out.println("After Row Scanning :-\n");
					ZERO=0; 
					k = null ; L = null;
					for(int i = 0 ; i < size1 ; i++)
					{
						for( int j = 0 ; j < size2; j++)
						{
							if(DI.contains(String.valueOf(j)))
							{
							}
							else
							{
								if(ARR[i][j] == 0)
								{
									ZERO +=1;
									k = String.valueOf(j);
									L = String.valueOf(i);
								}
							}
						}
						if(ZERO==1)
						{

							total_Zeros +=1;
							COL.add(k);
							index.add(L);
							DI.add(k);
						}
						ZERO = 0;
						k=null;
						L=null;
					}
					if(total_Zeros == size1)
					{
						bubble();
						System.out.println("\nProcess \t Value");
						int i = 0 ;
						while(i<index.size())
						{
							int j=Integer.valueOf(COL.get(i));
							int k1 = Integer.valueOf(index.get(i));
						System.out.println("P"+(i+1)+" \t\t "+TEMP[k1][j]);
						i++;
						}
					}else
					{
						bubble();
						int First= Integer.valueOf(index.get(0));
						if(First <3)
						{
							index.clear();
							COL.clear();
							while(First<size1)
							{
								ARR[First][First] = 0;
								index.add(String.valueOf(First));
								COL.add(String.valueOf(First));
								First++;
							}
							System.out.println("\nProcess \t Value");
							int i = 0 ;
							while(i<index.size())
							{
								int j=Integer.valueOf(COL.get(i));
								int k1 = Integer.valueOf(index.get(i));
							System.out.println("P"+(i+1)+" \t\t "+TEMP[k1][j]);
							i++;
							}	
						}
						else
						{
						First = 0;
						index.clear();
						COL.clear();
						while(First<size1)
						{
							ARR[First][First] = 0;
							index.add(String.valueOf(First));
							COL.add(String.valueOf(First));
							First++;
						}
						System.out.println("\nProcess \t Value");
						int i = 0 ;
						while(i<index.size())
						{
							int j=Integer.valueOf(COL.get(i));
							int k1 = Integer.valueOf(index.get(i));
						System.out.println("P"+(i+1)+" \t\t "+TEMP[k1][j]);
						i++;
						}	
						}	
					}
				}		
			}
		}	
	}
	static void bubble()
	{
		String S1,S2;
		for(int i  = 0 ; i <index.size(); i++) 
		{
			for(int j = 1 ; j <COL.size() ; j++)
			{
				int A = Integer.valueOf(index.get(j));
				int B = Integer.valueOf(index.get(j-1));
				if(A<B)
				{
				S1 = index.get(j);
				index.set(j, index.get(j-1));
				index.set(j-1, S1);
				S2 = COL.get(j);
				COL.set(j, COL.get(j-1));
				COL.set(j-1, S2);
				}	
			}
		}
	}
}