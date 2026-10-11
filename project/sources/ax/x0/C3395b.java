package ax.x0;

import android.annotation.SuppressLint;
import android.text.Editable;
import ax.v0.C3247d;

/* renamed from: ax.x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3395b extends Editable.Factory {
    private static final Object a = new Object();
    private static volatile Editable.Factory b;
    private static Class<?> c;

    @SuppressLint({"PrivateApi"})
    private C3395b() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C3395b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (a) {
                try {
                    if (b == null) {
                        b = new C3395b();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = c;
        return cls != null ? C3247d.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
