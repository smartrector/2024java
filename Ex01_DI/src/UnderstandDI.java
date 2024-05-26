import java.util.Date;

public class UnderstandDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.print(date);

	}
	public static void memberUse1() {
		Member member1 = new Member();
	}
	
	public static void memberUse2(Member m) {
		Member member2 = m;
	}
	
}

class Member
{
	String name;
	String nickname;
	public Member() {}
}