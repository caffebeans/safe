package com.sspu.vo;

import lombok.Data;
import sun.net.sdp.SdpProvider;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-08-06 17:10
 **/


@Data
public class ResultVO<T> {

         private int code;
         private String msg;
         private T data;

         public  Object sucesss(Object data){
             code=200;
             this.data= (T) data;
             return this;
         }

         public  Object setMessage(String message){
          msg=message;
          return this;
         }







}
