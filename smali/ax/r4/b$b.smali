.class public final Lax/r4/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/r4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/r4/b$b$a;
    }
.end annotation


# static fields
.field public static final n:Lax/r4/b$b$a;


# instance fields
.field private a:Lax/p4/k;

.field private b:Landroid/content/Intent;

.field private c:Lax/p4/l;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/String;

.field private j:Lax/p4/z;

.field private k:Lax/p4/m;

.field private l:Ljava/lang/String;

.field private m:Lax/p4/q;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/r4/b$b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lax/r4/b$b$a;-><init>(Lax/Gb/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/r4/b$b;->n:Lax/r4/b$b$a;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>()V
    .registers 17

    const/16 v14, 0x1fff

    const/4 v15, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    .line 1
    invoke-direct/range {v0 .. v15}, Lax/r4/b$b;-><init>(Lax/p4/k;Landroid/content/Intent;Lax/p4/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lax/p4/z;Lax/p4/m;Ljava/lang/String;Lax/p4/q;ILax/Gb/g;)V

    return-void
.end method

.method public constructor <init>(Lax/p4/k;Landroid/content/Intent;Lax/p4/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lax/p4/z;Lax/p4/m;Ljava/lang/String;Lax/p4/q;)V
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/p4/k;",
            "Landroid/content/Intent;",
            "Lax/p4/l;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lax/p4/z;",
            "Lax/p4/m;",
            "Ljava/lang/String;",
            "Lax/p4/q;",
            ")V"
        }
    .end annotation

    const-string v0, "mPKCEManager"

    invoke-static {p3, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAlreadyAuthedUids"

    invoke-static {p8, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/r4/b$b;->a:Lax/p4/k;

    .line 4
    iput-object p2, p0, Lax/r4/b$b;->b:Landroid/content/Intent;

    .line 5
    iput-object p3, p0, Lax/r4/b$b;->c:Lax/p4/l;

    .line 6
    iput-object p4, p0, Lax/r4/b$b;->d:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lax/r4/b$b;->e:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lax/r4/b$b;->f:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lax/r4/b$b;->g:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lax/r4/b$b;->h:Ljava/util/List;

    .line 11
    iput-object p9, p0, Lax/r4/b$b;->i:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lax/r4/b$b;->j:Lax/p4/z;

    .line 13
    iput-object p11, p0, Lax/r4/b$b;->k:Lax/p4/m;

    .line 14
    iput-object p12, p0, Lax/r4/b$b;->l:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lax/r4/b$b;->m:Lax/p4/q;

    return-void
.end method

.method public synthetic constructor <init>(Lax/p4/k;Landroid/content/Intent;Lax/p4/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lax/p4/z;Lax/p4/m;Ljava/lang/String;Lax/p4/q;ILax/Gb/g;)V
    .registers 29

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    move-object p1, v2

    :cond_8
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_e

    move-object v1, v2

    goto :goto_f

    :cond_e
    move-object v1, p2

    :goto_f
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_19

    .line 16
    new-instance v3, Lax/p4/l;

    invoke-direct {v3}, Lax/p4/l;-><init>()V

    goto :goto_1b

    :cond_19
    move-object/from16 v3, p3

    :goto_1b
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_21

    move-object v4, v2

    goto :goto_23

    :cond_21
    move-object/from16 v4, p4

    :goto_23
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_29

    move-object v5, v2

    goto :goto_2b

    :cond_29
    move-object/from16 v5, p5

    :goto_2b
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_31

    move-object v6, v2

    goto :goto_33

    :cond_31
    move-object/from16 v6, p6

    :goto_33
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_39

    move-object v7, v2

    goto :goto_3b

    :cond_39
    move-object/from16 v7, p7

    :goto_3b
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_44

    .line 17
    invoke-static {}, Lax/tb/o;->j()Ljava/util/List;

    move-result-object v8

    goto :goto_46

    :cond_44
    move-object/from16 v8, p8

    :goto_46
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_4c

    move-object v9, v2

    goto :goto_4e

    :cond_4c
    move-object/from16 v9, p9

    :goto_4e
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_54

    move-object v10, v2

    goto :goto_56

    :cond_54
    move-object/from16 v10, p10

    :goto_56
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_5c

    move-object v11, v2

    goto :goto_5e

    :cond_5c
    move-object/from16 v11, p11

    :goto_5e
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_64

    move-object v12, v2

    goto :goto_66

    :cond_64
    move-object/from16 v12, p12

    :goto_66
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_85

    move-object/from16 p14, v2

    :goto_6c
    move-object p2, p1

    move-object/from16 p3, v1

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object p1, p0

    goto :goto_88

    :cond_85
    move-object/from16 p14, p13

    goto :goto_6c

    .line 18
    :goto_88
    invoke-direct/range {p1 .. p14}, Lax/r4/b$b;-><init>(Lax/p4/k;Landroid/content/Intent;Lax/p4/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lax/p4/z;Lax/p4/m;Ljava/lang/String;Lax/p4/q;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
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

.method public final b()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method public final c()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method public final d()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method public final e()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    instance-of v1, p1, Lax/r4/b$b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    return v2

    .line 11
    :cond_a
    check-cast p1, Lax/r4/b$b;

    .line 12
    .line 13
    iget-object v1, p0, Lax/r4/b$b;->a:Lax/p4/k;

    .line 14
    .line 15
    iget-object v3, p1, Lax/r4/b$b;->a:Lax/p4/k;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_17

    .line 22
    .line 23
    return v2

    .line 24
    :cond_17
    iget-object v1, p0, Lax/r4/b$b;->b:Landroid/content/Intent;

    .line 25
    .line 26
    iget-object v3, p1, Lax/r4/b$b;->b:Landroid/content/Intent;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_22

    .line 33
    .line 34
    return v2

    .line 35
    :cond_22
    iget-object v1, p0, Lax/r4/b$b;->c:Lax/p4/l;

    .line 36
    .line 37
    iget-object v3, p1, Lax/r4/b$b;->c:Lax/p4/l;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_2d

    .line 44
    .line 45
    return v2

    .line 46
    :cond_2d
    iget-object v1, p0, Lax/r4/b$b;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lax/r4/b$b;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_38

    .line 55
    .line 56
    return v2

    .line 57
    :cond_38
    iget-object v1, p0, Lax/r4/b$b;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lax/r4/b$b;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_43

    .line 66
    .line 67
    return v2

    .line 68
    :cond_43
    iget-object v1, p0, Lax/r4/b$b;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lax/r4/b$b;->f:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_4e

    .line 77
    .line 78
    return v2

    .line 79
    :cond_4e
    iget-object v1, p0, Lax/r4/b$b;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lax/r4/b$b;->g:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_59

    .line 88
    .line 89
    return v2

    .line 90
    :cond_59
    iget-object v1, p0, Lax/r4/b$b;->h:Ljava/util/List;

    .line 91
    .line 92
    iget-object v3, p1, Lax/r4/b$b;->h:Ljava/util/List;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_64

    .line 99
    .line 100
    return v2

    .line 101
    :cond_64
    iget-object v1, p0, Lax/r4/b$b;->i:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v3, p1, Lax/r4/b$b;->i:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_6f

    .line 110
    .line 111
    return v2

    .line 112
    :cond_6f
    iget-object v1, p0, Lax/r4/b$b;->j:Lax/p4/z;

    .line 113
    .line 114
    iget-object v3, p1, Lax/r4/b$b;->j:Lax/p4/z;

    .line 115
    .line 116
    if-eq v1, v3, :cond_76

    .line 117
    .line 118
    return v2

    .line 119
    :cond_76
    iget-object v1, p0, Lax/r4/b$b;->k:Lax/p4/m;

    .line 120
    .line 121
    iget-object v3, p1, Lax/r4/b$b;->k:Lax/p4/m;

    .line 122
    .line 123
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_81

    .line 128
    .line 129
    return v2

    .line 130
    :cond_81
    iget-object v1, p0, Lax/r4/b$b;->l:Ljava/lang/String;

    .line 131
    .line 132
    iget-object v3, p1, Lax/r4/b$b;->l:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v1, v3}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_8c

    .line 139
    .line 140
    return v2

    .line 141
    :cond_8c
    iget-object v1, p0, Lax/r4/b$b;->m:Lax/p4/q;

    .line 142
    .line 143
    iget-object p1, p1, Lax/r4/b$b;->m:Lax/p4/q;

    .line 144
    .line 145
    if-eq v1, p1, :cond_93

    .line 146
    .line 147
    return v2

    .line 148
    :cond_93
    return v0
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
.end method

.method public final f()Lax/p4/k;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->a:Lax/p4/k;

    .line 2
    .line 3
    return-object v0
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

.method public final g()Lax/p4/q;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->m:Lax/p4/q;

    .line 2
    .line 3
    return-object v0
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

.method public final h()Lax/p4/l;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->c:Lax/p4/l;

    .line 2
    .line 3
    return-object v0
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

.method public hashCode()I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->a:Lax/p4/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_7

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    goto :goto_b

    .line 8
    :cond_7
    invoke-virtual {v0}, Lax/p4/k;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_b
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lax/r4/b$b;->b:Landroid/content/Intent;

    .line 15
    .line 16
    if-nez v2, :cond_13

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    goto :goto_17

    .line 20
    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_17
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, Lax/r4/b$b;->c:Lax/p4/l;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/2addr v0, v2

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-object v2, p0, Lax/r4/b$b;->d:Ljava/lang/String;

    .line 37
    .line 38
    if-nez v2, :cond_29

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    goto :goto_2d

    .line 42
    :cond_29
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    :goto_2d
    add-int/2addr v0, v2

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v2, p0, Lax/r4/b$b;->e:Ljava/lang/String;

    .line 50
    .line 51
    if-nez v2, :cond_36

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    goto :goto_3a

    .line 55
    :cond_36
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    :goto_3a
    add-int/2addr v0, v2

    .line 60
    mul-int/lit8 v0, v0, 0x1f

    .line 61
    .line 62
    iget-object v2, p0, Lax/r4/b$b;->f:Ljava/lang/String;

    .line 63
    .line 64
    if-nez v2, :cond_43

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    goto :goto_47

    .line 68
    :cond_43
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    :goto_47
    add-int/2addr v0, v2

    .line 73
    mul-int/lit8 v0, v0, 0x1f

    .line 74
    .line 75
    iget-object v2, p0, Lax/r4/b$b;->g:Ljava/lang/String;

    .line 76
    .line 77
    if-nez v2, :cond_50

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    goto :goto_54

    .line 81
    :cond_50
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    :goto_54
    add-int/2addr v0, v2

    .line 86
    mul-int/lit8 v0, v0, 0x1f

    .line 87
    .line 88
    iget-object v2, p0, Lax/r4/b$b;->h:Ljava/util/List;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    add-int/2addr v0, v2

    .line 95
    mul-int/lit8 v0, v0, 0x1f

    .line 96
    .line 97
    iget-object v2, p0, Lax/r4/b$b;->i:Ljava/lang/String;

    .line 98
    .line 99
    if-nez v2, :cond_66

    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    goto :goto_6a

    .line 103
    :cond_66
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    :goto_6a
    add-int/2addr v0, v2

    .line 108
    mul-int/lit8 v0, v0, 0x1f

    .line 109
    .line 110
    iget-object v2, p0, Lax/r4/b$b;->j:Lax/p4/z;

    .line 111
    .line 112
    if-nez v2, :cond_73

    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    goto :goto_77

    .line 116
    :cond_73
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    :goto_77
    add-int/2addr v0, v2

    .line 121
    mul-int/lit8 v0, v0, 0x1f

    .line 122
    .line 123
    iget-object v2, p0, Lax/r4/b$b;->k:Lax/p4/m;

    .line 124
    .line 125
    if-nez v2, :cond_80

    .line 126
    .line 127
    const/4 v2, 0x0

    .line 128
    goto :goto_84

    .line 129
    :cond_80
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    :goto_84
    add-int/2addr v0, v2

    .line 134
    mul-int/lit8 v0, v0, 0x1f

    .line 135
    .line 136
    iget-object v2, p0, Lax/r4/b$b;->l:Ljava/lang/String;

    .line 137
    .line 138
    if-nez v2, :cond_8d

    .line 139
    .line 140
    const/4 v2, 0x0

    .line 141
    goto :goto_91

    .line 142
    :cond_8d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    :goto_91
    add-int/2addr v0, v2

    .line 147
    mul-int/lit8 v0, v0, 0x1f

    .line 148
    .line 149
    iget-object v2, p0, Lax/r4/b$b;->m:Lax/p4/q;

    .line 150
    .line 151
    if-nez v2, :cond_99

    .line 152
    .line 153
    goto :goto_9d

    .line 154
    :cond_99
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    :goto_9d
    add-int/2addr v0, v1

    .line 159
    return v0
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

.method public final i()Lax/p4/m;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->k:Lax/p4/m;

    .line 2
    .line 3
    return-object v0
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

.method public final j()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method public final k()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method public final l()Lax/p4/z;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->j:Lax/p4/z;

    .line 2
    .line 3
    return-object v0
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

.method public final m(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/r4/b$b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public toString()Ljava/lang/String;
    .registers 16

    .line 1
    iget-object v0, p0, Lax/r4/b$b;->a:Lax/p4/k;

    .line 2
    .line 3
    iget-object v1, p0, Lax/r4/b$b;->b:Landroid/content/Intent;

    .line 4
    .line 5
    iget-object v2, p0, Lax/r4/b$b;->c:Lax/p4/l;

    .line 6
    .line 7
    iget-object v3, p0, Lax/r4/b$b;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lax/r4/b$b;->e:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lax/r4/b$b;->f:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lax/r4/b$b;->g:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lax/r4/b$b;->h:Ljava/util/List;

    .line 16
    .line 17
    iget-object v8, p0, Lax/r4/b$b;->i:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v9, p0, Lax/r4/b$b;->j:Lax/p4/z;

    .line 20
    .line 21
    iget-object v10, p0, Lax/r4/b$b;->k:Lax/p4/m;

    .line 22
    .line 23
    iget-object v11, p0, Lax/r4/b$b;->l:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v12, p0, Lax/r4/b$b;->m:Lax/p4/q;

    .line 26
    .line 27
    new-instance v13, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v14, "State(mHost="

    .line 33
    .line 34
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, ", result="

    .line 41
    .line 42
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, ", mPKCEManager="

    .line 49
    .line 50
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v0, ", mAuthStateNonce="

    .line 57
    .line 58
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, ", mAppKey="

    .line 65
    .line 66
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, ", mApiType="

    .line 73
    .line 74
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v0, ", mDesiredUid="

    .line 81
    .line 82
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, ", mAlreadyAuthedUids="

    .line 89
    .line 90
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v0, ", mSessionId="

    .line 97
    .line 98
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v0, ", mTokenAccessType="

    .line 105
    .line 106
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, ", mRequestConfig="

    .line 113
    .line 114
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v0, ", mScope="

    .line 121
    .line 122
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v0, ", mIncludeGrantedScopes="

    .line 129
    .line 130
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v0, ")"

    .line 137
    .line 138
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0
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
