package main.giaiphuongtrinh;

public class giaiphuongtrinhbac2 {
	private int a, b, c;
	
	public giaiphuongtrinhbac2(int x,int y,int z){
		 this.a = x ;
		 this.b = y ;
		 this.c = z ;
	}

	public String tinhnghiem(){
		double delta=0 ;
		double x1 = 0 ;
		double x2 = 0 ;
		if(a==0){
			if(b==0){
				if(c==0){
					//System.out.println("vo so nghiem");
					return "vo so nghiem";
				}
				else
					//System.out.println("vo nghiem");
					return "vo nghiem";
			}
			else{
				x1 = (double)(-c/b) ;
				//System.out.println(x1);
				return String.valueOf(x1);
			}
		}
			else{
				delta = b*b - 4*a*c ;
				if(delta>0){
					x1 = (double)(-b-Math.sqrt(delta))/(2*a);
					x2 = (double)(-b+Math.sqrt(delta))/(2*a);
					System.out.println(x1);
					System.out.println(x2);
					return String.valueOf(x1) +" "+ String.valueOf(x2) ;
				}
				else{
					if(delta==0){
						x1=x2 = (double)(-b/(2*a));
						return String.valueOf(x1);
					}
				
				else
					return "vo nghiem";
			}
		}
	}

	public static void main(String[] args) {
		giaiphuongtrinhbac2 gpt = new giaiphuongtrinhbac2(1,5,6);
		//Scanner input = new Scanner(System.in);
		//gpt.a = input.nextInt();
		//gpt.b = input.nextInt();
		//gpt.c = input.nextInt();
		gpt.tinhnghiem();

	}

}