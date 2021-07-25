package com.javaex.problem02;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        // 친구정보 입력받기
        String friendData;
        
        for (int i = 0; i < friendArray.length; i++) {
        	friendData = sc.next();
        }
 
        // 입력받은 친구정보를 공백으로 분리
        
        
       
       
        // Friend 객체 생성하여 데이터 넣기
        Friend friend1 = new Friend();
        friend1.setName("ㅇㅇㅇ");
        friend1.setHp("34535");
        friend1.setSchool("ㅅ");
        
        Friend friend2 = new Friend();
        friend2.setName(null);
        friend2.setHp(null);
        friend2.setSchool(null);
        
        Friend friend3 = new Friend();
        friend3.setName(null);
        friend3.setHp(null);
        friend3.setSchool(null);


        // 배열에 추가하기

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        	
        }

        sc.close();
    }

}
