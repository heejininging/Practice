package Collection;

import java.util.Arrays;

public class CollectionTest1 {

	public static void main(String[] args) {
		
		String [] ar = {"List", "Set", "Map"};
		//배열의 데이터를 수정하는 것은 가능
		ar[2] = "HashTable";
		System.out.println(Arrays.toString(ar));

		//ar배열에 데이터를 추가
		//ar배열보다 1개 더 큰 공간을 갖는 br배열 생성
		String[] br = new String[ar.length +1];
		//ar의 내용 복사
		for(int i = 0; i < ar.length; i++) {
			br[i] = ar[i];
		}
		
		//br의 마지막 데이터 추가
		br[br.length-1] = "Propoties";
		//br이 가리키는 곳을 ar이 가리키도록 한다.
		ar = br;
		System.out.println(Arrays.toString(ar));
	
		// Set을 삭제하기.
		ar[1] = "";
		System.out.println(Arrays.toString(ar));
		
		String[] cr = new String[ar.length-1];
	}
	
}
