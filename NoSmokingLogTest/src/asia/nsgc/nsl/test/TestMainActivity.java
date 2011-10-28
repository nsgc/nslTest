package asia.nsgc.nsl.test;

import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;
import asia.nsgc.nsl.Activity.MainActivity;

public class TestMainActivity extends ActivityInstrumentationTestCase2<MainActivity> {
	private Solo solo;
	
	public TestMainActivity() {
		super("asia.nsgc.nsl.Activity", MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}

	protected void tearDown() throws Exception {
		try {
			solo.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		getActivity().finish();
		super.tearDown();
	}

}
