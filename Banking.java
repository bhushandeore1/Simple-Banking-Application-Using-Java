package onlineBanking;

class amount{
	int acnt_num;
	String name;
	float amnt;
	
	void insert(int a,String b, float c) {
		acnt_num=a;
		name=b;
		amnt=c;
	}
	void display() {
		System.out.println(acnt_num+" "+name+" "+amnt);
	}
	void deposit(int a) {
		amnt=a+amnt;
		System.out.println("Deposited amount is "+ a+" and total amount is " +amnt);
	}
	void withdraw(int c) {
		if(c>amnt) {
			System.out.println("Accoun balance is not sufficient");
		}
		else {
			amnt=amnt-c;
			System.out.println("Withdrwal amount is "+ c+" and total amount is " +amnt);
		}
	}
}
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amount a=new amount();
		a.insert(12358,"dena",5000);
		a.display();
		a.deposit(2000);
		a.withdraw(3000);

	}

}
