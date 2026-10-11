/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import ax.J5.h;
import ax.M5.p;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.c;

@KeepName
public class GoogleApiActivity
extends Activity
implements DialogInterface.OnCancelListener {
    protected int a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int n8, boolean bl) {
        context = new Intent(context, GoogleApiActivity.class);
        context.putExtra("pending_intent", (Parcelable)pendingIntent);
        context.putExtra("failing_client_id", n8);
        context.putExtra("notify_manager", bl);
        return context;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void b() {
        Object object2;
        Object object;
        block13: {
            Throwable var2_7;
            block12: {
                object = this.getIntent().getExtras();
                if (object == null) {
                    Log.e((String)"GoogleApiActivity", (String)"Activity started without extras");
                    this.finish();
                    return;
                }
                object2 = (PendingIntent)object.get("pending_intent");
                Integer n8 = (Integer)object.get("error_code");
                if (object2 == null && n8 == null) {
                    Log.e((String)"GoogleApiActivity", (String)"Activity started without resolution");
                    this.finish();
                    return;
                }
                if (object2 == null) {
                    int n9 = p.l(n8);
                    h.o().p(this, n9, 2, this);
                    this.a = 1;
                    return;
                }
                try {
                    n8 = object2.getIntentSender();
                }
                catch (IntentSender.SendIntentException sendIntentException) {
                    // empty catch block
                    break block12;
                }
                catch (ActivityNotFoundException activityNotFoundException) {
                    // empty catch block
                    break block13;
                }
                try {
                    this.startIntentSenderForResult((IntentSender)n8, 1, null, 0, 0, 0);
                    this.a = 1;
                    return;
                }
                catch (IntentSender.SendIntentException sendIntentException) {
                }
                catch (ActivityNotFoundException activityNotFoundException) {
                    break block13;
                }
            }
            Log.e((String)"GoogleApiActivity", (String)"Failed to launch pendingIntent", (Throwable)var2_7);
            this.finish();
            return;
        }
        if (object.getBoolean("notify_manager", true)) {
            c.u((Context)this).D(new ax.J5.c(22, null), this.getIntent().getIntExtra("failing_client_id", -1));
        } else {
            Throwable var2_9;
            object2 = object2.toString();
            object = new StringBuilder();
            ((StringBuilder)object).append("Activity not found while launching ");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(".");
            object = ((StringBuilder)object).toString();
            object2 = object;
            if (Build.FINGERPRINT.contains("generic")) {
                object2 = ((String)object).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
            }
            Log.e((String)"GoogleApiActivity", (String)object2, (Throwable)var2_9);
        }
        this.a = 1;
        this.finish();
    }

    protected final void onActivityResult(int n8, int n9, Intent object) {
        super.onActivityResult(n8, n9, (Intent)object);
        if (n8 == 1) {
            boolean bl = this.getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            this.setResult(n9, (Intent)object);
            if (bl) {
                object = c.u((Context)this);
                if (n9 != -1) {
                    if (n9 == 0) {
                        ((c)object).D(new ax.J5.c(13, null), this.getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    ((c)object).E();
                }
            }
        } else if (n8 == 2) {
            this.a = 0;
            this.setResult(n9, (Intent)object);
        }
        this.finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        this.setResult(0);
        this.finish();
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            this.b();
        }
    }

    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }
}

