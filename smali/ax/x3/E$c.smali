.class Lax/x3/E$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/x3/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lax/x3/E;


# direct methods
.method constructor <init>(Lax/x3/E;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/x3/E$c;->q:Lax/x3/E;

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
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 2
    .line 3
    invoke-static {v0}, Lax/x3/E;->k(Lax/x3/E;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq v0, v1, :cond_a

    .line 9
    .line 10
    return-void

    .line 11
    :cond_a
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 12
    .line 13
    invoke-static {v0}, Lax/x3/E;->l(Lax/x3/E;)Lcom/android/ex/photo/PhotoViewPager;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroidx/viewpager/widget/a;->e()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    if-nez v0, :cond_33

    .line 27
    .line 28
    invoke-static {}, Lax/u3/b;->f()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lax/x3/E;->m(Lax/x3/E;I)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 37
    .line 38
    invoke-static {v0}, Lax/x3/E;->n(Lax/x3/E;)Lax/x3/E$d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v1, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 43
    .line 44
    invoke-static {v1}, Lax/x3/E;->h(Lax/x3/E;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-interface {v0, v1}, Lax/x3/E$d;->a(Z)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    iget-object v2, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 53
    .line 54
    invoke-static {v2}, Lax/x3/E;->l(Lax/x3/E;)Lcom/android/ex/photo/PhotoViewPager;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/4 v3, 0x1

    .line 63
    add-int/2addr v2, v3

    .line 64
    rem-int/2addr v2, v0

    .line 65
    if-eqz v2, :cond_43

    .line 66
    .line 67
    goto :goto_44

    .line 68
    :cond_43
    const/4 v3, 0x0

    .line 69
    :goto_44
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 70
    .line 71
    invoke-static {v0}, Lax/x3/E;->o(Lax/x3/E;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eq v2, v0, :cond_6f

    .line 76
    .line 77
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 78
    .line 79
    invoke-static {v0}, Lax/x3/E;->l(Lax/x3/E;)Lcom/android/ex/photo/PhotoViewPager;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0, v2, v3}, Landroidx/viewpager/widget/ViewPager;->N(IZ)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 87
    .line 88
    invoke-static {v0}, Lax/x3/E;->d(Lax/x3/E;)Landroid/os/Handler;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 96
    .line 97
    invoke-static {v0}, Lax/x3/E;->d(Lax/x3/E;)Landroid/os/Handler;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget-object v1, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 102
    .line 103
    invoke-static {v1}, Lax/x3/E;->a(Lax/x3/E;)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    int-to-long v1, v1

    .line 108
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_6f
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 113
    .line 114
    invoke-static {v0}, Lax/x3/E;->f(Lax/x3/E;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_9a

    .line 119
    .line 120
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 121
    .line 122
    invoke-static {v0}, Lax/x3/E;->l(Lax/x3/E;)Lcom/android/ex/photo/PhotoViewPager;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0, v2, v3}, Landroidx/viewpager/widget/ViewPager;->N(IZ)V

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 130
    .line 131
    invoke-static {v0}, Lax/x3/E;->d(Lax/x3/E;)Landroid/os/Handler;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 139
    .line 140
    invoke-static {v0}, Lax/x3/E;->d(Lax/x3/E;)Landroid/os/Handler;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iget-object v1, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 145
    .line 146
    invoke-static {v1}, Lax/x3/E;->a(Lax/x3/E;)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    int-to-long v1, v1

    .line 151
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_9a
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 156
    .line 157
    invoke-static {v0}, Lax/x3/E;->l(Lax/x3/E;)Lcom/android/ex/photo/PhotoViewPager;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object v2, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 162
    .line 163
    invoke-static {v2}, Lax/x3/E;->o(Lax/x3/E;)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-virtual {v0, v2, v3}, Landroidx/viewpager/widget/ViewPager;->N(IZ)V

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 171
    .line 172
    invoke-static {v0, v1}, Lax/x3/E;->m(Lax/x3/E;I)V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 176
    .line 177
    invoke-static {v0}, Lax/x3/E;->n(Lax/x3/E;)Lax/x3/E$d;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iget-object v1, p0, Lax/x3/E$c;->q:Lax/x3/E;

    .line 182
    .line 183
    invoke-static {v1}, Lax/x3/E;->h(Lax/x3/E;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    invoke-interface {v0, v1}, Lax/x3/E$d;->a(Z)V

    .line 188
    .line 189
    .line 190
    return-void
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
