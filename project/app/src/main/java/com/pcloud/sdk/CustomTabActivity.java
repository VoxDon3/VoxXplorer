/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import ax.L0.a;
import com.pcloud.sdk.AuthorizationActivity;

public class CustomTabActivity
extends Activity {
    private BroadcastReceiver a;

    protected void onActivityResult(int n8, int n9, Intent intent) {
        super.onActivityResult(n8, n9, intent);
        if (n9 == 0) {
            intent = new Intent("CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION");
            intent.putExtra("AuthorizationActivity.EXTRA_URL", (Parcelable)this.getIntent().getData());
            ax.L0.a.b((Context)this).d(intent);
            this.a = new BroadcastReceiver(this){
                final CustomTabActivity a;
                {
                    this.a = customTabActivity;
                }

                public void onReceive(Context context, Intent intent) {
                    this.a.finish();
                }
            };
            ax.L0.a.b((Context)this).c(this.a, new IntentFilter("CustomTabActivity.DESTROY_ACTION"));
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = new Intent((Context)this, AuthorizationActivity.class);
        bundle.setAction("CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION");
        bundle.putExtra("AuthorizationActivity.EXTRA_URL", (Parcelable)this.getIntent().getData());
        bundle.addFlags(0x24000000);
        this.startActivityForResult((Intent)bundle, 1338);
    }

    protected void onDestroy() {
        ax.L0.a.b((Context)this).f(this.a);
        super.onDestroy();
    }
}

