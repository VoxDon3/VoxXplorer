package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.preference.DialogPreference;

/* loaded from: classes.dex */
public abstract class c extends androidx.fragment.app.e implements DialogInterface.OnClickListener {
    private int A0;
    private DialogPreference t0;
    private CharSequence u0;
    private CharSequence v0;
    private CharSequence w0;
    private CharSequence x0;
    private int y0;
    private BitmapDrawable z0;

    private static class a {
        static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    private void j3(Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window);
        } else {
            k3();
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.u0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.v0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.w0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.x0);
        bundle.putInt("PreferenceDialogFragment.layout", this.y0);
        BitmapDrawable bitmapDrawable = this.z0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog T2(Bundle bundle) {
        this.A0 = -2;
        a.C0006a h = new a.C0006a(p2()).setTitle(this.u0).d(this.z0).l(this.v0, this).h(this.w0, this);
        View g3 = g3(p2());
        if (g3 != null) {
            f3(g3);
            h.setView(g3);
        } else {
            h.f(this.x0);
        }
        i3(h);
        androidx.appcompat.app.a create = h.create();
        if (e3()) {
            j3(create);
        }
        return create;
    }

    public DialogPreference d3() {
        if (this.t0 == null) {
            this.t0 = (DialogPreference) ((DialogPreference.a) P0()).n(o2().getString("key"));
        }
        return this.t0;
    }

    protected boolean e3() {
        return false;
    }

    protected void f3(View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.x0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    protected View g3(Context context) {
        int i = this.y0;
        if (i == 0) {
            return null;
        }
        return u0().inflate(i, (ViewGroup) null);
    }

    public abstract void h3(boolean z);

    protected void i3(a.C0006a c0006a) {
    }

    protected void k3() {
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        ax.G0.h P0 = P0();
        if (!(P0 instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) P0;
        String string = o2().getString("key");
        if (bundle != null) {
            this.u0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.v0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.w0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.x0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.y0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.z0 = new BitmapDrawable(G0(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.n(string);
        this.t0 = dialogPreference;
        this.u0 = dialogPreference.W0();
        this.v0 = this.t0.Y0();
        this.w0 = this.t0.X0();
        this.x0 = this.t0.V0();
        this.y0 = this.t0.U0();
        Drawable T0 = this.t0.T0();
        if (T0 == null || (T0 instanceof BitmapDrawable)) {
            this.z0 = (BitmapDrawable) T0;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(T0.getIntrinsicWidth(), T0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        T0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        T0.draw(canvas);
        this.z0 = new BitmapDrawable(G0(), createBitmap);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.A0 = i;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        h3(this.A0 == -1);
    }
}
