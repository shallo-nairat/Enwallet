package com.akirachix.enwallet_project

import android.os.Binder
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvIncomes.layoutManager=LinearLayoutManager(this)
        displaySalary()
        }
    fun displaySalary(){
        var income1=Enwallet("","Salary","KES 40000","1 July 2024")
        var income2=Enwallet("","Rent","KES 16000","2 July 2024")
        var income3=Enwallet("","Dividends","KES 2400","5 July 2024")
        var income4=Enwallet("","Electricity","KES 800","5 July 2024")
        var income5=Enwallet("","Internet","KES 2500","5 July 2024")
        var income6=Enwallet("","Shopping","KES 3500","5 July 2024")
        var income7=Enwallet("","Bus fare","KES 500","11 July 2024")
        var income8=Enwallet("","Waterbill","KES 5000"," 12 July 2024")
        var income9=Enwallet("","Laundry","KES 2000","14 July 2024")
        var income10=Enwallet("","Food","KES 16000","3 July 2024")
        var income11=Enwallet("","Zuku","KES 5000","1 July 2024")


        val salaryList = listOf(income1,income1,income3,income4,income5,income6,income7,income8,income9,income10,income11)
        val enwalletAdapter= EnwalletAdapter(salaryList)
        binding.rvIncomes.adapter=enwalletAdapter








    }
}