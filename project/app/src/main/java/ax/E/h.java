/*
 * Decompiled with CFR 0.152.
 */
package ax.E;

import ax.E.b;
import ax.E.c;
import ax.E.d;
import ax.E.i;
import java.util.Arrays;
import java.util.Comparator;

public class h
extends ax.E.b {
    private int g = 128;
    private i[] h = new i[128];
    private i[] i = new i[128];
    private int j = 0;
    b k = new b(this, this);
    c l;

    public h(c c8) {
        super(c8);
        this.l = c8;
    }

    private final void F(i i8) {
        int n8 = this.j;
        i[] iArray = this.h;
        if (n8 + 1 > iArray.length) {
            this.h = iArray = Arrays.copyOf(iArray, iArray.length * 2);
            this.i = Arrays.copyOf(iArray, iArray.length * 2);
        }
        iArray = this.h;
        int n9 = this.j;
        iArray[n9] = i8;
        this.j = n8 = n9 + 1;
        if (n8 > 1 && iArray[n9].d0 > i8.d0) {
            int n10;
            n9 = 0;
            for (n8 = 0; n8 < (n10 = this.j); ++n8) {
                this.i[n8] = this.h[n8];
            }
            Arrays.sort(this.i, 0, n10, new Comparator<i>(this){
                final h q;
                {
                    this.q = h8;
                }

                public int a(i i8, i i9) {
                    return i8.d0 - i9.d0;
                }
            });
            for (n8 = n9; n8 < this.j; ++n8) {
                this.h[n8] = this.i[n8];
            }
        }
        i8.q = true;
        i8.d(this);
    }

    private final void G(i i8) {
        for (int i9 = 0; i9 < this.j; ++i9) {
            int n8;
            if (this.h[i9] != i8) continue;
            while (i9 < (n8 = this.j) - 1) {
                i[] iArray = this.h;
                n8 = i9 + 1;
                iArray[i9] = iArray[n8];
                i9 = n8;
            }
            this.j = n8 - 1;
            i8.q = false;
            return;
        }
    }

    @Override
    public void B(d object, ax.E.b b8, boolean bl) {
        i i8 = b8.a;
        if (i8 == null) {
            return;
        }
        b.a a8 = b8.e;
        int n8 = a8.b();
        for (int i9 = 0; i9 < n8; ++i9) {
            object = a8.d(i9);
            float f8 = a8.g(i9);
            this.k.b((i)object);
            if (this.k.a(i8, f8)) {
                this.F((i)object);
            }
            this.b += b8.b * f8;
        }
        this.G(i8);
    }

    @Override
    public void b(i i8) {
        this.k.b(i8);
        this.k.e();
        i8.j0[i8.f0] = 1.0f;
        this.F(i8);
    }

    @Override
    public i c(d object, boolean[] blArray) {
        int n8 = -1;
        for (int i8 = 0; i8 < this.j; ++i8) {
            int n9;
            block6: {
                block8: {
                    block7: {
                        block5: {
                            object = this.h[i8];
                            if (!blArray[((i)object).d0]) break block5;
                            n9 = n8;
                            break block6;
                        }
                        this.k.b((i)object);
                        if (n8 != -1) break block7;
                        n9 = n8;
                        if (!this.k.c()) break block6;
                        break block8;
                    }
                    n9 = n8;
                    if (!this.k.d(this.h[n8])) break block6;
                }
                n9 = i8;
            }
            n8 = n9;
        }
        if (n8 == -1) {
            return null;
        }
        return this.h[n8];
    }

    @Override
    public void clear() {
        this.j = 0;
        this.b = 0.0f;
    }

    @Override
    public boolean isEmpty() {
        return this.j == 0;
    }

    @Override
    public String toString() {
        CharSequence charSequence = new StringBuilder();
        charSequence.append("");
        charSequence.append(" goal -> (");
        charSequence.append(this.b);
        charSequence.append(") : ");
        charSequence = charSequence.toString();
        for (int i8 = 0; i8 < this.j; ++i8) {
            Comparable<i> comparable = this.h[i8];
            this.k.b((i)comparable);
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append((String)charSequence);
            ((StringBuilder)comparable).append(this.k);
            ((StringBuilder)comparable).append(" ");
            charSequence = ((StringBuilder)comparable).toString();
        }
        return charSequence;
    }

    class b {
        i a;
        h b;
        final h c;

        public b(h h8, h h9) {
            this.c = h8;
            this.b = h9;
        }

        public boolean a(i i8, float f8) {
            int n8;
            boolean bl = this.a.q;
            boolean bl2 = true;
            if (bl) {
                for (n8 = 0; n8 < 9; ++n8) {
                    float f9;
                    float[] fArray = this.a.j0;
                    fArray[n8] = f9 = fArray[n8] + i8.j0[n8] * f8;
                    if (Math.abs(f9) < 1.0E-4f) {
                        this.a.j0[n8] = 0.0f;
                        continue;
                    }
                    bl2 = false;
                }
                if (bl2) {
                    this.c.G(this.a);
                }
                return false;
            }
            for (n8 = 0; n8 < 9; ++n8) {
                float f10 = i8.j0[n8];
                if (f10 != 0.0f) {
                    float f11;
                    f10 = f11 = f10 * f8;
                    if (Math.abs(f11) < 1.0E-4f) {
                        f10 = 0.0f;
                    }
                    this.a.j0[n8] = f10;
                    continue;
                }
                this.a.j0[n8] = 0.0f;
            }
            return true;
        }

        public void b(i i8) {
            this.a = i8;
        }

        public final boolean c() {
            for (int i8 = 8; i8 >= 0; --i8) {
                float f8 = this.a.j0[i8];
                if (f8 > 0.0f) {
                    return false;
                }
                if (!(f8 < 0.0f)) continue;
                return true;
            }
            return false;
        }

        public final boolean d(i i8) {
            for (int i9 = 8; i9 >= 0; --i9) {
                float f8 = this.a.j0[i9];
                float f9 = i8.j0[i9];
                if (f8 == f9) {
                    continue;
                }
                if (!(f8 < f9)) break;
                return true;
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.a.j0, 0.0f);
        }

        public String toString() {
            CharSequence charSequence;
            i i8 = this.a;
            CharSequence charSequence2 = charSequence = "[ ";
            if (i8 != null) {
                int n8 = 0;
                while (true) {
                    charSequence2 = charSequence;
                    if (n8 >= 9) break;
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append((String)charSequence);
                    ((StringBuilder)charSequence2).append(this.a.j0[n8]);
                    ((StringBuilder)charSequence2).append(" ");
                    charSequence = ((StringBuilder)charSequence2).toString();
                    ++n8;
                }
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)charSequence2);
            ((StringBuilder)charSequence).append("] ");
            ((StringBuilder)charSequence).append(this.a);
            return ((StringBuilder)charSequence).toString();
        }
    }
}

