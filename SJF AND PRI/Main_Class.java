package OS_Assignment;
import java.util.Scanner;
import static OS_Assignment.Main_Class.Arrival;
import static OS_Assignment.Main_Class.TAT;
import static OS_Assignment.Main_Class.Burst;
import static OS_Assignment.Main_Class.Processes;
import static OS_Assignment.Main_Class.WT;
import static OS_Assignment.Main_Class.CT;
import static OS_Assignment.Main_Class.Priority_;
import static OS_Assignment.Main_Class.check;
import static OS_Assignment.Main_Class.loop_end;
public class Main_Class {
    public static int check = 0, loop_end =0;
    public static int Processes[];
    public static int Arrival[];
    public static int WT[];
    public static int CT[];
    public static int Priority_[];
    public static int Burst[];
    public static int TAT[];
    public static int avgtat=0 ;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t  **** WELCOME ****\n");
        System.out.println("****************************************");
        System.out.println("CODE BY TALHA SIRAJ  ID=10213");
        System.out.println("****************************************");
        System.out.println("1. For Priority Press '1' \n2. For Shortest Job First Press '2'");
        System.out.println("****************************************");
        System.out.println("\nEnter Your Choice :");
        int n = input.nextInt();
        if(n == 1)
        {
        System.out.println("\nThe Priority Program :-");
        System.out.println("Number Of Process : ");
        int N = input.nextInt();
        Priority obj = new Priority(N);
        for(int i = 0; i<N ; i++)
        {
        System.out.println("Arrival Time Of P"+(i+1)+" :");
        int num = input.nextInt();
        Priority.AT(num);
        System.out.println("Burst Time Of P"+(i+1)+" :");
        int Burst=input.nextInt();   
        Priority.BT(Burst); 
        System.out.println("Priority Number : ");
        int p=input.nextInt();
        Priority.set_Prio(p);
        }
        System.out.println("\nBefore :");
        System.out.println("Process Arrival Burst Priority");
        for(int i = 0 ; i <N ; i++)
        {
        System.out.println("   "+Processes[i]+"\t   "+Arrival[i]+"\t  "+Burst[i]+"\t "+Priority_[i]);    
        }
        System.out.println("\nAfter :");
        Priority.Prio_Premitive_Arrange();
        System.out.println("********************************************");
        System.out.println("Process Arrival Burst Priority  CT   TAT    WT");
        for(int i = 0 ; i <N ; i++)
        {
        System.out.println("   "+Processes[i]+"\t   "+Arrival[i]+"\t  "+Burst[i]+"\t "+Priority_[i]+"\t"+CT[i]+"   "+TAT[i]+"   "+WT[i]);
        System.out.println("********************************************");
        } 
        }
        else{
             System.out.println("Number Of process : ");
        int N = input.nextInt();
             SJF_ OBJ = new SJF_(N);    
        for(int i = 0; i<N ; i++)
        {
        System.out.println("Arrival Time Of P"+(i+1)+" :");
        int num = input.nextInt();
        SJF_.AT(num);
        System.out.println("Burst Time Of P"+(i+1)+" :");
        int Burst=input.nextInt();   
        Priority.BT(Burst);
        SJF_.BT(Burst); 
        }
        System.out.println("\nBefore :");
        System.out.println("Process Arrival Burst");
        for(int i = 0 ; i <N ; i++)
        {
        System.out.println("   "+Processes[i]+"\t  "+Arrival[i]+"\t  "+Burst[i]);    
        }
        System.out.println("\nAfter :");
        SJF_.SJF_Premitive_Arrange();
        System.out.println("************************************");
        System.out.println("Process Arrival Burst CT  TAT  WT");
        for(int i = 0 ; i <N ; i++)
        {
        System.out.println("   "+Processes[i]+"\t  "+Arrival[i]+"\t "+Burst[i]+"     "+CT[i]+"   "+TAT[i]+"  "+WT[i]);
        System.out.println("************************************");
        }
        }       
    }  
}
class SJF_
    {
    SJF_(int N)
    {
        Processes= new int[N];
        Arrival= new int [N];
        Burst= new int [N];
        TAT = new int[N];
        CT = new int[N];
        WT=new int [N];
        loop_end = N;
        set_PN();
    }
    private void set_PN()
    {
    for(int i = 0; i<loop_end ; i++)
        {
         Processes[i]= i+1;
        }
    }
    public static void AT(int value)
    {
        if(check < loop_end)
        {
        Arrival[check]=value;    
        }
    }
    public static void BT(int value)
    {
        if(check < loop_end)
        {
            Burst[check]=value;
        }
        check ++;
        }
    protected static void SJF_Premitive_Arrange()
    {
        for(int i=0 ; i <loop_end ; i++)
        {
            for(int k=1 ; k <loop_end ; k++)
            {
                if(Burst[k-1]==Burst[k])
                {
                  if(Arrival[k-1]>Arrival[k])
                  {
                    int v3 =Burst[k];
                  Burst[k]=Burst[k-1];
                  Burst[k-1]=v3;
                  int v1 =Processes[k];
                  Processes[k]=Processes[k-1];
                  Processes[k-1]=v1;
                  int v2 =Arrival[k];
                  Arrival[k]=Arrival[k-1];
                  Arrival[k-1]=v2;
                  }
                }
                else
                {
                if(Burst[k-1]>Burst[k])
                  {
                    int v3 =Burst[k];
                  Burst[k]=Burst[k-1];
                  Burst[k-1]=v3;
                  int v1 =Processes[k];
                  Processes[k]=Processes[k-1];
                  Processes[k-1]=v1;
                  int v2 =Arrival[k];
                  Arrival[k]=Arrival[k-1];
                  Arrival[k-1]=v2;    
                  }    
                }  
            }
        }
        CT_();
        TAT_();
        waiting();   
    }
    public static void CT_()
    {
        int count = 0;
     for(int i = 0 ; i <loop_end ; i++)
     {
         int value = Burst[i];
         int k = 1;
         while(k <= value)
         {
        	 count+=1;
        	 k++;
         }
        	 CT[i]=count;    
     }
    }
    public static void waiting()
    {
      for(int i=0 ; i< loop_end;i++)
      {
    	  WT[i]=TAT[i]-Burst[i];
      if(WT[i] < 0)
      {
    	  int num = WT[i]*-1;
    	  WT[i] =num;
      }
      }
     }
 
     public static void TAT_()
     {
      for(int i = 0;i < loop_end;i++)
      {
    	  TAT[i]=CT[i]-Arrival[i];
      if(TAT[i] < 0)
      {
    	  int num = TAT[i]*-1;
    	  TAT[i] =num;
      }
      }
     }
    }
class Priority {
    Priority(int N)
    {
        Processes= new int[N];
        Arrival= new int [N];
        Burst= new int [N];
        TAT = new int[N];
        CT = new int[N];
        WT=new int [N];
        Priority_=new int[N];
        loop_end = N;
        set_PN();
    }
    private void set_PN()
    {  
    for(int i = 0; i<loop_end ; i++)
        {
         Processes[i]= i+1;
        }
    }
    public static void AT(int value)
    {
        if(check < loop_end)
        {
        Arrival[check]=value;    
        }
    }
    public static void BT(int value)
    {
        if(check < loop_end)
        {
            Burst[check]=value;
        }    
    }
    public static void set_Prio(int value)
    {
        if(check < loop_end)
        {
            Priority_[check]=value;
        }
        check ++;
    }
    protected static void Prio_Premitive_Arrange()
    {
        for(int i=0 ; i <loop_end ; i++)
        {
            for(int k=1 ; k <loop_end ; k++)
            {
                if(Priority_[k-1]==Priority_[k])
                {
                  if(Arrival[k-1]>Arrival[k])
                  {
                  int v4 =Priority_[k];
                  Priority_[k]=Priority_[k-1];
                  Priority_[k-1]=v4;
                  int v3 =Burst[k];
                  Burst[k]=Burst[k-1];
                  Burst[k-1]=v3;
                  int v1 =Processes[k];
                  Processes[k]=Processes[k-1];
                  Processes[k-1]=v1;
                  int v2 =Arrival[k];
                  Arrival[k]=Arrival[k-1];
                  Arrival[k-1]=v2;
                  }
                }
                else
                {
                 if(Priority_[k-1]>Priority_[k])
                 {
                  int v4 =Priority_[k];
                  Priority_[k]=Priority_[k-1];
                  Priority_[k-1]=v4;
                  int v3 =Burst[k];
                  Burst[k]=Burst[k-1];
                  Burst[k-1]=v3;
                  int v1 =Processes[k];
                  Processes[k]=Processes[k-1];
                  Processes[k-1]=v1;
                  int v2 =Arrival[k];
                  Arrival[k]=Arrival[k-1];
                  Arrival[k-1]=v2;  
                 }      
                }
            }
        }
        CT_();
        TAT_();
        waiting(); 
    }
    public static void CT_()
    {
    	int count = 0;
     for(int i = 0 ; i <loop_end ; i++)
     {
    	 int value = Burst[i];
         int k = 1;
         while(k <= value)
     {
         count+=1;
         k++;
     }
         CT[i]=count;    
     }
    }
    public static void waiting()
    {
     for(int i=0 ; i< loop_end;i++)
     {
    	 WT[i]=TAT[i]-Burst[i];    
     if(WT[i] < 0)
     {
    	 int num = WT[i]*-1;
    	 WT[i]=num;
     }
     }
    }
    public static void TAT_()
    {
     for(int i = 0;i < loop_end;i++)
     {
     TAT[i]=CT[i]-Arrival[i];
     if(TAT[i] < 0)
     {
    	 int num = TAT[i]*-1;
    	 TAT[i] =num;
     }
     }
    }   
}