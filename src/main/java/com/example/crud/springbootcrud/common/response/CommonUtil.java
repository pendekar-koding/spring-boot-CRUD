package com.example.crud.springbootcrud.common.response;

import javax.servlet.http.HttpServletRequest;

public class CommonUtil {

    public CommonUtil() {
    }

    public static boolean cekNipIdor(HttpServletRequest request, String nip){
        boolean bResult = true;
        String loggedUser = request.getHeader("loggedUser");
        if (loggedUser !=null && nip!= null){
            bResult=nip.equals(loggedUser);
        }else if(nip == null) {
            bResult = false;
        }
        return bResult;
    }

    public static boolean isJpeg(String base64){
        boolean result = false;
        if (base64 != null && base64.length () > 4){
            result = base64.substring (0, 3).equalsIgnoreCase ("/9j");
        }
        return result;
    }

}
