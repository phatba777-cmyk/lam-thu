package com.example.studentprofile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studentprofile.model.Student

class MainActivity : AppCompatActivity() {

    // Đối tượng sinh viên hiện tại
    private var currentStudent = Student(
        id = "22505120005",
        name = "Nguyễn Văn An",
        className = "22CT111",
        email = "an.nv@ute.udn.vn",
        gpa = 3.75
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Hàm gán toàn bộ thông tin từ model lên các Views giao diện
    private fun bindStudentData(student: Student) {
        // Code binding dữ liệu
    }
}