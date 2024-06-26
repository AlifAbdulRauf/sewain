package com.horehoreteam.sewain_hackathon2023.mainpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.horehoreteam.sewain_hackathon2023.DataDummy
import com.horehoreteam.sewain_hackathon2023.R
import com.horehoreteam.sewain_hackathon2023.databinding.FragmentNotificationBinding
import com.horehoreteam.sewain_hackathon2023.mainpage.adapter.NotificationAdapter


class NotificationFragment : Fragment() {


    private var _binding: FragmentNotificationBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        rvNotificationRecent?.layout(LinearLayoutManager())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentNotificationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listMessage = DataDummy.generateNotificationMessage()
        val notificationAdapter = NotificationAdapter(listMessage)
        val rvNotificationRecent = binding.rvRecent.also { it.layoutManager = LinearLayoutManager(requireActivity()) }
        val rvNotificationWeek = binding.rvWeek.also { it.layoutManager = LinearLayoutManager(requireActivity()) }
        val rvNotificationMonth = binding.rvMonth.also { it.layoutManager = LinearLayoutManager(requireActivity()) }

        rvNotificationRecent.adapter = notificationAdapter
        rvNotificationWeek.adapter = notificationAdapter
        rvNotificationMonth.adapter = notificationAdapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}