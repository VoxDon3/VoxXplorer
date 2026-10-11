/*
 * Decompiled with CFR 0.152.
 */
package ax.v0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import ax.b0.g;
import ax.v0.c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class d
extends SpannableStringBuilder {
    private final List<a> c0 = new ArrayList<a>();
    private final Class<?> q;

    d(Class<?> clazz, CharSequence charSequence) {
        super(charSequence);
        g.h(clazz, "watcherClass cannot be null");
        this.q = clazz;
    }

    d(Class<?> clazz, CharSequence charSequence, int n8, int n9) {
        super(charSequence, n8, n9);
        g.h(clazz, "watcherClass cannot be null");
        this.q = clazz;
    }

    private void b() {
        for (int i8 = 0; i8 < this.c0.size(); ++i8) {
            this.c0.get(i8).a();
        }
    }

    public static d c(Class<?> clazz, CharSequence charSequence) {
        return new d(clazz, charSequence);
    }

    private void e() {
        for (int i8 = 0; i8 < this.c0.size(); ++i8) {
            this.c0.get(i8).onTextChanged((CharSequence)((Object)this), 0, this.length(), this.length());
        }
    }

    private a f(Object object) {
        for (int i8 = 0; i8 < this.c0.size(); ++i8) {
            a a8 = this.c0.get(i8);
            if (a8.a != object) continue;
            return a8;
        }
        return null;
    }

    private boolean g(Class<?> clazz) {
        return this.q == clazz;
    }

    private boolean h(Object object) {
        return object != null && this.g(object.getClass());
    }

    private void i() {
        for (int i8 = 0; i8 < this.c0.size(); ++i8) {
            this.c0.get(i8).c();
        }
    }

    public void a() {
        this.b();
    }

    public SpannableStringBuilder append(char c8) {
        super.append(c8);
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint(value={"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint(value={"UnknownNullness"}) CharSequence charSequence, int n8, int n9) {
        super.append(charSequence, n8, n9);
        return this;
    }

    @SuppressLint(value={"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object object, int n8) {
        super.append(charSequence, object, n8);
        return this;
    }

    public void d() {
        this.i();
        this.e();
    }

    @SuppressLint(value={"UnknownNullness"})
    public SpannableStringBuilder delete(int n8, int n9) {
        super.delete(n8, n9);
        return this;
    }

    public int getSpanEnd(Object object) {
        Object object2 = object;
        if (this.h(object)) {
            a a8 = this.f(object);
            object2 = object;
            if (a8 != null) {
                object2 = a8;
            }
        }
        return super.getSpanEnd(object2);
    }

    public int getSpanFlags(Object object) {
        Object object2 = object;
        if (this.h(object)) {
            a a8 = this.f(object);
            object2 = object;
            if (a8 != null) {
                object2 = a8;
            }
        }
        return super.getSpanFlags(object2);
    }

    public int getSpanStart(Object object) {
        Object object2 = object;
        if (this.h(object)) {
            a a8 = this.f(object);
            object2 = object;
            if (a8 != null) {
                object2 = a8;
            }
        }
        return super.getSpanStart(object2);
    }

    @SuppressLint(value={"UnknownNullness"})
    public <T> T[] getSpans(int n8, int n9, Class<T> objectArray) {
        if (this.g((Class<?>)objectArray)) {
            a[] aArray = (a[])super.getSpans(n8, n9, a.class);
            objectArray = (Object[])Array.newInstance(objectArray, aArray.length);
            for (n8 = 0; n8 < aArray.length; ++n8) {
                objectArray[n8] = aArray[n8].a;
            }
            return objectArray;
        }
        return super.getSpans(n8, n9, objectArray);
    }

    @SuppressLint(value={"UnknownNullness"})
    public SpannableStringBuilder insert(int n8, CharSequence charSequence) {
        super.insert(n8, charSequence);
        return this;
    }

    @SuppressLint(value={"UnknownNullness"})
    public SpannableStringBuilder insert(int n8, CharSequence charSequence, int n9, int n10) {
        super.insert(n8, charSequence, n9, n10);
        return this;
    }

    public int nextSpanTransition(int n8, int n9, Class clazz) {
        Class<a> clazz2;
        block3: {
            block2: {
                if (clazz == null) break block2;
                clazz2 = clazz;
                if (!this.g(clazz)) break block3;
            }
            clazz2 = a.class;
        }
        return super.nextSpanTransition(n8, n9, clazz2);
    }

    public void removeSpan(Object object) {
        a a8;
        if (this.h(object)) {
            a a9;
            a8 = a9 = this.f(object);
            if (a9 != null) {
                object = a9;
                a8 = a9;
            }
        } else {
            a8 = null;
        }
        super.removeSpan(object);
        if (a8 != null) {
            this.c0.remove(a8);
        }
    }

    @SuppressLint(value={"UnknownNullness"})
    public SpannableStringBuilder replace(int n8, int n9, CharSequence charSequence) {
        this.b();
        super.replace(n8, n9, charSequence);
        this.i();
        return this;
    }

    @SuppressLint(value={"UnknownNullness"})
    public SpannableStringBuilder replace(int n8, int n9, CharSequence charSequence, int n10, int n11) {
        this.b();
        super.replace(n8, n9, charSequence, n10, n11);
        this.i();
        return this;
    }

    public void setSpan(Object object, int n8, int n9, int n10) {
        Object object2 = object;
        if (this.h(object)) {
            object2 = new a(object);
            this.c0.add((a)object2);
        }
        super.setSpan(object2, n8, n9, n10);
    }

    @SuppressLint(value={"UnknownNullness"})
    public CharSequence subSequence(int n8, int n9) {
        return new d(this.q, (CharSequence)((Object)this), n8, n9);
    }

    private static class a
    implements TextWatcher,
    SpanWatcher {
        final Object a;
        private final AtomicInteger b = new AtomicInteger(0);

        a(Object object) {
            this.a = object;
        }

        private boolean b(Object object) {
            return object instanceof c;
        }

        final void a() {
            this.b.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher)this.a).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            ((TextWatcher)this.a).beforeTextChanged(charSequence, n8, n9, n10);
        }

        final void c() {
            this.b.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object object, int n8, int n9) {
            if (this.b.get() > 0 && this.b(object)) {
                return;
            }
            ((SpanWatcher)this.a).onSpanAdded(spannable, object, n8, n9);
        }

        /*
         * Unable to fully structure code
         */
        public void onSpanChanged(Spannable var1_1, Object var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
            if (this.b.get() > 0 && this.b(var2_2)) {
                return;
            }
            var8_7 = var3_3;
            if (Build.VERSION.SDK_INT >= 28) ** GOTO lbl-1000
            var7_8 = var3_3;
            if (var3_3 > var4_4) {
                var7_8 = 0;
            }
            var8_7 = var7_8;
            if (var5_5 > var6_6) {
                var3_3 = 0;
                var8_7 = var7_8;
            } else lbl-1000:
            // 2 sources

            {
                var3_3 = var5_5;
            }
            ((SpanWatcher)this.a).onSpanChanged(var1_1, var2_2, var8_7, var4_4, var3_3, var6_6);
        }

        public void onSpanRemoved(Spannable spannable, Object object, int n8, int n9) {
            if (this.b.get() > 0 && this.b(object)) {
                return;
            }
            ((SpanWatcher)this.a).onSpanRemoved(spannable, object, n8, n9);
        }

        public void onTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            ((TextWatcher)this.a).onTextChanged(charSequence, n8, n9, n10);
        }
    }
}

