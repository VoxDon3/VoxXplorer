package ax.Lc;

import j$.util.Objects;

/* loaded from: classes3.dex */
public enum e {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");

    private final String q;

    e(String str) {
        Objects.requireNonNull(str, "lineSeparator");
        this.q = str;
    }

    public String h() {
        return this.q;
    }
}
