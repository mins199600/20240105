package com.lotteriaKiosk.hamburgerManage;

import java.util.Random;

public class Pay {
    public void MemberMethod() {
        //멤버 메소드 받을 내용
    }

    public void MenuMethod() {
        //메뉴 메소드 받을 내용
    }
    public void setCoupon(boolean SetDiscount){
        if(SetDiscount){
            System.out.println("쿠폰사용이 완료되었습니다");

        }else{
            System.out.println("세트메뉴로 변경해드리겠습니다");
        }
    }
    public void Coupon() {
        Random rand = new Random();
        int couponCode = rand.nextInt(100);
        //쿠폰 적용할 코드
    }

}