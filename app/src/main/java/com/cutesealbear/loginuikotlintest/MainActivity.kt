package com.cutesealbear.loginuikotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

//            아이디 입력값, 비번 입력값을 각각의 변수에 저장.

            val inputId = idEdt.text.toString()
            val inputPw = passwordEdt.text.toString()

//            두개의 변수에 들어있는 값 검사. (맞는 아이디/비번)
//            맞을때 => 틀릴때 분기처리. (if문 활용)
//            ID맞고, 비번도 맞아야 함. => 그래야 관리자.

            if (inputId == "admin@test.com" && inputPw == "qwer") {

//                관리자 이름을 변수에 임시 저장.
                val name = "물곰이"

//                둘다 맞다면 => 관리자입니다. 토스트

                Toast.makeText(this, "${name} 관리자입니다.", Toast.LENGTH_SHORT).show()

            }
            else {
//                아이디 내지는 비번 중 하나라도 틀리면 로그인 실패 토스트.
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }


        }

    }
}