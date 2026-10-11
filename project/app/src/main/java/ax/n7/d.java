/*
 * Decompiled with CFR 0.152.
 */
package ax.n7;

final class d {
    private static final ThreadLocal<char[]> a = new ThreadLocal<char[]>(){

        protected char[] a() {
            return new char[1024];
        }
    };

    static char[] a() {
        return a.get();
    }
}

