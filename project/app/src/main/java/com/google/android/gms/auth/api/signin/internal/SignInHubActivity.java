/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.f;
import ax.H5.p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.a;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

@KeepName
public class SignInHubActivity
extends f {
    private static boolean f = false;
    private boolean a = false;
    private SignInConfiguration b;
    private boolean c;
    private int d;
    private Intent e;

    static /* bridge */ /* synthetic */ int F(SignInHubActivity signInHubActivity) {
        return signInHubActivity.d;
    }

    static /* bridge */ /* synthetic */ Intent H(SignInHubActivity signInHubActivity) {
        return signInHubActivity.e;
    }

    private final void I() {
        this.getSupportLoaderManager().e(0, null, new a(this, null));
        f = false;
    }

    private final void J(int n8) {
        Status status = new Status(n8);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", (Parcelable)status);
        this.setResult(0, intent);
        this.finish();
        f = false;
    }

    private final void L(String string) {
        Intent intent = new Intent(string);
        if (string.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(this.getPackageName());
        }
        intent.putExtra("config", (Parcelable)this.b);
        try {
            this.startActivityForResult(intent, 40962);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            this.a = true;
            Log.w((String)"AuthSignInClient", (String)"Could not launch sign in Intent. Google Play Service is probably being updated...");
            this.J(17);
            return;
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override
    protected final void onActivityResult(int n8, int n9, Intent intent) {
        block9: {
            block8: {
                if (this.a) break block8;
                this.setResult(0);
                if (n8 == 40962) break block9;
            }
            return;
        }
        if (intent != null) {
            ax.N5.a a8 = (SignInAccount)intent.getParcelableExtra("signInAccount");
            if (a8 != null && a8.k() != null) {
                if ((a8 = a8.k()) == null) {
                    Log.e((String)"AuthSignInClient", (String)"Google account is null");
                    this.J(12500);
                    return;
                }
                p.a((Context)this).c(this.b.k(), (GoogleSignInAccount)a8);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", (Parcelable)a8);
                this.c = true;
                this.d = n9;
                this.e = intent;
                this.I();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                n8 = n9 = intent.getIntExtra("errorCode", 8);
                if (n9 == 13) {
                    n8 = 12501;
                }
                this.J(n8);
                return;
            }
        }
        this.J(8);
    }

    @Override
    protected final void onCreate(Bundle bundle) {
        boolean bl;
        super.onCreate(bundle);
        Object object = this.getIntent();
        String string = object.getAction();
        if (string == null) {
            Log.e((String)"AuthSignInClient", (String)"Null action");
            this.J(12500);
            return;
        }
        if (string.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e((String)"AuthSignInClient", (String)"Action not implemented");
            this.J(12500);
            return;
        }
        if (!string.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !string.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e((String)"AuthSignInClient", (String)"Unknown action: ".concat(String.valueOf(object.getAction())));
            this.finish();
            return;
        }
        if ((object = object.getBundleExtra("config")) == null) {
            Log.e((String)"AuthSignInClient", (String)"Activity started with no configuration.");
            this.setResult(0);
            this.finish();
            return;
        }
        if ((object = (SignInConfiguration)object.getParcelable("config")) == null) {
            Log.e((String)"AuthSignInClient", (String)"Activity started with invalid configuration.");
            this.setResult(0);
            this.finish();
            return;
        }
        this.b = object;
        if (bundle == null) {
            if (f) {
                this.setResult(0);
                this.J(12502);
                return;
            }
            f = true;
            this.L(string);
            return;
        }
        this.c = bl = bundle.getBoolean("signingInGoogleApiClients");
        if (bl) {
            this.d = bundle.getInt("signInResultCode");
            if ((bundle = (Intent)bundle.getParcelable("signInResultData")) == null) {
                Log.e((String)"AuthSignInClient", (String)"Sign in result data cannot be null");
                this.setResult(0);
                this.finish();
                return;
            }
            this.e = bundle;
            this.I();
        }
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        f = false;
    }

    @Override
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.c);
        if (this.c) {
            bundle.putInt("signInResultCode", this.d);
            bundle.putParcelable("signInResultData", (Parcelable)this.e);
        }
    }
}

