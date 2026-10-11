/*
 * Decompiled with CFR 0.152.
 */
package ax.E;

import ax.E.b;
import ax.E.c;
import ax.E.i;
import java.util.Arrays;

public class a
implements b.a {
    private static float l = 0.001f;
    int a = 0;
    private final b b;
    protected final c c;
    private int d = 8;
    private i e = null;
    private int[] f = new int[8];
    private int[] g = new int[8];
    private float[] h = new float[8];
    private int i = -1;
    private int j = -1;
    private boolean k = false;

    a(b b8, c c8) {
        this.b = b8;
        this.c = c8;
    }

    @Override
    public void a(i object, float f8, boolean bl) {
        block27: {
            float f9 = l;
            if (!(f8 > -f9) || !(f8 < f9)) {
                int n8 = this.i;
                if (n8 == -1) {
                    this.i = 0;
                    this.h[0] = f8;
                    this.f[0] = ((i)object).d0;
                    this.g[0] = -1;
                    ++((i)object).n0;
                    ((i)object).d(this.b);
                    ++this.a;
                    if (!this.k) {
                        this.j = n8 = this.j + 1;
                        object = this.f;
                        if (n8 >= ((Object)object).length) {
                            this.k = true;
                            this.j = ((Object)object).length - 1;
                            return;
                        }
                    }
                } else {
                    int[] nArray;
                    int n9;
                    int n10;
                    int n11 = -1;
                    for (n10 = 0; n8 != -1 && n10 < this.a; ++n10) {
                        n9 = this.f[n8];
                        int n12 = ((i)object).d0;
                        if (n9 == n12) {
                            Object[] objectArray = this.h;
                            f9 = objectArray[n8] + f8;
                            float f10 = l;
                            f8 = f9;
                            if (f9 > -f10) {
                                f8 = f9;
                                if (f9 < f10) {
                                    f8 = 0.0f;
                                }
                            }
                            objectArray[n8] = f8;
                            if (f8 == 0.0f) {
                                if (n8 == this.i) {
                                    this.i = this.g[n8];
                                } else {
                                    objectArray = this.g;
                                    objectArray[n11] = objectArray[n8];
                                }
                                if (bl) {
                                    ((i)object).l(this.b);
                                }
                                if (this.k) {
                                    this.j = n8;
                                }
                                --((i)object).n0;
                                --this.a;
                                return;
                            }
                            break block27;
                        }
                        if (n9 < n12) {
                            n11 = n8;
                        }
                        n8 = this.g[n8];
                    }
                    n8 = this.j;
                    if (this.k) {
                        nArray = this.f;
                        if (nArray[n8] != -1) {
                            n8 = nArray.length;
                        }
                    } else {
                        ++n8;
                    }
                    nArray = this.f;
                    n10 = n8;
                    if (n8 >= nArray.length) {
                        n10 = n8;
                        if (this.a < nArray.length) {
                            n9 = 0;
                            while (true) {
                                nArray = this.f;
                                n10 = n8;
                                if (n9 >= nArray.length) break;
                                if (nArray[n9] == -1) {
                                    n10 = n9;
                                    break;
                                }
                                ++n9;
                            }
                        }
                    }
                    nArray = this.f;
                    n8 = n10;
                    if (n10 >= nArray.length) {
                        n8 = nArray.length;
                        this.d = n10 = this.d * 2;
                        this.k = false;
                        this.j = n8 - 1;
                        this.h = Arrays.copyOf(this.h, n10);
                        this.f = Arrays.copyOf(this.f, this.d);
                        this.g = Arrays.copyOf(this.g, this.d);
                    }
                    this.f[n8] = ((i)object).d0;
                    this.h[n8] = f8;
                    if (n11 != -1) {
                        nArray = this.g;
                        nArray[n8] = nArray[n11];
                        nArray[n11] = n8;
                    } else {
                        this.g[n8] = this.i;
                        this.i = n8;
                    }
                    ++((i)object).n0;
                    ((i)object).d(this.b);
                    ++this.a;
                    if (!this.k) {
                        ++this.j;
                    }
                    if ((n8 = this.j) >= ((Object)(object = (Object)this.f)).length) {
                        this.k = true;
                        this.j = ((Object)object).length - 1;
                    }
                }
            }
        }
    }

    @Override
    public int b() {
        return this.a;
    }

    @Override
    public final float c(i i8) {
        int n8 = this.i;
        for (int i9 = 0; n8 != -1 && i9 < this.a; ++i9) {
            if (this.f[n8] == i8.d0) {
                return this.h[n8];
            }
            n8 = this.g[n8];
        }
        return 0.0f;
    }

    @Override
    public final void clear() {
        int n8 = this.i;
        for (int i8 = 0; n8 != -1 && i8 < this.a; ++i8) {
            i i9 = this.c.d[this.f[n8]];
            if (i9 != null) {
                i9.l(this.b);
            }
            n8 = this.g[n8];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    @Override
    public i d(int n8) {
        int n9 = this.i;
        for (int i8 = 0; n9 != -1 && i8 < this.a; ++i8) {
            if (i8 == n8) {
                return this.c.d[this.f[n9]];
            }
            n9 = this.g[n9];
        }
        return null;
    }

    @Override
    public float e(b object, boolean bl) {
        float f8 = this.c(((b)object).a);
        this.j(((b)object).a, bl);
        object = ((b)object).e;
        int n8 = object.b();
        for (int i8 = 0; i8 < n8; ++i8) {
            i i9 = object.d(i8);
            this.a(i9, object.c(i9) * f8, bl);
        }
        return f8;
    }

    @Override
    public void f() {
        int n8 = this.i;
        for (int i8 = 0; n8 != -1 && i8 < this.a; ++i8) {
            float[] fArray = this.h;
            fArray[n8] = fArray[n8] * -1.0f;
            n8 = this.g[n8];
        }
    }

    @Override
    public float g(int n8) {
        int n9 = this.i;
        for (int i8 = 0; n9 != -1 && i8 < this.a; ++i8) {
            if (i8 == n8) {
                return this.h[n9];
            }
            n9 = this.g[n9];
        }
        return 0.0f;
    }

    @Override
    public final void h(i object, float f8) {
        if (f8 == 0.0f) {
            this.j((i)object, true);
            return;
        }
        int n8 = this.i;
        if (n8 == -1) {
            this.i = 0;
            this.h[0] = f8;
            this.f[0] = ((i)object).d0;
            this.g[0] = -1;
            ++((i)object).n0;
            ((i)object).d(this.b);
            ++this.a;
            if (!this.k) {
                this.j = n8 = this.j + 1;
                object = this.f;
                if (n8 >= ((Object)object).length) {
                    this.k = true;
                    this.j = ((Object)object).length - 1;
                    return;
                }
            }
        } else {
            int[] nArray;
            int n9;
            int n10;
            int n11 = -1;
            for (n10 = 0; n8 != -1 && n10 < this.a; ++n10) {
                n9 = this.f[n8];
                int n12 = ((i)object).d0;
                if (n9 == n12) {
                    this.h[n8] = f8;
                    return;
                }
                if (n9 < n12) {
                    n11 = n8;
                }
                n8 = this.g[n8];
            }
            n8 = this.j;
            if (this.k) {
                nArray = this.f;
                if (nArray[n8] != -1) {
                    n8 = nArray.length;
                }
            } else {
                ++n8;
            }
            nArray = this.f;
            n10 = n8;
            if (n8 >= nArray.length) {
                n10 = n8;
                if (this.a < nArray.length) {
                    n9 = 0;
                    while (true) {
                        nArray = this.f;
                        n10 = n8;
                        if (n9 >= nArray.length) break;
                        if (nArray[n9] == -1) {
                            n10 = n9;
                            break;
                        }
                        ++n9;
                    }
                }
            }
            nArray = this.f;
            n8 = n10;
            if (n10 >= nArray.length) {
                n8 = nArray.length;
                this.d = n10 = this.d * 2;
                this.k = false;
                this.j = n8 - 1;
                this.h = Arrays.copyOf(this.h, n10);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[n8] = ((i)object).d0;
            this.h[n8] = f8;
            if (n11 != -1) {
                nArray = this.g;
                nArray[n8] = nArray[n11];
                nArray[n11] = n8;
            } else {
                this.g[n8] = this.i;
                this.i = n8;
            }
            ++((i)object).n0;
            ((i)object).d(this.b);
            this.a = n8 = this.a + 1;
            if (!this.k) {
                ++this.j;
            }
            if (n8 >= ((Object)(object = (Object)this.f)).length) {
                this.k = true;
            }
            if (this.j >= ((Object)object).length) {
                this.k = true;
                this.j = ((Object)object).length - 1;
            }
        }
    }

    @Override
    public boolean i(i i8) {
        int n8 = this.i;
        if (n8 == -1) {
            return false;
        }
        for (int i9 = 0; n8 != -1 && i9 < this.a; ++i9) {
            if (this.f[n8] == i8.d0) {
                return true;
            }
            n8 = this.g[n8];
        }
        return false;
    }

    @Override
    public final float j(i i8, boolean bl) {
        int n8;
        if (this.e == i8) {
            this.e = null;
        }
        if ((n8 = this.i) == -1) {
            return 0.0f;
        }
        int n9 = -1;
        for (int i9 = 0; n8 != -1 && i9 < this.a; ++i9) {
            if (this.f[n8] == i8.d0) {
                if (n8 == this.i) {
                    this.i = this.g[n8];
                } else {
                    int[] nArray = this.g;
                    nArray[n9] = nArray[n8];
                }
                if (bl) {
                    i8.l(this.b);
                }
                --i8.n0;
                --this.a;
                this.f[n8] = -1;
                if (this.k) {
                    this.j = n8;
                }
                return this.h[n8];
            }
            int n10 = this.g[n8];
            n9 = n8;
            n8 = n10;
        }
        return 0.0f;
    }

    @Override
    public void k(float f8) {
        int n8 = this.i;
        for (int i8 = 0; n8 != -1 && i8 < this.a; ++i8) {
            float[] fArray = this.h;
            fArray[n8] = fArray[n8] / f8;
            n8 = this.g[n8];
        }
    }

    public String toString() {
        int n8 = this.i;
        CharSequence charSequence = "";
        for (int i8 = 0; n8 != -1 && i8 < this.a; ++i8) {
            CharSequence charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append(" -> ");
            charSequence2 = ((StringBuilder)charSequence2).toString();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)charSequence2);
            ((StringBuilder)charSequence).append(this.h[n8]);
            ((StringBuilder)charSequence).append(" : ");
            charSequence = ((StringBuilder)charSequence).toString();
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append(this.c.d[this.f[n8]]);
            charSequence = ((StringBuilder)charSequence2).toString();
            n8 = this.g[n8];
        }
        return charSequence;
    }
}

