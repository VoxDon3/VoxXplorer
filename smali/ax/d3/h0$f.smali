.class Lax/d3/h0$f;
.super Lax/i2/I$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/h0;->L1(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/h0;


# direct methods
.method constructor <init>(Lax/d3/h0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/h0$f;->a:Lax/d3/h0;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/i2/I$b;-><init>()V

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
    .line 22
.end method


# virtual methods
.method public b()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/h0$f;->a:Lax/d3/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_64

    .line 10
    :cond_9
    iget-object v0, p0, Lax/d3/h0$f;->a:Lax/d3/h0;

    .line 11
    .line 12
    invoke-static {v0}, Lax/d3/h0;->Q4(Lax/d3/h0;)Lax/x3/I;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lax/x3/I;->c()Lax/i2/I;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lax/i2/I;->j()Lax/i2/D;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lax/i2/D;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-lez v0, :cond_65

    .line 29
    .line 30
    iget-object v1, p0, Lax/d3/h0$f;->a:Lax/d3/h0;

    .line 31
    .line 32
    invoke-virtual {v1}, Lax/d3/n;->K3()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_38

    .line 37
    .line 38
    iget-object v1, p0, Lax/d3/h0$f;->a:Lax/d3/h0;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lax/n/c;

    .line 45
    .line 46
    iget-object v2, p0, Lax/d3/h0$f;->a:Lax/d3/h0;

    .line 47
    .line 48
    invoke-static {v2}, Lax/d3/h0;->T4(Lax/d3/h0;)Landroidx/appcompat/view/a$a;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Lax/n/c;->startSupportActionMode(Landroidx/appcompat/view/a$a;)Landroidx/appcompat/view/a;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    goto :goto_3e

    .line 57
    :cond_38
    iget-object v1, p0, Lax/d3/h0$f;->a:Lax/d3/h0;

    .line 58
    .line 59
    invoke-virtual {v1}, Lax/d3/n;->E3()Landroidx/appcompat/view/a;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_3e
    if-eqz v1, :cond_64

    .line 64
    .line 65
    new-instance v2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v0, "/"

    .line 74
    .line 75
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lax/d3/h0$f;->a:Lax/d3/h0;

    .line 79
    .line 80
    invoke-static {v0}, Lax/d3/h0;->U4(Lax/d3/h0;)Lax/x3/H;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lax/x3/H;->X()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v1, v0}, Landroidx/appcompat/view/a;->r(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Landroidx/appcompat/view/a;->k()V

    .line 99
    .line 100
    .line 101
    :cond_64
    :goto_64
    return-void

    .line 102
    :cond_65
    iget-object v0, p0, Lax/d3/h0$f;->a:Lax/d3/h0;

    .line 103
    .line 104
    invoke-virtual {v0}, Lax/d3/n;->h3()V

    .line 105
    .line 106
    .line 107
    return-void
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
