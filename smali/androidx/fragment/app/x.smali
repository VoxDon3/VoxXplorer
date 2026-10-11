.class Landroidx/fragment/app/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/c;
.implements Lax/n2/d;
.implements Lax/G0/v;


# instance fields
.field private final a:Landroidx/fragment/app/Fragment;

.field private final b:Landroidx/lifecycle/r;

.field private c:Landroidx/lifecycle/g;

.field private d:Lax/n2/c;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/r;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/fragment/app/x;->c:Landroidx/lifecycle/g;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/fragment/app/x;->d:Lax/n2/c;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/fragment/app/x;->a:Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    iput-object p2, p0, Landroidx/fragment/app/x;->b:Landroidx/lifecycle/r;

    .line 12
    .line 13
    return-void
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
.end method


# virtual methods
.method a(Landroidx/lifecycle/d$a;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/x;->c:Landroidx/lifecycle/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/g;->h(Landroidx/lifecycle/d$a;)V

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

.method b()V
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/x;->c:Landroidx/lifecycle/g;

    .line 2
    .line 3
    if-nez v0, :cond_14

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/g;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/lifecycle/g;-><init>(Lax/G0/h;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/fragment/app/x;->c:Landroidx/lifecycle/g;

    .line 11
    .line 12
    invoke-static {p0}, Lax/n2/c;->a(Lax/n2/d;)Lax/n2/c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Landroidx/fragment/app/x;->d:Lax/n2/c;

    .line 17
    .line 18
    invoke-virtual {v0}, Lax/n2/c;->c()V

    .line 19
    .line 20
    .line 21
    :cond_14
    return-void
.end method

.method c()Z
    .registers 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/x;->c:Landroidx/lifecycle/g;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method d(Landroid/os/Bundle;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/x;->d:Lax/n2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/n2/c;->d(Landroid/os/Bundle;)V

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

.method e(Landroid/os/Bundle;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/x;->d:Lax/n2/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/n2/c;->e(Landroid/os/Bundle;)V

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

.method f(Landroidx/lifecycle/d$b;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/x;->c:Landroidx/lifecycle/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/g;->m(Landroidx/lifecycle/d$b;)V

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

.method public getDefaultViewModelCreationExtras()Lax/I0/a;
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p2()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_a
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v1, :cond_1c

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v1, :cond_15

    .line 18
    .line 19
    check-cast v0, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1d

    .line 22
    :cond_15
    check-cast v0, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_a

    .line 29
    :cond_1c
    const/4 v0, 0x0

    .line 30
    :goto_1d
    new-instance v1, Lax/I0/d;

    .line 31
    .line 32
    invoke-direct {v1}, Lax/I0/d;-><init>()V

    .line 33
    .line 34
    .line 35
    if-eqz v0, :cond_29

    .line 36
    .line 37
    sget-object v2, Landroidx/lifecycle/q$a;->g:Lax/I0/a$b;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v0}, Lax/I0/d;->c(Lax/I0/a$b;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_29
    sget-object v0, Landroidx/lifecycle/m;->a:Lax/I0/a$b;

    .line 43
    .line 44
    iget-object v2, p0, Landroidx/fragment/app/x;->a:Landroidx/fragment/app/Fragment;

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lax/I0/d;->c(Lax/I0/a$b;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Landroidx/lifecycle/m;->b:Lax/I0/a$b;

    .line 50
    .line 51
    invoke-virtual {v1, v0, p0}, Lax/I0/d;->c(Lax/I0/a$b;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Landroidx/fragment/app/Fragment;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_48

    .line 61
    .line 62
    sget-object v0, Landroidx/lifecycle/m;->c:Lax/I0/a$b;

    .line 63
    .line 64
    iget-object v2, p0, Landroidx/fragment/app/x;->a:Landroidx/fragment/app/Fragment;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v1, v0, v2}, Lax/I0/d;->c(Lax/I0/a$b;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_48
    return-object v1
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
.end method

.method public getLifecycle()Landroidx/lifecycle/d;
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/x;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/x;->c:Landroidx/lifecycle/g;

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

.method public getSavedStateRegistry()Landroidx/savedstate/a;
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/x;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/x;->d:Lax/n2/c;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/n2/c;->b()Landroidx/savedstate/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
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

.method public getViewModelStore()Landroidx/lifecycle/r;
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/x;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/x;->b:Landroidx/lifecycle/r;

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
