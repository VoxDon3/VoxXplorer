package ax.Q2;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.BadParcelableException;
import ax.b3.C;
import ax.b3.C1495j;
import ax.b3.G;
import ax.h5.InterfaceC2152b;
import ax.h5.InterfaceC2155e;
import ax.j5.C2313a;
import ax.j5.C2316d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class o {
    private static o f;
    com.github.mjdev.libaums.c a;
    InterfaceC2152b b;
    long c;
    long d;
    boolean e;

    public static o i() {
        if (f == null) {
            f = new o();
        }
        return f;
    }

    public boolean a(Context context) {
        com.github.mjdev.libaums.c cVar = this.a;
        if (cVar == null) {
            return false;
        }
        UsbDevice d = cVar.d();
        UsbManager usbManager = (UsbManager) context.getSystemService("usb");
        new ArrayList();
        Iterator<UsbDevice> it = usbManager.getDeviceList().values().iterator();
        while (it.hasNext()) {
            if (it.next().getDeviceId() == d.getDeviceId()) {
                return true;
            }
        }
        return false;
    }

    public void b(Context context) {
        this.e = a(context);
    }

    public void c() {
        this.c = 0L;
        this.d = 0L;
    }

    public void d() {
        if (this.a != null) {
            this.c = h();
            this.d = j();
            this.a.a();
            this.a = null;
            this.b = null;
            this.e = false;
        }
    }

    public boolean e(Context context) throws C1495j {
        if (this.a != null) {
            d();
        }
        com.github.mjdev.libaums.c[] b = com.github.mjdev.libaums.c.b(context);
        if (b == null || b.length <= 0) {
            this.a = null;
        } else {
            com.github.mjdev.libaums.c cVar = b[0];
            if (l(context, cVar.d())) {
                try {
                    cVar.f();
                    this.a = cVar;
                    List<C2313a> c = cVar.c();
                    if (c != null && !c.isEmpty()) {
                        C2313a c2313a = c.get(0);
                        if (c2313a != null) {
                            this.b = c2313a.b();
                        }
                    } else if (this.a.e()) {
                        throw new G(7);
                    }
                } catch (C2316d.b e) {
                    e = e;
                    e.printStackTrace();
                    throw new C(e);
                } catch (com.github.mjdev.libaums.b e2) {
                    e = e2;
                    e.printStackTrace();
                    throw new C(e);
                } catch (IOException e3) {
                    e3.printStackTrace();
                    if (a(context)) {
                        ax.Ha.c.h().f().d("!!UsbStorage Init 3!!").l(e3).h();
                    }
                } catch (IllegalArgumentException e4) {
                    e = e4;
                    ax.Ha.c.h().f().d("!!UsbStorage Init!!").l(e).h();
                } catch (IllegalStateException e5) {
                    e = e5;
                    ax.Ha.c.h().f().d("!!UsbStorage Init!!").l(e).h();
                } catch (NegativeArraySizeException e6) {
                    e = e6;
                    ax.Ha.c.h().f().d("!!UsbStorage Init!!").l(e).h();
                } catch (NullPointerException e7) {
                    e = e7;
                    ax.Ha.c.h().f().d("!!UsbStorage Init!!").l(e).h();
                }
            } else {
                this.a = null;
            }
        }
        boolean z = this.a != null;
        this.e = z;
        return z;
    }

    public UsbDevice f(Context context) {
        HashMap<String, UsbDevice> hashMap;
        try {
            try {
                hashMap = ((UsbManager) context.getSystemService("usb")).getDeviceList();
            } catch (BadParcelableException unused) {
                hashMap = null;
            }
        } catch (NullPointerException | NoSuchElementException unused2) {
        }
        if (hashMap == null) {
            return null;
        }
        for (UsbDevice usbDevice : hashMap.values()) {
            int interfaceCount = usbDevice.getInterfaceCount();
            for (int i = 0; i < interfaceCount; i++) {
                UsbInterface usbInterface = usbDevice.getInterface(i);
                if (usbInterface.getInterfaceClass() == 8 && usbInterface.getInterfaceSubclass() == 6 && usbInterface.getInterfaceProtocol() == 80) {
                    int endpointCount = usbInterface.getEndpointCount();
                    UsbEndpoint usbEndpoint = null;
                    UsbEndpoint usbEndpoint2 = null;
                    for (int i2 = 0; i2 < endpointCount; i2++) {
                        UsbEndpoint endpoint = usbInterface.getEndpoint(i2);
                        if (endpoint.getType() == 2) {
                            if (endpoint.getDirection() == 0) {
                                usbEndpoint = endpoint;
                            } else {
                                usbEndpoint2 = endpoint;
                            }
                        }
                    }
                    if (usbEndpoint != null && usbEndpoint2 != null) {
                        return usbDevice;
                    }
                }
            }
        }
        return null;
    }

    public boolean g() {
        d();
        return true;
    }

    public long h() {
        InterfaceC2152b interfaceC2152b = this.b;
        return interfaceC2152b != null ? interfaceC2152b.b() : this.c;
    }

    public long j() {
        InterfaceC2152b interfaceC2152b = this.b;
        return interfaceC2152b != null ? interfaceC2152b.c() : this.d;
    }

    public InterfaceC2155e k() {
        InterfaceC2152b interfaceC2152b = this.b;
        if (interfaceC2152b == null) {
            return null;
        }
        return interfaceC2152b.d();
    }

    public boolean l(Context context, UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        return ((UsbManager) context.getSystemService("usb")).hasPermission(usbDevice);
    }

    public boolean m() {
        return this.a != null && this.e;
    }

    public void n() {
        com.github.mjdev.libaums.c cVar = this.a;
        if (cVar == null) {
            return;
        }
        cVar.h();
    }
}
