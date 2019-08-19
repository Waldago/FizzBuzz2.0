package ejercicioClase2a;

public class Divisible {

	private int num;

	public Divisible (int num) {
		this.setNum(num);
	}

	public Divisible () {
		this.setNum(0);
	}

	public void getDivisible () {
		for (int i=this.getNum() ; i<=100 ; i++) {
			System.out.println(i);
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(" FizzBuzz");
			}
			else if (i%3==0){
				System.out.print(" Fizz");
			}
			else if (i%5==0){
				System.out.print(" buzz");
			}
		}

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


}
