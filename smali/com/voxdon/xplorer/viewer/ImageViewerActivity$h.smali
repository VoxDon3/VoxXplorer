.class Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/x3/d$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->d0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

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
.method public a()V
    .registers 7

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->j()Lcom/android/ex/photo/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/voxdon/xplorer/viewer/b;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/voxdon/xplorer/viewer/b;->V0()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 14
    .line 15
    invoke-static {v2, v1}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->a0(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Landroid/net/Uri;)Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_1a

    .line 21
    .line 22
    invoke-static {v1}, Lax/c3/B;->H(Lcom/voxdon/xplorer/file/n;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    goto :goto_1b

    .line 27
    :cond_1a
    const/4 v3, 0x0

    .line 28
    :goto_1b
    iget-object v4, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 29
    .line 30
    iget-object v4, v4, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 31
    .line 32
    const v5, 0x7f0a02dc

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, v5, v3}, Lax/x3/d;->t(IZ)V

    .line 36
    .line 37
    .line 38
    const v4, 0x7f0a02da

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_4d

    .line 43
    .line 44
    invoke-static {v0, v1, v5}, Lcom/voxdon/xplorer/viewer/b;->W0(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Z)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_4d

    .line 49
    .line 50
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 51
    .line 52
    invoke-static {v1, v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->b0(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;Landroid/content/Intent;)Lcom/voxdon/xplorer/viewer/ImageViewerActivity$m;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_4d

    .line 57
    .line 58
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 59
    .line 60
    iget-object v1, v1, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 61
    .line 62
    iget-object v3, v0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$m;->a:Ljava/lang/CharSequence;

    .line 63
    .line 64
    invoke-virtual {v1, v4, v3}, Lax/x3/d;->s(ILjava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 68
    .line 69
    iget-object v1, v1, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$m;->b:Landroid/graphics/drawable/Drawable;

    .line 72
    .line 73
    invoke-virtual {v1, v4, v0}, Lax/x3/d;->q(ILandroid/graphics/drawable/Drawable;)V

    .line 74
    .line 75
    .line 76
    const/4 v0, 0x1

    .line 77
    goto :goto_4e

    .line 78
    :cond_4d
    const/4 v0, 0x0

    .line 79
    :goto_4e
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 80
    .line 81
    iget-object v1, v1, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 82
    .line 83
    invoke-virtual {v1, v4, v0}, Lax/x3/d;->t(IZ)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 87
    .line 88
    iget-object v0, v0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 89
    .line 90
    const v1, 0x7f0a02f3

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1, v5}, Lax/x3/d;->t(IZ)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 97
    .line 98
    iget-object v0, v0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->s:Lax/x3/d;

    .line 99
    .line 100
    const v1, 0x7f0a02cb

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Lax/x3/d;->t(IZ)V

    .line 104
    .line 105
    .line 106
    return-void
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

.method public b(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/ImageViewerActivity$h;->a:Lcom/voxdon/xplorer/viewer/ImageViewerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/ImageViewerActivity;->V(Lcom/voxdon/xplorer/viewer/ImageViewerActivity;)Lcom/android/ex/photo/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/android/ex/photo/f;->a(Z)V

    .line 8
    .line 9
    .line 10
    return-void
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
