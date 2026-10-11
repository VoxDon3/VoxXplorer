.class Lax/c0/F0$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/c0/F0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# instance fields
.field private final a:Lax/c0/F0;

.field b:[Lax/T/b;


# direct methods
.method constructor <init>()V
    .registers 3

    .line 1
    new-instance v0, Lax/c0/F0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lax/c0/F0;-><init>(Lax/c0/F0;)V

    invoke-direct {p0, v0}, Lax/c0/F0$f;-><init>(Lax/c0/F0;)V

    return-void
.end method

.method constructor <init>(Lax/c0/F0;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/c0/F0$f;->a:Lax/c0/F0;

    return-void
.end method


# virtual methods
.method protected final a()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/c0/F0$f;->b:[Lax/T/b;

    .line 2
    .line 3
    if-eqz v0, :cond_58

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v1}, Lax/c0/F0$m;->d(I)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    aget-object v0, v0, v2

    .line 11
    .line 12
    iget-object v2, p0, Lax/c0/F0$f;->b:[Lax/T/b;

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    invoke-static {v3}, Lax/c0/F0$m;->d(I)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    aget-object v2, v2, v4

    .line 20
    .line 21
    if-nez v2, :cond_1c

    .line 22
    .line 23
    iget-object v2, p0, Lax/c0/F0$f;->a:Lax/c0/F0;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Lax/c0/F0;->f(I)Lax/T/b;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :cond_1c
    if-nez v0, :cond_24

    .line 30
    .line 31
    iget-object v0, p0, Lax/c0/F0$f;->a:Lax/c0/F0;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lax/c0/F0;->f(I)Lax/T/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_24
    invoke-static {v0, v2}, Lax/T/b;->a(Lax/T/b;Lax/T/b;)Lax/T/b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0, v0}, Lax/c0/F0$f;->g(Lax/T/b;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lax/c0/F0$f;->b:[Lax/T/b;

    .line 45
    .line 46
    const/16 v1, 0x10

    .line 47
    .line 48
    invoke-static {v1}, Lax/c0/F0$m;->d(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    aget-object v0, v0, v1

    .line 53
    .line 54
    if-eqz v0, :cond_3a

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lax/c0/F0$f;->f(Lax/T/b;)V

    .line 57
    .line 58
    .line 59
    :cond_3a
    iget-object v0, p0, Lax/c0/F0$f;->b:[Lax/T/b;

    .line 60
    .line 61
    const/16 v1, 0x20

    .line 62
    .line 63
    invoke-static {v1}, Lax/c0/F0$m;->d(I)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    aget-object v0, v0, v1

    .line 68
    .line 69
    if-eqz v0, :cond_49

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lax/c0/F0$f;->d(Lax/T/b;)V

    .line 72
    .line 73
    .line 74
    :cond_49
    iget-object v0, p0, Lax/c0/F0$f;->b:[Lax/T/b;

    .line 75
    .line 76
    const/16 v1, 0x40

    .line 77
    .line 78
    invoke-static {v1}, Lax/c0/F0$m;->d(I)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    aget-object v0, v0, v1

    .line 83
    .line 84
    if-eqz v0, :cond_58

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lax/c0/F0$f;->h(Lax/T/b;)V

    .line 87
    .line 88
    .line 89
    :cond_58
    return-void
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

.method b()Lax/c0/F0;
    .registers 1

    const/4 p0, 0x0

    throw p0
.end method

.method c(ILax/T/b;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/c0/F0$f;->b:[Lax/T/b;

    .line 2
    .line 3
    if-nez v0, :cond_a

    .line 4
    .line 5
    const/16 v0, 0x9

    .line 6
    .line 7
    new-array v0, v0, [Lax/T/b;

    .line 8
    .line 9
    iput-object v0, p0, Lax/c0/F0$f;->b:[Lax/T/b;

    .line 10
    .line 11
    :cond_a
    const/4 v0, 0x1

    .line 12
    :goto_b
    const/16 v1, 0x100

    .line 13
    .line 14
    if-gt v0, v1, :cond_1f

    .line 15
    .line 16
    and-int v1, p1, v0

    .line 17
    .line 18
    if-nez v1, :cond_14

    .line 19
    .line 20
    goto :goto_1c

    .line 21
    :cond_14
    iget-object v1, p0, Lax/c0/F0$f;->b:[Lax/T/b;

    .line 22
    .line 23
    invoke-static {v0}, Lax/c0/F0$m;->d(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    aput-object p2, v1, v2

    .line 28
    .line 29
    :goto_1c
    shl-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_b

    .line 32
    :cond_1f
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method d(Lax/T/b;)V
    .registers 2

    .line 1
    return-void
    .line 2
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
    .line 22
.end method

.method e(Lax/T/b;)V
    .registers 2

    const/4 p0, 0x0

    throw p0
.end method

.method f(Lax/T/b;)V
    .registers 2

    .line 1
    return-void
    .line 2
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
    .line 22
.end method

.method g(Lax/T/b;)V
    .registers 2

    const/4 p0, 0x0

    throw p0
.end method

.method h(Lax/T/b;)V
    .registers 2

    .line 1
    return-void
    .line 2
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
    .line 22
.end method
