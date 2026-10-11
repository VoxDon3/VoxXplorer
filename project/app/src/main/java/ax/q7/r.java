/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.d;
import ax.q7.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class r {
    private final d a;
    private final boolean b;
    private final c c;
    private final int d;

    private r(c c8) {
        this(c8, false, ax.q7.d.f(), Integer.MAX_VALUE);
    }

    private r(c c8, boolean bl, d d8, int n8) {
        this.c = c8;
        this.b = bl;
        this.a = d8;
        this.d = n8;
    }

    public static r d(char c8) {
        return r.e(ax.q7.d.d(c8));
    }

    public static r e(d d8) {
        n.n(d8);
        return new r(new c(d8){
            final d a;
            {
                this.a = d8;
            }

            public b b(r r8, CharSequence charSequence) {
                return new b(this, r8, charSequence){
                    final a i0;
                    {
                        this.i0 = a8;
                        super(r8, charSequence);
                    }

                    @Override
                    int g(int n8) {
                        return n8 + 1;
                    }

                    @Override
                    int h(int n8) {
                        return this.i0.a.c(this.d0, n8);
                    }
                };
            }
        });
    }

    private Iterator<String> g(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public List<String> f(CharSequence object) {
        n.n(object);
        Iterator<String> iterator = this.g((CharSequence)object);
        object = new ArrayList();
        while (iterator.hasNext()) {
            object.add(iterator.next());
        }
        return java.util.DesugarCollections.unmodifiableList((List)object);
    }

    private static abstract class b
    extends ax.q7.b<String> {
        final CharSequence d0;
        final d e0;
        final boolean f0;
        int g0 = 0;
        int h0;

        protected b(r r8, CharSequence charSequence) {
            this.e0 = r8.a;
            this.f0 = r8.b;
            this.h0 = r8.d;
            this.d0 = charSequence;
        }

        protected String f() {
            int n8;
            int n9 = this.g0;
            while ((n8 = this.g0) != -1) {
                if ((n8 = this.h(n8)) == -1) {
                    n8 = this.d0.length();
                    this.g0 = -1;
                } else {
                    this.g0 = this.g(n8);
                }
                int n10 = this.g0;
                int n11 = n9;
                if (n10 == n9) {
                    this.g0 = n8 = n10 + 1;
                    if (n8 <= this.d0.length()) continue;
                    this.g0 = -1;
                    continue;
                }
                while (true) {
                    n9 = n8;
                    if (n11 >= n8) break;
                    n9 = n8;
                    if (!this.e0.e(this.d0.charAt(n11))) break;
                    ++n11;
                }
                while (n9 > n11 && this.e0.e(this.d0.charAt(n9 - 1))) {
                    --n9;
                }
                if (this.f0 && n11 == n9) {
                    n9 = this.g0;
                    continue;
                }
                n8 = this.h0;
                if (n8 == 1) {
                    n9 = this.d0.length();
                    this.g0 = -1;
                    while (true) {
                        n8 = n9;
                        if (n9 > n11) {
                            n8 = n9;
                            if (this.e0.e(this.d0.charAt(n9 - 1))) {
                                --n9;
                                continue;
                            }
                        }
                        break;
                    }
                } else {
                    this.h0 = n8 - 1;
                    n8 = n9;
                }
                return this.d0.subSequence(n11, n8).toString();
            }
            return (String)this.c();
        }

        abstract int g(int var1);

        abstract int h(int var1);
    }

    private static interface c {
        public Iterator<String> a(r var1, CharSequence var2);
    }
}

