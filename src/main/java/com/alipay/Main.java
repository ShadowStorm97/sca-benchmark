package com.alipay;

import com.zoloz.zprod.face.handler.FaceVerifyServerModeInitHandler;
import com.zoloz.zprod.face.model.request.FaceInitRequest;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FaceVerifyServerModeInitHandler handler = new FaceVerifyServerModeInitHandler();
        handler.initContext(new FaceInitRequest(null, null));
    }
}