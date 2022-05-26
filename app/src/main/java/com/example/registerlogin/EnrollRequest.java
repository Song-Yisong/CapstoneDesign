package com.example.registerlogin;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class EnrollRequest extends StringRequest {

    //서버 url 설정 (php파일 연동)
    final static private String URL = "http://dlthd3475.dothome.co.kr/Register.php";
    private Map<String,String> map;
    public EnrollRequest(String userOttname, String userPrice, String userNextpay, String userPaydate, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID", userOttname);
        map.put("userPassword",userPrice);
        map.put("userName",userPaydate);
        map.put("userTell",userNextpay);
    }

    @Nullable
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }

    public EnrollRequest(String url, Response.Listener<String> listener, @Nullable Response.ErrorListener errorListener) {
        super(url, listener, errorListener);
    }
}