package games.fteng.a2048

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.start_fragment.*


class StartFragment : Fragment() {

    companion object {
        fun newInstance() = StartFragment()
    }

    private lateinit var viewModel: StartViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.start_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(StartViewModel::class.java)
        // TODO: Use the ViewModel

//        start_btn.setOnClickListener{
//            Navigation.findNavController(it).navigate(R.id.action_startFragment_to_gameFragment)
//        }
    }

    fun onStartBtnClicked(view: View) {
        Navigation.findNavController(view).navigate(R.id.action_startFragment_to_gameFragment)
    }

}
