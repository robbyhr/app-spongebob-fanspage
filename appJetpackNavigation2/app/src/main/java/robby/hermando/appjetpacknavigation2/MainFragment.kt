package robby.hermando.appjetpacknavigation2


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    lateinit var nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        btnconstraint.setOnClickListener {
            nav.navigate(R.id.action_mainFragment_to_constraintLayout)
        }

        btnlinear.setOnClickListener {
            nav.navigate(R.id.action_mainFragment_to_linearLayout)
        }

        btnnavigate.setOnClickListener {
            nav.navigate(R.id.action_mainFragment_to_inputFragment)
        }
    }
}
