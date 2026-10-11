/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.publicsuffix;

import ax.Gb.g;
import ax.Gb.l;
import ax.Nb.h;
import ax.tb.o;
import java.io.IOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.Util;

public final class PublicSuffixDatabase {
    public static final Companion Companion = new Companion(null);
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE;
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL;
    private static final PublicSuffixDatabase instance;
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    static {
        WILDCARD_LABEL = new byte[]{42};
        PREVAILING_RULE = o.d("*");
        instance = new PublicSuffixDatabase();
    }

    private final List<String> findMatchingRule(List<String> object) {
        block30: {
            Object object2;
            block34: {
                block33: {
                    Object object3;
                    block32: {
                        block31: {
                            Companion companion;
                            Object object4;
                            Object var7_8;
                            int n8;
                            byte[][] byArrayArray;
                            int n9;
                            block29: {
                                if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
                                    this.readTheListUninterruptibly();
                                } else {
                                    try {
                                        this.readCompleteLatch.await();
                                    }
                                    catch (InterruptedException interruptedException) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                                if (this.publicSuffixListBytes == null) break block30;
                                n9 = object.size();
                                byArrayArray = new byte[n9][];
                                for (n8 = 0; n8 < n9; ++n8) {
                                    object3 = object.get(n8);
                                    object2 = StandardCharsets.UTF_8;
                                    l.e(object2, "UTF_8");
                                    object2 = ((String)object3).getBytes((Charset)object2);
                                    l.e(object2, "this as java.lang.String).getBytes(charset)");
                                    byArrayArray[n8] = (byte[])object2;
                                }
                                n8 = 0;
                                while (true) {
                                    var7_8 = null;
                                    if (n8 >= n9) break;
                                    object3 = Companion;
                                    object = object2 = (Object)this.publicSuffixListBytes;
                                    if (object2 == null) {
                                        l.t("publicSuffixListBytes");
                                        object = null;
                                    }
                                    if ((object = ((Companion)object3).binarySearch((byte[])object, byArrayArray, n8)) == null) {
                                        ++n8;
                                        continue;
                                    }
                                    break block29;
                                    break;
                                }
                                object = null;
                            }
                            if (n9 > 1) {
                                object4 = (byte[][])byArrayArray.clone();
                                int n10 = ((byte[][])object4).length;
                                for (n8 = 0; n8 < n10 - 1; ++n8) {
                                    object4[n8] = WILDCARD_LABEL;
                                    companion = Companion;
                                    object2 = object3 = (Object)this.publicSuffixListBytes;
                                    if (object3 == null) {
                                        l.t("publicSuffixListBytes");
                                        object2 = null;
                                    }
                                    if ((object2 = companion.binarySearch((byte[])object2, object4, n8)) == null) {
                                        continue;
                                    }
                                    break;
                                }
                            } else {
                                object2 = null;
                            }
                            object3 = var7_8;
                            if (object2 != null) {
                                n8 = 0;
                                while (true) {
                                    object3 = var7_8;
                                    if (n8 >= n9 - 1) break;
                                    companion = Companion;
                                    object4 = this.publicSuffixExceptionListBytes;
                                    object3 = object4;
                                    if (object4 == null) {
                                        l.t("publicSuffixExceptionListBytes");
                                        object3 = null;
                                    }
                                    if ((object3 = companion.binarySearch((byte[])object3, byArrayArray, n8)) != null) break;
                                    ++n8;
                                }
                            }
                            if (object3 != null) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append('!');
                                ((StringBuilder)object).append((String)object3);
                                return ax.Ob.h.q0(((StringBuilder)object).toString(), new char[]{'.'}, false, 0, 6, null);
                            }
                            if (object == null && object2 == null) {
                                return PREVAILING_RULE;
                            }
                            if (object == null) break block31;
                            object = object3 = ax.Ob.h.q0(object, new char[]{'.'}, false, 0, 6, null);
                            if (object3 != null) break block32;
                        }
                        object = o.j();
                    }
                    if (object2 == null) break block33;
                    object2 = object3 = ax.Ob.h.q0(object2, new char[]{'.'}, false, 0, 6, null);
                    if (object3 != null) break block34;
                }
                object2 = o.j();
            }
            if (object.size() <= object2.size()) {
                object = object2;
            }
            return object;
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
    }

    /*
     * Exception decompiling
     */
    private final void readTheList() throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [6 : 146->150)] java.lang.Throwable
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

    /*
     * Exception decompiling
     */
    private final void readTheListUninterruptibly() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3 : 24->37)] java.lang.Throwable
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

    private final List<String> splitDomain(String list) {
        List list2 = ax.Ob.h.q0((CharSequence)((Object)list), new char[]{'.'}, false, 0, 6, null);
        list = list2;
        if (l.a(o.M(list2), "")) {
            list = o.A(list2, 1);
        }
        return list;
    }

    public final String getEffectiveTldPlusOne(String string) {
        int n8;
        int n9;
        l.f(string, "domain");
        Object object = IDN.toUnicode(string);
        l.e(object, "unicodeDomain");
        List<String> list = this.splitDomain((String)object);
        object = this.findMatchingRule(list);
        if (list.size() == object.size() && ((String)object.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String)object.get(0)).charAt(0) == '!') {
            n9 = list.size();
            n8 = object.size();
        } else {
            n9 = list.size();
            n8 = object.size() + 1;
        }
        return h.l(h.i(o.y((Iterable)this.splitDomain(string)), n9 - n8), ".", null, null, 0, null, null, 62, null);
    }

    public final void setListBytes(byte[] byArray, byte[] byArray2) {
        l.f(byArray, "publicSuffixListBytes");
        l.f(byArray2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = byArray;
        this.publicSuffixExceptionListBytes = byArray2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         */
        private final String binarySearch(byte[] byArray, byte[][] object, int n8) {
            int n9 = byArray.length;
            int n10 = 0;
            while (true) {
                int n11;
                block14: {
                    int n12;
                    int n13;
                    int n14;
                    int n15;
                    block15: {
                        int n16;
                        block13: {
                            int n17;
                            int n18;
                            int n19;
                            Object var3_4;
                            if (n10 >= n9) {
                                return null;
                            }
                            for (n16 = (n10 + n9) / 2; n16 > -1 && byArray[n16] != 10; --n16) {
                            }
                            n15 = n16 + 1;
                            int n20 = 1;
                            while (byArray[n11 = n15 + n20] != 10) {
                                ++n20;
                            }
                            n14 = n11 - n15;
                            int n21 = var3_4;
                            n13 = 0;
                            n20 = 0;
                            n12 = 0;
                            while (true) {
                                if (n13 != 0) {
                                    n19 = 46;
                                    n13 = 0;
                                } else {
                                    n19 = Util.and(object[n21][n20], 255);
                                }
                                n18 = n19 - Util.and(byArray[n15 + n12], 255);
                                n19 = n20++;
                                n17 = n12++;
                                if (n18 != 0) break;
                                n19 = n20;
                                n17 = n12;
                                if (n12 == n14) break;
                                if (object[n21].length != n20) continue;
                                if (n21 == ((byte[][])object).length - 1) {
                                    n19 = n20;
                                    n17 = n12;
                                    break;
                                }
                                ++n21;
                                n13 = 1;
                                n20 = -1;
                            }
                            if (n18 < 0) break block13;
                            if (n18 > 0) break block14;
                            n12 = n14 - n17;
                            n13 = object[n21].length - n19;
                            n20 = n21 + true;
                            n21 = ((byte[][])object).length;
                            while (n20 < n21) {
                                n13 += object[n20].length;
                                ++n20;
                            }
                            if (n13 >= n12) break block15;
                        }
                        n9 = n16;
                        continue;
                    }
                    if (n13 <= n12) {
                        Charset charset = StandardCharsets.UTF_8;
                        l.e(charset, "UTF_8");
                        return new String(byArray, n15, n14, charset);
                    }
                }
                n10 = n11 + 1;
            }
        }

        public final PublicSuffixDatabase get() {
            return instance;
        }
    }
}

