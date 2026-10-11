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
import ax.m.C2506a;
import ax.n.x;

/* loaded from: classes.dex */
public class a extends x implements DialogInterface {
    final AlertController f;

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0006a {
        private final AlertController.f a;
        private final int b;

        public C0006a(Context context) {
            this(context, a.k(context, 0));
        }

        public C0006a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public C0006a b(boolean z) {
            this.a.r = z;
            return this;
        }

        public C0006a c(View view) {
            this.a.g = view;
            return this;
        }

        public a create() {
            a aVar = new a(this.a.a, this.b);
            this.a.a(aVar.f);
            aVar.setCancelable(this.a.r);
            if (this.a.r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.a.s);
            aVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public C0006a d(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public C0006a e(int i) {
            AlertController.f fVar = this.a;
            fVar.h = fVar.a.getText(i);
            return this;
        }

        public C0006a f(CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public C0006a g(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public Context getContext() {
            return this.a.a;
        }

        public C0006a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public C0006a i(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.o = fVar.a.getText(i);
            this.a.q = onClickListener;
            return this;
        }

        public C0006a j(DialogInterface.OnCancelListener onCancelListener) {
            this.a.s = onCancelListener;
            return this;
        }

        public C0006a k(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public C0006a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public C0006a m(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = fVar.a.getResources().getTextArray(i);
            AlertController.f fVar2 = this.a;
            fVar2.x = onClickListener;
            fVar2.I = i2;
            fVar2.H = true;
            return this;
        }

        public C0006a n(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public C0006a o(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public C0006a p(int i) {
            AlertController.f fVar = this.a;
            fVar.f = fVar.a.getText(i);
            return this;
        }

        public C0006a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.l = fVar.a.getText(i);
            this.a.n = onClickListener;
            return this;
        }

        public C0006a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.i = fVar.a.getText(i);
            this.a.k = onClickListener;
            return this;
        }

        public C0006a setTitle(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public C0006a setView(View view) {
            AlertController.f fVar = this.a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        public C0006a(Context context, int i) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, a.k(context, i)));
            this.b = i;
        }
    }

    protected a(Context context, int i) {
        super(context, k(context, i));
        this.f = new AlertController(getContext(), this, getWindow());
    }

    static int k(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2506a.o, typedValue, true);
        return typedValue.resourceId;
    }

    public Button i(int i) {
        return this.f.c(i);
    }

    public ListView j() {
        return this.f.e();
    }

    public void l(int i) {
        this.f.n(i);
    }

    public void m(Drawable drawable) {
        this.f.o(drawable);
    }

    @Override // ax.n.x, ax.i.DialogC2198n, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f.i(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // ax.n.x, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f.r(charSequence);
    }
}
