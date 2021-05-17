package com.example.task6.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task6.Person
import com.example.task6.adapters.RecyclerViewAdapter
import com.example.task6.R

class ThirdFragment : Fragment(R.layout.fragment_third) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerView)

        recyclerViewAdapter = RecyclerViewAdapter(getData())
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = recyclerViewAdapter
    }

    private fun getData(): List<Person> {

        val persons = ArrayList<Person>()

        persons.add(
            Person(
                1,
                "https://www.focus2move.com/wp-content/uploads/2020/01/Tesla-Roadster-2020-1024-03.jpg",
                "gela",
                "gelaevichi"
            )
        )

        persons.add(
            Person(
                2,
                "https://media.ed.edmunds-media.com/bmw/3-series/2003/oem/2003_bmw_3-series_sedan_330i_fq_oem_1_500.jpg",
                "Guka",
                "Plexanovski"
            )
        )

        persons.add(
            Person(
                3,
                "https://www.motortrend.com/uploads/sites/5/2020/06/2020-Mercedes-AMG-GLC-43-34.jpg",
                "Nazi",
                "Txlashadze"
            )
        )

        persons.add(
            Person(
                1,
                "https://www.focus2move.com/wp-content/uploads/2020/01/Tesla-Roadster-2020-1024-03.jpg",
                "gela",
                "gelaevichi"
            )
        )

        persons.add(
            Person(
                1,
                "https://www.focus2move.com/wp-content/uploads/2020/01/Tesla-Roadster-2020-1024-03.jpg",
                "gela",
                "gelaevichi"
            )
        )

        persons.add(
            Person(
                3,
                "https://www.motortrend.com/uploads/sites/5/2020/06/2020-Mercedes-AMG-GLC-43-34.jpg",
                "Nazi",
                "Txlashadze"
            )
        )
        return persons
    }
}