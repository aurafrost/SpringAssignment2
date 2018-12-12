package problem3;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AopClassAdvice {
	/*
	//before
	public void displayMethod(JoinPoint p) {
		System.out.println("Before");
	}
	//after
	public void displayMethod(JoinPoint p) {
		System.out.println("After");
		System.out.println();
	}
	//after returning
	public void displayMethod(JoinPoint p,Object o) {
		System.out.println("After returning:");
		System.out.println("Object: "+o);
		System.out.println();
	}*/
	//around
	public void displayMethod(ProceedingJoinPoint p) throws Throwable {
		System.out.println("Around: Before call");
		Object o=p.proceed();
		System.out.println("Around: After call");
	}
}
