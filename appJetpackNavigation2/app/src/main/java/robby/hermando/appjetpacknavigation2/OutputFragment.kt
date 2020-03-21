package robby.hermando.appjetpacknavigation2


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import kotlinx.android.synthetic.main.fragment_output.*

/**
 * A simple [Fragment] subclass.
 */
class OutputFragment : Fragment() {

    lateinit var nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_output, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hasilTangkap = arguments?.getString( "args")
            textView.text = hasilTangkap
    }

}
