package com.jcraft.jsch;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.BaseTSD;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinBase;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.platform.win32.WinUser;
import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class PageantConnector implements AgentConnector {
    private final User32 a;
    private final Kernel32 b;

    public PageantConnector() throws AgentProxyException {
        if (!Util.p("os.name", HttpUrl.FRAGMENT_ENCODE_SET).startsWith("Windows")) {
            throw new AgentProxyException("PageantConnector only available on Windows.");
        }
        try {
            this.a = User32.INSTANCE;
            this.b = Kernel32.INSTANCE;
        } catch (NoClassDefFoundError | UnsatisfiedLinkError e) {
            throw new AgentProxyException(e.toString(), e);
        }
    }

    static WinUser.COPYDATASTRUCT b(String str) {
        Memory memory = new Memory(str.length() + 1);
        memory.setString(0L, str, "US-ASCII");
        WinUser.COPYDATASTRUCT copydatastruct = new WinUser.COPYDATASTRUCT();
        copydatastruct.dwData = new BaseTSD.ULONG_PTR(2152616122L);
        copydatastruct.cbData = (int) memory.size();
        copydatastruct.lpData = memory;
        copydatastruct.write();
        return copydatastruct;
    }

    @Override // com.jcraft.jsch.AgentConnector
    public void a(Buffer buffer) throws AgentProxyException {
        WinNT.HANDLE handle;
        if (buffer.j() > 262144) {
            throw new AgentProxyException("Query too large.");
        }
        WinDef.HWND FindWindow = this.a.FindWindow("Pageant", "Pageant");
        if (FindWindow == null) {
            throw new AgentProxyException("Pageant is not runnning.");
        }
        String format = String.format(Locale.ROOT, "PageantRequest%08x", Integer.valueOf(this.b.GetCurrentThreadId()));
        Pointer pointer = null;
        try {
            handle = this.b.CreateFileMapping(WinBase.INVALID_HANDLE_VALUE, (WinBase.SECURITY_ATTRIBUTES) null, 4, 0, 262144, format);
            if (handle != null) {
                try {
                    if (handle != WinBase.INVALID_HANDLE_VALUE) {
                        Pointer MapViewOfFile = this.b.MapViewOfFile(handle, 2, 0, 0, 0);
                        try {
                            if (MapViewOfFile == null) {
                                throw new AgentProxyException("Unable to create shared file mapping.");
                            }
                            MapViewOfFile.write(0L, buffer.b, 0, buffer.j());
                            WinUser.COPYDATASTRUCT b = b(format);
                            long c = c(FindWindow, b);
                            long longValue = b.dwData.longValue();
                            buffer.B();
                            if (c == 0) {
                                throw new AgentProxyException("User32.SendMessage() returned 0 with cds.dwData: " + Long.toHexString(longValue));
                            }
                            MapViewOfFile.read(0L, buffer.b, 0, 4);
                            int i = buffer.i();
                            if (i <= 0 || i > 262140) {
                                throw new AgentProxyException("Illegal length: " + i);
                            }
                            buffer.B();
                            buffer.a(i);
                            MapViewOfFile.read(4L, buffer.b, 0, i);
                            this.b.UnmapViewOfFile(MapViewOfFile);
                            this.b.CloseHandle(handle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            pointer = MapViewOfFile;
                            if (pointer != null) {
                                this.b.UnmapViewOfFile(pointer);
                            }
                            if (handle != null) {
                                this.b.CloseHandle(handle);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            throw new AgentProxyException("Unable to create shared file mapping.");
        } catch (Throwable th3) {
            th = th3;
            handle = null;
        }
    }

    long c(WinDef.HWND hwnd, WinUser.COPYDATASTRUCT copydatastruct) {
        return this.a.SendMessage(hwnd, 74, (WinDef.WPARAM) null, new WinDef.LPARAM(Pointer.nativeValue(copydatastruct.getPointer()))).longValue();
    }
}
