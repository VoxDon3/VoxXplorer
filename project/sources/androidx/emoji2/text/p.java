package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import ax.a0.C1265c;
import ax.a0.s;
import j$.util.stream.IntStream;

/* loaded from: classes.dex */
class p implements Spannable {
    private Spannable c0;
    private boolean q = false;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            IntStream convert;
            convert = IntStream.VivifiedWrapper.convert(charSequence.chars());
            return convert;
        }

        static IntStream b(CharSequence charSequence) {
            IntStream convert;
            convert = IntStream.VivifiedWrapper.convert(charSequence.codePoints());
            return convert;
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof s;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.p.b
        boolean a(CharSequence charSequence) {
            return C1265c.a(charSequence) || (charSequence instanceof s);
        }
    }

    p(Spannable spannable) {
        this.c0 = spannable;
    }

    private void a() {
        Spannable spannable = this.c0;
        if (!this.q && c().a(spannable)) {
            this.c0 = new SpannableString(spannable);
        }
        this.q = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.c0;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.c0.charAt(i);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.c0.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.c0.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.c0.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.c0.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.c0.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.c0.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.c0.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.c0.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.c0.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.c0.toString();
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.c0);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.c0);
    }

    p(CharSequence charSequence) {
        this.c0 = new SpannableString(charSequence);
    }
}
