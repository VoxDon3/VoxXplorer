/*
 * Decompiled with CFR 0.152.
 */
package ax.Q2;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.BadParcelableException;
import ax.b3.C;
import ax.b3.G;
import ax.b3.j;
import ax.h5.b;
import ax.h5.e;
import ax.j5.a;
import ax.j5.d;
import com.github.mjdev.libaums.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class o {
    private static o f;
    c a;
    b b;
    long c;
    long d;
    boolean e;

    public static o i() {
        if (f == null) {
            f = new o();
        }
        return f;
    }

    public boolean a(Context object) {
        c c8 = this.a;
        if (c8 == null) {
            return false;
        }
        c8 = c8.d();
        object = (UsbManager)object.getSystemService("usb");
        new ArrayList();
        object = object.getDeviceList().values().iterator();
        while (object.hasNext()) {
            if (((UsbDevice)object.next()).getDeviceId() != c8.getDeviceId()) continue;
            return true;
        }
        return false;
    }

    public void b(Context context) {
        this.e = this.a(context);
    }

    public void c() {
        this.c = 0L;
        this.d = 0L;
    }

    public void d() {
        if (this.a != null) {
            this.c = this.h();
            this.d = this.j();
            this.a.a();
            this.a = null;
            this.b = null;
            this.e = false;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean e(Context context) throws j {
        boolean bl;
        block16: {
            block20: {
                Throwable var1_9;
                block19: {
                    IOException iOException2;
                    block18: {
                        Throwable var1_8;
                        block17: {
                            if (this.a != null) {
                                this.d();
                            }
                            Object object = com.github.mjdev.libaums.c.b(context);
                            bl = false;
                            if (object == null || ((c[])object).length <= 0) break block20;
                            if (!this.l(context, ((c)(object = object[0])).d())) {
                                this.a = null;
                                break block16;
                            } else {
                                block15: {
                                    try {
                                        ((c)object).f();
                                        this.a = object;
                                        object = ((c)object).c();
                                        if (object == null || object.isEmpty()) break block15;
                                        if ((object = (a)object.get(0)) != null) {
                                            this.b = ((a)object).b();
                                        }
                                        break block16;
                                    }
                                    catch (NegativeArraySizeException negativeArraySizeException) {
                                        break block17;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        break block17;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        break block17;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        break block17;
                                    }
                                    catch (IOException iOException2) {
                                        break block18;
                                    }
                                    catch (d.b b8) {
                                        break block19;
                                    }
                                    catch (com.github.mjdev.libaums.b b9) {
                                        break block19;
                                    }
                                }
                                if (this.a.e()) {
                                    object = new G(7);
                                    throw object;
                                }
                            }
                            break block16;
                        }
                        ax.Ha.c.h().f().d("!!UsbStorage Init!!").l((Throwable)var1_8).h();
                        break block16;
                    }
                    iOException2.printStackTrace();
                    if (this.a(context)) {
                        ax.Ha.c.h().f().d("!!UsbStorage Init 3!!").l(iOException2).h();
                    }
                    break block16;
                }
                var1_9.printStackTrace();
                throw new C((Throwable)var1_9);
            }
            this.a = null;
        }
        if (this.a != null) {
            bl = true;
        }
        this.e = bl;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public UsbDevice f(Context object) {
        try {
            object = (UsbManager)object.getSystemService("usb");
            try {
                object = object.getDeviceList();
            }
            catch (BadParcelableException badParcelableException) {
                return null;
            }
            if (object == null) {
                return null;
            }
            Iterator iterator = ((HashMap)object).values().iterator();
            block4: while (true) {
                if (!iterator.hasNext()) return null;
                UsbDevice usbDevice = (UsbDevice)iterator.next();
                int n8 = usbDevice.getInterfaceCount();
                int n9 = 0;
                while (true) {
                    if (n9 >= n8) continue block4;
                    UsbInterface usbInterface = usbDevice.getInterface(n9);
                    if (usbInterface.getInterfaceClass() == 8 && usbInterface.getInterfaceSubclass() == 6 && usbInterface.getInterfaceProtocol() == 80) {
                        int n10 = usbInterface.getEndpointCount();
                        UsbEndpoint usbEndpoint = null;
                        object = null;
                        for (int i8 = 0; i8 < n10; ++i8) {
                            UsbEndpoint usbEndpoint2 = usbInterface.getEndpoint(i8);
                            UsbEndpoint usbEndpoint3 = usbEndpoint;
                            Object object2 = object;
                            if (usbEndpoint2.getType() == 2) {
                                int n11 = usbEndpoint2.getDirection();
                                if (n11 == 0) {
                                    usbEndpoint3 = usbEndpoint2;
                                    object2 = object;
                                } else {
                                    object2 = usbEndpoint2;
                                    usbEndpoint3 = usbEndpoint;
                                }
                            }
                            usbEndpoint = usbEndpoint3;
                            object = object2;
                        }
                        if (usbEndpoint != null && object != null) {
                            return usbDevice;
                        }
                    }
                    ++n9;
                }
                break;
            }
        }
        catch (NullPointerException | NoSuchElementException runtimeException) {
            return null;
        }
    }

    public boolean g() {
        this.d();
        return true;
    }

    public long h() {
        b b8 = this.b;
        if (b8 != null) {
            return b8.b();
        }
        return this.c;
    }

    public long j() {
        b b8 = this.b;
        if (b8 != null) {
            return b8.c();
        }
        return this.d;
    }

    public e k() {
        b b8 = this.b;
        if (b8 == null) {
            return null;
        }
        return b8.d();
    }

    public boolean l(Context context, UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        return ((UsbManager)context.getSystemService("usb")).hasPermission(usbDevice);
    }

    public boolean m() {
        return this.a != null && this.e;
    }

    public void n() {
        c c8 = this.a;
        if (c8 == null) {
            return;
        }
        c8.h();
    }
}

