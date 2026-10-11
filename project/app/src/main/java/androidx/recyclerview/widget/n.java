/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

class n {
    final a a;

    n(a a8) {
        this.a = a8;
    }

    private int a(List<a.b> list) {
        boolean bl = false;
        for (int i8 = list.size() - 1; i8 >= 0; --i8) {
            boolean bl2;
            if (list.get((int)i8).a == 8) {
                bl2 = bl;
                if (bl) {
                    return i8;
                }
            } else {
                bl2 = true;
            }
            bl = bl2;
        }
        return -1;
    }

    private void c(List<a.b> list, int n8, a.b b8, int n9, a.b b9) {
        int n10 = b8.d;
        int n11 = b9.b;
        int n12 = n10 < n11 ? -1 : 0;
        int n13 = b8.b;
        int n14 = n12;
        if (n13 < n11) {
            n14 = n12 + 1;
        }
        if (n11 <= n13) {
            b8.b = n13 + b9.d;
        }
        if ((n12 = b9.b) <= n10) {
            b8.d = n10 + b9.d;
        }
        b9.b = n12 + n14;
        list.set(n8, b9);
        list.set(n9, b8);
    }

    private void d(List<a.b> list, int n8, int n9) {
        a.b b8 = list.get(n8);
        a.b b9 = list.get(n9);
        int n10 = b9.a;
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 4) {
                    return;
                }
                this.f(list, n8, b8, n9, b9);
                return;
            }
            this.e(list, n8, b8, n9, b9);
            return;
        }
        this.c(list, n8, b8, n9, b9);
    }

    void b(List<a.b> list) {
        int n8;
        while ((n8 = this.a(list)) != -1) {
            this.d(list, n8, n8 + 1);
        }
    }

    /*
     * Unable to fully structure code
     */
    void e(List<a.b> var1_1, int var2_2, a.b var3_3, int var4_4, a.b var5_5) {
        block28: {
            var6_6 = var3_3.b;
            var8_7 = var3_3.d;
            var7_8 = false;
            if (var6_6 < var8_7) {
                if (var5_5.b == var6_6 && var5_5.d == var8_7 - var6_6) {
                    var6_6 = 0;
lbl7:
                    // 2 sources

                    while (true) {
                        var7_8 = true;
                        break;
                    }
                } else {
                    var6_6 = 0;
                }
            } else {
                if (var5_5.b == var8_7 + 1 && var5_5.d == var6_6 - var8_7) {
                    var6_6 = 1;
                    ** continue;
                }
                var6_6 = 1;
            }
            var9_9 = var5_5.b;
            if (var8_7 >= var9_9) break block28;
            var5_5.b = var9_9 - 1;
            ** GOTO lbl-1000
        }
        var10_10 = var5_5.d;
        if (var8_7 < var9_9 + var10_10) {
            var5_5.d = var10_10 - 1;
            var3_3.a = 2;
            var3_3.d = 1;
            if (var5_5.d == 0) {
                var1_1.remove(var4_4);
                this.a.a(var5_5);
                return;
            }
        } else lbl-1000:
        // 2 sources

        {
            var9_9 = var3_3.b;
            var8_7 = var5_5.b;
            var11_11 = null;
            if (var9_9 <= var8_7) {
                var5_5.b = var8_7 + 1;
            } else {
                var10_10 = var5_5.d;
                if (var9_9 < var8_7 + var10_10) {
                    var11_11 = this.a.b(2, var9_9 + 1, var8_7 + var10_10 - var9_9, null);
                    var5_5.d = var3_3.b - var5_5.b;
                }
            }
            if (var7_8) {
                var1_1.set(var2_2, var5_5);
                var1_1.remove(var4_4);
                this.a.a(var3_3);
                return;
            }
            if (var6_6 != 0) {
                if (var11_11 != null) {
                    var6_6 = var3_3.b;
                    if (var6_6 > var11_11.b) {
                        var3_3.b = var6_6 - var11_11.d;
                    }
                    if ((var6_6 = var3_3.d) > var11_11.b) {
                        var3_3.d = var6_6 - var11_11.d;
                    }
                }
                if ((var6_6 = var3_3.b) > var5_5.b) {
                    var3_3.b = var6_6 - var5_5.d;
                }
                if ((var6_6 = var3_3.d) > var5_5.b) {
                    var3_3.d = var6_6 - var5_5.d;
                }
            } else {
                if (var11_11 != null) {
                    var6_6 = var3_3.b;
                    if (var6_6 >= var11_11.b) {
                        var3_3.b = var6_6 - var11_11.d;
                    }
                    if ((var6_6 = var3_3.d) >= var11_11.b) {
                        var3_3.d = var6_6 - var11_11.d;
                    }
                }
                if ((var6_6 = var3_3.b) >= var5_5.b) {
                    var3_3.b = var6_6 - var5_5.d;
                }
                if ((var6_6 = var3_3.d) >= var5_5.b) {
                    var3_3.d = var6_6 - var5_5.d;
                }
            }
            var1_1.set(var2_2, var5_5);
            if (var3_3.b != var3_3.d) {
                var1_1.set(var4_4, var3_3);
            } else {
                var1_1.remove(var4_4);
            }
            if (var11_11 != null) {
                var1_1.add(var2_2, var11_11);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    void f(List<a.b> var1_1, int var2_2, a.b var3_3, int var4_4, a.b var5_5) {
        block9: {
            var8_6 = var3_3.d;
            var7_7 = var5_5.b;
            var10_8 = null;
            if (var8_6 >= var7_7) break block9;
            var5_5.b = var7_7 - 1;
            ** GOTO lbl-1000
        }
        var6_9 = var5_5.d;
        if (var8_6 < var7_7 + var6_9) {
            var5_5.d = var6_9 - 1;
            var9_10 = this.a.b(4, var3_3.b, 1, var5_5.c);
        } else lbl-1000:
        // 2 sources

        {
            var9_10 = null;
        }
        var6_9 = var3_3.b;
        var8_6 = var5_5.b;
        if (var6_9 <= var8_6) {
            var5_5.b = var8_6 + 1;
        } else {
            var7_7 = var5_5.d;
            if (var6_9 < var8_6 + var7_7) {
                var7_7 = var8_6 + var7_7 - var6_9;
                var10_8 = this.a.b(4, var6_9 + 1, var7_7, var5_5.c);
                var5_5.d -= var7_7;
            }
        }
        var1_1.set(var4_4, var3_3);
        if (var5_5.d > 0) {
            var1_1.set(var2_2, var5_5);
        } else {
            var1_1.remove(var2_2);
            this.a.a(var5_5);
        }
        if (var9_10 != null) {
            var1_1.add(var2_2, var9_10);
        }
        if (var10_8 != null) {
            var1_1.add(var2_2, var10_8);
        }
    }

    static interface a {
        public void a(a.b var1);

        public a.b b(int var1, int var2, int var3, Object var4);
    }
}

