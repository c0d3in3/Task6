package com.example.task6.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.task6.Person
import com.example.task6.R

class RecyclerViewAdapter(private val list: List<Person>) :
    RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val imageView = itemView.findViewById<ImageView>(R.id.imageView)
        private val firstNameTextView: TextView = itemView.findViewById(R.id.textView)
        private val lastNameTextView: TextView = itemView.findViewById(R.id.textView2)

        fun bindPerson(person: Person) {

            Glide.with(itemView)
                .load(person.imageUrl)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(imageView)

            firstNameTextView.text = person.firstName

            lastNameTextView.text = person.lastName

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bindPerson(list[position])
    }

    override fun getItemCount() = list.size

}