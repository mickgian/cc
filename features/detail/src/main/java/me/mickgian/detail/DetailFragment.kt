package me.mickgian.detail


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.mickgian.common.base.BaseFragment
import me.mickgian.common.base.BaseViewModel
import me.mickgian.detail.databinding.FragmentDetailBinding
import org.koin.android.viewmodel.ext.android.viewModel


/**
 * A simple [BaseFragment] subclass
 * that will show the [User] details.
 */
class DetailFragment : BaseFragment() {

    private val detailViewModel: DetailViewModel by viewModel()
    private lateinit var binding: FragmentDetailBinding
    private lateinit var marketSymbolString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            val safeArgs = DetailFragmentArgs.fromBundle(it)
            marketSymbolString = safeArgs.marketSymbolString
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailBinding .inflate(inflater, container, false)
        binding.viewModel = detailViewModel
        binding.lifecycleOwner = viewLifecycleOwner

        detailViewModel.loadDataWhenFragmentStarts(marketSymbolString)

        return binding.root
    }

    override fun getViewModel(): BaseViewModel = detailViewModel
}
