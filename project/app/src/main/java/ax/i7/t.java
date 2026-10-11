/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.m;
import ax.i7.p;
import ax.i7.s;
import ax.m7.v;
import ax.m7.z;
import java.io.IOException;

public class t
extends IOException {
    private final String c0;
    private final transient m d0;
    private final String e0;
    private final int f0;
    private final int q;

    public t(s s8) {
        this(new a(s8));
    }

    protected t(a a8) {
        super(a8.e);
        this.q = a8.a;
        this.c0 = a8.b;
        this.d0 = a8.c;
        this.e0 = a8.d;
        this.f0 = a8.f;
    }

    public static StringBuilder a(s object) {
        String string;
        StringBuilder stringBuilder = new StringBuilder();
        int n8 = ((s)object).h();
        if (n8 != 0) {
            stringBuilder.append(n8);
        }
        if ((string = ((s)object).i()) != null) {
            if (n8 != 0) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(string);
        }
        if ((object = ((s)object).g()) != null) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append('\n');
            }
            if ((string = ((p)object).i()) != null) {
                stringBuilder.append(string);
                stringBuilder.append(' ');
            }
            stringBuilder.append(((p)object).p());
        }
        return stringBuilder;
    }

    public final int b() {
        return this.q;
    }

    public final String c() {
        return this.c0;
    }

    public static class a {
        int a;
        String b;
        m c;
        String d;
        String e;
        int f;

        public a(int n8, String string, m m8) {
            this.f(n8);
            this.g(string);
            this.d(m8);
        }

        public a(s object) {
            block5: {
                IOException iOException2;
                block6: {
                    this(((s)object).h(), ((s)object).i(), ((s)object).f());
                    try {
                        String string;
                        this.d = string = ((s)object).n();
                        if (string.length() == 0) {
                            this.d = null;
                        }
                        break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                    }
                    catch (IOException iOException2) {
                        break block6;
                    }
                    illegalArgumentException.printStackTrace();
                    break block5;
                }
                iOException2.printStackTrace();
            }
            object = t.a((s)object);
            if (this.d != null) {
                ((StringBuilder)object).append(z.a);
                ((StringBuilder)object).append(this.d);
            }
            this.e = ((StringBuilder)object).toString();
        }

        public t a() {
            return new t(this);
        }

        public a b(int n8) {
            boolean bl = n8 >= 0;
            v.a(bl);
            this.f = n8;
            return this;
        }

        public a c(String string) {
            this.d = string;
            return this;
        }

        public a d(m m8) {
            this.c = v.d(m8);
            return this;
        }

        public a e(String string) {
            this.e = string;
            return this;
        }

        public a f(int n8) {
            boolean bl = n8 >= 0;
            v.a(bl);
            this.a = n8;
            return this;
        }

        public a g(String string) {
            this.b = string;
            return this;
        }
    }
}

