.class public Lax/a3/A;
.super Lax/a3/I;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/a3/A$g;,
        Lax/a3/A$f;
    }
.end annotation


# static fields
.field private static final A0:[Ljava/lang/String;


# instance fields
.field private t0:Lax/a3/A$g;

.field private u0:I

.field private v0:I

.field private w0:Landroid/widget/AutoCompleteTextView;

.field private x0:Landroid/widget/AutoCompleteTextView;

.field private y0:Landroid/widget/EditText;

.field private z0:Landroid/widget/EditText;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    const-string v0, "MB"

    .line 2
    .line 3
    const-string v1, "GB"

    .line 4
    .line 5
    const-string v2, "KB"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lax/a3/A;->A0:[Ljava/lang/String;

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
.end method

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

.method static synthetic i3(Lax/a3/A;)Lax/a3/A$g;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/a3/A;->t0:Lax/a3/A$g;

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

.method static synthetic j3(Lax/a3/A;)J
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/a3/A;->p3()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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

.method static synthetic k3(Lax/a3/A;)J
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/a3/A;->q3()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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

.method static synthetic l3(Lax/a3/A;I)I
    .registers 2

    .line 1
    iput p1, p0, Lax/a3/A;->u0:I

    .line 2
    .line 3
    return p1
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

.method static synthetic m3(Lax/a3/A;I)I
    .registers 2

    .line 1
    iput p1, p0, Lax/a3/A;->v0:I

    .line 2
    .line 3
    return p1
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

.method private n3(II)J
    .registers 5

    .line 1
    if-nez p2, :cond_8

    .line 2
    .line 3
    int-to-long p1, p1

    .line 4
    const-wide/16 v0, 0x3e8

    .line 5
    .line 6
    :goto_5
    mul-long p1, p1, v0

    .line 7
    .line 8
    return-wide p1

    .line 9
    :cond_8
    const/4 v0, 0x1

    .line 10
    if-ne p2, v0, :cond_10

    .line 11
    .line 12
    int-to-long p1, p1

    .line 13
    const-wide/32 v0, 0xf4240

    .line 14
    .line 15
    .line 16
    goto :goto_5

    .line 17
    :cond_10
    const/4 v0, 0x2

    .line 18
    if-ne p2, v0, :cond_18

    .line 19
    .line 20
    int-to-long p1, p1

    .line 21
    const-wide/32 v0, 0x3b9aca00

    .line 22
    .line 23
    .line 24
    goto :goto_5

    .line 25
    :cond_18
    int-to-long p1, p1

    .line 26
    return-wide p1
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

.method public static o3()Lax/a3/A;
    .registers 1

    .line 1
    new-instance v0, Lax/a3/A;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/a3/A;-><init>()V

    .line 4
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

.method private p3()J
    .registers 5

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    :try_start_2
    iget-object v2, p0, Lax/a3/A;->y0:Landroid/widget/EditText;

    .line 4
    .line 5
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_13

    .line 18
    .line 19
    return-wide v0

    .line 20
    :cond_13
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget v3, p0, Lax/a3/A;->u0:I

    .line 25
    .line 26
    invoke-direct {p0, v2, v3}, Lax/a3/A;->n3(II)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_1d} :catch_1d

    .line 30
    :catch_1d
    return-wide v0
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

.method private q3()J
    .registers 5

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    :try_start_2
    iget-object v2, p0, Lax/a3/A;->z0:Landroid/widget/EditText;

    .line 4
    .line 5
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_13

    .line 18
    .line 19
    return-wide v0

    .line 20
    :cond_13
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget v3, p0, Lax/a3/A;->v0:I

    .line 25
    .line 26
    invoke-direct {p0, v2, v3}, Lax/a3/A;->n3(II)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_1d} :catch_1d

    .line 30
    :catch_1d
    return-wide v0
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

.method private s3(Landroid/content/Context;Landroid/widget/AutoCompleteTextView;)V
    .registers 5

    .line 1
    new-instance v0, Lax/a3/A$f;

    .line 2
    .line 3
    sget-object v1, Lax/a3/A;->A0:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lax/a3/A$f;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lax/a3/A$d;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lax/a3/A$d;-><init>(Lax/a3/A;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput p1, p0, Lax/a3/A;->u0:I

    .line 21
    .line 22
    aget-object p1, v1, p1

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method private t3(Landroid/content/Context;Landroid/widget/AutoCompleteTextView;)V
    .registers 5

    .line 1
    new-instance v0, Lax/a3/A$f;

    .line 2
    .line 3
    sget-object v1, Lax/a3/A;->A0:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lax/a3/A$f;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lax/a3/A$e;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lax/a3/A$e;-><init>(Lax/a3/A;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput p1, p0, Lax/a3/A;->v0:I

    .line 21
    .line 22
    aget-object p1, v1, p1

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void
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
.method public g3()Landroid/app/Dialog;
    .registers 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lax/u3/h;->a(Landroid/content/Context;)Landroidx/appcompat/app/a$a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const v5, 0x7f0d006a

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v5, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const v3, 0x7f0a0222

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Landroid/widget/AutoCompleteTextView;

    .line 34
    .line 35
    iput-object v3, p0, Lax/a3/A;->w0:Landroid/widget/AutoCompleteTextView;

    .line 36
    .line 37
    invoke-direct {p0, v0, v3}, Lax/a3/A;->s3(Landroid/content/Context;Landroid/widget/AutoCompleteTextView;)V

    .line 38
    .line 39
    .line 40
    const v3, 0x7f0a04a1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Landroid/widget/AutoCompleteTextView;

    .line 48
    .line 49
    iput-object v3, p0, Lax/a3/A;->x0:Landroid/widget/AutoCompleteTextView;

    .line 50
    .line 51
    invoke-direct {p0, v0, v3}, Lax/a3/A;->t3(Landroid/content/Context;Landroid/widget/AutoCompleteTextView;)V

    .line 52
    .line 53
    .line 54
    const v0, 0x7f0a021f

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Landroid/widget/EditText;

    .line 62
    .line 63
    iput-object v0, p0, Lax/a3/A;->y0:Landroid/widget/EditText;

    .line 64
    .line 65
    const v0, 0x7f0a049a

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Landroid/widget/EditText;

    .line 73
    .line 74
    iput-object v0, p0, Lax/a3/A;->z0:Landroid/widget/EditText;

    .line 75
    .line 76
    const v0, 0x7f130414

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0}, Landroidx/appcompat/app/a$a;->p(I)Landroidx/appcompat/app/a$a;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroidx/appcompat/app/a$a;->setView(Landroid/view/View;)Landroidx/appcompat/app/a$a;

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    invoke-virtual {v1, v0}, Landroidx/appcompat/app/a$a;->b(Z)Landroidx/appcompat/app/a$a;

    .line 87
    .line 88
    .line 89
    new-instance v0, Lax/a3/A$a;

    .line 90
    .line 91
    invoke-direct {v0, p0}, Lax/a3/A$a;-><init>(Lax/a3/A;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v0}, Landroidx/appcompat/app/a$a;->j(Landroid/content/DialogInterface$OnCancelListener;)Landroidx/appcompat/app/a$a;

    .line 95
    .line 96
    .line 97
    new-instance v0, Lax/a3/A$b;

    .line 98
    .line 99
    invoke-direct {v0, p0}, Lax/a3/A$b;-><init>(Lax/a3/A;)V

    .line 100
    .line 101
    .line 102
    const v2, 0x104000a

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v2, v0}, Landroidx/appcompat/app/a$a;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    .line 106
    .line 107
    .line 108
    new-instance v0, Lax/a3/A$c;

    .line 109
    .line 110
    invoke-direct {v0, p0}, Lax/a3/A$c;-><init>(Lax/a3/A;)V

    .line 111
    .line 112
    .line 113
    const/high16 v2, 0x1040000

    .line 114
    .line 115
    invoke-virtual {v1, v2, v0}, Landroidx/appcompat/app/a$a;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Landroidx/appcompat/app/a$a;->create()Landroidx/appcompat/app/a;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0
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

.method public onCancel(Landroid/content/DialogInterface;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/a3/A;->t0:Lax/a3/A$g;

    .line 2
    .line 3
    if-eqz p1, :cond_7

    .line 4
    .line 5
    invoke-interface {p1}, Lax/a3/A$g;->a()V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
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

.method public r3(Lax/a3/A$g;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/A;->t0:Lax/a3/A$g;

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
