package ax.b6;

/* loaded from: classes3.dex */
final class M5 extends N5 {
    M5() {
    }

    @Override // ax.b6.N5
    final int a(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i2 += 2;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i4 >= i3 - 2) {
                        return L5.c(bArr, i4, i3);
                    }
                    int i5 = i2 + 2;
                    byte b2 = bArr[i4];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        int i6 = i2 + 3;
                        if (bArr[i5] <= -65) {
                            i2 += 4;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i4 >= i3 - 1) {
                    return L5.c(bArr, i4, i3);
                }
                int i7 = i2 + 2;
                byte b3 = bArr[i4];
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    i2 += 3;
                    if (bArr[i7] > -65) {
                    }
                }
                return -1;
            }
            i2 = i4;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // ax.b6.N5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int b(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.M5.b(java.lang.String, byte[], int, int):int");
    }

    @Override // ax.b6.N5
    final String c(byte[] bArr, int i, int i2) throws C1663s4 {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            K5.d(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                int i7 = i5 + 1;
                K5.d(b2, cArr, i5);
                while (i6 < i3) {
                    byte b3 = bArr[i6];
                    if (b3 < 0) {
                        break;
                    }
                    i6++;
                    K5.d(b3, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i = i6;
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw C1663s4.c();
                }
                i += 2;
                K5.c(b2, bArr[i6], cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw C1663s4.c();
                }
                int i8 = i + 2;
                i += 3;
                K5.b(b2, bArr[i6], bArr[i8], cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw C1663s4.c();
                }
                byte b4 = bArr[i6];
                int i9 = i + 3;
                byte b5 = bArr[i + 2];
                i += 4;
                K5.a(b2, b4, b5, bArr[i9], cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }
}
