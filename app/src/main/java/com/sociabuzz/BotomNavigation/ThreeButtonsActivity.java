package com.sociabuzz.BotomNavigation;

import android.support.annotation.IdRes;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabSelectedListener;
import com.sociabuzz.R;

public class ThreeButtonsActivity extends AppCompatActivity {
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_buttons);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.three_buttons_activity);

        BottomBar bottomBar = BottomBar.attach(this, savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.three_buttons_menu, new OnMenuTabSelectedListener() {
            @Override
            public void onMenuItemSelected(@IdRes int itemId) {
                switch (itemId) {
                    case R.id.recent_item:
                        Snackbar.make(coordinatorLayout, "Recent Item Selected", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.favorite_item:
                        Snackbar.make(coordinatorLayout, null, Snackbar.LENGTH_LONG).show();
                    case R.id.location_item:
                        Snackbar.make(coordinatorLayout, "Recent Item Selected", Snackbar.LENGTH_LONG).show();
                }
            }
        });

        // Set the color for the active tab. Ignored on mobile when there are more than three tabs.
        bottomBar.setActiveTabColor("#C2185B");


    }
}
