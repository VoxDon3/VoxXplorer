/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import ax.n.x;

public class a
extends x
implements DialogInterface {
    final AlertController f = new AlertController(this.getContext(), this, this.getWindow());

    protected a(Context context, int n8) {
        super(context, a.k(context, n8));
    }

    static int k(Context context, int n8) {
        if ((n8 >>> 24 & 0xFF) >= 1) {
            return n8;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ax.m.a.o, typedValue, true);
        return typedValue.resourceId;
    }

    public Button i(int n8) {
        return this.f.c(n8);
    }

    public ListView j() {
        return this.f.e();
    }

    public void l(int n8) {
        this.f.n(n8);
    }

    public void m(Drawable drawable) {
        this.f.o(drawable);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f.f();
    }

    public boolean onKeyDown(int n8, KeyEvent keyEvent) {
        if (this.f.h(n8, keyEvent)) {
            return true;
        }
        return super.onKeyDown(n8, keyEvent);
    }

    public boolean onKeyUp(int n8, KeyEvent keyEvent) {
        if (this.f.i(n8, keyEvent)) {
            return true;
        }
        return super.onKeyUp(n8, keyEvent);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f.r(charSequence);
    }

    public static class a {
        private final AlertController.f a;
        private final int b;

        public a(Context context) {
            this(context, androidx.appcompat.app.a.k(context, 0));
        }

        public a(Context context, int n8) {
            this.a = new AlertController.f((Context)new ContextThemeWrapper(context, androidx.appcompat.app.a.k(context, n8)));
            this.b = n8;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f f8 = this.a;
            f8.w = listAdapter;
            f8.x = onClickListener;
            return this;
        }

        public a b(boolean bl) {
            this.a.r = bl;
            return this;
        }

        public a c(View view) {
            this.a.g = view;
            return this;
        }

        public a create() {
            a a8 = new a(this.a.a, this.b);
            this.a.a(a8.f);
            a8.setCancelable(this.a.r);
            if (this.a.r) {
                a8.setCanceledOnTouchOutside(true);
            }
            a8.setOnCancelListener(this.a.s);
            a8.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                a8.setOnKeyListener(onKeyListener);
            }
            return a8;
        }

        public a d(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public a e(int n8) {
            AlertController.f f8 = this.a;
            f8.h = f8.a.getText(n8);
            return this;
        }

        public a f(CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public a g(CharSequence[] charSequenceArray, boolean[] blArray, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f f8 = this.a;
            f8.v = charSequenceArray;
            f8.J = onMultiChoiceClickListener;
            f8.F = blArray;
            f8.G = true;
            return this;
        }

        public Context getContext() {
            return this.a.a;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f f8 = this.a;
            f8.l = charSequence;
            f8.n = onClickListener;
            return this;
        }

        public a i(int n8, DialogInterface.OnClickListener onClickListener) {
            AlertController.f f8 = this.a;
            f8.o = f8.a.getText(n8);
            this.a.q = onClickListener;
            return this;
        }

        public a j(DialogInterface.OnCancelListener onCancelListener) {
            this.a.s = onCancelListener;
            return this;
        }

        public a k(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f f8 = this.a;
            f8.i = charSequence;
            f8.k = onClickListener;
            return this;
        }

        public a m(int n8, int n9, DialogInterface.OnClickListener onClickListener) {
            AlertController.f f8 = this.a;
            f8.v = f8.a.getResources().getTextArray(n8);
            f8 = this.a;
            f8.x = onClickListener;
            f8.I = n9;
            f8.H = true;
            return this;
        }

        public a n(ListAdapter listAdapter, int n8, DialogInterface.OnClickListener onClickListener) {
            AlertController.f f8 = this.a;
            f8.w = listAdapter;
            f8.x = onClickListener;
            f8.I = n8;
            f8.H = true;
            return this;
        }

        public a o(CharSequence[] charSequenceArray, int n8, DialogInterface.OnClickListener onClickListener) {
            AlertController.f f8 = this.a;
            f8.v = charSequenceArray;
            f8.x = onClickListener;
            f8.I = n8;
            f8.H = true;
            return this;
        }

        public a p(int n8) {
            AlertController.f f8 = this.a;
            f8.f = f8.a.getText(n8);
            return this;
        }

        public a setNegativeButton(int n8, DialogInterface.OnClickListener onClickListener) {
            AlertController.f f8 = this.a;
            f8.l = f8.a.getText(n8);
            this.a.n = onClickListener;
            return this;
        }

        public a setPositiveButton(int n8, DialogInterface.OnClickListener onClickListener) {
            AlertController.f f8 = this.a;
            f8.i = f8.a.getText(n8);
            this.a.k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.f f8 = this.a;
            f8.z = view;
            f8.y = 0;
            f8.E = false;
            return this;
        }
    }
}

