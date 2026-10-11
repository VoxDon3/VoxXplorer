/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.fragment.app.e;
import androidx.preference.DialogPreference;

public abstract class c
extends e
implements DialogInterface.OnClickListener {
    private int A0;
    private DialogPreference t0;
    private CharSequence u0;
    private CharSequence v0;
    private CharSequence w0;
    private CharSequence x0;
    private int y0;
    private BitmapDrawable z0;

    private void j3(Dialog dialog) {
        dialog = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a((Window)dialog);
            return;
        }
        this.k3();
    }

    @Override
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.u0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.v0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.w0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.x0);
        bundle.putInt("PreferenceDialogFragment.layout", this.y0);
        BitmapDrawable bitmapDrawable = this.z0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", (Parcelable)bitmapDrawable.getBitmap());
        }
    }

    @Override
    public Dialog T2(Bundle object) {
        this.A0 = -2;
        a.a a8 = new a.a(this.p2()).setTitle(this.u0).d((Drawable)this.z0).l(this.v0, this).h(this.w0, this);
        object = this.g3(this.p2());
        if (object != null) {
            this.f3((View)object);
            a8.setView((View)object);
        } else {
            a8.f(this.x0);
        }
        this.i3(a8);
        object = a8.create();
        if (this.e3()) {
            this.j3((Dialog)object);
        }
        return object;
    }

    public DialogPreference d3() {
        if (this.t0 == null) {
            String string = this.o2().getString("key");
            this.t0 = (DialogPreference)((DialogPreference.a)((Object)this.P0())).n(string);
        }
        return this.t0;
    }

    protected boolean e3() {
        return false;
    }

    protected void f3(View view) {
        if ((view = view.findViewById(16908299)) != null) {
            int n8;
            CharSequence charSequence = this.x0;
            if (!TextUtils.isEmpty((CharSequence)charSequence)) {
                if (view instanceof TextView) {
                    ((TextView)view).setText(charSequence);
                }
                n8 = 0;
            } else {
                n8 = 8;
            }
            if (view.getVisibility() != n8) {
                view.setVisibility(n8);
            }
        }
    }

    protected View g3(Context context) {
        int n8 = this.y0;
        if (n8 == 0) {
            return null;
        }
        return this.u0().inflate(n8, null);
    }

    public abstract void h3(boolean var1);

    protected void i3(a.a a8) {
    }

    protected void k3() {
    }

    @Override
    public void n1(Bundle object) {
        super.n1((Bundle)object);
        Object object2 = this.P0();
        if (object2 instanceof DialogPreference.a) {
            DialogPreference.a a8 = (DialogPreference.a)object2;
            object2 = this.o2().getString("key");
            if (object == null) {
                object = (DialogPreference)a8.n((CharSequence)object2);
                this.t0 = object;
                this.u0 = ((DialogPreference)object).W0();
                this.v0 = this.t0.Y0();
                this.w0 = this.t0.X0();
                this.x0 = this.t0.V0();
                this.y0 = this.t0.U0();
                a8 = this.t0.T0();
                if (a8 != null && !(a8 instanceof BitmapDrawable)) {
                    object2 = Bitmap.createBitmap((int)a8.getIntrinsicWidth(), (int)a8.getIntrinsicHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
                    object = new Canvas((Bitmap)object2);
                    a8.setBounds(0, 0, object.getWidth(), object.getHeight());
                    a8.draw((Canvas)object);
                    this.z0 = new BitmapDrawable(this.G0(), (Bitmap)object2);
                    return;
                }
                this.z0 = (BitmapDrawable)a8;
                return;
            }
            this.u0 = object.getCharSequence("PreferenceDialogFragment.title");
            this.v0 = object.getCharSequence("PreferenceDialogFragment.positiveText");
            this.w0 = object.getCharSequence("PreferenceDialogFragment.negativeText");
            this.x0 = object.getCharSequence("PreferenceDialogFragment.message");
            this.y0 = object.getInt("PreferenceDialogFragment.layout", 0);
            if ((object = (Bitmap)object.getParcelable("PreferenceDialogFragment.icon")) != null) {
                this.z0 = new BitmapDrawable(this.G0(), (Bitmap)object);
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public void onClick(DialogInterface dialogInterface, int n8) {
        this.A0 = n8;
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        boolean bl = this.A0 == -1;
        this.h3(bl);
    }

    private static class a {
        static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }
}

