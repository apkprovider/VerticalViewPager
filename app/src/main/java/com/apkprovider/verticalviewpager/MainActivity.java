package com.apkprovider.verticalviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.apkprovider.verticalviewpager.verticalviewpager.StackTransformer;
import com.apkprovider.verticalviewpager.verticalviewpager.VerticalViewPager;
import com.apkprovider.verticalviewpager.verticalviewpager.ZoomOutTransformer;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");
        initViewPager();
    }

    private void initViewPager() {
        VerticalViewPager viewPager = (VerticalViewPager) findViewById(R.id.vertical_viewpager);

        // Customize the Page Transforamtion from here
        //viewPager.setPageTransformer(true, new ZoomOutTransformer());
        //viewPager.setPageTransformer(true, new StackTransformer());

        String title1 = "Vertical View Pager 1";
        String title2 = "Vertical View Pager 2";
        String title3 = "Vertical View Pager 3";
        String title4 = "Vertical View Pager 4";
        String title5 = "Vertical View Pager 5";
        viewPager.setAdapter(new ContentFragmentAdapter.Holder(getSupportFragmentManager())
                .add(ContentFragment.newInstance(title1, 1))
                .add(ContentFragment.newInstance(title2, 2))
                .add(ContentFragment.newInstance(title3, 3))
                .add(ContentFragment.newInstance(title4, 4))
                .add(ContentFragment.newInstance(title5, 5))
                .set());
        //If you setting other scroll mode, the scrolled fade is shown from either side of display.
        viewPager.setOverScrollMode(View.OVER_SCROLL_NEVER);
    }
}
