/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import ax.b0.d;
import ax.b0.e;
import java.util.ArrayList;
import java.util.List;

final class a
implements n.a {
    private d<b> a = new e<b>(30);
    final ArrayList<b> b = new ArrayList();
    final ArrayList<b> c = new ArrayList();
    final a d;
    Runnable e;
    final boolean f;
    final n g;
    private int h = 0;

    a(a a8) {
        this(a8, false);
    }

    a(a a8, boolean bl) {
        this.d = a8;
        this.f = bl;
        this.g = new n(this);
    }

    private void c(b b8) {
        this.v(b8);
    }

    private void d(b b8) {
        this.v(b8);
    }

    private void f(b b8) {
        int n8 = b8.b;
        int n9 = b8.d + n8;
        int n10 = -1;
        int n11 = 0;
        for (int i8 = n8; i8 < n9; ++i8) {
            int n12;
            if (this.d.e(i8) == null && !this.h(i8)) {
                if (n10 == 1) {
                    this.v(this.b(2, n8, n11, null));
                    n10 = 1;
                } else {
                    n10 = 0;
                }
                int n13 = 0;
                n12 = n10;
                n10 = n13;
            } else {
                if (n10 == 0) {
                    this.k(this.b(2, n8, n11, null));
                    n12 = 1;
                } else {
                    n12 = 0;
                }
                n10 = 1;
            }
            if (n12 != 0) {
                i8 -= n11;
                n9 -= n11;
                n12 = 1;
            } else {
                n12 = n11 + 1;
            }
            n11 = n12;
        }
        b b9 = b8;
        if (n11 != b8.d) {
            this.a(b8);
            b9 = this.b(2, n8, n11, null);
        }
        if (n10 == 0) {
            this.k(b9);
            return;
        }
        this.v(b9);
    }

    private void g(b b8) {
        int n8 = b8.b;
        int n9 = b8.d;
        int n10 = n8;
        int n11 = -1;
        int n12 = 0;
        for (int i8 = n8; i8 < n9 + n8; ++i8) {
            int n13;
            int n14;
            if (this.d.e(i8) == null && !this.h(i8)) {
                n14 = n10;
                n13 = n12;
                if (n11 == 1) {
                    this.v(this.b(4, n10, n12, b8.c));
                    n14 = i8;
                    n13 = 0;
                }
                n12 = 0;
                n10 = n14;
                n14 = n13;
            } else {
                n13 = n10;
                n14 = n12;
                if (n11 == 0) {
                    this.k(this.b(4, n10, n12, b8.c));
                    n13 = i8;
                    n14 = 0;
                }
                n12 = 1;
                n10 = n13;
            }
            n13 = n14 + 1;
            n11 = n12;
            n12 = n13;
        }
        Object object = b8;
        if (n12 != b8.d) {
            object = b8.c;
            this.a(b8);
            object = this.b(4, n10, n12, object);
        }
        if (n11 == 0) {
            this.k((b)object);
            return;
        }
        this.v((b)object);
    }

    private boolean h(int n8) {
        int n9 = this.c.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            b b8 = this.c.get(i8);
            int n10 = b8.a;
            if (n10 == 8) {
                if (this.n(b8.d, i8 + 1) != n8) continue;
                return true;
            }
            if (n10 != 1) continue;
            int n11 = b8.b;
            int n12 = b8.d;
            for (n10 = n11; n10 < n12 + n11; ++n10) {
                if (this.n(n10, i8 + 1) != n8) continue;
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void k(b b8) {
        Object object;
        int n8;
        int n9;
        int n10;
        int n11 = b8.a;
        if (n11 != 1 && n11 != 8) {
            n10 = this.z(b8.b, n11);
            n11 = b8.b;
            n9 = b8.a;
            if (n9 != 2) {
                if (n9 != 4) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("op should be remove or update.");
                    stringBuilder.append(b8);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                n8 = 1;
            } else {
                n8 = 0;
            }
            n9 = 1;
        } else {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        for (int i8 = 1; i8 < b8.d; ++i8) {
            int n12 = this.z(b8.b + n8 * i8, b8.a);
            int n13 = b8.a;
            if (n13 != 2 ? n13 == 4 && n12 == n10 + 1 : n12 == n10) {
                ++n9;
                continue;
            }
            object = this.b(n13, n10, n9, b8.c);
            this.l((b)object, n11);
            this.a((b)object);
            n10 = n11;
            if (b8.a == 4) {
                n10 = n11 + n9;
            }
            n9 = 1;
            n11 = n10;
            n10 = n12;
        }
        object = b8.c;
        this.a(b8);
        if (n9 > 0) {
            b8 = this.b(b8.a, n10, n9, object);
            this.l(b8, n11);
            this.a(b8);
        }
    }

    private void v(b b8) {
        this.c.add(b8);
        int n8 = b8.a;
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 4) {
                    if (n8 == 8) {
                        this.d.a(b8.b, b8.d);
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown update op type for ");
                    stringBuilder.append(b8);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                this.d.c(b8.b, b8.d, b8.c);
                return;
            }
            this.d.f(b8.b, b8.d);
            return;
        }
        this.d.g(b8.b, b8.d);
    }

    private int z(int n8, int n9) {
        b b8;
        int n10 = n8;
        for (int i8 = this.c.size() - 1; i8 >= 0; --i8) {
            int n11;
            b8 = this.c.get(i8);
            int n12 = b8.a;
            if (n12 == 8) {
                int n13;
                n11 = b8.b;
                n12 = b8.d;
                if (n11 < n12) {
                    n13 = n11;
                    n8 = n12;
                } else {
                    n8 = n11;
                    n13 = n12;
                }
                if (n10 >= n13 && n10 <= n8) {
                    if (n13 == n11) {
                        if (n9 == 1) {
                            b8.d = n12 + 1;
                        } else if (n9 == 2) {
                            b8.d = n12 - 1;
                        }
                        n8 = n10 + 1;
                    } else {
                        if (n9 == 1) {
                            b8.b = n11 + 1;
                        } else if (n9 == 2) {
                            b8.b = n11 - 1;
                        }
                        n8 = n10 - 1;
                    }
                } else {
                    n8 = n10;
                    if (n10 < n11) {
                        if (n9 == 1) {
                            b8.b = n11 + 1;
                            b8.d = n12 + 1;
                            n8 = n10;
                        } else {
                            n8 = n10;
                            if (n9 == 2) {
                                b8.b = n11 - 1;
                                b8.d = n12 - 1;
                                n8 = n10;
                            }
                        }
                    }
                }
            } else {
                n11 = b8.b;
                if (n11 <= n10) {
                    if (n12 == 1) {
                        n8 = n10 - b8.d;
                    } else {
                        n8 = n10;
                        if (n12 == 2) {
                            n8 = n10 + b8.d;
                        }
                    }
                } else if (n9 == 1) {
                    b8.b = n11 + 1;
                    n8 = n10;
                } else {
                    n8 = n10;
                    if (n9 == 2) {
                        b8.b = n11 - 1;
                        n8 = n10;
                    }
                }
            }
            n10 = n8;
        }
        for (n8 = this.c.size() - 1; n8 >= 0; --n8) {
            b8 = this.c.get(n8);
            if (b8.a == 8) {
                n9 = b8.d;
                if (n9 != b8.b && n9 >= 0) continue;
                this.c.remove(n8);
                this.a(b8);
                continue;
            }
            if (b8.d > 0) continue;
            this.c.remove(n8);
            this.a(b8);
        }
        return n10;
    }

    @Override
    public void a(b b8) {
        if (!this.f) {
            b8.c = null;
            this.a.a(b8);
        }
    }

    @Override
    public b b(int n8, int n9, int n10, Object object) {
        b b8 = this.a.b();
        if (b8 == null) {
            return new b(n8, n9, n10, object);
        }
        b8.a = n8;
        b8.b = n9;
        b8.d = n10;
        b8.c = object;
        return b8;
    }

    public int e(int n8) {
        int n9 = this.b.size();
        int n10 = n8;
        for (int i8 = 0; i8 < n9; ++i8) {
            b b8 = this.b.get(i8);
            n8 = b8.a;
            if (n8 != 1) {
                int n11;
                if (n8 != 2) {
                    if (n8 != 8) {
                        n8 = n10;
                    } else {
                        n8 = b8.b;
                        if (n8 == n10) {
                            n8 = b8.d;
                        } else {
                            n11 = n10;
                            if (n8 < n10) {
                                n11 = n10 - 1;
                            }
                            n8 = n11;
                            if (b8.d <= n11) {
                                n8 = n11 + 1;
                            }
                        }
                    }
                } else {
                    n11 = b8.b;
                    n8 = n10;
                    if (n11 <= n10) {
                        n8 = b8.d;
                        if (n11 + n8 > n10) {
                            return -1;
                        }
                        n8 = n10 - n8;
                    }
                }
            } else {
                n8 = n10;
                if (b8.b <= n10) {
                    n8 = n10 + b8.d;
                }
            }
            n10 = n8;
        }
        return n10;
    }

    void i() {
        int n8 = this.c.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.d.d(this.c.get(i8));
        }
        this.x(this.c);
        this.h = 0;
    }

    void j() {
        this.i();
        int n8 = this.b.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object = this.b.get(i8);
            int n9 = ((b)object).a;
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 4) {
                        if (n9 == 8) {
                            this.d.d((b)object);
                            this.d.a(((b)object).b, ((b)object).d);
                        }
                    } else {
                        this.d.d((b)object);
                        this.d.c(((b)object).b, ((b)object).d, ((b)object).c);
                    }
                } else {
                    this.d.d((b)object);
                    this.d.h(((b)object).b, ((b)object).d);
                }
            } else {
                this.d.d((b)object);
                this.d.g(((b)object).b, ((b)object).d);
            }
            object = this.e;
            if (object == null) continue;
            object.run();
        }
        this.x(this.b);
        this.h = 0;
    }

    void l(b b8, int n8) {
        this.d.b(b8);
        int n9 = b8.a;
        if (n9 != 2) {
            if (n9 == 4) {
                this.d.c(n8, b8.d, b8.c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.d.h(n8, b8.d);
    }

    int m(int n8) {
        return this.n(n8, 0);
    }

    int n(int n8, int n9) {
        int n10 = this.c.size();
        int n11 = n9;
        n9 = n8;
        while (n11 < n10) {
            int n12;
            b b8 = this.c.get(n11);
            int n13 = b8.a;
            if (n13 == 8) {
                n8 = b8.b;
                if (n8 == n9) {
                    n8 = b8.d;
                } else {
                    n12 = n9;
                    if (n8 < n9) {
                        n12 = n9 - 1;
                    }
                    n8 = n12;
                    if (b8.d <= n12) {
                        n8 = n12 + 1;
                    }
                }
            } else {
                n12 = b8.b;
                n8 = n9;
                if (n12 <= n9) {
                    if (n13 == 2) {
                        n8 = b8.d;
                        if (n9 < n12 + n8) {
                            return -1;
                        }
                        n8 = n9 - n8;
                    } else {
                        n8 = n9;
                        if (n13 == 1) {
                            n8 = n9 + b8.d;
                        }
                    }
                }
            }
            ++n11;
            n9 = n8;
        }
        return n9;
    }

    boolean o(int n8) {
        return (n8 & this.h) != 0;
    }

    boolean p() {
        return this.b.size() > 0;
    }

    boolean q() {
        return !this.c.isEmpty() && !this.b.isEmpty();
    }

    boolean r(int n8, int n9, Object object) {
        if (n9 < 1) {
            return false;
        }
        this.b.add(this.b(4, n8, n9, object));
        this.h |= 4;
        return this.b.size() == 1;
    }

    boolean s(int n8, int n9) {
        if (n9 < 1) {
            return false;
        }
        this.b.add(this.b(1, n8, n9, null));
        this.h |= 1;
        return this.b.size() == 1;
    }

    boolean t(int n8, int n9, int n10) {
        if (n8 == n9) {
            return false;
        }
        if (n10 == 1) {
            this.b.add(this.b(8, n8, n9, null));
            this.h |= 8;
            return this.b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    boolean u(int n8, int n9) {
        if (n9 < 1) {
            return false;
        }
        this.b.add(this.b(2, n8, n9, null));
        this.h |= 2;
        return this.b.size() == 1;
    }

    void w() {
        this.g.b(this.b);
        int n8 = this.b.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object = this.b.get(i8);
            int n9 = ((b)object).a;
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 4) {
                        if (n9 == 8) {
                            this.d((b)object);
                        }
                    } else {
                        this.g((b)object);
                    }
                } else {
                    this.f((b)object);
                }
            } else {
                this.c((b)object);
            }
            object = this.e;
            if (object == null) continue;
            object.run();
        }
        this.b.clear();
    }

    void x(List<b> list) {
        int n8 = list.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.a(list.get(i8));
        }
        list.clear();
    }

    void y() {
        this.x(this.b);
        this.x(this.c);
        this.h = 0;
    }

    static interface a {
        public void a(int var1, int var2);

        public void b(b var1);

        public void c(int var1, int var2, Object var3);

        public void d(b var1);

        public RecyclerView.F e(int var1);

        public void f(int var1, int var2);

        public void g(int var1, int var2);

        public void h(int var1, int var2);
    }

    static final class b {
        int a;
        int b;
        Object c;
        int d;

        b(int n8, int n9, int n10, Object object) {
            this.a = n8;
            this.b = n9;
            this.d = n10;
            this.c = object;
        }

        String a() {
            int n8 = this.a;
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 4) {
                        if (n8 != 8) {
                            return "??";
                        }
                        return "mv";
                    }
                    return "up";
                }
                return "rm";
            }
            return "add";
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            int n8 = this.a;
            if (n8 != ((b)object).a) {
                return false;
            }
            if (n8 == 8 && Math.abs(this.d - this.b) == 1 && this.d == ((b)object).b && this.b == ((b)object).d) {
                return true;
            }
            if (this.d != ((b)object).d) {
                return false;
            }
            if (this.b != ((b)object).b) {
                return false;
            }
            Object object2 = this.c;
            return !(object2 != null ? !object2.equals(((b)object).c) : ((b)object).c != null);
        }

        public int hashCode() {
            return (this.a * 31 + this.b) * 31 + this.d;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append("[");
            stringBuilder.append(this.a());
            stringBuilder.append(",s:");
            stringBuilder.append(this.b);
            stringBuilder.append("c:");
            stringBuilder.append(this.d);
            stringBuilder.append(",p:");
            stringBuilder.append(this.c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }
}

