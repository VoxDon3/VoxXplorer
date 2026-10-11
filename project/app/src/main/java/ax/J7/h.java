/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.os.Process;
import ax.J7.C;
import ax.J7.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class h {
    private static final AtomicLong a = new AtomicLong(0L);
    private static String b;

    h(C object) {
        Object object2 = new byte[10];
        this.e((byte[])object2);
        this.d((byte[])object2);
        this.c((byte[])object2);
        object = i.z(((C)object).a().c());
        String string = i.t(object2);
        object2 = Locale.US;
        b = String.format((Locale)object2, "%s%s%s%s", string.substring(0, 12), string.substring(12, 16), string.subSequence(16, 20), ((String)object).substring(0, 12)).toUpperCase((Locale)object2);
    }

    private static byte[] a(long l8) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt((int)l8);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        byteBuffer.position(0);
        return byteBuffer.array();
    }

    private static byte[] b(long l8) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        byteBuffer.putShort((short)l8);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        byteBuffer.position(0);
        return byteBuffer.array();
    }

    private void c(byte[] byArray) {
        byte[] byArray2 = h.b(Integer.valueOf(Process.myPid()).shortValue());
        byArray[8] = byArray2[0];
        byArray[9] = byArray2[1];
    }

    private void d(byte[] byArray) {
        byte[] byArray2 = h.b(a.incrementAndGet());
        byArray[6] = byArray2[0];
        byArray[7] = byArray2[1];
    }

    private void e(byte[] byArray) {
        long l8 = new Date().getTime();
        byte[] byArray2 = h.a(l8 / 1000L);
        byArray[0] = byArray2[0];
        byArray[1] = byArray2[1];
        byArray[2] = byArray2[2];
        byArray[3] = byArray2[3];
        byArray2 = h.b(l8 % 1000L);
        byArray[4] = byArray2[0];
        byArray[5] = byArray2[1];
    }

    public String toString() {
        return b;
    }
}

