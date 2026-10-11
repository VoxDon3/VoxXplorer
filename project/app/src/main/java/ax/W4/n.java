/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import ax.W4.e;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public final class n
extends Writer
implements AutoCloseable {
    private OutputStream c0;
    private byte[] d0;
    private final int e0;
    private int f0;
    private int g0;
    private final e q;

    public n(e object, OutputStream outputStream) {
        this.q = object;
        this.c0 = outputStream;
        object = ((e)object).h();
        this.d0 = (byte[])object;
        this.e0 = ((Object)object).length - 4;
        this.f0 = 0;
    }

    protected static void b(int n8) throws IOException {
        throw new IOException(n.c(n8));
    }

    protected static String c(int n8) {
        if (n8 > 0x10FFFF) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal character point (0x");
            stringBuilder.append(Integer.toHexString(n8));
            stringBuilder.append(") to output; max is 0x10FFFF as per RFC 4627");
            return stringBuilder.toString();
        }
        if (n8 >= 55296) {
            if (n8 <= 56319) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unmatched first part of surrogate pair (0x");
                stringBuilder.append(Integer.toHexString(n8));
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unmatched second part of surrogate pair (0x");
            stringBuilder.append(Integer.toHexString(n8));
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal character point (0x");
        stringBuilder.append(Integer.toHexString(n8));
        stringBuilder.append(") to output");
        return stringBuilder.toString();
    }

    protected int a(int n8) throws IOException {
        int n9 = this.g0;
        this.g0 = 0;
        if (n8 >= 56320 && n8 <= 57343) {
            return (n9 - 55296 << 10) + 65536 + (n8 - 56320);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Broken surrogate pair: first char 0x");
        stringBuilder.append(Integer.toHexString(n9));
        stringBuilder.append(", second 0x");
        stringBuilder.append(Integer.toHexString(n8));
        stringBuilder.append("; illegal combination");
        throw new IOException(stringBuilder.toString());
    }

    @Override
    public Writer append(char c8) throws IOException {
        this.write(c8);
        return this;
    }

    @Override
    public void close() throws IOException {
        OutputStream outputStream = this.c0;
        if (outputStream != null) {
            int n8 = this.f0;
            if (n8 > 0) {
                outputStream.write(this.d0, 0, n8);
                this.f0 = 0;
            }
            outputStream = this.c0;
            this.c0 = null;
            byte[] byArray = this.d0;
            if (byArray != null) {
                this.d0 = null;
                this.q.q(byArray);
            }
            outputStream.close();
            n8 = this.g0;
            this.g0 = 0;
            if (n8 > 0) {
                n.b(n8);
            }
        }
    }

    @Override
    public void flush() throws IOException {
        OutputStream outputStream = this.c0;
        if (outputStream != null) {
            int n8 = this.f0;
            if (n8 > 0) {
                outputStream.write(this.d0, 0, n8);
                this.f0 = 0;
            }
            this.c0.flush();
        }
    }

    @Override
    public void write(int n8) throws IOException {
        int n9;
        if (this.g0 > 0) {
            n9 = this.a(n8);
        } else {
            n9 = n8;
            if (n8 >= 55296) {
                n9 = n8;
                if (n8 <= 57343) {
                    if (n8 > 56319) {
                        n.b(n8);
                    }
                    this.g0 = n8;
                    return;
                }
            }
        }
        n8 = this.f0;
        if (n8 >= this.e0) {
            this.c0.write(this.d0, 0, n8);
            this.f0 = 0;
        }
        if (n9 < 128) {
            byte[] byArray = this.d0;
            n8 = this.f0;
            this.f0 = n8 + 1;
            byArray[n8] = (byte)n9;
            return;
        }
        int n10 = this.f0;
        if (n9 < 2048) {
            byte[] byArray = this.d0;
            byArray[n10] = (byte)(n9 >> 6 | 0xC0);
            n8 = n10 + 2;
            byArray[n10 + 1] = (byte)(n9 & 0x3F | 0x80);
        } else if (n9 <= 65535) {
            byte[] byArray = this.d0;
            byArray[n10] = (byte)(n9 >> 12 | 0xE0);
            byArray[n10 + 1] = (byte)(n9 >> 6 & 0x3F | 0x80);
            n8 = n10 + 3;
            byArray[n10 + 2] = (byte)(n9 & 0x3F | 0x80);
        } else {
            if (n9 > 0x10FFFF) {
                n.b(n9);
            }
            byte[] byArray = this.d0;
            byArray[n10] = (byte)(n9 >> 18 | 0xF0);
            byArray[n10 + 1] = (byte)(n9 >> 12 & 0x3F | 0x80);
            byArray[n10 + 2] = (byte)(n9 >> 6 & 0x3F | 0x80);
            n8 = n10 + 4;
            byArray[n10 + 3] = (byte)(n9 & 0x3F | 0x80);
        }
        this.f0 = n8;
    }

    @Override
    public void write(String string) throws IOException {
        this.write(string, 0, string.length());
    }

    @Override
    public void write(String string, int n8, int n9) throws IOException {
        if (n9 < 2) {
            if (n9 == 1) {
                this.write(string.charAt(n8));
            }
            return;
        }
        int n10 = n8;
        int n11 = n9;
        if (this.g0 > 0) {
            n10 = string.charAt(n8);
            n11 = n9 - 1;
            this.write(this.a(n10));
            n10 = n8 + 1;
        }
        n8 = this.f0;
        byte[] byArray = this.d0;
        int n12 = this.e0;
        int n13 = n11 + n10;
        n9 = n10;
        block0: while (true) {
            n10 = n8;
            if (n9 >= n13) break;
            n10 = n8;
            if (n8 >= n12) {
                this.c0.write(byArray, 0, n8);
                n10 = 0;
            }
            n11 = n9 + 1;
            int n14 = string.charAt(n9);
            n8 = n10;
            n9 = n11;
            int n15 = n14;
            if (n14 < 128) {
                n8 = n10 + 1;
                byArray[n10] = (byte)n14;
                n9 = n13 - n11;
                n15 = n12 - n8;
                n10 = n9;
                if (n9 > n15) {
                    n10 = n15;
                }
                n9 = n11;
                while (true) {
                    if ((n15 = n9) >= n10 + n11) {
                        n9 = n15;
                        continue block0;
                    }
                    n9 = n15 + 1;
                    if ((n15 = (int)string.charAt(n15)) >= 128) break;
                    n14 = n8 + 1;
                    byArray[n8] = (byte)n15;
                    n8 = n14;
                }
            }
            if (n15 < 2048) {
                byArray[n8] = (byte)(n15 >> 6 | 0xC0);
                n10 = n8 + 2;
                byArray[n8 + 1] = (byte)(n15 & 0x3F | 0x80);
                n8 = n10;
                continue;
            }
            if (n15 >= 55296 && n15 <= 57343) {
                if (n15 > 56319) {
                    this.f0 = n8;
                    n.b(n15);
                }
                this.g0 = n15;
                if (n9 >= n13) {
                    n10 = n8;
                    break;
                }
                n10 = n9 + 1;
                n11 = this.a(string.charAt(n9));
                if (n11 > 0x10FFFF) {
                    this.f0 = n8;
                    n.b(n11);
                }
                byArray[n8] = (byte)(n11 >> 18 | 0xF0);
                byArray[n8 + 1] = (byte)(n11 >> 12 & 0x3F | 0x80);
                byArray[n8 + 2] = (byte)(n11 >> 6 & 0x3F | 0x80);
                n9 = n8 + 4;
                byArray[n8 + 3] = (byte)(n11 & 0x3F | 0x80);
                n8 = n9;
                n9 = n10;
                continue;
            }
            byArray[n8] = (byte)(n15 >> 12 | 0xE0);
            byArray[n8 + 1] = (byte)(n15 >> 6 & 0x3F | 0x80);
            n10 = n8 + 3;
            byArray[n8 + 2] = (byte)(n15 & 0x3F | 0x80);
            n8 = n10;
        }
        this.f0 = n10;
    }

    @Override
    public void write(char[] cArray) throws IOException {
        this.write(cArray, 0, cArray.length);
    }

    @Override
    public void write(char[] cArray, int n8, int n9) throws IOException {
        if (n9 < 2) {
            if (n9 == 1) {
                this.write(cArray[n8]);
            }
            return;
        }
        int n10 = n8;
        int n11 = n9;
        if (this.g0 > 0) {
            n10 = cArray[n8];
            n11 = n9 - 1;
            this.write(this.a(n10));
            n10 = n8 + 1;
        }
        n8 = this.f0;
        byte[] byArray = this.d0;
        int n12 = this.e0;
        int n13 = n11 + n10;
        n9 = n10;
        block0: while (true) {
            n10 = n8;
            if (n9 >= n13) break;
            n10 = n8;
            if (n8 >= n12) {
                this.c0.write(byArray, 0, n8);
                n10 = 0;
            }
            n11 = n9 + 1;
            int n14 = cArray[n9];
            n8 = n10;
            n9 = n11;
            int n15 = n14;
            if (n14 < 128) {
                n8 = n10 + 1;
                byArray[n10] = (byte)n14;
                n15 = n13 - n11;
                n9 = n12 - n8;
                n10 = n15;
                if (n15 > n9) {
                    n10 = n9;
                }
                n9 = n11;
                while (true) {
                    if ((n15 = n9) >= n10 + n11) {
                        n9 = n15;
                        continue block0;
                    }
                    n9 = n15 + 1;
                    if ((n15 = cArray[n15]) >= 128) break;
                    n14 = n8 + 1;
                    byArray[n8] = (byte)n15;
                    n8 = n14;
                }
            }
            if (n15 < 2048) {
                byArray[n8] = (byte)(n15 >> 6 | 0xC0);
                n10 = n8 + 2;
                byArray[n8 + 1] = (byte)(n15 & 0x3F | 0x80);
                n8 = n10;
                continue;
            }
            if (n15 >= 55296 && n15 <= 57343) {
                if (n15 > 56319) {
                    this.f0 = n8;
                    n.b(n15);
                }
                this.g0 = n15;
                if (n9 >= n13) {
                    n10 = n8;
                    break;
                }
                n10 = n9 + 1;
                n11 = this.a(cArray[n9]);
                if (n11 > 0x10FFFF) {
                    this.f0 = n8;
                    n.b(n11);
                }
                byArray[n8] = (byte)(n11 >> 18 | 0xF0);
                byArray[n8 + 1] = (byte)(n11 >> 12 & 0x3F | 0x80);
                byArray[n8 + 2] = (byte)(n11 >> 6 & 0x3F | 0x80);
                n9 = n8 + 4;
                byArray[n8 + 3] = (byte)(n11 & 0x3F | 0x80);
                n8 = n9;
                n9 = n10;
                continue;
            }
            byArray[n8] = (byte)(n15 >> 12 | 0xE0);
            byArray[n8 + 1] = (byte)(n15 >> 6 & 0x3F | 0x80);
            n10 = n8 + 3;
            byArray[n8 + 2] = (byte)(n15 & 0x3F | 0x80);
            n8 = n10;
        }
        this.f0 = n10;
    }
}

