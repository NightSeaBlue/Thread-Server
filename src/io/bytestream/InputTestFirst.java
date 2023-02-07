package io.bytestream;

/*
	======================================================
	InputStream을 구현한 FileInputStream을 이용한 예
	======================================================
	
	@ int read()
		` 한 바이트를 읽고 이를 0-255사이의 값을 리턴하지만4byte의 int 형으로 리턴
		` 리턴되는 값은 0-255 부호없는 바이트이지만 형변환 과정에서 -128 ~127의 부호 있는 바이트가 된다
		
		
		` 데이타를 읽어들이기 전까지 기다리므로 다른 부분을 실행할 수가 없다
			-> 쓰레드 적용 필요
			
		` 더이상 읽을 바이트가 없으면 -1 리턴
		
		
		
		[ 참고 ]
			int i =  b >= 0 ? b : 256 + b;
*/

import java.io.FileInputStream;
import java.io.IOException;

public class InputTestFirst
{
	public static  void main( String args[] ) 
	{
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			
			int tempData=0;
			
			while(true) {
				tempData = fis.read();
				//EndOfFile => 파일을 다 읽은 경우 -1 을 리턴
				if (tempData == -1) break;
				System.out.print((char)tempData);
			} // end of while
			
			// 통신이 끝난 이후 반드시 경로를 닫아주어야 한다.
			fis.close();
		} catch (Exception e) {
			System.out.println("error"+e.getMessage());
		}
		
		
	}	
}

/*
	======================================
		결과 출력
	======================================

	` 숫자만 나오는데, 우선 열개만 읽어서 숫자 자체로 출력하고
	나머지는 읽어서 (char) 형변환 하면 문자로 출력될 것.
*/

/*
 * 파이썬 기본 타입 : char
 * C 기본 타입 : byte 
 * 
 */
 

/*
 * 	ASCII-Code 
 * 		: 영문자, 기호, 숫자 등등 1Byte로 표현한 코드
 * 		A = 65
 * 		a = 97
 *      
 *      1byte = 8bit
 *      
 *      A : 0 100 0001 => 64 + 1 = 65
 *      B : 0 100 0010 => 64 + 2 = 66
 *      a : 0 110 0001 => 64+32+1 = 97
 *      
 *      
 * 	Unicode : 2byte 표현 코드
 * 		 
 * 
 */
 