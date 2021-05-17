package com.example.task6.adapters

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.task6.fragments.ThirdFragment
import com.example.task6.fragments.FirstFragment
import com.example.task6.fragments.SecondFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment().apply {
                arguments = Bundle().apply {
                    putString("STRING", "123456TEXT")
                }
            }
            2 -> ThirdFragment()
            else -> FirstFragment()
        }
    }


}