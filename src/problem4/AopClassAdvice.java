package problem4;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect
public class AopClassAdvice {
	@Pointcut("execution(* problem4.AOPTest.*(..))")
	public void point() {
		System.out.println("Point cut name");
	}
	@Before("point()")
	public void testMethod(JoinPoint p) {
		System.out.println("Before");
	}
	/*
	@After("point()")
	public void testMethod(JoinPoint p) {
		System.out.println("After");
		System.out.println();
	}
	@AfterReturning(pointcut="execution(* problem4.AOPTest.*(..))",returning="o")
	public void testMethod(JoinPoint p,Object o) {
		System.out.println("After returning:");
		System.out.println("Object: "+o);
	}
	*/
	/*
	public void testMethod(ProceedingJoinPoint p) throws Throwable {
		System.out.println("Around: Before call");
		Object o=p.proceed();
		System.out.println("Around: After call");
	}
	*/
}
