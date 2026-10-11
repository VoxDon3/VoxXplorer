/*
 * Decompiled with CFR 0.152.
 */
package ax.l0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class b {
    private static boolean a(int n8, Rect rect, Rect rect2, Rect rect3) {
        boolean bl = b.b(n8, rect, rect2);
        if (!b.b(n8, rect, rect3) && bl) {
            if (!b.j(n8, rect, rect3)) {
                return true;
            }
            if (n8 != 17 && n8 != 66) {
                return b.k(n8, rect, rect2) < b.m(n8, rect, rect3);
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean b(int n8, Rect rect, Rect rect2) {
        if (n8 == 17) return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
        if (n8 == 33) return rect2.right >= rect.left && rect2.left <= rect.right;
        if (n8 == 66) return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
        if (n8 == 130) return rect2.right >= rect.left && rect2.left <= rect.right;
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static <L, T> T c(L l8, b<L, T> b8, a<T> a8, T t8, Rect rect, int n8) {
        Rect rect2 = new Rect(rect);
        int n9 = 0;
        if (n8 != 17) {
            if (n8 != 33) {
                if (n8 != 66) {
                    if (n8 != 130) throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    rect2.offset(0, -(rect.height() + 1));
                } else {
                    rect2.offset(-(rect.width() + 1), 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int n10 = b8.b(l8);
        Rect rect3 = new Rect();
        T t9 = null;
        while (n9 < n10) {
            L l9 = b8.a(l8, n9);
            if (l9 != t8) {
                a8.a(l9, rect3);
                if (b.h(n8, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t9 = (T)l9;
                }
            }
            ++n9;
        }
        return t9;
    }

    public static <L, T> T d(L l8, b<L, T> b8, a<T> a8, T t8, int n8, boolean bl, boolean bl2) {
        int n9 = b8.b(l8);
        ArrayList<T> arrayList = new ArrayList<T>(n9);
        for (int i8 = 0; i8 < n9; ++i8) {
            arrayList.add(b8.a(l8, i8));
        }
        Collections.sort(arrayList, new c<T>(bl, a8));
        if (n8 != 1) {
            if (n8 == 2) {
                return b.e(t8, arrayList, bl2);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return b.f(t8, arrayList, bl2);
    }

    private static <T> T e(T t8, ArrayList<T> arrayList, boolean bl) {
        int n8 = arrayList.size();
        int n9 = t8 == null ? -1 : arrayList.lastIndexOf(t8);
        if (++n9 < n8) {
            return arrayList.get(n9);
        }
        if (bl && n8 > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    private static <T> T f(T t8, ArrayList<T> arrayList, boolean bl) {
        int n8 = arrayList.size();
        int n9 = t8 == null ? n8 : arrayList.indexOf(t8);
        if (--n9 >= 0) {
            return arrayList.get(n9);
        }
        if (bl && n8 > 0) {
            return arrayList.get(n8 - 1);
        }
        return null;
    }

    private static int g(int n8, int n9) {
        return n8 * 13 * n8 + n9 * n9;
    }

    private static boolean h(int n8, Rect rect, Rect rect2, Rect rect3) {
        if (!b.i(rect, rect2, n8)) {
            return false;
        }
        if (!b.i(rect, rect3, n8)) {
            return true;
        }
        if (b.a(n8, rect, rect2, rect3)) {
            return true;
        }
        if (b.a(n8, rect, rect3, rect2)) {
            return false;
        }
        return b.g(b.k(n8, rect, rect2), b.o(n8, rect, rect2)) < b.g(b.k(n8, rect, rect3), b.o(n8, rect, rect3));
    }

    private static boolean i(Rect rect, Rect rect2, int n8) {
        if (n8 != 17) {
            if (n8 != 33) {
                if (n8 != 66) {
                    if (n8 == 130) {
                        int n9 = rect.top;
                        n8 = rect2.top;
                        return (n9 < n8 || rect.bottom <= n8) && rect.bottom < rect2.bottom;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int n10 = rect.left;
                n8 = rect2.left;
                return (n10 < n8 || rect.right <= n8) && rect.right < rect2.right;
            }
            n8 = rect.bottom;
            int n11 = rect2.bottom;
            return (n8 > n11 || rect.top >= n11) && rect.top > rect2.top;
        }
        int n12 = rect.right;
        n8 = rect2.right;
        return (n12 > n8 || rect.left >= n8) && rect.left > rect2.left;
    }

    private static boolean j(int n8, Rect rect, Rect rect2) {
        if (n8 != 17) {
            if (n8 != 33) {
                if (n8 != 66) {
                    if (n8 == 130) {
                        return rect.bottom <= rect2.top;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                return rect.right <= rect2.left;
            }
            return rect.top >= rect2.bottom;
        }
        return rect.left >= rect2.right;
    }

    private static int k(int n8, Rect rect, Rect rect2) {
        return Math.max(0, b.l(n8, rect, rect2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int l(int n8, Rect rect, Rect rect2) {
        int n9;
        if (n8 != 17) {
            if (n8 != 33) {
                if (n8 != 66) {
                    if (n8 != 130) throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    n8 = rect2.top;
                    n9 = rect.bottom;
                    return n8 - n9;
                }
                n8 = rect2.left;
                n9 = rect.right;
                return n8 - n9;
            }
            n8 = rect.top;
            n9 = rect2.bottom;
            return n8 - n9;
        }
        n8 = rect.left;
        n9 = rect2.right;
        return n8 - n9;
    }

    private static int m(int n8, Rect rect, Rect rect2) {
        return Math.max(1, b.n(n8, rect, rect2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int n(int n8, Rect rect, Rect rect2) {
        int n9;
        if (n8 != 17) {
            if (n8 != 33) {
                if (n8 != 66) {
                    if (n8 != 130) throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    n8 = rect2.bottom;
                    n9 = rect.bottom;
                    return n8 - n9;
                }
                n8 = rect2.right;
                n9 = rect.right;
                return n8 - n9;
            }
            n8 = rect.top;
            n9 = rect2.top;
            return n8 - n9;
        }
        n8 = rect.left;
        n9 = rect2.left;
        return n8 - n9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int o(int n8, Rect rect, Rect rect2) {
        if (n8 == 17) return Math.abs(rect.top + rect.height() / 2 - (rect2.top + rect2.height() / 2));
        if (n8 == 33) return Math.abs(rect.left + rect.width() / 2 - (rect2.left + rect2.width() / 2));
        if (n8 == 66) return Math.abs(rect.top + rect.height() / 2 - (rect2.top + rect2.height() / 2));
        if (n8 == 130) return Math.abs(rect.left + rect.width() / 2 - (rect2.left + rect2.width() / 2));
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static interface a<T> {
        public void a(T var1, Rect var2);
    }

    public static interface b<T, V> {
        public V a(T var1, int var2);

        public int b(T var1);
    }

    private static class c<T>
    implements Comparator<T> {
        private final Rect c0;
        private final boolean d0;
        private final a<T> e0;
        private final Rect q = new Rect();

        c(boolean bl, a<T> a8) {
            this.c0 = new Rect();
            this.d0 = bl;
            this.e0 = a8;
        }

        @Override
        public int compare(T t8, T t9) {
            Rect rect = this.q;
            Rect rect2 = this.c0;
            this.e0.a(t8, rect);
            this.e0.a(t9, rect2);
            int n8 = rect.top;
            int n9 = rect2.top;
            if (n8 < n9) {
                return -1;
            }
            if (n8 > n9) {
                return 1;
            }
            n9 = rect.left;
            n8 = rect2.left;
            if (n9 < n8) {
                if (this.d0) {
                    return 1;
                }
                return -1;
            }
            if (n9 > n8) {
                if (this.d0) {
                    return -1;
                }
                return 1;
            }
            n9 = rect.bottom;
            n8 = rect2.bottom;
            if (n9 < n8) {
                return -1;
            }
            if (n9 > n8) {
                return 1;
            }
            n8 = rect.right;
            n9 = rect2.right;
            if (n8 < n9) {
                if (this.d0) {
                    return 1;
                }
                return -1;
            }
            if (n8 > n9) {
                if (this.d0) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }
}

