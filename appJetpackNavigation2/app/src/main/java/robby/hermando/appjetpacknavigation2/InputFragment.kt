package robby.hermando.appjetpacknavigation2


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_input.*

/**
 * A simple [Fragment] subclass.
 */
class InputFragment : Fragment() {

    lateinit var nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        btn_submit.setOnClickListener {
            if (editText.text.toString().isNotEmpty()){
                val input = editText.text.toString()
                val bundle= Bundle()
                bundle.putString("args", input)

                nav.navigate(R.id.action_inputFragment_to_outputFragment, bundle)
            }
        }
    }

}
