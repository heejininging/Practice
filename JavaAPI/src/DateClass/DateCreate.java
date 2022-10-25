package DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;//import할때 주의해서 할 것

public class DateCreate {

	public static void main(String[] args) {
		//현재 시간을 갖는 java.util.Date 인스턴스 생성
		Date currentTime = new Date();
		
		//출력 = 년월일 시분초 출력
		System.out.println(currentTime);
		
		//원하는 날짜를 가지고 생성
//		Date firstMeetingTime = new Date(1998,04,24,02,57); //Tue May 24 02:57:00 KST 3898
		Date firstMeetingTime = new Date(98,03,24,02,57); //Fri Apr 24 02:57:00 KST 1998
//		int year = currentTime.getYear(); //현재년도
		
		//출력 = 년월일 시분초 출력
		System.out.println(firstMeetingTime);
		
		//년도만 추출해서 출력
		System.out.println(firstMeetingTime.getYear() + 1900);//원하는 날짜의 년도만 추출
//		System.out.println(year + 1900);//현재년도
		
		//원하는 포맷으로 출력
		//1986년 5월 5일 ?요일이라고 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(sdf.format(firstMeetingTime));
		
		//연습해볼만한 과제 = 년월일을 비교해서 년월일이 같으면 시간과 분을 그렇지않으면 년월일을 출력
		Date a = new Date(98,04,24,02,11);
		Date b = new Date(98,03,24,11,12);
		
		int year = a.getYear() + 1900;
		int year2 = b.getYear() + 1900;
		
		int month = a.getMonth() - 1;
		int month2 = b.getMonth() - 1;
		
		int day = a.getDay();
		int day2 = b.getDay();
		
		int hour = a.getHours();
		int hour2 = b.getHours();
		
		int min = a.getMinutes();
		int min2 = b.getMinutes();
		
		String aymd = year + "" + month + "" + day + "";
		String bymd = year2 + "" + month2 + "" + day2 + "";
		
		if(aymd.equals(bymd)) {
			System.out.println("a의 시간 : " + hour +"시 " + min + "분");
			System.out.println("b의 시간 : " + hour2 +"시 " + min2 + "분");

		}else {
			System.out.println("년,월,일이 다릅니다.");
			
			System.out.println("a의 년/월/일 : " + sdf.format(a));
			System.out.println("b의 년/월/일 : " + year2 + month2 + day2);
		}
		
		
		
		
		
		
	}
	
}
