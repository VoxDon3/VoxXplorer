.class public final Lax/X1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/X1/L$c;


# instance fields
.field private final a:I

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/P0/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .registers 3

    .line 1
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lax/X1/j;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lax/P0/v;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lax/X1/j;->a:I

    .line 4
    iput-object p2, p0, Lax/X1/j;->b:Ljava/util/List;

    return-void
.end method

.method private c(Lax/X1/L$b;)Lax/X1/G;
    .registers 4

    .line 1
    new-instance v0, Lax/X1/G;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/X1/j;->e(Lax/X1/L$b;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v1, "video/mp2t"

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lax/X1/G;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private d(Lax/X1/L$b;)Lax/X1/O;
    .registers 4

    .line 1
    new-instance v0, Lax/X1/O;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/X1/j;->e(Lax/X1/L$b;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v1, "video/mp2t"

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lax/X1/O;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private e(Lax/X1/L$b;)Ljava/util/List;
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/X1/L$b;",
            ")",
            "Ljava/util/List<",
            "Lax/P0/v;",
            ">;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/X1/j;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_b

    .line 8
    .line 9
    iget-object p1, p0, Lax/X1/j;->b:Ljava/util/List;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_b
    new-instance v0, Lax/S0/G;

    .line 13
    .line 14
    iget-object p1, p1, Lax/X1/L$b;->e:[B

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lax/S0/G;-><init>([B)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lax/X1/j;->b:Ljava/util/List;

    .line 20
    .line 21
    :goto_14
    invoke-virtual {v0}, Lax/S0/G;->a()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lez v1, :cond_8e

    .line 26
    .line 27
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v0}, Lax/S0/G;->g()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    add-int/2addr v3, v2

    .line 40
    const/16 v2, 0x86

    .line 41
    .line 42
    if-ne v1, v2, :cond_8a

    .line 43
    .line 44
    new-instance p1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    and-int/lit8 v1, v1, 0x1f

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    :goto_38
    if-ge v4, v1, :cond_8a

    .line 58
    .line 59
    const/4 v5, 0x3

    .line 60
    invoke-virtual {v0, v5}, Lax/S0/G;->J(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    and-int/lit16 v7, v6, 0x80

    .line 69
    .line 70
    const/4 v8, 0x1

    .line 71
    if-eqz v7, :cond_4a

    .line 72
    .line 73
    const/4 v7, 0x1

    .line 74
    goto :goto_4b

    .line 75
    :cond_4a
    const/4 v7, 0x0

    .line 76
    :goto_4b
    if-eqz v7, :cond_52

    .line 77
    .line 78
    and-int/lit8 v6, v6, 0x3f

    .line 79
    .line 80
    const-string v9, "application/cea-708"

    .line 81
    .line 82
    goto :goto_55

    .line 83
    :cond_52
    const-string v9, "application/cea-608"

    .line 84
    .line 85
    const/4 v6, 0x1

    .line 86
    :goto_55
    invoke-virtual {v0}, Lax/S0/G;->M()I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    int-to-byte v10, v10

    .line 91
    invoke-virtual {v0, v8}, Lax/S0/G;->c0(I)V

    .line 92
    .line 93
    .line 94
    if-eqz v7, :cond_6a

    .line 95
    .line 96
    and-int/lit8 v7, v10, 0x40

    .line 97
    .line 98
    if-eqz v7, :cond_64

    .line 99
    .line 100
    goto :goto_65

    .line 101
    :cond_64
    const/4 v8, 0x0

    .line 102
    :goto_65
    invoke-static {v8}, Lax/S0/i;->g(Z)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    goto :goto_6b

    .line 107
    :cond_6a
    const/4 v7, 0x0

    .line 108
    :goto_6b
    new-instance v8, Lax/P0/v$b;

    .line 109
    .line 110
    invoke-direct {v8}, Lax/P0/v$b;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8, v9}, Lax/P0/v$b;->y0(Ljava/lang/String;)Lax/P0/v$b;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-virtual {v8, v5}, Lax/P0/v$b;->n0(Ljava/lang/String;)Lax/P0/v$b;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v5, v6}, Lax/P0/v$b;->Q(I)Lax/P0/v$b;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5, v7}, Lax/P0/v$b;->k0(Ljava/util/List;)Lax/P0/v$b;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v5}, Lax/P0/v$b;->P()Lax/P0/v;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    add-int/lit8 v4, v4, 0x1

    .line 137
    .line 138
    goto :goto_38

    .line 139
    :cond_8a
    invoke-virtual {v0, v3}, Lax/S0/G;->b0(I)V

    .line 140
    .line 141
    .line 142
    goto :goto_14

    .line 143
    :cond_8e
    return-object p1
.end method

.method private f(I)Z
    .registers 3

    .line 1
    iget v0, p0, Lax/X1/j;->a:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    if-eqz p1, :cond_7

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1

    .line 8
    :cond_7
    const/4 p1, 0x0

    .line 9
    return p1
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public a()Landroid/util/SparseArray;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Lax/X1/L;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b(ILax/X1/L$b;)Lax/X1/L;
    .registers 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const-string v1, "video/mp2t"

    .line 3
    .line 4
    if-eq p1, v0, :cond_152

    .line 5
    .line 6
    const/4 v2, 0x3

    .line 7
    if-eq p1, v2, :cond_141

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    if-eq p1, v2, :cond_141

    .line 11
    .line 12
    const/16 v3, 0x15

    .line 13
    .line 14
    if-eq p1, v3, :cond_136

    .line 15
    .line 16
    const/16 v3, 0x1b

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-eq p1, v3, :cond_115

    .line 20
    .line 21
    const/16 v2, 0x24

    .line 22
    .line 23
    if-eq p1, v2, :cond_106

    .line 24
    .line 25
    const/16 v2, 0x2d

    .line 26
    .line 27
    if-eq p1, v2, :cond_fb

    .line 28
    .line 29
    const/16 v2, 0x59

    .line 30
    .line 31
    if-eq p1, v2, :cond_ee

    .line 32
    .line 33
    const/16 v2, 0xac

    .line 34
    .line 35
    if-eq p1, v2, :cond_dd

    .line 36
    .line 37
    const/16 v2, 0x101

    .line 38
    .line 39
    if-eq p1, v2, :cond_d0

    .line 40
    .line 41
    const/16 v2, 0x8a

    .line 42
    .line 43
    if-eq p1, v2, :cond_bd

    .line 44
    .line 45
    const/16 v2, 0x8b

    .line 46
    .line 47
    if-eq p1, v2, :cond_aa

    .line 48
    .line 49
    packed-switch p1, :pswitch_data_162

    .line 50
    .line 51
    .line 52
    packed-switch p1, :pswitch_data_16c

    .line 53
    .line 54
    .line 55
    packed-switch p1, :pswitch_data_176

    .line 56
    .line 57
    .line 58
    return-object v4

    .line 59
    :pswitch_3a
    const/16 p1, 0x10

    .line 60
    .line 61
    invoke-direct {p0, p1}, Lax/X1/j;->f(I)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_43

    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_43
    new-instance p1, Lax/X1/E;

    .line 69
    .line 70
    new-instance p2, Lax/X1/x;

    .line 71
    .line 72
    const-string v0, "application/x-scte35"

    .line 73
    .line 74
    invoke-direct {p2, v0, v1}, Lax/X1/x;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p1, p2}, Lax/X1/E;-><init>(Lax/X1/D;)V

    .line 78
    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_50
    const/16 p1, 0x40

    .line 82
    .line 83
    invoke-direct {p0, p1}, Lax/X1/j;->f(I)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_bd

    .line 88
    .line 89
    return-object v4

    .line 90
    :pswitch_59
    new-instance p1, Lax/X1/y;

    .line 91
    .line 92
    new-instance v0, Lax/X1/c;

    .line 93
    .line 94
    iget-object v2, p2, Lax/X1/L$b;->b:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p2}, Lax/X1/L$b;->a()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-direct {v0, v2, p2, v1}, Lax/X1/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 104
    .line 105
    .line 106
    return-object p1

    .line 107
    :pswitch_6a
    invoke-direct {p0, v0}, Lax/X1/j;->f(I)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_71

    .line 112
    .line 113
    return-object v4

    .line 114
    :cond_71
    new-instance p1, Lax/X1/y;

    .line 115
    .line 116
    new-instance v0, Lax/X1/s;

    .line 117
    .line 118
    iget-object v2, p2, Lax/X1/L$b;->b:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {p2}, Lax/X1/L$b;->a()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-direct {v0, v2, p2, v1}, Lax/X1/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 128
    .line 129
    .line 130
    return-object p1

    .line 131
    :pswitch_82
    new-instance p1, Lax/X1/y;

    .line 132
    .line 133
    new-instance v0, Lax/X1/o;

    .line 134
    .line 135
    invoke-direct {p0, p2}, Lax/X1/j;->d(Lax/X1/L$b;)Lax/X1/O;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-direct {v0, p2, v1}, Lax/X1/o;-><init>(Lax/X1/O;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 143
    .line 144
    .line 145
    return-object p1

    .line 146
    :pswitch_91
    invoke-direct {p0, v0}, Lax/X1/j;->f(I)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_98

    .line 151
    .line 152
    return-object v4

    .line 153
    :cond_98
    new-instance p1, Lax/X1/y;

    .line 154
    .line 155
    new-instance v0, Lax/X1/i;

    .line 156
    .line 157
    iget-object v2, p2, Lax/X1/L$b;->b:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {p2}, Lax/X1/L$b;->a()I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    const/4 v3, 0x0

    .line 164
    invoke-direct {v0, v3, v2, p2, v1}, Lax/X1/i;-><init>(ZLjava/lang/String;ILjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 168
    .line 169
    .line 170
    return-object p1

    .line 171
    :cond_aa
    new-instance p1, Lax/X1/y;

    .line 172
    .line 173
    new-instance v0, Lax/X1/k;

    .line 174
    .line 175
    iget-object v2, p2, Lax/X1/L$b;->b:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {p2}, Lax/X1/L$b;->a()I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    const/16 v3, 0x1520

    .line 182
    .line 183
    invoke-direct {v0, v2, p2, v3, v1}, Lax/X1/k;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 187
    .line 188
    .line 189
    return-object p1

    .line 190
    :cond_bd
    :pswitch_bd
    new-instance p1, Lax/X1/y;

    .line 191
    .line 192
    new-instance v0, Lax/X1/k;

    .line 193
    .line 194
    iget-object v2, p2, Lax/X1/L$b;->b:Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {p2}, Lax/X1/L$b;->a()I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    const/16 v3, 0x1000

    .line 201
    .line 202
    invoke-direct {v0, v2, p2, v3, v1}, Lax/X1/k;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 206
    .line 207
    .line 208
    return-object p1

    .line 209
    :cond_d0
    new-instance p1, Lax/X1/E;

    .line 210
    .line 211
    new-instance p2, Lax/X1/x;

    .line 212
    .line 213
    const-string v0, "application/vnd.dvb.ait"

    .line 214
    .line 215
    invoke-direct {p2, v0, v1}, Lax/X1/x;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-direct {p1, p2}, Lax/X1/E;-><init>(Lax/X1/D;)V

    .line 219
    .line 220
    .line 221
    return-object p1

    .line 222
    :cond_dd
    new-instance p1, Lax/X1/y;

    .line 223
    .line 224
    new-instance v0, Lax/X1/f;

    .line 225
    .line 226
    iget-object v2, p2, Lax/X1/L$b;->b:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {p2}, Lax/X1/L$b;->a()I

    .line 229
    .line 230
    .line 231
    move-result p2

    .line 232
    invoke-direct {v0, v2, p2, v1}, Lax/X1/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 236
    .line 237
    .line 238
    return-object p1

    .line 239
    :cond_ee
    new-instance p1, Lax/X1/y;

    .line 240
    .line 241
    new-instance v0, Lax/X1/l;

    .line 242
    .line 243
    iget-object p2, p2, Lax/X1/L$b;->d:Ljava/util/List;

    .line 244
    .line 245
    invoke-direct {v0, p2, v1}, Lax/X1/l;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 249
    .line 250
    .line 251
    return-object p1

    .line 252
    :cond_fb
    new-instance p1, Lax/X1/y;

    .line 253
    .line 254
    new-instance p2, Lax/X1/u;

    .line 255
    .line 256
    invoke-direct {p2, v1}, Lax/X1/u;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-direct {p1, p2}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 260
    .line 261
    .line 262
    return-object p1

    .line 263
    :cond_106
    new-instance p1, Lax/X1/y;

    .line 264
    .line 265
    new-instance v0, Lax/X1/q;

    .line 266
    .line 267
    invoke-direct {p0, p2}, Lax/X1/j;->c(Lax/X1/L$b;)Lax/X1/G;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    invoke-direct {v0, p2, v1}, Lax/X1/q;-><init>(Lax/X1/G;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 275
    .line 276
    .line 277
    return-object p1

    .line 278
    :cond_115
    invoke-direct {p0, v2}, Lax/X1/j;->f(I)Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-eqz p1, :cond_11c

    .line 283
    .line 284
    return-object v4

    .line 285
    :cond_11c
    new-instance p1, Lax/X1/y;

    .line 286
    .line 287
    new-instance v0, Lax/X1/p;

    .line 288
    .line 289
    invoke-direct {p0, p2}, Lax/X1/j;->c(Lax/X1/L$b;)Lax/X1/G;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    const/4 v2, 0x1

    .line 294
    invoke-direct {p0, v2}, Lax/X1/j;->f(I)Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    const/16 v3, 0x8

    .line 299
    .line 300
    invoke-direct {p0, v3}, Lax/X1/j;->f(I)Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    invoke-direct {v0, p2, v2, v3, v1}, Lax/X1/p;-><init>(Lax/X1/G;ZZLjava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 308
    .line 309
    .line 310
    return-object p1

    .line 311
    :cond_136
    new-instance p1, Lax/X1/y;

    .line 312
    .line 313
    new-instance p2, Lax/X1/r;

    .line 314
    .line 315
    invoke-direct {p2, v1}, Lax/X1/r;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-direct {p1, p2}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 319
    .line 320
    .line 321
    return-object p1

    .line 322
    :cond_141
    new-instance p1, Lax/X1/y;

    .line 323
    .line 324
    new-instance v0, Lax/X1/t;

    .line 325
    .line 326
    iget-object v2, p2, Lax/X1/L$b;->b:Ljava/lang/String;

    .line 327
    .line 328
    invoke-virtual {p2}, Lax/X1/L$b;->a()I

    .line 329
    .line 330
    .line 331
    move-result p2

    .line 332
    invoke-direct {v0, v2, p2, v1}, Lax/X1/t;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 336
    .line 337
    .line 338
    return-object p1

    .line 339
    :cond_152
    :pswitch_152
    new-instance p1, Lax/X1/y;

    .line 340
    .line 341
    new-instance v0, Lax/X1/n;

    .line 342
    .line 343
    invoke-direct {p0, p2}, Lax/X1/j;->d(Lax/X1/L$b;)Lax/X1/O;

    .line 344
    .line 345
    .line 346
    move-result-object p2

    .line 347
    invoke-direct {v0, p2, v1}, Lax/X1/n;-><init>(Lax/X1/O;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    invoke-direct {p1, v0}, Lax/X1/y;-><init>(Lax/X1/m;)V

    .line 351
    .line 352
    .line 353
    return-object p1

    .line 354
    nop

    .line 355
    :pswitch_data_162
    .packed-switch 0xf
        :pswitch_91
        :pswitch_82
        :pswitch_6a
    .end packed-switch

    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    :pswitch_data_16c
    .packed-switch 0x80
        :pswitch_152
        :pswitch_59
        :pswitch_50
    .end packed-switch

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    :pswitch_data_176
    .packed-switch 0x86
        :pswitch_3a
        :pswitch_59
        :pswitch_bd
    .end packed-switch
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method
