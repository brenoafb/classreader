public class Functions {
    public static void voidVoidFunc() {
	System.out.println("Hello from voidVoid.");
    }

    public static int intIntFunc(int x) {
	System.out.print("intInt received ");
	System.out.print(x);
	System.out.print(". Returning ");
	System.out.println(x+1);
	return x+1;
    }

    public static int intVoidFunc() {
	int n = 1234;
	System.out.print("intVoid returning ");
	System.out.println(n);
	return n;
    }

    public static int twoparams(int x, int y) {
	System.out.print("twoparams received ");
	System.out.print(x);
	System.out.print(" and ");
	System.out.print(y);
	System.out.print(". Returning ");
	System.out.println(x+y);
	return x+y;
    }

    public static void main(String[] args) {
	int n = 10;
	voidVoidFunc();
	int ret = intIntFunc(n);
	System.out.println(ret);
	ret = intVoidFunc();
	System.out.println(ret);

	ret = twoparams(n, ret);
	System.out.println(ret);
    }
}
