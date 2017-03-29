import java.util.Date;

/**
 * @author 089245 sunyongjun
 * @since 14-7-18 下午5:22
 */
public class Test{

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date = " + date);
		int interval = 30 * 60 * 1000;
		Date newDate = new Date(date.getTime() / interval * interval);
		System.out.println("newDate = " + newDate);
	}
}
