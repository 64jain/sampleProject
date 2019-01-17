package operations;
public class Subtract {
	float a,b,result;
	Subtract(float a, float b) {
		this.a=a;
		this.b=b;
		sub();
	}
	void sub() {
		this.result = this.a - this.b;
	}
	float getResult() {
		return this.result;
	}
}
