.class public final Lax/P1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/N1/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P1/a$b;,
        Lax/P1/a$a;,
        Lax/P1/a$h;,
        Lax/P1/a$d;,
        Lax/P1/a$e;,
        Lax/P1/a$f;,
        Lax/P1/a$g;,
        Lax/P1/a$c;
    }
.end annotation


# static fields
.field private static final h:[B

.field private static final i:[B

.field private static final j:[B


# instance fields
.field private final a:Landroid/graphics/Paint;

.field private final b:Landroid/graphics/Paint;

.field private final c:Landroid/graphics/Canvas;

.field private final d:Lax/P1/a$b;

.field private final e:Lax/P1/a$a;

.field private final f:Lax/P1/a$h;

.field private g:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_1a

    .line 5
    .line 6
    .line 7
    sput-object v1, Lax/P1/a;->h:[B

    .line 8
    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    fill-array-data v0, :array_20

    .line 12
    .line 13
    .line 14
    sput-object v0, Lax/P1/a;->i:[B

    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    fill-array-data v0, :array_26

    .line 21
    .line 22
    .line 23
    sput-object v0, Lax/P1/a;->j:[B

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :array_1a
    .array-data 1
        0x0t
        0x7t
        0x8t
        0xft
    .end array-data

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    :array_20
    .array-data 1
        0x0t
        0x77t
        -0x78t
        -0x1t
    .end array-data

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    :array_26
    .array-data 1
        0x0t
        0x11t
        0x22t
        0x33t
        0x44t
        0x55t
        0x66t
        0x77t
        -0x78t
        -0x67t
        -0x56t
        -0x45t
        -0x34t
        -0x23t
        -0x12t
        -0x1t
    .end array-data
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public constructor <init>(Ljava/util/List;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/S0/G;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, [B

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lax/S0/G;-><init>([B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lax/S0/G;->U()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {v0}, Lax/S0/G;->U()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    new-instance v2, Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lax/P1/a;->a:Landroid/graphics/Paint;

    .line 30
    .line 31
    sget-object v3, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    .line 37
    .line 38
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 39
    .line 40
    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 44
    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 48
    .line 49
    .line 50
    new-instance v2, Landroid/graphics/Paint;

    .line 51
    .line 52
    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v2, p0, Lax/P1/a;->b:Landroid/graphics/Paint;

    .line 56
    .line 57
    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 58
    .line 59
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 60
    .line 61
    .line 62
    new-instance v4, Landroid/graphics/PorterDuffXfermode;

    .line 63
    .line 64
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 65
    .line 66
    invoke-direct {v4, v5}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 73
    .line 74
    .line 75
    new-instance v2, Landroid/graphics/Canvas;

    .line 76
    .line 77
    invoke-direct {v2}, Landroid/graphics/Canvas;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v2, p0, Lax/P1/a;->c:Landroid/graphics/Canvas;

    .line 81
    .line 82
    new-instance v3, Lax/P1/a$b;

    .line 83
    .line 84
    const/4 v8, 0x0

    .line 85
    const/16 v9, 0x23f

    .line 86
    .line 87
    const/16 v4, 0x2cf

    .line 88
    .line 89
    const/16 v5, 0x23f

    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    const/16 v7, 0x2cf

    .line 93
    .line 94
    invoke-direct/range {v3 .. v9}, Lax/P1/a$b;-><init>(IIIIII)V

    .line 95
    .line 96
    .line 97
    iput-object v3, p0, Lax/P1/a;->d:Lax/P1/a$b;

    .line 98
    .line 99
    new-instance v2, Lax/P1/a$a;

    .line 100
    .line 101
    invoke-static {}, Lax/P1/a;->f()[I

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {}, Lax/P1/a;->g()[I

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static {}, Lax/P1/a;->h()[I

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-direct {v2, v1, v3, v4, v5}, Lax/P1/a$a;-><init>(I[I[I[I)V

    .line 114
    .line 115
    .line 116
    iput-object v2, p0, Lax/P1/a;->e:Lax/P1/a$a;

    .line 117
    .line 118
    new-instance v1, Lax/P1/a$h;

    .line 119
    .line 120
    invoke-direct {v1, p1, v0}, Lax/P1/a$h;-><init>(II)V

    .line 121
    .line 122
    .line 123
    iput-object v1, p0, Lax/P1/a;->f:Lax/P1/a$h;

    .line 124
    .line 125
    return-void
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private static e(IILax/S0/F;)[B
    .registers 6

    .line 1
    new-array v0, p0, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_3
    if-ge v1, p0, :cond_f

    .line 5
    .line 6
    invoke-virtual {p2, p1}, Lax/S0/F;->h(I)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    int-to-byte v2, v2

    .line 11
    aput-byte v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_f
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private static f()[I
    .registers 4

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    const v1, -0x808081

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, -0x1

    .line 8
    filled-new-array {v2, v3, v0, v1}, [I

    .line 9
    .line 10
    .line 11
    move-result-object v0

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
.end method

.method private static g()[I
    .registers 9

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aput v2, v1, v2

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    :goto_8
    if-ge v3, v0, :cond_50

    .line 10
    .line 11
    const/16 v4, 0x8

    .line 12
    .line 13
    const/16 v5, 0xff

    .line 14
    .line 15
    if-ge v3, v4, :cond_2f

    .line 16
    .line 17
    and-int/lit8 v4, v3, 0x1

    .line 18
    .line 19
    if-eqz v4, :cond_17

    .line 20
    .line 21
    const/16 v4, 0xff

    .line 22
    .line 23
    goto :goto_18

    .line 24
    :cond_17
    const/4 v4, 0x0

    .line 25
    :goto_18
    and-int/lit8 v6, v3, 0x2

    .line 26
    .line 27
    if-eqz v6, :cond_1f

    .line 28
    .line 29
    const/16 v6, 0xff

    .line 30
    .line 31
    goto :goto_20

    .line 32
    :cond_1f
    const/4 v6, 0x0

    .line 33
    :goto_20
    and-int/lit8 v7, v3, 0x4

    .line 34
    .line 35
    if-eqz v7, :cond_27

    .line 36
    .line 37
    const/16 v7, 0xff

    .line 38
    .line 39
    goto :goto_28

    .line 40
    :cond_27
    const/4 v7, 0x0

    .line 41
    :goto_28
    invoke-static {v5, v4, v6, v7}, Lax/P1/a;->i(IIII)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    aput v4, v1, v3

    .line 46
    .line 47
    goto :goto_4d

    .line 48
    :cond_2f
    and-int/lit8 v4, v3, 0x1

    .line 49
    .line 50
    const/16 v6, 0x7f

    .line 51
    .line 52
    if-eqz v4, :cond_38

    .line 53
    .line 54
    const/16 v4, 0x7f

    .line 55
    .line 56
    goto :goto_39

    .line 57
    :cond_38
    const/4 v4, 0x0

    .line 58
    :goto_39
    and-int/lit8 v7, v3, 0x2

    .line 59
    .line 60
    if-eqz v7, :cond_40

    .line 61
    .line 62
    const/16 v7, 0x7f

    .line 63
    .line 64
    goto :goto_41

    .line 65
    :cond_40
    const/4 v7, 0x0

    .line 66
    :goto_41
    and-int/lit8 v8, v3, 0x4

    .line 67
    .line 68
    if-eqz v8, :cond_46

    .line 69
    .line 70
    goto :goto_47

    .line 71
    :cond_46
    const/4 v6, 0x0

    .line 72
    :goto_47
    invoke-static {v5, v4, v7, v6}, Lax/P1/a;->i(IIII)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    aput v4, v1, v3

    .line 77
    .line 78
    :goto_4d
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_8

    .line 81
    :cond_50
    return-object v1
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private static h()[I
    .registers 11

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aput v2, v1, v2

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_8
    if-ge v3, v0, :cond_128

    .line 10
    .line 11
    const/16 v4, 0x8

    .line 12
    .line 13
    const/16 v5, 0xff

    .line 14
    .line 15
    if-ge v3, v4, :cond_30

    .line 16
    .line 17
    and-int/lit8 v4, v3, 0x1

    .line 18
    .line 19
    if-eqz v4, :cond_17

    .line 20
    .line 21
    const/16 v4, 0xff

    .line 22
    .line 23
    goto :goto_18

    .line 24
    :cond_17
    const/4 v4, 0x0

    .line 25
    :goto_18
    and-int/lit8 v6, v3, 0x2

    .line 26
    .line 27
    if-eqz v6, :cond_1f

    .line 28
    .line 29
    const/16 v6, 0xff

    .line 30
    .line 31
    goto :goto_20

    .line 32
    :cond_1f
    const/4 v6, 0x0

    .line 33
    :goto_20
    and-int/lit8 v7, v3, 0x4

    .line 34
    .line 35
    if-eqz v7, :cond_25

    .line 36
    .line 37
    goto :goto_26

    .line 38
    :cond_25
    const/4 v5, 0x0

    .line 39
    :goto_26
    const/16 v7, 0x3f

    .line 40
    .line 41
    invoke-static {v7, v4, v6, v5}, Lax/P1/a;->i(IIII)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    aput v4, v1, v3

    .line 46
    .line 47
    goto/16 :goto_124

    .line 48
    .line 49
    :cond_30
    and-int/lit16 v6, v3, 0x88

    .line 50
    .line 51
    const/16 v7, 0xaa

    .line 52
    .line 53
    const/16 v8, 0x55

    .line 54
    .line 55
    if-eqz v6, :cond_ef

    .line 56
    .line 57
    const/16 v9, 0x7f

    .line 58
    .line 59
    if-eq v6, v4, :cond_b9

    .line 60
    .line 61
    const/16 v4, 0x80

    .line 62
    .line 63
    const/16 v7, 0x2b

    .line 64
    .line 65
    if-eq v6, v4, :cond_7f

    .line 66
    .line 67
    const/16 v4, 0x88

    .line 68
    .line 69
    if-eq v6, v4, :cond_48

    .line 70
    .line 71
    goto/16 :goto_124

    .line 72
    .line 73
    :cond_48
    and-int/lit8 v4, v3, 0x1

    .line 74
    .line 75
    if-eqz v4, :cond_4f

    .line 76
    .line 77
    const/16 v4, 0x2b

    .line 78
    .line 79
    goto :goto_50

    .line 80
    :cond_4f
    const/4 v4, 0x0

    .line 81
    :goto_50
    and-int/lit8 v6, v3, 0x10

    .line 82
    .line 83
    if-eqz v6, :cond_57

    .line 84
    .line 85
    const/16 v6, 0x55

    .line 86
    .line 87
    goto :goto_58

    .line 88
    :cond_57
    const/4 v6, 0x0

    .line 89
    :goto_58
    add-int/2addr v4, v6

    .line 90
    and-int/lit8 v6, v3, 0x2

    .line 91
    .line 92
    if-eqz v6, :cond_60

    .line 93
    .line 94
    const/16 v6, 0x2b

    .line 95
    .line 96
    goto :goto_61

    .line 97
    :cond_60
    const/4 v6, 0x0

    .line 98
    :goto_61
    and-int/lit8 v9, v3, 0x20

    .line 99
    .line 100
    if-eqz v9, :cond_68

    .line 101
    .line 102
    const/16 v9, 0x55

    .line 103
    .line 104
    goto :goto_69

    .line 105
    :cond_68
    const/4 v9, 0x0

    .line 106
    :goto_69
    add-int/2addr v6, v9

    .line 107
    and-int/lit8 v9, v3, 0x4

    .line 108
    .line 109
    if-eqz v9, :cond_6f

    .line 110
    .line 111
    goto :goto_70

    .line 112
    :cond_6f
    const/4 v7, 0x0

    .line 113
    :goto_70
    and-int/lit8 v9, v3, 0x40

    .line 114
    .line 115
    if-eqz v9, :cond_75

    .line 116
    .line 117
    goto :goto_76

    .line 118
    :cond_75
    const/4 v8, 0x0

    .line 119
    :goto_76
    add-int/2addr v7, v8

    .line 120
    invoke-static {v5, v4, v6, v7}, Lax/P1/a;->i(IIII)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    aput v4, v1, v3

    .line 125
    .line 126
    goto/16 :goto_124

    .line 127
    .line 128
    :cond_7f
    and-int/lit8 v4, v3, 0x1

    .line 129
    .line 130
    if-eqz v4, :cond_86

    .line 131
    .line 132
    const/16 v4, 0x2b

    .line 133
    .line 134
    goto :goto_87

    .line 135
    :cond_86
    const/4 v4, 0x0

    .line 136
    :goto_87
    add-int/2addr v4, v9

    .line 137
    and-int/lit8 v6, v3, 0x10

    .line 138
    .line 139
    if-eqz v6, :cond_8f

    .line 140
    .line 141
    const/16 v6, 0x55

    .line 142
    .line 143
    goto :goto_90

    .line 144
    :cond_8f
    const/4 v6, 0x0

    .line 145
    :goto_90
    add-int/2addr v4, v6

    .line 146
    and-int/lit8 v6, v3, 0x2

    .line 147
    .line 148
    if-eqz v6, :cond_98

    .line 149
    .line 150
    const/16 v6, 0x2b

    .line 151
    .line 152
    goto :goto_99

    .line 153
    :cond_98
    const/4 v6, 0x0

    .line 154
    :goto_99
    add-int/2addr v6, v9

    .line 155
    and-int/lit8 v10, v3, 0x20

    .line 156
    .line 157
    if-eqz v10, :cond_a1

    .line 158
    .line 159
    const/16 v10, 0x55

    .line 160
    .line 161
    goto :goto_a2

    .line 162
    :cond_a1
    const/4 v10, 0x0

    .line 163
    :goto_a2
    add-int/2addr v6, v10

    .line 164
    and-int/lit8 v10, v3, 0x4

    .line 165
    .line 166
    if-eqz v10, :cond_a8

    .line 167
    .line 168
    goto :goto_a9

    .line 169
    :cond_a8
    const/4 v7, 0x0

    .line 170
    :goto_a9
    add-int/2addr v7, v9

    .line 171
    and-int/lit8 v9, v3, 0x40

    .line 172
    .line 173
    if-eqz v9, :cond_af

    .line 174
    .line 175
    goto :goto_b0

    .line 176
    :cond_af
    const/4 v8, 0x0

    .line 177
    :goto_b0
    add-int/2addr v7, v8

    .line 178
    invoke-static {v5, v4, v6, v7}, Lax/P1/a;->i(IIII)I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    aput v4, v1, v3

    .line 183
    .line 184
    goto/16 :goto_124

    .line 185
    .line 186
    :cond_b9
    and-int/lit8 v4, v3, 0x1

    .line 187
    .line 188
    if-eqz v4, :cond_c0

    .line 189
    .line 190
    const/16 v4, 0x55

    .line 191
    .line 192
    goto :goto_c1

    .line 193
    :cond_c0
    const/4 v4, 0x0

    .line 194
    :goto_c1
    and-int/lit8 v5, v3, 0x10

    .line 195
    .line 196
    if-eqz v5, :cond_c8

    .line 197
    .line 198
    const/16 v5, 0xaa

    .line 199
    .line 200
    goto :goto_c9

    .line 201
    :cond_c8
    const/4 v5, 0x0

    .line 202
    :goto_c9
    add-int/2addr v4, v5

    .line 203
    and-int/lit8 v5, v3, 0x2

    .line 204
    .line 205
    if-eqz v5, :cond_d1

    .line 206
    .line 207
    const/16 v5, 0x55

    .line 208
    .line 209
    goto :goto_d2

    .line 210
    :cond_d1
    const/4 v5, 0x0

    .line 211
    :goto_d2
    and-int/lit8 v6, v3, 0x20

    .line 212
    .line 213
    if-eqz v6, :cond_d9

    .line 214
    .line 215
    const/16 v6, 0xaa

    .line 216
    .line 217
    goto :goto_da

    .line 218
    :cond_d9
    const/4 v6, 0x0

    .line 219
    :goto_da
    add-int/2addr v5, v6

    .line 220
    and-int/lit8 v6, v3, 0x4

    .line 221
    .line 222
    if-eqz v6, :cond_e0

    .line 223
    .line 224
    goto :goto_e1

    .line 225
    :cond_e0
    const/4 v8, 0x0

    .line 226
    :goto_e1
    and-int/lit8 v6, v3, 0x40

    .line 227
    .line 228
    if-eqz v6, :cond_e6

    .line 229
    .line 230
    goto :goto_e7

    .line 231
    :cond_e6
    const/4 v7, 0x0

    .line 232
    :goto_e7
    add-int/2addr v8, v7

    .line 233
    invoke-static {v9, v4, v5, v8}, Lax/P1/a;->i(IIII)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    aput v4, v1, v3

    .line 238
    .line 239
    goto :goto_124

    .line 240
    :cond_ef
    and-int/lit8 v4, v3, 0x1

    .line 241
    .line 242
    if-eqz v4, :cond_f6

    .line 243
    .line 244
    const/16 v4, 0x55

    .line 245
    .line 246
    goto :goto_f7

    .line 247
    :cond_f6
    const/4 v4, 0x0

    .line 248
    :goto_f7
    and-int/lit8 v6, v3, 0x10

    .line 249
    .line 250
    if-eqz v6, :cond_fe

    .line 251
    .line 252
    const/16 v6, 0xaa

    .line 253
    .line 254
    goto :goto_ff

    .line 255
    :cond_fe
    const/4 v6, 0x0

    .line 256
    :goto_ff
    add-int/2addr v4, v6

    .line 257
    and-int/lit8 v6, v3, 0x2

    .line 258
    .line 259
    if-eqz v6, :cond_107

    .line 260
    .line 261
    const/16 v6, 0x55

    .line 262
    .line 263
    goto :goto_108

    .line 264
    :cond_107
    const/4 v6, 0x0

    .line 265
    :goto_108
    and-int/lit8 v9, v3, 0x20

    .line 266
    .line 267
    if-eqz v9, :cond_10f

    .line 268
    .line 269
    const/16 v9, 0xaa

    .line 270
    .line 271
    goto :goto_110

    .line 272
    :cond_10f
    const/4 v9, 0x0

    .line 273
    :goto_110
    add-int/2addr v6, v9

    .line 274
    and-int/lit8 v9, v3, 0x4

    .line 275
    .line 276
    if-eqz v9, :cond_116

    .line 277
    .line 278
    goto :goto_117

    .line 279
    :cond_116
    const/4 v8, 0x0

    .line 280
    :goto_117
    and-int/lit8 v9, v3, 0x40

    .line 281
    .line 282
    if-eqz v9, :cond_11c

    .line 283
    .line 284
    goto :goto_11d

    .line 285
    :cond_11c
    const/4 v7, 0x0

    .line 286
    :goto_11d
    add-int/2addr v8, v7

    .line 287
    invoke-static {v5, v4, v6, v8}, Lax/P1/a;->i(IIII)I

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    aput v4, v1, v3

    .line 292
    .line 293
    :goto_124
    add-int/lit8 v3, v3, 0x1

    .line 294
    .line 295
    goto/16 :goto_8

    .line 296
    .line 297
    :cond_128
    return-object v1
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
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
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method private static i(IIII)I
    .registers 4

    .line 1
    shl-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x10

    .line 4
    .line 5
    or-int/2addr p0, p1

    .line 6
    shl-int/lit8 p1, p2, 0x8

    .line 7
    .line 8
    or-int/2addr p0, p1

    .line 9
    or-int/2addr p0, p3

    .line 10
    return p0
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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private static j(Lax/S0/F;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I
    .registers 16

    .line 1
    const/4 v6, 0x0

    .line 2
    const/4 v0, 0x0

    .line 3
    :goto_2
    const/4 v1, 0x2

    .line 4
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v2, :cond_d

    .line 10
    .line 11
    move v7, v0

    .line 12
    :goto_b
    const/4 v8, 0x1

    .line 13
    goto :goto_5a

    .line 14
    :cond_d
    invoke-virtual {p0}, Lax/S0/F;->g()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v4, 0x3

    .line 19
    if-eqz v2, :cond_21

    .line 20
    .line 21
    invoke-virtual {p0, v4}, Lax/S0/F;->h(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v2, v4

    .line 26
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :goto_1d
    move v7, v0

    .line 31
    move v8, v2

    .line 32
    move v2, v1

    .line 33
    goto :goto_5a

    .line 34
    :cond_21
    invoke-virtual {p0}, Lax/S0/F;->g()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2a

    .line 39
    .line 40
    move v7, v0

    .line 41
    const/4 v2, 0x0

    .line 42
    goto :goto_b

    .line 43
    :cond_2a
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_57

    .line 48
    .line 49
    if-eq v2, v3, :cond_53

    .line 50
    .line 51
    if-eq v2, v1, :cond_47

    .line 52
    .line 53
    if-eq v2, v4, :cond_3a

    .line 54
    .line 55
    move v7, v0

    .line 56
    const/4 v2, 0x0

    .line 57
    :goto_38
    const/4 v8, 0x0

    .line 58
    goto :goto_5a

    .line 59
    :cond_3a
    const/16 v2, 0x8

    .line 60
    .line 61
    invoke-virtual {p0, v2}, Lax/S0/F;->h(I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    add-int/lit8 v2, v2, 0x1d

    .line 66
    .line 67
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    goto :goto_1d

    .line 72
    :cond_47
    const/4 v2, 0x4

    .line 73
    invoke-virtual {p0, v2}, Lax/S0/F;->h(I)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    add-int/lit8 v2, v2, 0xc

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    goto :goto_1d

    .line 84
    :cond_53
    move v7, v0

    .line 85
    const/4 v2, 0x0

    .line 86
    const/4 v8, 0x2

    .line 87
    goto :goto_5a

    .line 88
    :cond_57
    const/4 v2, 0x0

    .line 89
    const/4 v7, 0x1

    .line 90
    goto :goto_38

    .line 91
    :goto_5a
    if-eqz v8, :cond_74

    .line 92
    .line 93
    if-eqz p5, :cond_74

    .line 94
    .line 95
    if-eqz p2, :cond_62

    .line 96
    .line 97
    aget-byte v2, p2, v2

    .line 98
    .line 99
    :cond_62
    aget v0, p1, v2

    .line 100
    .line 101
    invoke-virtual {p5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 102
    .line 103
    .line 104
    int-to-float v1, p3

    .line 105
    int-to-float v2, p4

    .line 106
    add-int v0, p3, v8

    .line 107
    .line 108
    int-to-float v0, v0

    .line 109
    add-int/2addr v3, p4

    .line 110
    int-to-float v4, v3

    .line 111
    move-object v5, p5

    .line 112
    move v3, v0

    .line 113
    move-object v0, p6

    .line 114
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 115
    .line 116
    .line 117
    :cond_74
    add-int/2addr p3, v8

    .line 118
    if-eqz v7, :cond_78

    .line 119
    .line 120
    return p3

    .line 121
    :cond_78
    move v0, v7

    .line 122
    goto :goto_2
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
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
.end method

.method private static k(Lax/S0/F;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I
    .registers 16

    .line 1
    const/4 v6, 0x0

    .line 2
    const/4 v0, 0x0

    .line 3
    :goto_2
    const/4 v1, 0x4

    .line 4
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v2, :cond_e

    .line 10
    .line 11
    move v7, v0

    .line 12
    :goto_b
    const/4 v8, 0x1

    .line 13
    goto/16 :goto_67

    .line 14
    .line 15
    :cond_e
    invoke-virtual {p0}, Lax/S0/F;->g()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v4, 0x3

    .line 20
    if-nez v2, :cond_25

    .line 21
    .line 22
    invoke-virtual {p0, v4}, Lax/S0/F;->h(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_21

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    move v7, v0

    .line 31
    move v8, v1

    .line 32
    const/4 v2, 0x0

    .line 33
    goto :goto_67

    .line 34
    :cond_21
    const/4 v2, 0x0

    .line 35
    const/4 v7, 0x1

    .line 36
    :goto_23
    const/4 v8, 0x0

    .line 37
    goto :goto_67

    .line 38
    :cond_25
    invoke-virtual {p0}, Lax/S0/F;->g()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v7, 0x2

    .line 43
    if-nez v2, :cond_39

    .line 44
    .line 45
    invoke-virtual {p0, v7}, Lax/S0/F;->h(I)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    add-int/2addr v2, v1

    .line 50
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    :goto_35
    move v7, v0

    .line 55
    move v8, v2

    .line 56
    move v2, v1

    .line 57
    goto :goto_67

    .line 58
    :cond_39
    invoke-virtual {p0, v7}, Lax/S0/F;->h(I)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_64

    .line 63
    .line 64
    if-eq v2, v3, :cond_60

    .line 65
    .line 66
    if-eq v2, v7, :cond_55

    .line 67
    .line 68
    if-eq v2, v4, :cond_48

    .line 69
    .line 70
    move v7, v0

    .line 71
    const/4 v2, 0x0

    .line 72
    goto :goto_23

    .line 73
    :cond_48
    const/16 v2, 0x8

    .line 74
    .line 75
    invoke-virtual {p0, v2}, Lax/S0/F;->h(I)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    add-int/lit8 v2, v2, 0x19

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    goto :goto_35

    .line 86
    :cond_55
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    add-int/lit8 v2, v2, 0x9

    .line 91
    .line 92
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    goto :goto_35

    .line 97
    :cond_60
    move v7, v0

    .line 98
    const/4 v2, 0x0

    .line 99
    const/4 v8, 0x2

    .line 100
    goto :goto_67

    .line 101
    :cond_64
    move v7, v0

    .line 102
    const/4 v2, 0x0

    .line 103
    goto :goto_b

    .line 104
    :goto_67
    if-eqz v8, :cond_81

    .line 105
    .line 106
    if-eqz p5, :cond_81

    .line 107
    .line 108
    if-eqz p2, :cond_6f

    .line 109
    .line 110
    aget-byte v2, p2, v2

    .line 111
    .line 112
    :cond_6f
    aget v0, p1, v2

    .line 113
    .line 114
    invoke-virtual {p5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 115
    .line 116
    .line 117
    int-to-float v1, p3

    .line 118
    int-to-float v2, p4

    .line 119
    add-int v0, p3, v8

    .line 120
    .line 121
    int-to-float v0, v0

    .line 122
    add-int/2addr v3, p4

    .line 123
    int-to-float v4, v3

    .line 124
    move-object v5, p5

    .line 125
    move v3, v0

    .line 126
    move-object v0, p6

    .line 127
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 128
    .line 129
    .line 130
    :cond_81
    add-int/2addr p3, v8

    .line 131
    if-eqz v7, :cond_85

    .line 132
    .line 133
    return p3

    .line 134
    :cond_85
    move v0, v7

    .line 135
    goto/16 :goto_2
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
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
.end method

.method private static l(Lax/S0/F;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I
    .registers 16

    .line 1
    const/4 v6, 0x0

    .line 2
    const/4 v0, 0x0

    .line 3
    :goto_2
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_e

    .line 11
    .line 12
    move v7, v0

    .line 13
    const/4 v8, 0x1

    .line 14
    goto :goto_2e

    .line 15
    :cond_e
    invoke-virtual {p0}, Lax/S0/F;->g()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v4, 0x7

    .line 20
    if-nez v2, :cond_23

    .line 21
    .line 22
    invoke-virtual {p0, v4}, Lax/S0/F;->h(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1f

    .line 27
    .line 28
    move v7, v0

    .line 29
    move v8, v1

    .line 30
    const/4 v2, 0x0

    .line 31
    goto :goto_2e

    .line 32
    :cond_1f
    const/4 v2, 0x0

    .line 33
    const/4 v7, 0x1

    .line 34
    const/4 v8, 0x0

    .line 35
    goto :goto_2e

    .line 36
    :cond_23
    invoke-virtual {p0, v4}, Lax/S0/F;->h(I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    move v7, v0

    .line 45
    move v8, v2

    .line 46
    move v2, v1

    .line 47
    :goto_2e
    if-eqz v8, :cond_48

    .line 48
    .line 49
    if-eqz p5, :cond_48

    .line 50
    .line 51
    if-eqz p2, :cond_36

    .line 52
    .line 53
    aget-byte v2, p2, v2

    .line 54
    .line 55
    :cond_36
    aget v0, p1, v2

    .line 56
    .line 57
    invoke-virtual {p5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 58
    .line 59
    .line 60
    int-to-float v1, p3

    .line 61
    int-to-float v2, p4

    .line 62
    add-int v0, p3, v8

    .line 63
    .line 64
    int-to-float v0, v0

    .line 65
    add-int/2addr v3, p4

    .line 66
    int-to-float v4, v3

    .line 67
    move-object v5, p5

    .line 68
    move v3, v0

    .line 69
    move-object v0, p6

    .line 70
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 71
    .line 72
    .line 73
    :cond_48
    add-int/2addr p3, v8

    .line 74
    if-eqz v7, :cond_4c

    .line 75
    .line 76
    return p3

    .line 77
    :cond_4c
    move v0, v7

    .line 78
    goto :goto_2
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
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
.end method

.method private static m([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .registers 16

    .line 1
    new-instance v0, Lax/S0/F;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/S0/F;-><init>([B)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    move-object v7, p0

    .line 8
    move-object v8, v7

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move-object p4, v8

    .line 12
    :goto_b
    invoke-virtual {v0}, Lax/S0/F;->b()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_88

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v5, 0xf0

    .line 25
    .line 26
    if-eq v2, v5, :cond_7e

    .line 27
    .line 28
    const/4 v5, 0x3

    .line 29
    packed-switch v2, :pswitch_data_8a

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x4

    .line 33
    packed-switch v2, :pswitch_data_94

    .line 34
    .line 35
    .line 36
    :goto_23
    move-object v1, p1

    .line 37
    move-object v5, p5

    .line 38
    move-object v6, p6

    .line 39
    goto/16 :goto_84

    .line 40
    .line 41
    :pswitch_28
    const/16 v2, 0x10

    .line 42
    .line 43
    invoke-static {v2, v1, v0}, Lax/P1/a;->e(IILax/S0/F;)[B

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    goto :goto_23

    .line 48
    :pswitch_2f
    invoke-static {v5, v1, v0}, Lax/P1/a;->e(IILax/S0/F;)[B

    .line 49
    .line 50
    .line 51
    move-result-object p4

    .line 52
    goto :goto_23

    .line 53
    :pswitch_34
    invoke-static {v5, v5, v0}, Lax/P1/a;->e(IILax/S0/F;)[B

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    goto :goto_23

    .line 58
    :pswitch_39
    const/4 v2, 0x0

    .line 59
    move-object v1, p1

    .line 60
    move-object v5, p5

    .line 61
    move-object v6, p6

    .line 62
    invoke-static/range {v0 .. v6}, Lax/P1/a;->l(Lax/S0/F;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    goto/16 :goto_84

    .line 67
    .line 68
    :pswitch_43
    move-object v1, p1

    .line 69
    move-object p1, p5

    .line 70
    move-object v6, p6

    .line 71
    if-ne p2, v5, :cond_51

    .line 72
    .line 73
    if-nez v7, :cond_4d

    .line 74
    .line 75
    sget-object p5, Lax/P1/a;->j:[B

    .line 76
    .line 77
    goto :goto_4e

    .line 78
    :cond_4d
    move-object p5, v7

    .line 79
    :goto_4e
    move-object v2, p5

    .line 80
    :goto_4f
    move-object v5, p1

    .line 81
    goto :goto_53

    .line 82
    :cond_51
    move-object v2, p0

    .line 83
    goto :goto_4f

    .line 84
    :goto_53
    invoke-static/range {v0 .. v6}, Lax/P1/a;->k(Lax/S0/F;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    move-object p1, v5

    .line 89
    invoke-virtual {v0}, Lax/S0/F;->c()V

    .line 90
    .line 91
    .line 92
    goto :goto_84

    .line 93
    :pswitch_5c
    move-object v1, p1

    .line 94
    move-object p1, p5

    .line 95
    move-object v6, p6

    .line 96
    if-ne p2, v5, :cond_6a

    .line 97
    .line 98
    if-nez p4, :cond_66

    .line 99
    .line 100
    sget-object p5, Lax/P1/a;->i:[B

    .line 101
    .line 102
    goto :goto_67

    .line 103
    :cond_66
    move-object p5, p4

    .line 104
    :goto_67
    move-object v5, p1

    .line 105
    move-object v2, p5

    .line 106
    goto :goto_76

    .line 107
    :cond_6a
    const/4 p5, 0x2

    .line 108
    if-ne p2, p5, :cond_74

    .line 109
    .line 110
    if-nez v8, :cond_72

    .line 111
    .line 112
    sget-object p5, Lax/P1/a;->h:[B

    .line 113
    .line 114
    goto :goto_67

    .line 115
    :cond_72
    move-object p5, v8

    .line 116
    goto :goto_67

    .line 117
    :cond_74
    move-object v2, p0

    .line 118
    move-object v5, p1

    .line 119
    :goto_76
    invoke-static/range {v0 .. v6}, Lax/P1/a;->j(Lax/S0/F;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-virtual {v0}, Lax/S0/F;->c()V

    .line 124
    .line 125
    .line 126
    goto :goto_84

    .line 127
    :cond_7e
    move-object v1, p1

    .line 128
    move-object v5, p5

    .line 129
    move-object v6, p6

    .line 130
    add-int/lit8 v4, v4, 0x2

    .line 131
    .line 132
    move v3, p3

    .line 133
    :goto_84
    move-object p1, v1

    .line 134
    move-object p5, v5

    .line 135
    move-object p6, v6

    .line 136
    goto :goto_b

    .line 137
    :cond_88
    return-void

    .line 138
    nop

    .line 139
    :pswitch_data_8a
    .packed-switch 0x10
        :pswitch_5c
        :pswitch_43
        :pswitch_39
    .end packed-switch

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    :pswitch_data_94
    .packed-switch 0x20
        :pswitch_34
        :pswitch_2f
        :pswitch_28
    .end packed-switch
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
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
.end method

.method private static n(Lax/P1/a$c;Lax/P1/a$a;IIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .registers 14

    .line 1
    const/4 v0, 0x3

    .line 2
    if-ne p2, v0, :cond_7

    .line 3
    .line 4
    iget-object p1, p1, Lax/P1/a$a;->d:[I

    .line 5
    .line 6
    :goto_5
    move-object v1, p1

    .line 7
    goto :goto_10

    .line 8
    :cond_7
    const/4 v0, 0x2

    .line 9
    if-ne p2, v0, :cond_d

    .line 10
    .line 11
    iget-object p1, p1, Lax/P1/a$a;->c:[I

    .line 12
    .line 13
    goto :goto_5

    .line 14
    :cond_d
    iget-object p1, p1, Lax/P1/a$a;->b:[I

    .line 15
    .line 16
    goto :goto_5

    .line 17
    :goto_10
    iget-object v0, p0, Lax/P1/a$c;->c:[B

    .line 18
    .line 19
    move v2, p2

    .line 20
    move v3, p3

    .line 21
    move v4, p4

    .line 22
    move-object v5, p5

    .line 23
    move-object v6, p6

    .line 24
    invoke-static/range {v0 .. v6}, Lax/P1/a;->m([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lax/P1/a$c;->d:[B

    .line 28
    .line 29
    add-int/lit8 v4, v4, 0x1

    .line 30
    .line 31
    invoke-static/range {v0 .. v6}, Lax/P1/a;->m([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
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
.end method

.method private o(Lax/S0/F;)Lax/N1/e;
    .registers 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    :goto_4
    invoke-virtual {v1}, Lax/S0/F;->b()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x30

    .line 10
    .line 11
    if-lt v2, v3, :cond_1c

    .line 12
    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lax/S0/F;->h(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/16 v3, 0xf

    .line 20
    .line 21
    if-ne v2, v3, :cond_1c

    .line 22
    .line 23
    iget-object v2, v0, Lax/P1/a;->f:Lax/P1/a$h;

    .line 24
    .line 25
    invoke-static {v1, v2}, Lax/P1/a;->u(Lax/S0/F;Lax/P1/a$h;)V

    .line 26
    .line 27
    .line 28
    goto :goto_4

    .line 29
    :cond_1c
    iget-object v1, v0, Lax/P1/a;->f:Lax/P1/a$h;

    .line 30
    .line 31
    iget-object v2, v1, Lax/P1/a$h;->i:Lax/P1/a$d;

    .line 32
    .line 33
    if-nez v2, :cond_36

    .line 34
    .line 35
    new-instance v3, Lax/N1/e;

    .line 36
    .line 37
    invoke-static {}, Lax/r7/z;->z()Lax/r7/z;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    invoke-direct/range {v3 .. v8}, Lax/N1/e;-><init>(Ljava/util/List;JJ)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_36
    iget-object v1, v1, Lax/P1/a$h;->h:Lax/P1/a$b;

    .line 56
    .line 57
    if-eqz v1, :cond_3b

    .line 58
    .line 59
    goto :goto_3d

    .line 60
    :cond_3b
    iget-object v1, v0, Lax/P1/a;->d:Lax/P1/a$b;

    .line 61
    .line 62
    :goto_3d
    iget-object v3, v0, Lax/P1/a;->g:Landroid/graphics/Bitmap;

    .line 63
    .line 64
    if-eqz v3, :cond_57

    .line 65
    .line 66
    iget v4, v1, Lax/P1/a$b;->a:I

    .line 67
    .line 68
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-ne v4, v3, :cond_57

    .line 75
    .line 76
    iget v3, v1, Lax/P1/a$b;->b:I

    .line 77
    .line 78
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    iget-object v4, v0, Lax/P1/a;->g:Landroid/graphics/Bitmap;

    .line 81
    .line 82
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eq v3, v4, :cond_6c

    .line 87
    .line 88
    :cond_57
    iget v3, v1, Lax/P1/a$b;->a:I

    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    iget v4, v1, Lax/P1/a$b;->b:I

    .line 93
    .line 94
    add-int/lit8 v4, v4, 0x1

    .line 95
    .line 96
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 97
    .line 98
    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    iput-object v3, v0, Lax/P1/a;->g:Landroid/graphics/Bitmap;

    .line 103
    .line 104
    iget-object v4, v0, Lax/P1/a;->c:Landroid/graphics/Canvas;

    .line 105
    .line 106
    invoke-virtual {v4, v3}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 107
    .line 108
    .line 109
    :cond_6c
    new-instance v6, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    iget-object v2, v2, Lax/P1/a$d;->d:Landroid/util/SparseArray;

    .line 115
    .line 116
    const/4 v4, 0x0

    .line 117
    :goto_74
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-ge v4, v5, :cond_1c0

    .line 122
    .line 123
    iget-object v5, v0, Lax/P1/a;->c:Landroid/graphics/Canvas;

    .line 124
    .line 125
    invoke-virtual {v5}, Landroid/graphics/Canvas;->save()I

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    check-cast v5, Lax/P1/a$e;

    .line 133
    .line 134
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->keyAt(I)I

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    iget-object v8, v0, Lax/P1/a;->f:Lax/P1/a$h;

    .line 139
    .line 140
    iget-object v8, v8, Lax/P1/a$h;->c:Landroid/util/SparseArray;

    .line 141
    .line 142
    invoke-virtual {v8, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    check-cast v7, Lax/P1/a$f;

    .line 147
    .line 148
    iget v8, v5, Lax/P1/a$e;->a:I

    .line 149
    .line 150
    iget v9, v1, Lax/P1/a$b;->c:I

    .line 151
    .line 152
    add-int/2addr v8, v9

    .line 153
    iget v5, v5, Lax/P1/a$e;->b:I

    .line 154
    .line 155
    iget v9, v1, Lax/P1/a$b;->e:I

    .line 156
    .line 157
    add-int/2addr v5, v9

    .line 158
    iget v9, v7, Lax/P1/a$f;->c:I

    .line 159
    .line 160
    add-int/2addr v9, v8

    .line 161
    iget v10, v1, Lax/P1/a$b;->d:I

    .line 162
    .line 163
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    iget v10, v7, Lax/P1/a$f;->d:I

    .line 168
    .line 169
    add-int/2addr v10, v5

    .line 170
    iget v11, v1, Lax/P1/a$b;->f:I

    .line 171
    .line 172
    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    iget-object v11, v0, Lax/P1/a;->c:Landroid/graphics/Canvas;

    .line 177
    .line 178
    invoke-virtual {v11, v8, v5, v9, v10}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 179
    .line 180
    .line 181
    iget-object v9, v0, Lax/P1/a;->f:Lax/P1/a$h;

    .line 182
    .line 183
    iget-object v9, v9, Lax/P1/a$h;->d:Landroid/util/SparseArray;

    .line 184
    .line 185
    iget v10, v7, Lax/P1/a$f;->g:I

    .line 186
    .line 187
    invoke-virtual {v9, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    check-cast v9, Lax/P1/a$a;

    .line 192
    .line 193
    if-nez v9, :cond_d2

    .line 194
    .line 195
    iget-object v9, v0, Lax/P1/a;->f:Lax/P1/a$h;

    .line 196
    .line 197
    iget-object v9, v9, Lax/P1/a$h;->f:Landroid/util/SparseArray;

    .line 198
    .line 199
    iget v10, v7, Lax/P1/a$f;->g:I

    .line 200
    .line 201
    invoke-virtual {v9, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    check-cast v9, Lax/P1/a$a;

    .line 206
    .line 207
    if-nez v9, :cond_d2

    .line 208
    .line 209
    iget-object v9, v0, Lax/P1/a;->e:Lax/P1/a$a;

    .line 210
    .line 211
    :cond_d2
    move-object v11, v9

    .line 212
    iget-object v9, v7, Lax/P1/a$f;->k:Landroid/util/SparseArray;

    .line 213
    .line 214
    const/4 v10, 0x0

    .line 215
    :goto_d6
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    if-ge v10, v12, :cond_12a

    .line 220
    .line 221
    invoke-virtual {v9, v10}, Landroid/util/SparseArray;->keyAt(I)I

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    invoke-virtual {v9, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v13

    .line 229
    check-cast v13, Lax/P1/a$g;

    .line 230
    .line 231
    iget-object v14, v0, Lax/P1/a;->f:Lax/P1/a$h;

    .line 232
    .line 233
    iget-object v14, v14, Lax/P1/a$h;->e:Landroid/util/SparseArray;

    .line 234
    .line 235
    invoke-virtual {v14, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v14

    .line 239
    check-cast v14, Lax/P1/a$c;

    .line 240
    .line 241
    if-nez v14, :cond_fd

    .line 242
    .line 243
    iget-object v14, v0, Lax/P1/a;->f:Lax/P1/a$h;

    .line 244
    .line 245
    iget-object v14, v14, Lax/P1/a$h;->g:Landroid/util/SparseArray;

    .line 246
    .line 247
    invoke-virtual {v14, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v12

    .line 251
    move-object v14, v12

    .line 252
    check-cast v14, Lax/P1/a$c;

    .line 253
    .line 254
    :cond_fd
    if-eqz v14, :cond_122

    .line 255
    .line 256
    iget-boolean v12, v14, Lax/P1/a$c;->b:Z

    .line 257
    .line 258
    if-eqz v12, :cond_106

    .line 259
    .line 260
    const/4 v12, 0x0

    .line 261
    :goto_104
    move-object v15, v12

    .line 262
    goto :goto_109

    .line 263
    :cond_106
    iget-object v12, v0, Lax/P1/a;->a:Landroid/graphics/Paint;

    .line 264
    .line 265
    goto :goto_104

    .line 266
    :goto_109
    iget v12, v7, Lax/P1/a$f;->f:I

    .line 267
    .line 268
    iget v3, v13, Lax/P1/a$g;->c:I

    .line 269
    .line 270
    add-int/2addr v3, v8

    .line 271
    iget v13, v13, Lax/P1/a$g;->d:I

    .line 272
    .line 273
    add-int/2addr v13, v5

    .line 274
    move-object/from16 v17, v2

    .line 275
    .line 276
    iget-object v2, v0, Lax/P1/a;->c:Landroid/graphics/Canvas;

    .line 277
    .line 278
    move/from16 v16, v13

    .line 279
    .line 280
    move v13, v3

    .line 281
    move v3, v10

    .line 282
    move-object v10, v14

    .line 283
    move/from16 v14, v16

    .line 284
    .line 285
    move-object/from16 v16, v2

    .line 286
    .line 287
    invoke-static/range {v10 .. v16}, Lax/P1/a;->n(Lax/P1/a$c;Lax/P1/a$a;IIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 288
    .line 289
    .line 290
    goto :goto_125

    .line 291
    :cond_122
    move-object/from16 v17, v2

    .line 292
    .line 293
    move v3, v10

    .line 294
    :goto_125
    add-int/lit8 v10, v3, 0x1

    .line 295
    .line 296
    move-object/from16 v2, v17

    .line 297
    .line 298
    goto :goto_d6

    .line 299
    :cond_12a
    move-object/from16 v17, v2

    .line 300
    .line 301
    iget-boolean v2, v7, Lax/P1/a$f;->b:Z

    .line 302
    .line 303
    if-eqz v2, :cond_162

    .line 304
    .line 305
    iget v2, v7, Lax/P1/a$f;->f:I

    .line 306
    .line 307
    const/4 v3, 0x3

    .line 308
    if-ne v2, v3, :cond_13c

    .line 309
    .line 310
    iget-object v2, v11, Lax/P1/a$a;->d:[I

    .line 311
    .line 312
    iget v3, v7, Lax/P1/a$f;->h:I

    .line 313
    .line 314
    aget v2, v2, v3

    .line 315
    .line 316
    goto :goto_14c

    .line 317
    :cond_13c
    const/4 v3, 0x2

    .line 318
    if-ne v2, v3, :cond_146

    .line 319
    .line 320
    iget-object v2, v11, Lax/P1/a$a;->c:[I

    .line 321
    .line 322
    iget v3, v7, Lax/P1/a$f;->i:I

    .line 323
    .line 324
    aget v2, v2, v3

    .line 325
    .line 326
    goto :goto_14c

    .line 327
    :cond_146
    iget-object v2, v11, Lax/P1/a$a;->b:[I

    .line 328
    .line 329
    iget v3, v7, Lax/P1/a$f;->j:I

    .line 330
    .line 331
    aget v2, v2, v3

    .line 332
    .line 333
    :goto_14c
    iget-object v3, v0, Lax/P1/a;->b:Landroid/graphics/Paint;

    .line 334
    .line 335
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 336
    .line 337
    .line 338
    iget-object v9, v0, Lax/P1/a;->c:Landroid/graphics/Canvas;

    .line 339
    .line 340
    int-to-float v10, v8

    .line 341
    int-to-float v11, v5

    .line 342
    iget v2, v7, Lax/P1/a$f;->c:I

    .line 343
    .line 344
    add-int/2addr v2, v8

    .line 345
    int-to-float v12, v2

    .line 346
    iget v2, v7, Lax/P1/a$f;->d:I

    .line 347
    .line 348
    add-int/2addr v2, v5

    .line 349
    int-to-float v13, v2

    .line 350
    iget-object v14, v0, Lax/P1/a;->b:Landroid/graphics/Paint;

    .line 351
    .line 352
    invoke-virtual/range {v9 .. v14}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 353
    .line 354
    .line 355
    :cond_162
    new-instance v2, Lax/R0/a$b;

    .line 356
    .line 357
    invoke-direct {v2}, Lax/R0/a$b;-><init>()V

    .line 358
    .line 359
    .line 360
    iget-object v3, v0, Lax/P1/a;->g:Landroid/graphics/Bitmap;

    .line 361
    .line 362
    iget v9, v7, Lax/P1/a$f;->c:I

    .line 363
    .line 364
    iget v10, v7, Lax/P1/a$f;->d:I

    .line 365
    .line 366
    invoke-static {v3, v8, v5, v9, v10}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    invoke-virtual {v2, v3}, Lax/R0/a$b;->f(Landroid/graphics/Bitmap;)Lax/R0/a$b;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    int-to-float v3, v8

    .line 375
    iget v8, v1, Lax/P1/a$b;->a:I

    .line 376
    .line 377
    int-to-float v8, v8

    .line 378
    div-float/2addr v3, v8

    .line 379
    invoke-virtual {v2, v3}, Lax/R0/a$b;->k(F)Lax/R0/a$b;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    const/4 v3, 0x0

    .line 384
    invoke-virtual {v2, v3}, Lax/R0/a$b;->l(I)Lax/R0/a$b;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    int-to-float v5, v5

    .line 389
    iget v8, v1, Lax/P1/a$b;->b:I

    .line 390
    .line 391
    int-to-float v8, v8

    .line 392
    div-float/2addr v5, v8

    .line 393
    invoke-virtual {v2, v5, v3}, Lax/R0/a$b;->h(FI)Lax/R0/a$b;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    invoke-virtual {v2, v3}, Lax/R0/a$b;->i(I)Lax/R0/a$b;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    iget v3, v7, Lax/P1/a$f;->c:I

    .line 402
    .line 403
    int-to-float v3, v3

    .line 404
    iget v5, v1, Lax/P1/a$b;->a:I

    .line 405
    .line 406
    int-to-float v5, v5

    .line 407
    div-float/2addr v3, v5

    .line 408
    invoke-virtual {v2, v3}, Lax/R0/a$b;->n(F)Lax/R0/a$b;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    iget v3, v7, Lax/P1/a$f;->d:I

    .line 413
    .line 414
    int-to-float v3, v3

    .line 415
    iget v5, v1, Lax/P1/a$b;->b:I

    .line 416
    .line 417
    int-to-float v5, v5

    .line 418
    div-float/2addr v3, v5

    .line 419
    invoke-virtual {v2, v3}, Lax/R0/a$b;->g(F)Lax/R0/a$b;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-virtual {v2}, Lax/R0/a$b;->a()Lax/R0/a;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    iget-object v2, v0, Lax/P1/a;->c:Landroid/graphics/Canvas;

    .line 431
    .line 432
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 433
    .line 434
    const/4 v5, 0x0

    .line 435
    invoke-virtual {v2, v5, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 436
    .line 437
    .line 438
    iget-object v2, v0, Lax/P1/a;->c:Landroid/graphics/Canvas;

    .line 439
    .line 440
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 441
    .line 442
    .line 443
    add-int/lit8 v4, v4, 0x1

    .line 444
    .line 445
    move-object/from16 v2, v17

    .line 446
    .line 447
    goto/16 :goto_74

    .line 448
    .line 449
    :cond_1c0
    new-instance v5, Lax/N1/e;

    .line 450
    .line 451
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    invoke-direct/range {v5 .. v10}, Lax/N1/e;-><init>(Ljava/util/List;JJ)V

    .line 462
    .line 463
    .line 464
    return-object v5
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
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method private static p(Lax/S0/F;I)Lax/P1/a$a;
    .registers 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v0, v1}, Lax/S0/F;->r(I)V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    add-int/lit8 v4, p1, -0x2

    .line 14
    .line 15
    invoke-static {}, Lax/P1/a;->f()[I

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-static {}, Lax/P1/a;->g()[I

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-static {}, Lax/P1/a;->h()[I

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    :goto_1a
    if-lez v4, :cond_c4

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    and-int/lit16 v10, v9, 0x80

    .line 38
    .line 39
    if-eqz v10, :cond_2a

    .line 40
    .line 41
    move-object v10, v5

    .line 42
    goto :goto_31

    .line 43
    :cond_2a
    and-int/lit8 v10, v9, 0x40

    .line 44
    .line 45
    if-eqz v10, :cond_30

    .line 46
    .line 47
    move-object v10, v6

    .line 48
    goto :goto_31

    .line 49
    :cond_30
    move-object v10, v7

    .line 50
    :goto_31
    and-int/lit8 v9, v9, 0x1

    .line 51
    .line 52
    if-eqz v9, :cond_48

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 67
    .line 68
    .line 69
    move-result v13

    .line 70
    add-int/lit8 v4, v4, -0x6

    .line 71
    .line 72
    goto :goto_68

    .line 73
    :cond_48
    const/4 v9, 0x6

    .line 74
    invoke-virtual {v0, v9}, Lax/S0/F;->h(I)I

    .line 75
    .line 76
    .line 77
    move-result v11

    .line 78
    shl-int/2addr v11, v3

    .line 79
    const/4 v12, 0x4

    .line 80
    invoke-virtual {v0, v12}, Lax/S0/F;->h(I)I

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    shl-int/2addr v13, v12

    .line 85
    invoke-virtual {v0, v12}, Lax/S0/F;->h(I)I

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    shl-int/lit8 v12, v14, 0x4

    .line 90
    .line 91
    invoke-virtual {v0, v3}, Lax/S0/F;->h(I)I

    .line 92
    .line 93
    .line 94
    move-result v14

    .line 95
    shl-int/lit8 v9, v14, 0x6

    .line 96
    .line 97
    add-int/lit8 v4, v4, -0x4

    .line 98
    .line 99
    move/from16 v23, v13

    .line 100
    .line 101
    move v13, v9

    .line 102
    move v9, v11

    .line 103
    move/from16 v11, v23

    .line 104
    .line 105
    :goto_68
    const/16 v15, 0xff

    .line 106
    .line 107
    if-nez v9, :cond_70

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    const/16 v13, 0xff

    .line 112
    .line 113
    :cond_70
    and-int/2addr v13, v15

    .line 114
    rsub-int v13, v13, 0xff

    .line 115
    .line 116
    int-to-byte v13, v13

    .line 117
    move/from16 p1, v4

    .line 118
    .line 119
    int-to-double v3, v9

    .line 120
    add-int/lit8 v11, v11, -0x80

    .line 121
    .line 122
    move/from16 v16, v2

    .line 123
    .line 124
    int-to-double v1, v11

    .line 125
    const-wide v17, 0x3ff66e978d4fdf3bL    # 1.402

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    mul-double v17, v17, v1

    .line 131
    .line 132
    move-object v11, v10

    .line 133
    add-double v9, v3, v17

    .line 134
    .line 135
    double-to-int v9, v9

    .line 136
    add-int/lit8 v12, v12, -0x80

    .line 137
    .line 138
    int-to-double v14, v12

    .line 139
    const-wide v19, 0x3fd60663c74fb54aL    # 0.34414

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    mul-double v19, v19, v14

    .line 145
    .line 146
    sub-double v19, v3, v19

    .line 147
    .line 148
    const-wide v21, 0x3fe6da3c21187e7cL    # 0.71414

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    mul-double v1, v1, v21

    .line 154
    .line 155
    sub-double v1, v19, v1

    .line 156
    .line 157
    double-to-int v1, v1

    .line 158
    const-wide v19, 0x3ffc5a1cac083127L    # 1.772

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    mul-double v14, v14, v19

    .line 164
    .line 165
    add-double/2addr v3, v14

    .line 166
    double-to-int v2, v3

    .line 167
    const/16 v3, 0xff

    .line 168
    .line 169
    const/4 v10, 0x0

    .line 170
    invoke-static {v9, v10, v3}, Lax/S0/d0;->p(III)I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    invoke-static {v1, v10, v3}, Lax/S0/d0;->p(III)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    invoke-static {v2, v10, v3}, Lax/S0/d0;->p(III)I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    invoke-static {v13, v4, v1, v2}, Lax/P1/a;->i(IIII)I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    aput v1, v11, v8

    .line 187
    .line 188
    move/from16 v4, p1

    .line 189
    .line 190
    move/from16 v2, v16

    .line 191
    .line 192
    const/16 v1, 0x8

    .line 193
    .line 194
    const/4 v3, 0x2

    .line 195
    goto/16 :goto_1a

    .line 196
    .line 197
    :cond_c4
    move/from16 v16, v2

    .line 198
    .line 199
    new-instance v0, Lax/P1/a$a;

    .line 200
    .line 201
    move/from16 v1, v16

    .line 202
    .line 203
    invoke-direct {v0, v1, v5, v6, v7}, Lax/P1/a$a;-><init>(I[I[I[I)V

    .line 204
    .line 205
    .line 206
    return-object v0
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
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

.method private static q(Lax/S0/F;)Lax/P1/a$b;
    .registers 10

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lax/S0/F;->r(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lax/S0/F;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-virtual {p0, v1}, Lax/S0/F;->r(I)V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x10

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v0, :cond_2d

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    move v8, p0

    .line 42
    move v6, v2

    .line 43
    move v7, v5

    .line 44
    move v5, v0

    .line 45
    goto :goto_32

    .line 46
    :cond_2d
    const/4 v0, 0x0

    .line 47
    move v6, v3

    .line 48
    move v8, v4

    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    :goto_32
    new-instance v2, Lax/P1/a$b;

    .line 52
    .line 53
    invoke-direct/range {v2 .. v8}, Lax/P1/a$b;-><init>(IIIIII)V

    .line 54
    .line 55
    .line 56
    return-object v2
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static r(Lax/S0/F;)Lax/P1/a$c;
    .registers 7

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/F;->h(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x4

    .line 8
    invoke-virtual {p0, v2}, Lax/S0/F;->r(I)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-virtual {p0, v2}, Lax/S0/F;->h(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p0}, Lax/S0/F;->g()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-virtual {p0, v4}, Lax/S0/F;->r(I)V

    .line 22
    .line 23
    .line 24
    sget-object v5, Lax/S0/d0;->f:[B

    .line 25
    .line 26
    if-ne v2, v4, :cond_27

    .line 27
    .line 28
    const/16 v2, 0x8

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Lax/S0/F;->h(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    mul-int/lit8 v2, v2, 0x10

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lax/S0/F;->r(I)V

    .line 37
    .line 38
    .line 39
    goto :goto_41

    .line 40
    :cond_27
    if-nez v2, :cond_41

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lax/S0/F;->h(I)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p0, v0}, Lax/S0/F;->h(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v4, 0x0

    .line 51
    if-lez v2, :cond_39

    .line 52
    .line 53
    new-array v5, v2, [B

    .line 54
    .line 55
    invoke-virtual {p0, v5, v4, v2}, Lax/S0/F;->k([BII)V

    .line 56
    .line 57
    .line 58
    :cond_39
    if-lez v0, :cond_41

    .line 59
    .line 60
    new-array v2, v0, [B

    .line 61
    .line 62
    invoke-virtual {p0, v2, v4, v0}, Lax/S0/F;->k([BII)V

    .line 63
    .line 64
    .line 65
    goto :goto_42

    .line 66
    :cond_41
    :goto_41
    move-object v2, v5

    .line 67
    :goto_42
    new-instance p0, Lax/P1/a$c;

    .line 68
    .line 69
    invoke-direct {p0, v1, v3, v5, v2}, Lax/P1/a$c;-><init>(IZ[B[B)V

    .line 70
    .line 71
    .line 72
    return-object p0
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private static s(Lax/S0/F;I)Lax/P1/a$d;
    .registers 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/F;->h(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x4

    .line 8
    invoke-virtual {p0, v2}, Lax/S0/F;->h(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-virtual {p0, v3}, Lax/S0/F;->h(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-virtual {p0, v3}, Lax/S0/F;->r(I)V

    .line 18
    .line 19
    .line 20
    sub-int/2addr p1, v3

    .line 21
    new-instance v3, Landroid/util/SparseArray;

    .line 22
    .line 23
    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    .line 24
    .line 25
    .line 26
    :goto_19
    if-lez p1, :cond_37

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lax/S0/F;->h(I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-virtual {p0, v0}, Lax/S0/F;->r(I)V

    .line 33
    .line 34
    .line 35
    const/16 v6, 0x10

    .line 36
    .line 37
    invoke-virtual {p0, v6}, Lax/S0/F;->h(I)I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-virtual {p0, v6}, Lax/S0/F;->h(I)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    add-int/lit8 p1, p1, -0x6

    .line 46
    .line 47
    new-instance v8, Lax/P1/a$e;

    .line 48
    .line 49
    invoke-direct {v8, v7, v6}, Lax/P1/a$e;-><init>(II)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v5, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_19

    .line 56
    :cond_37
    new-instance p0, Lax/P1/a$d;

    .line 57
    .line 58
    invoke-direct {p0, v1, v2, v4, v3}, Lax/P1/a$d;-><init>(IIILandroid/util/SparseArray;)V

    .line 59
    .line 60
    .line 61
    return-object p0
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method private static t(Lax/S0/F;I)Lax/P1/a$f;
    .registers 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const/4 v2, 0x4

    .line 10
    invoke-virtual {v0, v2}, Lax/S0/F;->r(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lax/S0/F;->g()Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/4 v5, 0x3

    .line 18
    invoke-virtual {v0, v5}, Lax/S0/F;->r(I)V

    .line 19
    .line 20
    .line 21
    const/16 v6, 0x10

    .line 22
    .line 23
    invoke-virtual {v0, v6}, Lax/S0/F;->h(I)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    invoke-virtual {v0, v6}, Lax/S0/F;->h(I)I

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    move v9, v7

    .line 32
    invoke-virtual {v0, v5}, Lax/S0/F;->h(I)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    invoke-virtual {v0, v5}, Lax/S0/F;->h(I)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    const/4 v10, 0x2

    .line 41
    invoke-virtual {v0, v10}, Lax/S0/F;->r(I)V

    .line 42
    .line 43
    .line 44
    move v11, v8

    .line 45
    move v8, v5

    .line 46
    move v5, v9

    .line 47
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    invoke-virtual {v0, v1}, Lax/S0/F;->h(I)I

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    move v13, v11

    .line 56
    invoke-virtual {v0, v2}, Lax/S0/F;->h(I)I

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    move v14, v12

    .line 61
    invoke-virtual {v0, v10}, Lax/S0/F;->h(I)I

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    invoke-virtual {v0, v10}, Lax/S0/F;->r(I)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v15, p1, -0xa

    .line 69
    .line 70
    move/from16 v16, v13

    .line 71
    .line 72
    new-instance v13, Landroid/util/SparseArray;

    .line 73
    .line 74
    invoke-direct {v13}, Landroid/util/SparseArray;-><init>()V

    .line 75
    .line 76
    .line 77
    :goto_4c
    if-lez v15, :cond_9e

    .line 78
    .line 79
    invoke-virtual {v0, v6}, Lax/S0/F;->h(I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {v0, v10}, Lax/S0/F;->h(I)I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    invoke-virtual {v0, v10}, Lax/S0/F;->h(I)I

    .line 88
    .line 89
    .line 90
    move-result v20

    .line 91
    const/16 v10, 0xc

    .line 92
    .line 93
    invoke-virtual {v0, v10}, Lax/S0/F;->h(I)I

    .line 94
    .line 95
    .line 96
    move-result v21

    .line 97
    invoke-virtual {v0, v2}, Lax/S0/F;->r(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v10}, Lax/S0/F;->h(I)I

    .line 101
    .line 102
    .line 103
    move-result v22

    .line 104
    add-int/lit8 v10, v15, -0x6

    .line 105
    .line 106
    const/4 v2, 0x1

    .line 107
    if-eq v6, v2, :cond_7b

    .line 108
    .line 109
    const/4 v2, 0x2

    .line 110
    if-ne v6, v2, :cond_72

    .line 111
    .line 112
    :goto_6f
    const/16 v10, 0x8

    .line 113
    .line 114
    goto :goto_7d

    .line 115
    :cond_72
    const/4 v15, 0x0

    .line 116
    move v15, v10

    .line 117
    const/16 v10, 0x8

    .line 118
    .line 119
    const/16 v23, 0x0

    .line 120
    .line 121
    const/16 v24, 0x0

    .line 122
    .line 123
    goto :goto_8b

    .line 124
    :cond_7b
    const/4 v2, 0x2

    .line 125
    goto :goto_6f

    .line 126
    :goto_7d
    invoke-virtual {v0, v10}, Lax/S0/F;->h(I)I

    .line 127
    .line 128
    .line 129
    move-result v17

    .line 130
    invoke-virtual {v0, v10}, Lax/S0/F;->h(I)I

    .line 131
    .line 132
    .line 133
    move-result v18

    .line 134
    add-int/lit8 v15, v15, -0x8

    .line 135
    .line 136
    move/from16 v23, v17

    .line 137
    .line 138
    move/from16 v24, v18

    .line 139
    .line 140
    :goto_8b
    new-instance v18, Lax/P1/a$g;

    .line 141
    .line 142
    move/from16 v19, v6

    .line 143
    .line 144
    invoke-direct/range {v18 .. v24}, Lax/P1/a$g;-><init>(IIIIII)V

    .line 145
    .line 146
    .line 147
    move-object/from16 v6, v18

    .line 148
    .line 149
    invoke-virtual {v13, v1, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    const/16 v1, 0x8

    .line 153
    .line 154
    const/4 v2, 0x4

    .line 155
    const/16 v6, 0x10

    .line 156
    .line 157
    const/4 v10, 0x2

    .line 158
    goto :goto_4c

    .line 159
    :cond_9e
    new-instance v2, Lax/P1/a$f;

    .line 160
    .line 161
    move v10, v14

    .line 162
    move/from16 v6, v16

    .line 163
    .line 164
    invoke-direct/range {v2 .. v13}, Lax/P1/a$f;-><init>(IZIIIIIIIILandroid/util/SparseArray;)V

    .line 165
    .line 166
    .line 167
    return-object v2
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
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

.method private static u(Lax/S0/F;Lax/P1/a$h;)V
    .registers 8

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/S0/F;->h(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0, v1}, Lax/S0/F;->h(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0}, Lax/S0/F;->d()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    add-int/2addr v3, v1

    .line 22
    mul-int/lit8 v4, v1, 0x8

    .line 23
    .line 24
    invoke-virtual {p0}, Lax/S0/F;->b()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-le v4, v5, :cond_2c

    .line 29
    .line 30
    const-string p1, "DvbParser"

    .line 31
    .line 32
    const-string v0, "Data field length exceeds limit"

    .line 33
    .line 34
    invoke-static {p1, v0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lax/S0/F;->b()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p0, p1}, Lax/S0/F;->r(I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2c
    packed-switch v0, :pswitch_data_da

    .line 46
    .line 47
    .line 48
    goto/16 :goto_d0

    .line 49
    .line 50
    :pswitch_31
    iget v0, p1, Lax/P1/a$h;->a:I

    .line 51
    .line 52
    if-ne v2, v0, :cond_d0

    .line 53
    .line 54
    invoke-static {p0}, Lax/P1/a;->q(Lax/S0/F;)Lax/P1/a$b;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p1, Lax/P1/a$h;->h:Lax/P1/a$b;

    .line 59
    .line 60
    goto/16 :goto_d0

    .line 61
    .line 62
    :pswitch_3d
    iget v0, p1, Lax/P1/a$h;->a:I

    .line 63
    .line 64
    if-ne v2, v0, :cond_4e

    .line 65
    .line 66
    invoke-static {p0}, Lax/P1/a;->r(Lax/S0/F;)Lax/P1/a$c;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object p1, p1, Lax/P1/a$h;->e:Landroid/util/SparseArray;

    .line 71
    .line 72
    iget v1, v0, Lax/P1/a$c;->a:I

    .line 73
    .line 74
    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_d0

    .line 78
    .line 79
    :cond_4e
    iget v0, p1, Lax/P1/a$h;->b:I

    .line 80
    .line 81
    if-ne v2, v0, :cond_d0

    .line 82
    .line 83
    invoke-static {p0}, Lax/P1/a;->r(Lax/S0/F;)Lax/P1/a$c;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object p1, p1, Lax/P1/a$h;->g:Landroid/util/SparseArray;

    .line 88
    .line 89
    iget v1, v0, Lax/P1/a$c;->a:I

    .line 90
    .line 91
    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_d0

    .line 95
    .line 96
    :pswitch_5f
    iget v0, p1, Lax/P1/a$h;->a:I

    .line 97
    .line 98
    if-ne v2, v0, :cond_6f

    .line 99
    .line 100
    invoke-static {p0, v1}, Lax/P1/a;->p(Lax/S0/F;I)Lax/P1/a$a;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object p1, p1, Lax/P1/a$h;->d:Landroid/util/SparseArray;

    .line 105
    .line 106
    iget v1, v0, Lax/P1/a$a;->a:I

    .line 107
    .line 108
    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_d0

    .line 112
    :cond_6f
    iget v0, p1, Lax/P1/a$h;->b:I

    .line 113
    .line 114
    if-ne v2, v0, :cond_d0

    .line 115
    .line 116
    invoke-static {p0, v1}, Lax/P1/a;->p(Lax/S0/F;I)Lax/P1/a$a;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object p1, p1, Lax/P1/a$h;->f:Landroid/util/SparseArray;

    .line 121
    .line 122
    iget v1, v0, Lax/P1/a$a;->a:I

    .line 123
    .line 124
    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_d0

    .line 128
    :pswitch_7f
    iget-object v0, p1, Lax/P1/a$h;->i:Lax/P1/a$d;

    .line 129
    .line 130
    iget v4, p1, Lax/P1/a$h;->a:I

    .line 131
    .line 132
    if-ne v2, v4, :cond_d0

    .line 133
    .line 134
    if-eqz v0, :cond_d0

    .line 135
    .line 136
    invoke-static {p0, v1}, Lax/P1/a;->t(Lax/S0/F;I)Lax/P1/a$f;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iget v0, v0, Lax/P1/a$d;->c:I

    .line 141
    .line 142
    if-nez v0, :cond_9e

    .line 143
    .line 144
    iget-object v0, p1, Lax/P1/a$h;->c:Landroid/util/SparseArray;

    .line 145
    .line 146
    iget v2, v1, Lax/P1/a$f;->a:I

    .line 147
    .line 148
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Lax/P1/a$f;

    .line 153
    .line 154
    if-eqz v0, :cond_9e

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Lax/P1/a$f;->a(Lax/P1/a$f;)V

    .line 157
    .line 158
    .line 159
    :cond_9e
    iget-object p1, p1, Lax/P1/a$h;->c:Landroid/util/SparseArray;

    .line 160
    .line 161
    iget v0, v1, Lax/P1/a$f;->a:I

    .line 162
    .line 163
    invoke-virtual {p1, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto :goto_d0

    .line 167
    :pswitch_a6
    iget v0, p1, Lax/P1/a$h;->a:I

    .line 168
    .line 169
    if-ne v2, v0, :cond_d0

    .line 170
    .line 171
    iget-object v0, p1, Lax/P1/a$h;->i:Lax/P1/a$d;

    .line 172
    .line 173
    invoke-static {p0, v1}, Lax/P1/a;->s(Lax/S0/F;I)Lax/P1/a$d;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    iget v2, v1, Lax/P1/a$d;->c:I

    .line 178
    .line 179
    if-eqz v2, :cond_c6

    .line 180
    .line 181
    iput-object v1, p1, Lax/P1/a$h;->i:Lax/P1/a$d;

    .line 182
    .line 183
    iget-object v0, p1, Lax/P1/a$h;->c:Landroid/util/SparseArray;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 186
    .line 187
    .line 188
    iget-object v0, p1, Lax/P1/a$h;->d:Landroid/util/SparseArray;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 191
    .line 192
    .line 193
    iget-object p1, p1, Lax/P1/a$h;->e:Landroid/util/SparseArray;

    .line 194
    .line 195
    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 196
    .line 197
    .line 198
    goto :goto_d0

    .line 199
    :cond_c6
    if-eqz v0, :cond_d0

    .line 200
    .line 201
    iget v0, v0, Lax/P1/a$d;->b:I

    .line 202
    .line 203
    iget v2, v1, Lax/P1/a$d;->b:I

    .line 204
    .line 205
    if-eq v0, v2, :cond_d0

    .line 206
    .line 207
    iput-object v1, p1, Lax/P1/a$h;->i:Lax/P1/a$d;

    .line 208
    .line 209
    :cond_d0
    :goto_d0
    invoke-virtual {p0}, Lax/S0/F;->d()I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    sub-int/2addr v3, p1

    .line 214
    invoke-virtual {p0, v3}, Lax/S0/F;->s(I)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    nop

    .line 219
    :pswitch_data_da
    .packed-switch 0x10
        :pswitch_a6
        :pswitch_7f
        :pswitch_5f
        :pswitch_3d
        :pswitch_31
    .end packed-switch
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
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


# virtual methods
.method public a()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P1/a;->f:Lax/P1/a$h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/P1/a$h;->a()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public synthetic b([BII)Lax/N1/k;
    .registers 4

    .line 1
    invoke-static {p0, p1, p2, p3}, Lax/N1/s;->a(Lax/N1/t;[BII)Lax/N1/k;

    move-result-object p1

    return-object p1
.end method

.method public c([BIILax/N1/t$b;Lax/S0/l;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lax/N1/t$b;",
            "Lax/S0/l<",
            "Lax/N1/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p4, Lax/S0/F;

    .line 2
    .line 3
    add-int/2addr p3, p2

    .line 4
    invoke-direct {p4, p1, p3}, Lax/S0/F;-><init>([BI)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p2}, Lax/S0/F;->p(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p4}, Lax/P1/a;->o(Lax/S0/F;)Lax/N1/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p5, p1}, Lax/S0/l;->accept(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method public d()I
    .registers 2

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
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
