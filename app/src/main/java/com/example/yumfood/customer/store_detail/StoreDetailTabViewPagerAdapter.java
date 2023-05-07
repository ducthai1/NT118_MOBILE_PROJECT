package com.example.yumfood.customer.store_detail;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.yumfood.customer.store_detail.order_tab.StoreOrderTabFragment;
import com.example.yumfood.customer.store_detail.review_tab.StoreReviewTabFragment;
import com.example.yumfood.customer.store_detail.info_tab.StoreInfoTabFragment;

import com.example.yumfood.models.Store;

public class StoreDetailTabViewPagerAdapter extends FragmentStateAdapter {

    private Store storedetail;

    public StoreDetailTabViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, Store storedetail) {
        super(fragmentActivity);
        this.storedetail = storedetail;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new StoreOrderTabFragment(storedetail);
            case 1:
                return new StoreReviewTabFragment(storedetail);
            case 2:
                return new StoreInfoTabFragment(storedetail);
            default:
                return new StoreOrderTabFragment(storedetail);
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}