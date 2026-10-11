.class final Lax/p2/d$d;
.super Lax/Gb/m;
.source "SourceFile"

# interfaces
.implements Lax/Fb/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/p2/d;-><init>(Landroid/content/Context;Ljava/lang/String;Lax/o2/h$a;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/Gb/m;",
        "Lax/Fb/a<",
        "Lax/p2/d$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic q:Lax/p2/d;


# direct methods
.method constructor <init>(Lax/p2/d;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lax/Gb/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
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


# virtual methods
.method public final a()Lax/p2/d$c;
    .registers 12

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_4d

    .line 7
    .line 8
    iget-object v0, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 9
    .line 10
    invoke-static {v0}, Lax/p2/d;->d(Lax/p2/d;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_4d

    .line 15
    .line 16
    iget-object v0, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 17
    .line 18
    invoke-static {v0}, Lax/p2/d;->e(Lax/p2/d;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_4d

    .line 23
    .line 24
    new-instance v0, Ljava/io/File;

    .line 25
    .line 26
    iget-object v1, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 27
    .line 28
    invoke-static {v1}, Lax/p2/d;->c(Lax/p2/d;)Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Lax/o2/d;->a(Landroid/content/Context;)Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v3, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 37
    .line 38
    invoke-static {v3}, Lax/p2/d;->d(Lax/p2/d;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v4, Lax/p2/d$c;

    .line 46
    .line 47
    iget-object v1, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 48
    .line 49
    invoke-static {v1}, Lax/p2/d;->c(Lax/p2/d;)Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    new-instance v7, Lax/p2/d$b;

    .line 58
    .line 59
    invoke-direct {v7, v2}, Lax/p2/d$b;-><init>(Lax/p2/c;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 63
    .line 64
    invoke-static {v0}, Lax/p2/d;->b(Lax/p2/d;)Lax/o2/h$a;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    iget-object v0, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 69
    .line 70
    invoke-static {v0}, Lax/p2/d;->a(Lax/p2/d;)Z

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    invoke-direct/range {v4 .. v9}, Lax/p2/d$c;-><init>(Landroid/content/Context;Ljava/lang/String;Lax/p2/d$b;Lax/o2/h$a;Z)V

    .line 75
    .line 76
    .line 77
    goto :goto_70

    .line 78
    :cond_4d
    new-instance v5, Lax/p2/d$c;

    .line 79
    .line 80
    iget-object v0, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 81
    .line 82
    invoke-static {v0}, Lax/p2/d;->c(Lax/p2/d;)Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    iget-object v0, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 87
    .line 88
    invoke-static {v0}, Lax/p2/d;->d(Lax/p2/d;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    new-instance v8, Lax/p2/d$b;

    .line 93
    .line 94
    invoke-direct {v8, v2}, Lax/p2/d$b;-><init>(Lax/p2/c;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 98
    .line 99
    invoke-static {v0}, Lax/p2/d;->b(Lax/p2/d;)Lax/o2/h$a;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    iget-object v0, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 104
    .line 105
    invoke-static {v0}, Lax/p2/d;->a(Lax/p2/d;)Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    invoke-direct/range {v5 .. v10}, Lax/p2/d$c;-><init>(Landroid/content/Context;Ljava/lang/String;Lax/p2/d$b;Lax/o2/h$a;Z)V

    .line 110
    .line 111
    .line 112
    move-object v4, v5

    .line 113
    :goto_70
    iget-object v0, p0, Lax/p2/d$d;->q:Lax/p2/d;

    .line 114
    .line 115
    invoke-static {v0}, Lax/p2/d;->f(Lax/p2/d;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-static {v4, v0}, Lax/o2/b;->d(Landroid/database/sqlite/SQLiteOpenHelper;Z)V

    .line 120
    .line 121
    .line 122
    return-object v4
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

.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/p2/d$d;->a()Lax/p2/d$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
