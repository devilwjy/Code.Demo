import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class test {

	 public static void main(String[] args){
	    	
	    	Scanner x=new Scanner(System.in);
	    	System.out.print("������һ��������");
	    	int number=x.nextInt();
	    	int writer=0;
	    	try {
                //����ļ����ڣ���׷�����ݣ�����ļ������ڣ��򴴽��ļ�
                File file = new File("result.txt");
                FileWriter fw = new FileWriter(file, true);

                PrintWriter pw = new PrintWriter(fw);
                
                if(writer==0)
                {
                    pw.println("201571030128");
                    writer=1;
                }
	    	       
	     
	    	System.out.println("201571030128");
	    	for(int i=1;i<=number;i++)
	    	{
	    		
	    		//���������
	    		Random rd=new Random();
	    		int data1=rd.nextInt(100)+1;
	    		int data2=rd.nextInt(100)+1;
	    		int data3=rd.nextInt(100)+1;
	    		//������������
	    		String[] operator={"*","/","+","-"};
	    		Random r=new Random();
	    		int num1=r.nextInt(4);
	    		int num2=r.nextInt(4);
	    		String str=data1+operator[num1]+data2+operator[num2]+data3;
	    		//System.out.println(str);
	    		int result;
	 
		    	if(operator[num1]=="+")
		    	{
		    		if(operator[num2]=="+")
		    		{
		    			result=data1+data2+data3;
		    			System.out.println(str+"="+result);
		    			pw.println(str+"="+result);
		    		}
		    		else if(operator[num2]=="-")
		    		{
		    			if(data1+data2>=data3)
		    			{
		    				result=data1+data2-data3;
			    			System.out.println(str+"="+result);
			    			pw.println(str+"="+result);
		    			}
		    			else{
		    				number++;
		    			}
		    		}
		    		else if(operator[num2]=="*")
		    		{
		    			result=data1+data2*data3;
		    			System.out.println(str+"="+result);
		    			pw.println(str+"="+result);
		    		}
		    		else
		    		{
		    			if(data2%data3==0 && data3!=0)
		    			{
		    				result=data1+data2/data3;
			    			System.out.println(str+"="+result);
			    			pw.println(str+"="+result);
		    			}
		    			else{
		    				number++;
		    			}
		    		}
		    	}
		    	
		    	else if(operator[num1]=="-")
		    	{
		    		if(operator[num2]=="+")
		    		{
		    			if(data1>=data2)
		    			{
		    				result=data1-data2+data3;
		    				System.out.println(str+"="+result);
		    				pw.println(str+"="+result);
		    			}
		    			else{
		    				number++;
		    			}
		    		}
		    		else if(operator[num2]=="-")
		    		{
		    			if(data1>=data2)
		    			{
		    				if(data1-data2>=data3)
		    				{
		    					result=data1-data2-data3;
			    				System.out.println(str+"="+result);
			    				pw.println(str+"="+result);
		    				}
		    				else{
		    					number++;
		    				}
		    			}
		    			else{
		    				number++;
		    			}
		    		}
		    		else if(operator[num2]=="*")
		    		{
		    			if(data1>=data2*data3)
		    			{
		    				result=data1-data2*data3;
		    				System.out.println(str+"="+result);
		    				pw.println(str+"="+result);
		    			}
		    			else{
		    				number++;
		    			}
		    		}
		    		else{
		    			if(data2%data3==0 && data3!=0)
		    			{
		    				if(data1>=data2/data3)
		    				{
		    					result=data1-data2/data3;
			    				System.out.println(str+"="+result);
			    				pw.println(str+"="+result);
		    				}
		    				else{
		    					number++;
		    				}
		    			}
		    			else{
		    				number++;
		    			}
		    		} 		
		    	}
		    	
		    	else if(operator[num1]=="*")
		    	{
		    		if(operator[num2]=="+")
		    		{
		    			result=data1*data2+data3;
	    				System.out.println(str+"="+result);
	    				pw.println(str+"="+result);
		    		}
		    		else if(operator[num2]=="-"){
		    			if(data1*data2>=data3)
		    			{
		    				result=data1*data2-data3;
		    				System.out.println(str+"="+result);
		    				pw.println(str+"="+result);
		    			}
		    			else{
		    				number++;
		    			}
		    		}
		    		else if(operator[num2]=="*")
		    		{
		    			result=data1*data2*data3;
	    				System.out.println(str+"="+result);
	    				pw.println(str+"="+result);
		    		}
		    		else{
		    			int result1=data1*data2;
		    			if(result1%data3==0 && data3!=0)
		    			{
		    				result=data1*data2/data3;
		    				System.out.println(str+"="+result);
		    				pw.println(str+"="+result);
		    			}
		    			else{
		    				number++;
		    			}
		    		}
		    	}
		    	//��һ�������Ϊ��/��
		    	else{
		    		if(data1%data2==0 && data2!=0)//�ж�data1�ܷ�data2����,�ҳ���data2����Ϊ0
		    		{
		    			if(operator[num2]=="+")//�˳������ȼ����ڼӼ������Կ���˳�����¼���
		    			{
		    				result=data1/data2+data3;
		    				System.out.println(str+"="+result);
		    				pw.println(str+"="+result);
		    			}
		    			else if(operator[num2]=="-")
		    			{
		    				if(data1/data2>=data3)//�ж�data1/data2�����Ƿ����data3
		    				{
		    					result=data1/data2-data3;
			    				System.out.println(str+"="+result);
			    				pw.println(str+"="+result);
		    				}
		    				else{
		    					number++;//�����������ͽ����ʽ�ĸ�����1��������һ�����ʽ�ļ���
		    				}
		    			}
		    			else if(operator[num2]=="*")
		    			{
		    				result=data1/data2*data3;
		    				System.out.println(str+"="+result);
		    				pw.println(str+"="+result);
		    			}
		    			else{
		    				int result1=data1/data2;
		    				if(result1%data3==0 && data3!=0)//�ж�data1/data2�����ܷ�����data3����data3����Ϊ0
		    				{
		    					result=data1/data2/data3;
			    				System.out.println(str+"="+result);
			    				pw.println(str+"="+result);
		    				}
		    				else{
		    					number++;
		    				}
		    			}
		    		}
		    		else{
		    			number++;
		    		}
		    	}
		   
	    	}
	    	
	    	 pw.flush();
             pw.close();
             fw.close();
         } catch (IOException e1) {
             e1.printStackTrace();
         }
     }
	    	
	    
	    
	 
}
	    	
