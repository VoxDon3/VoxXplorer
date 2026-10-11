package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.n;
import ax.v0.AbstractC3246c;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
final class j {
    private final e.i a;
    private final n b;
    private e.d c;
    private final boolean d;
    private final int[] e;

    private static final class a {
        static int a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        static int b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    private static class b implements c<p> {
        public p a;
        private final e.i b;

        b(p pVar, e.i iVar) {
            this.a = pVar;
            this.b = iVar;
        }

        @Override // androidx.emoji2.text.j.c
        public boolean b(CharSequence charSequence, int i, int i2, o oVar) {
            if (oVar.k()) {
                return true;
            }
            if (this.a == null) {
                this.a = new p(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.a.setSpan(this.b.a(oVar), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.j.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p a() {
            return this.a;
        }
    }

    private interface c<T> {
        T a();

        boolean b(CharSequence charSequence, int i, int i2, o oVar);
    }

    private static class d implements c<d> {
        private final String a;

        d(String str) {
            this.a = str;
        }

        @Override // androidx.emoji2.text.j.c
        public boolean b(CharSequence charSequence, int i, int i2, o oVar) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
                return true;
            }
            oVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.j.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }

    static final class e {
        private int a = 1;
        private final n.a b;
        private n.a c;
        private n.a d;
        private int e;
        private int f;
        private final boolean g;
        private final int[] h;

        e(n.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
            this.g = z;
            this.h = iArr;
        }

        private static boolean d(int i) {
            return i == 65039;
        }

        private static boolean f(int i) {
            return i == 65038;
        }

        private int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        private boolean h() {
            if (this.c.b().j() || d(this.e)) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i) {
            n.a a = this.c.a(i);
            int i2 = 2;
            if (this.a != 2) {
                if (a == null) {
                    i2 = g();
                } else {
                    this.a = 2;
                    this.c = a;
                    this.f = 1;
                }
            } else if (a != null) {
                this.c = a;
                this.f++;
            } else if (f(i)) {
                i2 = g();
            } else if (!d(i)) {
                if (this.c.b() != null) {
                    i2 = 3;
                    if (this.f != 1) {
                        this.d = this.c;
                        g();
                    } else if (h()) {
                        this.d = this.c;
                        g();
                    } else {
                        i2 = g();
                    }
                } else {
                    i2 = g();
                }
            }
            this.e = i;
            return i2;
        }

        o b() {
            return this.c.b();
        }

        o c() {
            return this.d.b();
        }

        boolean e() {
            if (this.a != 2 || this.c.b() == null) {
                return false;
            }
            return this.f > 1 || h();
        }
    }

    j(n nVar, e.i iVar, e.d dVar, boolean z, int[] iArr, Set<int[]> set) {
        this.a = iVar;
        this.b = nVar;
        this.c = dVar;
        this.d = z;
        this.e = iArr;
        g(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC3246c[] abstractC3246cArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (abstractC3246cArr = (AbstractC3246c[]) editable.getSpans(selectionStart, selectionEnd, AbstractC3246c.class)) != null && abstractC3246cArr.length > 0) {
            for (AbstractC3246c abstractC3246c : abstractC3246cArr) {
                int spanStart = editable.getSpanStart(abstractC3246c);
                int spanEnd = editable.getSpanEnd(abstractC3246c);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = a.a(editable, selectionStart, Math.max(i, 0));
                min = a.b(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            AbstractC3246c[] abstractC3246cArr = (AbstractC3246c[]) editable.getSpans(max, min, AbstractC3246c.class);
            if (abstractC3246cArr != null && abstractC3246cArr.length > 0) {
                for (AbstractC3246c abstractC3246c : abstractC3246cArr) {
                    int spanStart = editable.getSpanStart(abstractC3246c);
                    int spanEnd = editable.getSpanEnd(abstractC3246c);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable, int i, KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean d(CharSequence charSequence, int i, int i2, o oVar) {
        if (oVar.d() == 0) {
            oVar.m(this.c.a(charSequence, i, i2, oVar.h()));
        }
        return oVar.d() == 2;
    }

    private static boolean e(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    private static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void g(Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private <T> T i(CharSequence charSequence, int i, int i2, int i3, boolean z, c<T> cVar) {
        int i4;
        e eVar = new e(this.b.f(), this.d, this.e);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        loop0: while (true) {
            i4 = i;
            while (i < i2 && i5 < i3 && z2) {
                int a2 = eVar.a(codePointAt);
                if (a2 == 1) {
                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                    if (i4 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i4);
                    }
                    i = i4;
                } else if (a2 == 2) {
                    i += Character.charCount(codePointAt);
                    if (i < i2) {
                        codePointAt = Character.codePointAt(charSequence, i);
                    }
                } else if (a2 == 3) {
                    if (z || !d(charSequence, i4, i, eVar.c())) {
                        z2 = cVar.b(charSequence, i4, i, eVar.c());
                        i5++;
                    }
                }
            }
        }
        if (eVar.e() && i5 < i3 && z2 && (z || !d(charSequence, i4, i, eVar.b()))) {
            cVar.b(charSequence, i4, i, eVar.b());
        }
        return cVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        if (r1 != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:62:0x000e, B:65:0x0013, B:67:0x0017, B:69:0x0024, B:10:0x003c, B:12:0x0044, B:14:0x0047, B:16:0x004b, B:18:0x0057, B:19:0x005a, B:29:0x0078), top: B:61:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.CharSequence h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            boolean r1 = r11 instanceof ax.v0.C3247d
            if (r1 == 0) goto La
            r0 = r11
            ax.v0.d r0 = (ax.v0.C3247d) r0
            r0.a()
        La:
            java.lang.Class<ax.v0.c> r0 = ax.v0.AbstractC3246c.class
            if (r1 != 0) goto L31
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L31
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2f
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r0)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2f
            androidx.emoji2.text.p r2 = new androidx.emoji2.text.p     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L39
        L2a:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto Lb7
        L2f:
            r2 = 0
            goto L39
        L31:
            androidx.emoji2.text.p r2 = new androidx.emoji2.text.p     // Catch: java.lang.Throwable -> Lb0
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> Lb0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb0
        L39:
            r3 = 0
            if (r2 == 0) goto L65
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r0)     // Catch: java.lang.Throwable -> L2a
            ax.v0.c[] r4 = (ax.v0.AbstractC3246c[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = 0
        L49:
            if (r6 >= r5) goto L65
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L5a
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L5a:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L49
        L65:
            r4 = r12
            r5 = r13
            if (r4 == r5) goto L6f
            int r12 = r11.length()     // Catch: java.lang.Throwable -> Lb0
            if (r4 < r12) goto L71
        L6f:
            r3 = r11
            goto Lb3
        L71:
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r12) goto L84
            if (r2 == 0) goto L84
            int r12 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r12 = r2.getSpans(r3, r12, r0)     // Catch: java.lang.Throwable -> L2a
            ax.v0.c[] r12 = (ax.v0.AbstractC3246c[]) r12     // Catch: java.lang.Throwable -> L2a
            int r12 = r12.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r12
        L84:
            r6 = r14
            androidx.emoji2.text.j$b r8 = new androidx.emoji2.text.j$b     // Catch: java.lang.Throwable -> Lb0
            androidx.emoji2.text.e$i r12 = r10.a     // Catch: java.lang.Throwable -> Lb0
            r8.<init>(r2, r12)     // Catch: java.lang.Throwable -> Lb0
            r2 = r10
            r3 = r11
            r7 = r15
            java.lang.Object r11 = r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La4
            androidx.emoji2.text.p r11 = (androidx.emoji2.text.p) r11     // Catch: java.lang.Throwable -> La4
            if (r11 == 0) goto La7
            android.text.Spannable r11 = r11.b()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto La3
            r12 = r3
            ax.v0.d r12 = (ax.v0.C3247d) r12
            r12.d()
        La3:
            return r11
        La4:
            r0 = move-exception
        La5:
            r12 = r0
            goto Lb7
        La7:
            if (r1 == 0) goto Laf
        La9:
            r11 = r3
            ax.v0.d r11 = (ax.v0.C3247d) r11
            r11.d()
        Laf:
            return r3
        Lb0:
            r0 = move-exception
            r3 = r11
            goto La5
        Lb3:
            if (r1 == 0) goto Lb6
            goto La9
        Lb6:
            return r3
        Lb7:
            if (r1 == 0) goto Lbf
            r11 = r3
            ax.v0.d r11 = (ax.v0.C3247d) r11
            r11.d()
        Lbf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.j.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
