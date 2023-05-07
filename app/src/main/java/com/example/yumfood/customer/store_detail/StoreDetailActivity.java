package com.example.yumfood.customer.store_detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.yumfood.R;
import com.example.yumfood.models.Store;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class StoreDetailActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private ViewPager2 viewPager;

    private Store storedetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_detail);

        tablayout = findViewById(R.id.StoreTab);
        viewPager = findViewById(R.id.StoreViewPager);

        final StoreDetailTabViewPagerAdapter adapter = new StoreDetailTabViewPagerAdapter(this, storedetail);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tablayout, viewPager, (tab, position) -> {
            switch (position){
                case 0:
                    tab.setText("Đặt đơn");
                    break;
                case 1:
                    tab.setText("Đánh giá");
                    break;
                case 2:
                    tab.setText("Thông tin");
                    break;
            }
        }).attach();
        tablayout.setTranslationY(0);
        tablayout.setAlpha(1);
    }
}