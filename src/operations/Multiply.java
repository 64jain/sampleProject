package operations;
public class Multiply {
	float a,b,result;
	Multiply(float a, float b) {
		this.a=a;
		this.b=b;
		mul();
	}
	void mul() {
		this.result = this.a * this.b;
	}
	float getResult() {
		return this.result;
	}
}
