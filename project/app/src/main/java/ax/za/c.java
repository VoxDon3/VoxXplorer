/*
 * Decompiled with CFR 0.152.
 */
package ax.za;

import ax.c9.e;
import ax.s9.i;
import ax.s9.m;
import ax.za.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedList;

public final class c
extends Enum<c> {
    public static final /* enum */ c e0;
    public static final /* enum */ c f0;
    public static final /* enum */ c g0;
    public static final /* enum */ c h0;
    public static final /* enum */ c i0;
    public static final /* enum */ c j0;
    private static final c[] k0;
    private final ax.oa.b c0;
    private final ax.oa.b d0;
    private final String q;

    static {
        ax.oa.b b8 = ax.oa.b.g0;
        ax.oa.b b9 = ax.oa.b.l0;
        e0 = new c("winreg", b8, b9);
        b8 = ax.oa.b.h0;
        f0 = new c("srvsvc", b8, b9);
        g0 = new c("lsarpc", ax.oa.b.i0, b9);
        h0 = new c("samr", ax.oa.b.j0, b9);
        i0 = new c("browser", b8, b9);
        j0 = new c("svcctl", ax.oa.b.k0, b9);
        k0 = c.d();
    }

    private c(String string2, ax.oa.b b8, ax.oa.b b9) {
        this.q = string2;
        this.c0 = b8;
        this.d0 = b9;
    }

    private static /* synthetic */ c[] d() {
        return new c[]{e0, f0, g0, h0, i0, j0};
    }

    private ax.Ca.a j(ax.r9.b object, i object2) throws IOException {
        LinkedList<ax.Ba.a> linkedList = new LinkedList<ax.Ba.a>();
        for (int i8 = -1; i8 < 1; ++i8) {
            try {
                ax.Ca.a a8 = this.l((ax.r9.b)object, (i)object2);
                return a8;
            }
            catch (ax.Ba.a a9) {
                linkedList.offer(a9);
                if (a.a[a9.a().ordinal()] == 1) {
                    try {
                        Thread.sleep(3000L);
                        continue;
                    }
                    catch (InterruptedException interruptedException) {
                        object2 = new InterruptedIOException();
                        ((Throwable)object2).addSuppressed(interruptedException);
                        throw object2;
                    }
                }
                throw (ax.Ba.a)linkedList.poll();
            }
        }
        if (!linkedList.isEmpty()) {
            throw (ax.Ba.a)linkedList.poll();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unknown error when opening pipe: ");
        ((StringBuilder)object).append(((m)object2).f().toString());
        throw new ax.k9.c(((StringBuilder)object).toString());
    }

    private ax.Ca.a l(ax.r9.b b8, i i8) throws IOException {
        return new ax.Ca.a(b8, i8, this.q);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])k0.clone();
    }

    public ax.za.a h(ax.r9.b object) throws IOException {
        m m8 = ((ax.r9.b)object).b("IPC$");
        if (m8 instanceof i) {
            object = new b(this.j((ax.r9.b)object, (i)m8));
            ((ax.za.a)object).c(this.c0, this.d0);
            return object;
        }
        throw new e(String.format("%s not a named pipe.", this.q));
    }
}

