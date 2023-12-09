//package com.amrh.challenge.matches
//
//import android.os.Bundle
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.viewModels
//import androidx.navigation.fragment.findNavController
//import com.amrh.challenge.MainActivity
//import com.amrh.challenge.matches.matchesAdaptors.MatchesSectionedByDateAdapter
//import com.innov8.moneyfellowscourier.databinding.FragmentSplashBinding
//import com.innov8.moneyfellowscourier.utils.actionAfter
//import dagger.hilt.android.AndroidEntryPoint
//import javax.inject.Inject
//
//
//@AndroidEntryPoint
//class SplashFragmentCode : Fragment(), MatchesSectionedByDateAdapter.MatchesSectionedByDateListener {
//
//    val viewModel: MatchesViewModel by viewModels()
//
//    @Inject
//    lateinit var adapter: MatchesSectionedByDateAdapter
//
//    private var _binding: FragmentSplashBinding? = null
//
//    // This property is only valid between onCreateView and
//    // onDestroyView.
//    private val binding get() = _binding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding = FragmentSplashBinding.inflate(inflater, container, false)
//        return binding.root
//
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        observeMatches()
//        observeFavoritesMatchesIDs()
//        setupAdaptor()
//        listeners()
//    }
//
//
//    override fun onResume() {
//        super.onResume()
//
//        actionAfter(1000) { sendIntentFavIds() }
//
//    }
//
//    private fun setupAdaptor() {
//        binding.rvAllMatches.adapter = adapter
//        adapter.listener = this
//    }
//
//    private fun listeners() {
//        binding.include.llShowFav.setOnClickListener {
//            findNavController().navigate(MatchesFragmentDirections.actionNavigationMatchesToFavoritesMatchesFragment())
//        }
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//
//
//    private fun observeMatches() {
//        (activity as MainActivity).showProgress(true)
//        viewModel.stateMatches.observe(viewLifecycleOwner) { result ->
//            (activity as MainActivity).showProgress(false)
//            when (result) {
//                is Result.Success -> {
//
//                    adapter.updateMatchesMap(result.data.value)
//
//
//                }
//                is Result.Loading -> {
//                    (activity as MainActivity).showProgress(true)
//                }
//                is Result.Failure -> {
//                    context?.showToast(result.exception?.localizedMessage.toString())
//                }
//            }
//        }
//    }
//
//
//    private fun observeFavoritesMatchesIDs() {
//        (activity as MainActivity).showProgress(true)
//        viewModel.stateFavoritesMatchesIds.observe(viewLifecycleOwner) { result ->
//            (activity as MainActivity).showProgress(false)
//            adapter.updateMatchesMap(
//                viewModel.convertMatchesFavStatesDependsOnIds(
//                    result as MutableList<Int>,
//                    adapter.sectionedByDateMap
//                )
//            )
//            Log.e("TAG", "observeFavoritesMatchesIDs: ${result.toString()}")
//        }
//    }
//
//    private fun sendIntentFavIds() {
//        viewModel.getFavoriteMatchesIds()
//    }
//
//    private fun addFavoriteMatch(match: Match) {
//        viewModel.addFavoriteMatch(match)
//    }
//
//    private fun removeFavoriteMatch(match: Match) {
//        viewModel.removeFavoriteMatch(match)
//    }
//
//
//
//
//    override fun onClicked(match: Match, isFavorite: Boolean) {
//        if (isFavorite) {
//            addFavoriteMatch(match)
//        } else {
//            removeFavoriteMatch(match)
//        }
//    }
//}