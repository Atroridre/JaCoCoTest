import androidx.test.ext.junit.runners.AndroidJUnit4
import com.jacoco.test.MainViewModel
import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*


@RunWith(AndroidJUnit4::class)
class ExampleTest {

    private var viewModel: MainViewModel = MainViewModel()

    @Test
    fun isTextEmptyTest() {
        assertFalse(viewModel.isTextEmpty())
    }

}