package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class EnrollActivity extends AppCompatActivity {

    private EditText et_ottname, et_price, et_nextpay, et_paydate;
    private Button btn_enroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //액티비티 시작시 처음으로 실행되는 생명주기!
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        //아이디 값 찾아주기
        et_ottname = findViewById(R.id.et_ottname);
        et_price = findViewById(R.id.et_price);
        et_nextpay = findViewById(R.id.et_nextpay);
        et_paydate = findViewById(R.id.et_paydate);

        //회원가입 버튼 클릭 시 수행
        btn_enroll = findViewById(R.id.btn_enroll);
        btn_enroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //EditText에 현재 입력되어 있는 값을 get 해온다.
                String userOttname = et_ottname.getText().toString();
                String userPrice = et_price.getText().toString();
                String userNextpay = et_nextpay.getText().toString();
                String userPaydate = et_paydate.getText().toString();

//                Response.Listener<String> responseListener = new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        try {
//                            JSONObject jsonObject = new JSONObject(response);
//                            boolean success = jsonObject.getBoolean("success");
//                            if(success){ // 서비스 등록에 성공한 경우
//                                Toast.makeText(getApplicationContext(), "OTT 구독 정보 등록에 성공하였습니다.", Toast.LENGTH_SHORT).show();
//                                Intent intent = new Intent(EnrollActivity.this, LoginActivity.class);
//                                startActivity(intent);
//                            } else{ // 등록에 실패한 경우
//                                Toast.makeText(getApplicationContext(), "등록에 실패하였습니다.", Toast.LENGTH_SHORT).show();
//                                return;
//                            }
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                };
//                //서버로 Volley를 이용해서 전송을 함
//                EnrollRequest enrollRequest = new EnrollRequest(userOttname, userPrice, userNextpay, userPaydate, responseListener);
//                RequestQueue queue = Volley.newRequestQueue(EnrollActivity.this);
//                queue.add(enrollRequest);
            }
        });
    }
}