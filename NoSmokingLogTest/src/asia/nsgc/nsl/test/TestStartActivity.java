package asia.nsgc.nsl.test;

import junit.framework.Assert;

import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;
import asia.nsgc.nsl.R;
import asia.nsgc.nsl.Activity.StartActivity;

public class TestStartActivity extends ActivityInstrumentationTestCase2<StartActivity> {
	private Solo solo;
	
	public TestStartActivity() {
		super("asia.nsgc.nsl.Activity", StartActivity.class);
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
	
	public void testDisplayBlackBox(){
		solo.assertCurrentActivity("Expected StartActivity", "StartActivity");
		Assert.assertTrue(solo.searchText("煙草1本あたりの値段"));
		solo.enterText(0, "20");
		solo.clickOnButton("スタート");
		solo.assertCurrentActivity("Expected MainActivity", "MainActivity");
	}

}
