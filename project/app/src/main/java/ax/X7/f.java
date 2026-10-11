/*
 * Decompiled with CFR 0.152.
 */
package ax.X7;

import ax.X7.b;
import ax.X7.c;
import ax.X7.d;
import ax.X7.e;
import ax.X7.i;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class f
implements ax.U7.e {
    private static final Charset f = Charset.forName("UTF-8");
    private static final ax.U7.c g = ax.U7.c.a("key").b(ax.X7.a.b().c(1).a()).a();
    private static final ax.U7.c h = ax.U7.c.a("value").b(ax.X7.a.b().c(2).a()).a();
    private static final ax.U7.d<Map.Entry<Object, Object>> i = new e();
    private OutputStream a;
    private final Map<Class<?>, ax.U7.d<?>> b;
    private final Map<Class<?>, ax.U7.f<?>> c;
    private final ax.U7.d<Object> d;
    private final i e = new i(this);

    f(OutputStream outputStream, Map<Class<?>, ax.U7.d<?>> map, Map<Class<?>, ax.U7.f<?>> map2, ax.U7.d<Object> d8) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = d8;
    }

    public static /* synthetic */ void f(Map.Entry entry, ax.U7.e e8) {
        e8.e(g, entry.getKey());
        e8.e(h, entry.getValue());
    }

    private static ByteBuffer p(int n8) {
        return ByteBuffer.allocate(n8).order(ByteOrder.LITTLE_ENDIAN);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private <T> long q(ax.U7.d<T> d8, T t8) throws IOException {
        Throwable throwable2222222;
        b b8;
        block8: {
            b8 = new b();
            OutputStream outputStream = this.a;
            this.a = b8;
            {
                long l8;
                catch (Throwable throwable2222222) {
                    break block8;
                }
                try {
                    d8.a(t8, this);
                    {
                        this.a = outputStream;
                        l8 = b8.getLength();
                    }
                }
                catch (Throwable throwable3) {}
                b8.close();
                return l8;
                {
                    this.a = outputStream;
                    throw throwable3;
                }
            }
        }
        try {
            b8.close();
            throw throwable2222222;
        }
        catch (Throwable throwable4) {
            throwable2222222.addSuppressed(throwable4);
        }
        throw throwable2222222;
    }

    private <T> f r(ax.U7.d<T> d8, ax.U7.c c8, T t8, boolean bl) throws IOException {
        long l8 = this.q(d8, t8);
        if (bl && l8 == 0L) {
            return this;
        }
        this.w(ax.X7.f.v(c8) << 3 | 2);
        this.x(l8);
        d8.a(t8, this);
        return this;
    }

    private <T> f s(ax.U7.f<T> f8, ax.U7.c c8, T t8, boolean bl) throws IOException {
        this.e.b(c8, bl);
        f8.a(t8, this.e);
        return this;
    }

    private static d u(ax.U7.c object) {
        if ((object = ((ax.U7.c)object).c(d.class)) != null) {
            return object;
        }
        throw new ax.U7.b("Field has no @Protobuf config");
    }

    private static int v(ax.U7.c object) {
        if ((object = ((ax.U7.c)object).c(d.class)) != null) {
            return object.tag();
        }
        throw new ax.U7.b("Field has no @Protobuf config");
    }

    private void w(int n8) throws IOException {
        while ((long)(n8 & 0xFFFFFF80) != 0L) {
            this.a.write(n8 & 0x7F | 0x80);
            n8 >>>= 7;
        }
        this.a.write(n8 & 0x7F);
    }

    private void x(long l8) throws IOException {
        while ((0xFFFFFFFFFFFFFF80L & l8) != 0L) {
            this.a.write((int)l8 & 0x7F | 0x80);
            l8 >>>= 7;
        }
        this.a.write((int)l8 & 0x7F);
    }

    @Override
    public ax.U7.e d(ax.U7.c c8, double d8) throws IOException {
        return this.g(c8, d8, true);
    }

    @Override
    public ax.U7.e e(ax.U7.c c8, Object object) throws IOException {
        return this.i(c8, object, true);
    }

    ax.U7.e g(ax.U7.c c8, double d8, boolean bl) throws IOException {
        if (bl && d8 == 0.0) {
            return this;
        }
        this.w(ax.X7.f.v(c8) << 3 | 1);
        this.a.write(ax.X7.f.p(8).putDouble(d8).array());
        return this;
    }

    ax.U7.e h(ax.U7.c c8, float f8, boolean bl) throws IOException {
        if (bl && f8 == 0.0f) {
            return this;
        }
        this.w(ax.X7.f.v(c8) << 3 | 5);
        this.a.write(ax.X7.f.p(4).putFloat(f8).array());
        return this;
    }

    /*
     * WARNING - void declaration
     */
    ax.U7.e i(ax.U7.c object, Object object22, boolean bl) throws IOException {
        boolean var3_8;
        block19: {
            byte[] byArray;
            block20: {
                block15: {
                    block18: {
                        block17: {
                            block16: {
                                if (object22 == null) break block15;
                                if (!(object22 instanceof CharSequence)) break block16;
                                CharSequence charSequence = (CharSequence)object22;
                                if (var3_8 == false || charSequence.length() != 0) {
                                    this.w(ax.X7.f.v((ax.U7.c)object) << 3 | 2);
                                    object = charSequence.toString().getBytes(f);
                                    this.w(((Object)object).length);
                                    this.a.write((byte[])object);
                                    return this;
                                }
                                break block15;
                            }
                            if (!(object22 instanceof Collection)) break block17;
                            Iterator iterator = ((Collection)object22).iterator();
                            while (iterator.hasNext()) {
                                this.i((ax.U7.c)object, iterator.next(), false);
                            }
                            break block15;
                        }
                        if (!(object22 instanceof Map)) break block18;
                        for (Map.Entry entry : ((Map)object22).entrySet()) {
                            this.r(i, (ax.U7.c)object, entry, false);
                        }
                        break block15;
                    }
                    if (object22 instanceof Double) {
                        return this.g((ax.U7.c)object, (Double)object22, (boolean)var3_8);
                    }
                    if (object22 instanceof Float) {
                        return this.h((ax.U7.c)object, ((Float)object22).floatValue(), (boolean)var3_8);
                    }
                    if (object22 instanceof Number) {
                        return this.m((ax.U7.c)object, ((Number)object22).longValue(), (boolean)var3_8);
                    }
                    if (object22 instanceof Boolean) {
                        return this.o((ax.U7.c)object, (Boolean)object22, (boolean)var3_8);
                    }
                    if (!(object22 instanceof byte[])) break block19;
                    byArray = (byte[])object22;
                    if (var3_8 == false || byArray.length != 0) break block20;
                }
                return this;
            }
            this.w(ax.X7.f.v((ax.U7.c)object) << 3 | 2);
            this.w(byArray.length);
            this.a.write(byArray);
            return this;
        }
        Object object2 = this.b.get(object22.getClass());
        if (object2 != null) {
            return this.r((ax.U7.d)object2, (ax.U7.c)object, (Object)object22, (boolean)var3_8);
        }
        object2 = this.c.get(object22.getClass());
        if (object2 != null) {
            return this.s((ax.U7.f)object2, (ax.U7.c)object, (Object)object22, (boolean)var3_8);
        }
        if (object22 instanceof c) {
            return this.j((ax.U7.c)object, ((c)object22).g());
        }
        if (object22 instanceof Enum) {
            return this.j((ax.U7.c)object, ((Enum)object22).ordinal());
        }
        return this.r(this.d, (ax.U7.c)object, object22, (boolean)var3_8);
    }

    public f j(ax.U7.c c8, int n8) throws IOException {
        return this.k(c8, n8, true);
    }

    f k(ax.U7.c object, int n8, boolean bl) throws IOException {
        block3: {
            block4: {
                block5: {
                    block2: {
                        if (bl && n8 == 0) break block2;
                        int n9 = ax.X7.f$a.a[(object = ax.X7.f.u((ax.U7.c)object)).intEncoding().ordinal()];
                        if (n9 == 1) break block3;
                        if (n9 == 2) break block4;
                        if (n9 == 3) break block5;
                    }
                    return this;
                }
                this.w(object.tag() << 3 | 5);
                this.a.write(ax.X7.f.p(4).putInt(n8).array());
                return this;
            }
            this.w(object.tag() << 3);
            this.w(n8 << 1 ^ n8 >> 31);
            return this;
        }
        this.w(object.tag() << 3);
        this.w(n8);
        return this;
    }

    public f l(ax.U7.c c8, long l8) throws IOException {
        return this.m(c8, l8, true);
    }

    f m(ax.U7.c object, long l8, boolean bl) throws IOException {
        block3: {
            block4: {
                block5: {
                    block2: {
                        if (bl && l8 == 0L) break block2;
                        int n8 = ax.X7.f$a.a[(object = ax.X7.f.u((ax.U7.c)object)).intEncoding().ordinal()];
                        if (n8 == 1) break block3;
                        if (n8 == 2) break block4;
                        if (n8 == 3) break block5;
                    }
                    return this;
                }
                this.w(object.tag() << 3 | 1);
                this.a.write(ax.X7.f.p(8).putLong(l8).array());
                return this;
            }
            this.w(object.tag() << 3);
            this.x(l8 >> 63 ^ l8 << 1);
            return this;
        }
        this.w(object.tag() << 3);
        this.x(l8);
        return this;
    }

    public f n(ax.U7.c c8, boolean bl) throws IOException {
        return this.o(c8, bl, true);
    }

    f o(ax.U7.c c8, boolean bl, boolean bl2) throws IOException {
        return this.k(c8, bl ? 1 : 0, bl2);
    }

    f t(Object object) throws IOException {
        if (object == null) {
            return this;
        }
        ax.U7.d<?> d8 = this.b.get(object.getClass());
        if (d8 != null) {
            d8.a(object, this);
            return this;
        }
        d8 = new StringBuilder();
        ((StringBuilder)((Object)d8)).append("No encoder for ");
        ((StringBuilder)((Object)d8)).append(object.getClass());
        throw new ax.U7.b(((StringBuilder)((Object)d8)).toString());
    }
}

