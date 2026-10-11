/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.AgentConnector;
import com.jcraft.jsch.AgentProxyException;
import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Util;
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

public class PageantConnector
implements AgentConnector {
    private final User32 a;
    private final Kernel32 b;

    /*
     * WARNING - void declaration
     */
    public PageantConnector() throws AgentProxyException {
        if (Util.p("os.name", "").startsWith("Windows")) {
            Throwable var1_3;
            try {
                this.a = User32.INSTANCE;
                this.b = Kernel32.INSTANCE;
                return;
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                // empty catch block
            }
            throw new AgentProxyException(var1_3.toString(), (Throwable)var1_3);
        }
        throw new AgentProxyException("PageantConnector only available on Windows.");
    }

    static WinUser.COPYDATASTRUCT b(String string) {
        Memory memory = new Memory((long)(string.length() + 1));
        memory.setString(0L, string, "US-ASCII");
        string = new WinUser.COPYDATASTRUCT();
        ((WinUser.COPYDATASTRUCT)string).dwData = new BaseTSD.ULONG_PTR(2152616122L);
        ((WinUser.COPYDATASTRUCT)string).cbData = (int)memory.size();
        ((WinUser.COPYDATASTRUCT)string).lpData = memory;
        string.write();
        return string;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(Buffer object) throws AgentProxyException {
        RuntimeException var1_5;
        WinNT.HANDLE hANDLE;
        Object object2;
        block16: {
            block12: {
                block13: {
                    long l8;
                    block14: {
                        int n8;
                        Pointer pointer;
                        block15: {
                            if (((Buffer)object).j() > 262144) {
                                throw new AgentProxyException("Query too large.");
                            }
                            WinDef.HWND hWND = this.a.FindWindow("Pageant", "Pageant");
                            if (hWND == null) {
                                throw new AgentProxyException("Pageant is not runnning.");
                            }
                            String string = String.format(Locale.ROOT, "PageantRequest%08x", this.b.GetCurrentThreadId());
                            object2 = null;
                            hANDLE = this.b.CreateFileMapping(WinBase.INVALID_HANDLE_VALUE, null, 4, 0, 262144, string);
                            if (hANDLE == null) break block12;
                            try {
                                if (hANDLE == WinBase.INVALID_HANDLE_VALUE) break block12;
                                pointer = this.b.MapViewOfFile(hANDLE, 2, 0, 0, 0);
                                if (pointer == null) break block13;
                            }
                            catch (Throwable throwable) {}
                            pointer.write(0L, ((Buffer)object).b, 0, ((Buffer)object).j());
                            object2 = PageantConnector.b(string);
                            long l9 = this.c(hWND, (WinUser.COPYDATASTRUCT)object2);
                            l8 = ((WinUser.COPYDATASTRUCT)object2).dwData.longValue();
                            ((Buffer)object).B();
                            if (l9 == 0L) break block14;
                            pointer.read(0L, ((Buffer)object).b, 0, 4);
                            n8 = ((Buffer)object).i();
                            if (n8 <= 0 || n8 > 262140) break block15;
                            ((Buffer)object).B();
                            ((Buffer)object).a(n8);
                            pointer.read(4L, ((Buffer)object).b, 0, n8);
                            this.b.UnmapViewOfFile(pointer);
                            this.b.CloseHandle(hANDLE);
                            return;
                        }
                        try {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("Illegal length: ");
                            ((StringBuilder)object2).append(n8);
                            object = new AgentProxyException(((StringBuilder)object2).toString());
                            throw object;
                        }
                        catch (Throwable throwable) {
                            object2 = pointer;
                        }
                        break block16;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("User32.SendMessage() returned 0 with cds.dwData: ");
                    ((StringBuilder)object).append(Long.toHexString(l8));
                    object2 = new AgentProxyException(((StringBuilder)object).toString());
                    throw object2;
                }
                object = new AgentProxyException("Unable to create shared file mapping.");
                throw object;
            }
            object = new AgentProxyException("Unable to create shared file mapping.");
            throw object;
            break block16;
            catch (Throwable throwable) {
                hANDLE = null;
            }
        }
        if (object2 != null) {
            this.b.UnmapViewOfFile(object2);
        }
        if (hANDLE != null) {
            this.b.CloseHandle(hANDLE);
        }
        throw var1_5;
    }

    long c(WinDef.HWND hWND, WinUser.COPYDATASTRUCT cOPYDATASTRUCT) {
        cOPYDATASTRUCT = new WinDef.LPARAM(Pointer.nativeValue((Pointer)cOPYDATASTRUCT.getPointer()));
        return this.a.SendMessage(hWND, 74, null, (WinDef.LPARAM)cOPYDATASTRUCT).longValue();
    }
}

