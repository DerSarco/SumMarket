package com.sarco.summarket.presentation

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.sarco.summarket.R
import com.sarco.summarket.databinding.FragmentListBinding

class listFragment : Fragment() {

    private lateinit var mBinding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mBinding = FragmentListBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        return mBinding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_create -> testMenu()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun testMenu() {
        Toast.makeText(mBinding.root.context, "Botón presionado", Toast.LENGTH_SHORT).show()
    }

}