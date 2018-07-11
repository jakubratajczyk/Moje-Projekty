package org.cadenhead.ecommerce;

public class ZipCode {
    private String code;

    ZipCode(String postCode){
        if(postCode.length()==5)
        {
            this.code=postCode;
        }else
        {
            code="ERROR";
        }
    }

    String getCode()
    {
        return this.code;
    }
}
