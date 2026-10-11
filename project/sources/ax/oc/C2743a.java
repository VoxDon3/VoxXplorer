package ax.oc;

import java.io.IOException;

/* renamed from: ax.oc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2743a extends IOException {
    private EnumC0408a q;

    /* renamed from: ax.oc.a$a, reason: collision with other inner class name */
    public enum EnumC0408a {
        WRONG_PASSWORD,
        TASK_CANCELLED_EXCEPTION,
        CHECKSUM_MISMATCH,
        UNKNOWN_COMPRESSION_METHOD,
        FILE_NOT_FOUND,
        UNSUPPORTED_ENCRYPTION,
        UNKNOWN
    }

    public C2743a(String str) {
        super(str);
        this.q = EnumC0408a.UNKNOWN;
    }

    public EnumC0408a a() {
        return this.q;
    }

    public C2743a(String str, EnumC0408a enumC0408a) {
        super(str);
        EnumC0408a enumC0408a2 = EnumC0408a.WRONG_PASSWORD;
        this.q = enumC0408a;
    }

    public C2743a(String str, Throwable th, EnumC0408a enumC0408a) {
        super(str, th);
        EnumC0408a enumC0408a2 = EnumC0408a.WRONG_PASSWORD;
        this.q = enumC0408a;
    }
}
