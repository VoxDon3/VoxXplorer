/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import java.text.Collator;
import java.util.Comparator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class a
implements Comparator<String> {
    Collator c0;
    c<b> q;

    public a(Collator collator) {
        this.c0 = collator;
        this.q = new c<b>(this){
            final a b;
            {
                this.b = a8;
            }

            protected b d() {
                return new b(this.b);
            }
        };
    }

    private int b(char c8, char c9) {
        int n8 = this.e(c8) - this.e(c9);
        if (n8 != 0) {
            return n8;
        }
        return c8 - c9;
    }

    private int c(int n8, String string) {
        while (n8 < string.length()) {
            if (this.f(string.charAt(n8))) {
                ++n8;
                continue;
            }
            return n8 - 1;
        }
        return string.length() - 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int d(String string, b b8, String string2, b b9) {
        int n8;
        block19: {
            int n9;
            block20: {
                int n10;
                int n11;
                block17: {
                    char c8;
                    char c9;
                    int n12 = 0;
                    n8 = 0;
                    n11 = 0;
                    n9 = 0;
                    while (true) {
                        n10 = n12;
                        if (n8 >= string.length()) break block17;
                        n10 = n12;
                        if (n8 >= string2.length()) break block17;
                        c9 = string.charAt(n8);
                        if (c9 != (c8 = string2.charAt(n8))) break;
                        if (this.f(string.charAt(n8))) {
                            n10 = n11;
                            if (n11 == 0) {
                                n9 = n8;
                                n10 = 1;
                            }
                        } else {
                            n10 = 0;
                        }
                        ++n8;
                        n11 = n10;
                    }
                    if (this.f(c9) && this.f(c8)) {
                        if (n11 != 0) {
                            b8.a = n9;
                            b9.a = n9;
                        } else {
                            b8.a = n8;
                            b9.a = n8;
                        }
                    } else {
                        if (!this.f(c9) && !this.f(c8)) {
                            if (this.g(c9) && this.g(c8)) {
                                b8.a = n8;
                                b9.a = n8;
                                return 3;
                            }
                            return 1;
                        }
                        if (n11 == 0) {
                            return 1;
                        }
                        b8.a = n9;
                        b9.a = n9;
                    }
                    n10 = 1;
                }
                n8 = n10;
                if (n10 != 0) break block19;
                n8 = n10;
                if (n11 == 0) break block19;
                n8 = n10;
                if (string.length() == string2.length()) break block19;
                if (string2.length() > string.length() && this.f(string2.charAt(string.length()))) break block20;
                n8 = n10;
                if (string.length() <= string2.length()) break block19;
                n8 = n10;
                if (!this.f(string.charAt(string2.length()))) break block19;
            }
            b8.a = n9;
            b9.a = n9;
            n8 = 1;
        }
        if (n8 == 0) {
            return 1;
        }
        b8.b = this.h(b8.a, string);
        b9.b = this.h(b9.a, string2);
        b8.c = this.c(b8.b, string);
        b9.c = this.c(b9.b, string2);
        return 2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int e(char c8) {
        if (c8 >= '\u2460' && c8 <= '\u249b') {
            if (c8 >= '\u2460' && c8 <= '\u2473') {
                return c8 - 9311;
            }
            if (c8 >= '\u2474' && c8 <= '\u2487') {
                return c8 - 9331;
            }
            if (c8 >= '\u2488' && c8 <= '\u249b') {
                return c8 - 9351;
            }
        } else if (c8 >= '\u24ea' && c8 <= '\u24ff') {
            if (c8 == '\u24ea' || c8 == '\u24ff') return 0;
            if (c8 >= '\u24eb' && c8 <= '\u24f4') {
                return c8 - 9440;
            }
            if (c8 >= '\u24f5' && c8 <= '\u24fe') {
                return c8 - 9460;
            }
        } else if (c8 >= '\u2776' && c8 <= '\u277f') {
            return c8 - 10101;
        }
        ax.u3.b.g("NOT REACHABLE");
        return -1;
    }

    private boolean f(char c8) {
        return c8 >= '0' && c8 <= '9';
    }

    private boolean g(char c8) {
        if (c8 >= '\u2460' && c8 <= '\u249b') {
            return true;
        }
        if (c8 >= '\u24ea' && c8 <= '\u24ff') {
            return true;
        }
        return c8 >= '\u2776' && c8 <= '\u277f';
    }

    private int h(int n8, String string) {
        while (n8 < string.length()) {
            char c8 = string.charAt(n8);
            if (this.f(c8)) {
                if (c8 == '0') {
                    ++n8;
                    continue;
                }
                return n8;
            }
            return n8 - 1;
        }
        return string.length() - 1;
    }

    /*
     * Exception decompiling
     */
    public int a(String var1_1, String var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 87->110)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    class b {
        int a;
        int b;
        int c;
        final a d;

        b(a a8) {
            this.d = a8;
        }

        int a() {
            return this.c - this.b;
        }

        int b() {
            return this.b - this.a;
        }
    }

    private static abstract class c<T> {
        private ConcurrentLinkedQueue<T> a = new ConcurrentLinkedQueue();

        public T a() {
            T t8;
            T t9 = t8 = this.a.poll();
            if (t8 == null) {
                t9 = this.b();
            }
            return t9;
        }

        protected abstract T b();

        public void c(T t8) {
            this.a.offer(t8);
        }
    }
}

