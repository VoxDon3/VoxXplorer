.class public Lax/a3/p;
.super Lax/a3/I;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/a3/p$d;
    }
.end annotation


# instance fields
.field private t0:Lax/a3/p$d;

.field private u0:Lcom/google/android/material/textfield/TextInputLayout;

.field v0:Landroid/widget/EditText;

.field private w0:Z

.field private x0:Ljava/lang/String;

.field y0:Lax/a3/l;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/a3/I;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method static synthetic i3(Lax/a3/p;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/a3/p;->x0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic j3(Lax/a3/p;)Lcom/google/android/material/textfield/TextInputLayout;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/a3/p;->u0:Lcom/google/android/material/textfield/TextInputLayout;

    .line 2
    .line 3
    return-object p0
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

.method static synthetic k3(Lax/a3/p;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/a3/p;->m3()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static l3(ZLax/a3/p$d;)Lax/a3/p;
    .registers 5

    .line 1
    new-instance v0, Lax/a3/p;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/a3/p;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "isDirectory"

    .line 12
    .line 13
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->v2(Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lax/a3/p;->n3(Lax/a3/p$d;)V

    .line 20
    .line 21
    .line 22
    return-object v0
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

.method private m3()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a3/p;->y0:Lax/a3/l;

    .line 2
    .line 3
    sget-object v1, Lax/a3/l;->q:Lax/a3/l;

    .line 4
    .line 5
    if-ne v0, v1, :cond_7

    .line 6
    .line 7
    goto :goto_6e

    .line 8
    :cond_7
    iget-object v0, p0, Lax/a3/p;->v0:Landroid/widget/EditText;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_23

    .line 27
    .line 28
    iget-object v0, p0, Lax/a3/p;->u0:Lcom/google/android/material/textfield/TextInputLayout;

    .line 29
    .line 30
    iget-object v1, p0, Lax/a3/p;->x0:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    invoke-static {v0}, Lax/c3/d0;->c(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_36

    .line 41
    .line 42
    iget-object v0, p0, Lax/a3/p;->u0:Lcom/google/android/material/textfield/TextInputLayout;

    .line 43
    .line 44
    const v1, 0x7f1300b1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_36
    iget-object v2, p0, Lax/a3/p;->t0:Lax/a3/p$d;

    .line 56
    .line 57
    if-eqz v2, :cond_6e

    .line 58
    .line 59
    invoke-interface {v2, v0}, Lax/a3/p$d;->a(Ljava/lang/String;)Lax/a3/l;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Lax/a3/p;->y0:Lax/a3/l;

    .line 64
    .line 65
    if-ne v0, v1, :cond_46

    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/fragment/app/e;->O2()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_46
    sget-object v1, Lax/a3/l;->c0:Lax/a3/l;

    .line 72
    .line 73
    if-ne v0, v1, :cond_57

    .line 74
    .line 75
    iget-object v0, p0, Lax/a3/p;->u0:Lcom/google/android/material/textfield/TextInputLayout;

    .line 76
    .line 77
    const v1, 0x7f1302d7

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_57
    sget-object v1, Lax/a3/l;->d0:Lax/a3/l;

    .line 89
    .line 90
    if-ne v0, v1, :cond_68

    .line 91
    .line 92
    iget-object v0, p0, Lax/a3/p;->u0:Lcom/google/android/material/textfield/TextInputLayout;

    .line 93
    .line 94
    const v1, 0x7f130137

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_68
    invoke-virtual {p0}, Landroidx/fragment/app/e;->O2()V

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lax/u3/b;->f()V

    .line 109
    .line 110
    .line 111
    :cond_6e
    :goto_6e
    return-void
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


# virtual methods
.method public f3()V
    .registers 3

    .line 1
    invoke-super {p0}, Lax/a3/I;->f3()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "isDirectory"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput-boolean v0, p0, Lax/a3/p;->w0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1b

    .line 17
    .line 18
    const v0, 0x7f1301c6

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lax/a3/p;->x0:Ljava/lang/String;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1b
    const v0, 0x7f1301b4

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->M0(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lax/a3/p;->x0:Ljava/lang/String;

    .line 36
    .line 37
    return-void
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
.end method

.method public g3()Landroid/app/Dialog;
    .registers 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/u3/h;->a(Landroid/content/Context;)Landroidx/appcompat/app/a$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v1, p0, Lax/a3/p;->w0:Z

    .line 10
    .line 11
    if-eqz v1, :cond_10

    .line 12
    .line 13
    const v1, 0x7f13011c

    .line 14
    .line 15
    .line 16
    goto :goto_13

    .line 17
    :cond_10
    const v1, 0x7f13011b

    .line 18
    .line 19
    .line 20
    :goto_13
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->p(I)Landroidx/appcompat/app/a$a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const v2, 0x7f0d006b

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const v2, 0x7f0a0202

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lcom/google/android/material/textfield/TextInputLayout;

    .line 49
    .line 50
    iput-object v2, p0, Lax/a3/p;->u0:Lcom/google/android/material/textfield/TextInputLayout;

    .line 51
    .line 52
    const v2, 0x7f0a01e2

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Landroid/widget/EditText;

    .line 60
    .line 61
    iput-object v2, p0, Lax/a3/p;->v0:Landroid/widget/EditText;

    .line 62
    .line 63
    new-instance v5, Lax/a3/p$a;

    .line 64
    .line 65
    invoke-direct {v5, p0}, Lax/a3/p$a;-><init>(Lax/a3/p;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 69
    .line 70
    .line 71
    iget-object v2, p0, Lax/a3/p;->v0:Landroid/widget/EditText;

    .line 72
    .line 73
    new-instance v5, Lax/a3/p$b;

    .line 74
    .line 75
    invoke-direct {v5, p0}, Lax/a3/p$b;-><init>(Lax/a3/p;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 79
    .line 80
    .line 81
    :try_start_50
    iget-object v2, p0, Lax/a3/p;->v0:Landroid/widget/EditText;

    .line 82
    .line 83
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z
    :try_end_55
    .catch Ljava/lang/RuntimeException; {:try_start_50 .. :try_end_55} :catch_55

    .line 84
    .line 85
    .line 86
    :catch_55
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->setView(Landroid/view/View;)Landroidx/appcompat/app/a$a;

    .line 87
    .line 88
    .line 89
    const/high16 v1, 0x1040000

    .line 90
    .line 91
    invoke-virtual {v0, v1, v3}, Landroidx/appcompat/app/a$a;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    .line 92
    .line 93
    .line 94
    const v1, 0x104000a

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1, v3}, Landroidx/appcompat/app/a$a;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/appcompat/app/a$a;->create()Landroidx/appcompat/app/a;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const/16 v2, 0x24

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 114
    .line 115
    .line 116
    new-instance v1, Lax/a3/p$c;

    .line 117
    .line 118
    invoke-direct {v1, p0, v0}, Lax/a3/p$c;-><init>(Lax/a3/p;Landroidx/appcompat/app/a;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 122
    .line 123
    .line 124
    return-object v0
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

.method public n3(Lax/a3/p$d;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/p;->t0:Lax/a3/p$d;

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
