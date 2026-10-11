.class Lax/d3/C0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/C0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/C0;


# direct methods
.method constructor <init>(Lax/d3/C0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public onGlobalLayout()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lax/d3/C0;->a(Lax/d3/C0;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 8
    .line 9
    invoke-static {v0}, Lax/d3/C0;->b(Lax/d3/C0;)Lax/n/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_13

    .line 18
    .line 19
    goto :goto_6a

    .line 20
    :cond_13
    iget-object v0, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 21
    .line 22
    invoke-static {v0}, Lax/d3/C0;->c(Lax/d3/C0;)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_24

    .line 35
    .line 36
    goto :goto_6a

    .line 37
    :cond_24
    iget-object v0, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 38
    .line 39
    invoke-static {v0}, Lax/d3/C0;->c(Lax/d3/C0;)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 51
    .line 52
    invoke-static {v0}, Lax/d3/C0;->d(Lax/d3/C0;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_44

    .line 57
    .line 58
    iget-object v0, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 59
    .line 60
    invoke-static {v0}, Lax/d3/C0;->e(Lax/d3/C0;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_42

    .line 65
    .line 66
    goto :goto_44

    .line 67
    :cond_42
    const/4 v0, 0x0

    .line 68
    goto :goto_5f

    .line 69
    :cond_44
    :goto_44
    iget-object v0, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 70
    .line 71
    invoke-static {v0}, Lax/d3/C0;->c(Lax/d3/C0;)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v3, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 76
    .line 77
    invoke-static {v3}, Lax/d3/C0;->g(Lax/d3/C0;)Landroid/content/res/Configuration;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-static {v0, v2, v3}, Lax/d3/C0;->i(Lax/d3/C0;Landroid/view/View;Landroid/content/res/Configuration;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-object v2, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 86
    .line 87
    invoke-static {v2, v1}, Lax/d3/C0;->f(Lax/d3/C0;Z)Z

    .line 88
    .line 89
    .line 90
    iget-object v2, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-static {v2, v3}, Lax/d3/C0;->h(Lax/d3/C0;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;

    .line 94
    .line 95
    .line 96
    :goto_5f
    if-nez v0, :cond_6b

    .line 97
    .line 98
    iget-object v0, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 99
    .line 100
    invoke-static {v0}, Lax/d3/C0;->j(Lax/d3/C0;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6a

    .line 105
    .line 106
    goto :goto_6b

    .line 107
    :cond_6a
    :goto_6a
    return-void

    .line 108
    :cond_6b
    :goto_6b
    iget-object v0, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 109
    .line 110
    invoke-static {v0}, Lax/d3/C0;->l(Lax/d3/C0;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lax/d3/C0$a;->a:Lax/d3/C0;

    .line 114
    .line 115
    invoke-static {v0, v1}, Lax/d3/C0;->k(Lax/d3/C0;Z)Z

    .line 116
    .line 117
    .line 118
    return-void
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
