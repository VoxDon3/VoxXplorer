.class Lcom/voxdon/xplorer/widget/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/widget/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/voxdon/xplorer/widget/a$c;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/widget/a$c;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

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
.method public run()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->e(Lcom/voxdon/xplorer/widget/a$c;)Lax/c3/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lax/c3/z;->n0:Lax/c3/z;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-ne v0, v1, :cond_35

    .line 12
    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 14
    .line 15
    invoke-static {v0, v2}, Lcom/voxdon/xplorer/widget/a$c;->f(Lcom/voxdon/xplorer/widget/a$c;Z)Z

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 19
    .line 20
    const v1, 0x7f08020d

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/widget/a$c;->g(Lcom/voxdon/xplorer/widget/a$c;I)I

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->h(Lcom/voxdon/xplorer/widget/a$c;)Landroid/widget/ImageView;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 36
    .line 37
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->h(Lcom/voxdon/xplorer/widget/a$c;)Landroid/widget/ImageView;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->h(Lcom/voxdon/xplorer/widget/a$c;)Landroid/widget/ImageView;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 55
    .line 56
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->i(Lcom/voxdon/xplorer/widget/a$c;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "epub"

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_6c

    .line 67
    .line 68
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 69
    .line 70
    invoke-static {v0, v2}, Lcom/voxdon/xplorer/widget/a$c;->f(Lcom/voxdon/xplorer/widget/a$c;Z)Z

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 74
    .line 75
    const v1, 0x7f08020c

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/widget/a$c;->g(Lcom/voxdon/xplorer/widget/a$c;I)I

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 82
    .line 83
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->h(Lcom/voxdon/xplorer/widget/a$c;)Landroid/widget/ImageView;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 91
    .line 92
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->h(Lcom/voxdon/xplorer/widget/a$c;)Landroid/widget/ImageView;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 100
    .line 101
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->h(Lcom/voxdon/xplorer/widget/a$c;)Landroid/widget/ImageView;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_6c
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 110
    .line 111
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->e(Lcom/voxdon/xplorer/widget/a$c;)Lax/c3/z;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sget-object v1, Lax/c3/z;->e0:Lax/c3/z;

    .line 116
    .line 117
    if-eq v0, v1, :cond_cc

    .line 118
    .line 119
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 120
    .line 121
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->j(Lcom/voxdon/xplorer/widget/a$c;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-eqz v0, :cond_8d

    .line 126
    .line 127
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 128
    .line 129
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->j(Lcom/voxdon/xplorer/widget/a$c;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const-string v1, "video"

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_8d

    .line 140
    .line 141
    goto :goto_cc

    .line 142
    :cond_8d
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 143
    .line 144
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->e(Lcom/voxdon/xplorer/widget/a$c;)Lax/c3/z;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sget-object v1, Lax/c3/z;->f0:Lax/c3/z;

    .line 149
    .line 150
    if-ne v0, v1, :cond_cb

    .line 151
    .line 152
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 153
    .line 154
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->i(Lcom/voxdon/xplorer/widget/a$c;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0}, Lax/c3/A;->O(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_cb

    .line 163
    .line 164
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 165
    .line 166
    invoke-static {v0, v2}, Lcom/voxdon/xplorer/widget/a$c;->f(Lcom/voxdon/xplorer/widget/a$c;Z)Z

    .line 167
    .line 168
    .line 169
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 170
    .line 171
    const v1, 0x7f08020e

    .line 172
    .line 173
    .line 174
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/widget/a$c;->g(Lcom/voxdon/xplorer/widget/a$c;I)I

    .line 175
    .line 176
    .line 177
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 178
    .line 179
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->h(Lcom/voxdon/xplorer/widget/a$c;)Landroid/widget/ImageView;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 187
    .line 188
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->h(Lcom/voxdon/xplorer/widget/a$c;)Landroid/widget/ImageView;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 193
    .line 194
    .line 195
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 196
    .line 197
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->h(Lcom/voxdon/xplorer/widget/a$c;)Landroid/widget/ImageView;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 202
    .line 203
    .line 204
    :cond_cb
    return-void

    .line 205
    :cond_cc
    :goto_cc
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$a;->q:Lcom/voxdon/xplorer/widget/a$c;

    .line 206
    .line 207
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->k(Lcom/voxdon/xplorer/widget/a$c;)Landroid/widget/ImageView;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 212
    .line 213
    .line 214
    return-void
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method
