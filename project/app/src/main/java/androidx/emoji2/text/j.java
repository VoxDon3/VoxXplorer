/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.n;
import androidx.emoji2.text.o;
import androidx.emoji2.text.p;
import java.util.Arrays;
import java.util.Set;

final class j {
    private final e.i a;
    private final n b;
    private e.d c;
    private final boolean d;
    private final int[] e;

    j(n n8, e.i i8, e.d d8, boolean bl, int[] nArray, Set<int[]> set) {
        this.a = i8;
        this.b = n8;
        this.c = d8;
        this.d = bl;
        this.e = nArray;
        this.g(set);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(Editable editable, KeyEvent object2, boolean bl) {
        int n8;
        if (j.f((KeyEvent)object2)) {
            return false;
        }
        int n9 = Selection.getSelectionStart((CharSequence)editable);
        if (j.e(n9, n8 = Selection.getSelectionEnd((CharSequence)editable))) {
            return false;
        }
        ax.v0.c[] cArray = (ax.v0.c[])editable.getSpans(n9, n8, ax.v0.c.class);
        if (cArray != null && cArray.length > 0) {
            for (ax.v0.c c8 : cArray) {
                Object var2_4;
                int n10 = editable.getSpanStart((Object)c8);
                int n11 = editable.getSpanEnd((Object)c8);
                if (!(var2_4 != false && n10 == n9 || var2_4 == false && n11 == n9) && (n9 <= n10 || n9 >= n11)) continue;
                editable.delete(n10, n11);
                return true;
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection, Editable editable, int n8, int n9, boolean bl) {
        block5: {
            ax.v0.c[] cArray;
            int n10;
            int n11;
            block8: {
                block6: {
                    block7: {
                        if (editable == null || inputConnection == null || n8 < 0 || n9 < 0) break block5;
                        n11 = Selection.getSelectionStart((CharSequence)editable);
                        if (j.e(n11, n10 = Selection.getSelectionEnd((CharSequence)editable))) {
                            return false;
                        }
                        if (!bl) break block6;
                        n8 = androidx.emoji2.text.j$a.a((CharSequence)editable, n11, Math.max(n8, 0));
                        n10 = androidx.emoji2.text.j$a.b((CharSequence)editable, n10, Math.max(n9, 0));
                        if (n8 == -1) break block7;
                        n9 = n10;
                        if (n10 != -1) break block8;
                    }
                    return false;
                }
                n8 = Math.max(n11 - n8, 0);
                n9 = Math.min(n10 + n9, editable.length());
            }
            if ((cArray = (ax.v0.c[])editable.getSpans(n8, n9, ax.v0.c.class)) != null && cArray.length > 0) {
                int n12 = cArray.length;
                n11 = 0;
                n10 = n8;
                for (n8 = n11; n8 < n12; ++n8) {
                    ax.v0.c c8 = cArray[n8];
                    int n13 = editable.getSpanStart((Object)c8);
                    n11 = editable.getSpanEnd((Object)c8);
                    n10 = Math.min(n13, n10);
                    n9 = Math.max(n11, n9);
                }
                n8 = Math.max(n10, 0);
                n9 = Math.min(n9, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(n8, n9);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable, int n8, KeyEvent keyEvent) {
        boolean bl = n8 != 67 ? (n8 != 112 ? false : j.a(editable, keyEvent, true)) : j.a(editable, keyEvent, false);
        if (bl) {
            MetaKeyKeyListener.adjustMetaAfterKeypress((Spannable)editable);
            return true;
        }
        return false;
    }

    private boolean d(CharSequence charSequence, int n8, int n9, o o8) {
        if (o8.d() == 0) {
            o8.m(this.c.a(charSequence, n8, n9, o8.h()));
        }
        return o8.d() == 2;
    }

    private static boolean e(int n8, int n9) {
        return n8 == -1 || n9 == -1 || n8 != n9;
        {
        }
    }

    private static boolean f(KeyEvent keyEvent) {
        return KeyEvent.metaStateHasNoModifiers((int)keyEvent.getMetaState()) ^ true;
    }

    private void g(Set<int[]> object) {
        if (!object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                Object object2 = (int[])object.next();
                object2 = new String((int[])object2, 0, ((int[])object2).length);
                d d8 = new d((String)object2);
                this.i((CharSequence)object2, 0, ((String)object2).length(), 1, true, d8);
            }
        }
    }

    private <T> T i(CharSequence charSequence, int n8, int n9, int n10, boolean bl, c<T> c8) {
        int n11;
        int n12;
        e e8 = new e(this.b.f(), this.d, this.e);
        int n13 = Character.codePointAt(charSequence, n8);
        int n14 = 0;
        boolean bl2 = true;
        int n15 = n8;
        block0: while (true) {
            n12 = n15;
            n11 = n15;
            n8 = n13;
            while (n11 < n9 && n14 < n10 && bl2) {
                n15 = e8.a(n8);
                if (n15 != 1) {
                    if (n15 != 2) {
                        if (n15 != 3) continue;
                        if (!bl) {
                            n13 = n8;
                            n15 = n11;
                            if (this.d(charSequence, n12, n11, e8.c())) continue block0;
                        }
                        bl2 = c8.b(charSequence, n12, n11, e8.c());
                        ++n14;
                        n13 = n8;
                        n15 = n11;
                        continue block0;
                    }
                    n11 = n15 = n11 + Character.charCount(n8);
                    if (n15 >= n9) continue;
                    n8 = Character.codePointAt(charSequence, n15);
                    n11 = n15;
                    continue;
                }
                if ((n12 += Character.charCount(Character.codePointAt(charSequence, n12))) < n9) {
                    n8 = Character.codePointAt(charSequence, n12);
                }
                n11 = n12;
            }
            break;
        }
        if (e8.e() && n14 < n10 && bl2 && (bl || !this.d(charSequence, n12, n11, e8.b()))) {
            c8.b(charSequence, n12, n11, e8.b());
        }
        return c8.a();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    CharSequence h(CharSequence charSequence, int n8, int n9, int n10, boolean bl) {
        RuntimeException var11_10;
        boolean bl2;
        block22: {
            block25: {
                block26: {
                    block23: {
                        Object object;
                        int n11;
                        int n12;
                        p p8;
                        block24: {
                            block21: {
                                int n13;
                                int n14;
                                block20: {
                                    block19: {
                                        bl2 = charSequence instanceof ax.v0.d;
                                        if (bl2) {
                                            ((ax.v0.d)((Object)charSequence)).a();
                                        }
                                        if (!bl2) {
                                            if (charSequence instanceof Spannable) break block19;
                                            p8 = charSequence instanceof Spanned && ((Spanned)charSequence).nextSpanTransition(n8 - 1, n9 + 1, ax.v0.c.class) <= n9 ? new p(charSequence) : null;
                                            break block20;
                                        }
                                    }
                                    p8 = new p((Spannable)charSequence);
                                }
                                n12 = n8;
                                n11 = n9;
                                if (p8 == null) break block21;
                                try {
                                    object = p8.getSpans(n8, n9, ax.v0.c.class);
                                    n12 = n8;
                                    n11 = n9;
                                    if (object == null) break block21;
                                    n12 = n8;
                                    n11 = n9;
                                    if (((ax.v0.c[])object).length <= 0) break block21;
                                    n14 = ((ax.v0.c[])object).length;
                                    n13 = 0;
                                }
                                catch (Throwable throwable) {
                                    break block22;
                                }
                                while (true) {
                                    n12 = n8;
                                    n11 = n9;
                                    if (n13 >= n14) break;
                                    ax.v0.c c8 = object[n13];
                                    {
                                        n11 = p8.getSpanStart((Object)c8);
                                        n12 = p8.getSpanEnd((Object)c8);
                                        if (n11 != n9) {
                                            p8.removeSpan((Object)c8);
                                        }
                                        n8 = Math.min(n11, n8);
                                        n9 = Math.max(n12, n9);
                                        ++n13;
                                        continue;
                                    }
                                    break;
                                }
                            }
                            if (n12 == n11) break block23;
                            try {
                                n8 = charSequence.length();
                                if (n12 >= n8) break block23;
                                n8 = n10;
                                if (n10 == Integer.MAX_VALUE) break block24;
                                n8 = n10;
                                if (p8 == null) break block24;
                            }
                            catch (Throwable throwable) {
                                break block22;
                            }
                            {
                                n8 = p8.getSpans(0, p8.length(), ax.v0.c.class).length;
                                n8 = n10 - n8;
                            }
                        }
                        object = new b(p8, this.a);
                        try {
                            p8 = (p)this.i(charSequence, n12, n11, n8, bl, (c)object);
                            if (p8 != null) {
                                p8 = p8.b();
                                if (bl2) {
                                    ((ax.v0.d)((Object)charSequence)).d();
                                }
                                return p8;
                            }
                        }
                        catch (Throwable throwable) {
                            break block22;
                        }
                        if (!bl2) break block25;
                        break block26;
                    }
                    if (!bl2) {
                        return charSequence;
                    }
                }
                ((ax.v0.d)((Object)charSequence)).d();
            }
            return charSequence;
        }
        if (bl2) {
            ((ax.v0.d)((Object)charSequence)).d();
        }
        throw var11_10;
    }

    private static final class a {
        static int a(CharSequence charSequence, int n8, int n9) {
            int n10 = charSequence.length();
            if (n8 >= 0 && n10 >= n8) {
                if (n9 < 0) {
                    return -1;
                }
                block0: while (true) {
                    n10 = 0;
                    while (true) {
                        if (n9 == 0) {
                            return n8;
                        }
                        if (--n8 < 0) {
                            if (n10 != 0) {
                                return -1;
                            }
                            return 0;
                        }
                        char c8 = charSequence.charAt(n8);
                        if (n10 != 0) {
                            if (!Character.isHighSurrogate(c8)) {
                                return -1;
                            }
                            --n9;
                            continue block0;
                        }
                        if (!Character.isSurrogate(c8)) {
                            --n9;
                            continue;
                        }
                        if (Character.isHighSurrogate(c8)) {
                            return -1;
                        }
                        n10 = 1;
                    }
                    break;
                }
            }
            return -1;
        }

        static int b(CharSequence charSequence, int n8, int n9) {
            int n10 = charSequence.length();
            if (n8 >= 0 && n10 >= n8) {
                if (n9 < 0) {
                    return -1;
                }
                block0: while (true) {
                    boolean bl = false;
                    while (true) {
                        if (n9 == 0) {
                            return n8;
                        }
                        if (n8 >= n10) {
                            if (bl) {
                                return -1;
                            }
                            return n10;
                        }
                        char c8 = charSequence.charAt(n8);
                        if (bl) {
                            if (!Character.isLowSurrogate(c8)) {
                                return -1;
                            }
                            --n9;
                            ++n8;
                            continue block0;
                        }
                        if (!Character.isSurrogate(c8)) {
                            --n9;
                            ++n8;
                            continue;
                        }
                        if (Character.isLowSurrogate(c8)) {
                            return -1;
                        }
                        ++n8;
                        bl = true;
                    }
                    break;
                }
            }
            return -1;
        }
    }

    private static class b
    implements c<p> {
        public p a;
        private final e.i b;

        b(p p8, e.i i8) {
            this.a = p8;
            this.b = i8;
        }

        @Override
        public boolean b(CharSequence object, int n8, int n9, o o8) {
            if (o8.k()) {
                return true;
            }
            if (this.a == null) {
                object = object instanceof Spannable ? (Spannable)object : new SpannableString(object);
                this.a = new p((Spannable)object);
            }
            object = this.b.a(o8);
            this.a.setSpan(object, n8, n9, 33);
            return true;
        }

        public p c() {
            return this.a;
        }
    }

    private static interface c<T> {
        public T a();

        public boolean b(CharSequence var1, int var2, int var3, o var4);
    }

    private static class d
    implements c<d> {
        private final String a;

        d(String string) {
            this.a = string;
        }

        @Override
        public boolean b(CharSequence charSequence, int n8, int n9, o o8) {
            if (TextUtils.equals((CharSequence)charSequence.subSequence(n8, n9), (CharSequence)this.a)) {
                o8.l(true);
                return false;
            }
            return true;
        }

        public d c() {
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

        e(n.a a8, boolean bl, int[] nArray) {
            this.b = a8;
            this.c = a8;
            this.g = bl;
            this.h = nArray;
        }

        private static boolean d(int n8) {
            return n8 == 65039;
        }

        private static boolean f(int n8) {
            return n8 == 65038;
        }

        private int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        private boolean h() {
            if (this.c.b().j()) {
                return true;
            }
            if (androidx.emoji2.text.j$e.d(this.e)) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                int n8 = this.c.b().b(0);
                if (Arrays.binarySearch(this.h, n8) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int n8) {
            n.a a8 = this.c.a(n8);
            int n9 = this.a;
            int n10 = 2;
            if (n9 != 2) {
                if (a8 == null) {
                    n10 = this.g();
                } else {
                    this.a = 2;
                    this.c = a8;
                    this.f = 1;
                }
            } else if (a8 != null) {
                this.c = a8;
                ++this.f;
            } else if (androidx.emoji2.text.j$e.f(n8)) {
                n10 = this.g();
            } else if (!androidx.emoji2.text.j$e.d(n8)) {
                if (this.c.b() != null) {
                    n9 = this.f;
                    n10 = 3;
                    if (n9 == 1) {
                        if (this.h()) {
                            this.d = this.c;
                            this.g();
                        } else {
                            n10 = this.g();
                        }
                    } else {
                        this.d = this.c;
                        this.g();
                    }
                } else {
                    n10 = this.g();
                }
            }
            this.e = n8;
            return n10;
        }

        o b() {
            return this.c.b();
        }

        o c() {
            return this.d.b();
        }

        boolean e() {
            return this.a == 2 && this.c.b() != null && (this.f > 1 || this.h());
        }
    }
}

