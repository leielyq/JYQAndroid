package com.jyq.jyqandroid.base.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.jyq.jyqandroid.R;

/**
 * Created by Administrator on 2017/9/25 0025.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(final Activity activity, Bundle bundle) {

                if (activity.findViewById(R.id.toolbar) != null) { //找到 Toolbar 并且替换 Actionbar
                    Toolbar mBar = activity.findViewById(R.id.toolbar);
                    mBar.setNavigationIcon(R.drawable.ic_arrow_back);
                    mBar.setNavigationOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            activity.finish();
                        }
                    });
                }

                if (activity.findViewById(R.id.toolbar_title) != null) { //找到 Toolbar 的标题栏并设置标题名
                    ((TextView) activity.findViewById(R.id.toolbar_title)).setText(activity.getTitle());
                }

            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }
}
