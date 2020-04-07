package com.jzw.springcloud.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable {
    private long id;

    private String serial;

    public Payment(long id,String serial){
        this.id=id;
        this.serial=serial;

    }
    public Payment(){

    }


}
