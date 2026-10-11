/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import ax.a0.s;
import ax.v0.f;
import ax.v0.g;
import java.util.stream.IntStream;

class p
implements Spannable {
    private Spannable c0;
    private boolean q = false;

    p(Spannable spannable) {
        this.c0 = spannable;
    }

    p(CharSequence charSequence) {
        this.c0 = new SpannableString(charSequence);
    }

    private void a() {
        Spannable spannable = this.c0;
        if (!this.q && p.c().a((CharSequence)spannable)) {
            this.c0 = new SpannableString((CharSequence)spannable);
        }
        this.q = true;
    }

    static b c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new b();
        }
        return new c();
    }

    Spannable b() {
        return this.c0;
    }

    public char charAt(int n8) {
        return this.c0.charAt(n8);
    }

    public j.IntStream chars() {
        return a.a((CharSequence)this.c0);
    }

    public /* synthetic */ IntStream chars() {
        return j.IntStream.Wrapper.convert((j.IntStream)this.chars());
    }

    public j.IntStream codePoints() {
        return a.b((CharSequence)this.c0);
    }

    public /* synthetic */ IntStream codePoints() {
        return j.IntStream.Wrapper.convert((j.IntStream)this.codePoints());
    }

    public int getSpanEnd(Object object) {
        return this.c0.getSpanEnd(object);
    }

    public int getSpanFlags(Object object) {
        return this.c0.getSpanFlags(object);
    }

    public int getSpanStart(Object object) {
        return this.c0.getSpanStart(object);
    }

    public <T> T[] getSpans(int n8, int n9, Class<T> clazz) {
        return this.c0.getSpans(n8, n9, clazz);
    }

    public int length() {
        return this.c0.length();
    }

    public int nextSpanTransition(int n8, int n9, Class clazz) {
        return this.c0.nextSpanTransition(n8, n9, clazz);
    }

    public void removeSpan(Object object) {
        this.a();
        this.c0.removeSpan(object);
    }

    public void setSpan(Object object, int n8, int n9, int n10) {
        this.a();
        this.c0.setSpan(object, n8, n9, n10);
    }

    public CharSequence subSequence(int n8, int n9) {
        return this.c0.subSequence(n8, n9);
    }

    public String toString() {
        return this.c0.toString();
    }

    private static class a {
        static j.IntStream a(CharSequence charSequence) {
            return g.a(charSequence);
        }

        static j.IntStream b(CharSequence charSequence) {
            return f.a(charSequence);
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof s;
        }
    }

    static class c
    extends b {
        c() {
        }

        @Override
        boolean a(CharSequence charSequence) {
            return ax.a0.c.a(charSequence) || charSequence instanceof s;
            {
            }
        }
    }
}

