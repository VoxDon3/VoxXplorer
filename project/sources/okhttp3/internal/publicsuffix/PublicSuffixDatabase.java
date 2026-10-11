package okhttp3.internal.publicsuffix;

import ax.Db.a;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.v;
import ax.Ob.h;
import ax.sb.t;
import ax.tb.C3139o;
import ax.xc.m;
import ax.xc.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = C3139o.d("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            int and;
            boolean z;
            int and2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        and = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        and = Util.and(bArr2[i8][i9], 255);
                        z = z3;
                    }
                    and2 = and - Util.and(bArr[i5 + i10], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                l.e(charset, "UTF_8");
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        private Companion() {
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> j;
        List<String> j2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str4 = list.get(i);
            Charset charset = StandardCharsets.UTF_8;
            l.e(charset, "UTF_8");
            byte[] bytes = str4.getBytes(charset);
            l.e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                str2 = null;
                break;
            }
            Companion companion = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                l.t("publicSuffixListBytes");
                bArr2 = null;
            }
            str2 = companion.binarySearch(bArr2, bArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = WILDCARD_LABEL;
                Companion companion2 = Companion;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    l.t("publicSuffixListBytes");
                    bArr4 = null;
                }
                String binarySearch = companion2.binarySearch(bArr4, bArr3, i3);
                if (binarySearch != null) {
                    str3 = binarySearch;
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i4 = size - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                Companion companion3 = Companion;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    l.t("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String binarySearch2 = companion3.binarySearch(bArr5, bArr, i5);
                if (binarySearch2 != null) {
                    str = binarySearch2;
                    break;
                }
                i5++;
            }
        }
        if (str != null) {
            return h.q0(EXCEPTION_MARKER + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (str2 == null && str3 == null) {
            return PREVAILING_RULE;
        }
        if (str2 == null || (j = h.q0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            j = C3139o.j();
        }
        if (str3 == null || (j2 = h.q0(str3, new char[]{'.'}, false, 0, 6, null)) == null) {
            j2 = C3139o.j();
        }
        return j.size() > j2.size() ? j : j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    private final void readTheList() throws IOException {
        try {
            v vVar = new v();
            v vVar2 = new v();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                ax.xc.g d = p.d(new m(p.k(resourceAsStream)));
                try {
                    vVar.q = d.y0(d.readInt());
                    vVar2.q = d.y0(d.readInt());
                    t tVar = t.a;
                    a.a(d, null);
                    synchronized (this) {
                        T t = vVar.q;
                        l.c(t);
                        this.publicSuffixListBytes = (byte[]) t;
                        T t2 = vVar2.q;
                        l.c(t2);
                        this.publicSuffixExceptionListBytes = (byte[]) t2;
                    }
                } finally {
                }
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e);
                    if (!z) {
                        return;
                    }
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> q0 = h.q0(str, new char[]{'.'}, false, 0, 6, null);
        return l.a(C3139o.M(q0), HttpUrl.FRAGMENT_ENCODE_SET) ? C3139o.A(q0, 1) : q0;
    }

    public final String getEffectiveTldPlusOne(String str) {
        int size;
        int size2;
        l.f(str, "domain");
        String unicode = IDN.toUnicode(str);
        l.e(unicode, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        return ax.Nb.h.l(ax.Nb.h.i(C3139o.y(splitDomain(str)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        l.f(bArr, "publicSuffixListBytes");
        l.f(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
