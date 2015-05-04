package y.q.wifisend.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import y.q.wifisend.Activity.Recive.ReciveActivity;
import y.q.wifisend.Activity.Send.FileChoseActivity;
import y.q.wifisend.Base.BaseActivity;
import y.q.wifisend.R;

/**
 * Created by CFun on 2015/4/11.
 */
public class HomeActivity extends BaseActivity implements View.OnClickListener
{

	private TextView sendBtn = null;
	private TextView reviveBtn = null;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		initView();
	}

	private void initView()
	{
		reviveBtn = (TextView) findViewById(R.id.tv_recive);
		sendBtn = (TextView) findViewById(R.id.tv_send);

		reviveBtn.setOnClickListener(this);
		sendBtn.setOnClickListener(this);
	}


	@Override
	public void onClick(View v)
	{
		Intent intent;
		switch (v.getId())
		{
			case R.id.tv_recive:
//                intent = new Intent(this, WaittingReciveActivity.class);
				intent = new Intent(this, ReciveActivity.class);
				startActivity(intent);
				break;
			case R.id.tv_send:
				intent = new Intent(this, FileChoseActivity.class);
				startActivity(intent);
				break;
		}
	}
}
