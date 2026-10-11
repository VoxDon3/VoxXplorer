package ax.T4;

import ax.T4.j;

/* loaded from: classes.dex */
public enum s implements ax.b5.g {
    AUTO_CLOSE_SOURCE(j.a.AUTO_CLOSE_SOURCE),
    STRICT_DUPLICATE_DETECTION(j.a.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNDEFINED(j.a.IGNORE_UNDEFINED),
    INCLUDE_SOURCE_IN_LOCATION(j.a.INCLUDE_SOURCE_IN_LOCATION),
    USE_FAST_DOUBLE_PARSER(j.a.USE_FAST_DOUBLE_PARSER),
    USE_FAST_BIG_NUMBER_PARSER(j.a.USE_FAST_BIG_NUMBER_PARSER);

    private final int c0;
    private final j.a d0;
    private final boolean q;

    s(j.a aVar) {
        this.d0 = aVar;
        this.c0 = aVar.l();
        this.q = aVar.h();
    }

    @Override // ax.b5.g
    public boolean d() {
        return this.q;
    }

    @Override // ax.b5.g
    public int h() {
        return this.c0;
    }

    public j.a j() {
        return this.d0;
    }
}
