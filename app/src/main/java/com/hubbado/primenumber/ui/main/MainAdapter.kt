package com.hubbado.primenumber.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hubbado.primenumber.R
import kotlinx.android.synthetic.main.item_array_row.view.*


class MainAdapter(
    private val context: Context,
    private var listOfTasks: List<String>
) : RecyclerView.Adapter<MainAdapter.CompletedTaskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompletedTaskViewHolder {
        return CompletedTaskViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_array_row,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listOfTasks.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holderCompleted: CompletedTaskViewHolder, position: Int) {
        holderCompleted.tvArrayRow.text = listOfTasks[position]
    }

    class CompletedTaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvArrayRow: TextView = view.tvArrayRow
    }

    fun setData(updatedListOfTask: List<String>) {
        listOfTasks = updatedListOfTask
        notifyDataSetChanged()
    }
}