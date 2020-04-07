package com.jzw.springcloud.entity;

import lombok.Data;

@Data
public class CommonResult<T>  {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this.code=code;
        this.message=message;
        this.data=null;
    }

    public CommonResult(){
        this.code=null;
        this.message=null;
        this.data=null;
    }

    public CommonResult(Integer code,String message,T data){
        this.code=code;
        this.message=message;
        this.data=data;
    }

}
