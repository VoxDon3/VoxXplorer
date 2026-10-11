package j$.desugar.sun.nio.fs;

import j$.nio.file.D;
import j$.nio.file.FileSystem;
import j$.nio.file.Path;
import j$.nio.file.attribute.B;
import java.util.Set;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class h extends FileSystem {
    public final String a;
    public final String b;
    public final l c;

    @Override // j$.nio.file.FileSystem
    public final boolean A() {
        return false;
    }

    @Override // j$.nio.file.FileSystem
    public final Set H() {
        return j$.com.android.tools.r8.a.R(new Object[]{"basic"});
    }

    @Override // j$.nio.file.FileSystem
    public final boolean isOpen() {
        return true;
    }

    @Override // j$.nio.file.FileSystem
    public final j$.nio.file.spi.c D() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.FileSystem
    public final String t() {
        return "/";
    }

    @Override // j$.nio.file.FileSystem
    public final Iterable o() {
        return j$.com.android.tools.r8.a.Q(new Object[]{new n(this, "/", this.a, this.b)});
    }

    @Override // j$.nio.file.FileSystem
    public final Iterable j() {
        throw new UnsupportedOperationException(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public h(l lVar, String str, String str2) {
        this.c = lVar;
        this.a = str;
        this.b = str2;
    }

    @Override // j$.nio.file.FileSystem
    public final Path k(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new n(this, str, this.a, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f1, code lost:
    
        if (j$.com.android.tools.r8.a.a0(r0, r8) == '&') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0120, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0135, code lost:
    
        if (r8 != ']') goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0137, code lost:
    
        r4.append("]]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0146, code lost:
    
        throw new java.util.regex.PatternSyntaxException("Missing ']", r0, r5 - 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0128  */
    @Override // j$.nio.file.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.nio.file.PathMatcher n(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.desugar.sun.nio.fs.h.n(java.lang.String):j$.nio.file.PathMatcher");
    }

    @Override // j$.nio.file.FileSystem
    public final B y() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.FileSystem
    public final D C() {
        throw new UnsupportedOperationException();
    }
}
