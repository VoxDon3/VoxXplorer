.class public Lax/d3/T;
.super Landroidx/preference/d;
.source "SourceFile"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field private A0:Landroidx/preference/CheckBoxPreference;

.field private B0:Landroidx/preference/CheckBoxPreference;

.field private C0:Z

.field private m0:Lax/Q2/f;

.field private n0:I

.field private o0:Lax/c3/K;

.field private p0:Ljava/lang/String;

.field private q0:Z

.field private r0:Lcom/voxdon/xplorer/RadioGroupPreference;

.field private s0:Landroid/widget/RadioGroup;

.field private t0:I

.field private u0:Lcom/voxdon/xplorer/RadioGroupPreference;

.field private v0:Landroid/widget/RadioGroup;

.field private w0:I

.field private x0:Landroidx/preference/ListPreference;

.field private y0:Landroidx/preference/CheckBoxPreference;

.field private z0:Landroidx/preference/CheckBoxPreference;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroidx/preference/d;-><init>()V

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

.method private A3()V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/f;->C0(Lax/Q2/f;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_f

    .line 8
    .line 9
    iget-object v0, p0, Lax/d3/T;->A0:Landroidx/preference/CheckBoxPreference;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->N0(Z)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    invoke-direct {p0}, Lax/d3/T;->D3()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2b

    .line 21
    .line 22
    iget-object v0, p0, Lax/d3/T;->A0:Landroidx/preference/CheckBoxPreference;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 29
    .line 30
    iget v3, p0, Lax/d3/T;->n0:I

    .line 31
    .line 32
    iget-object v4, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v5, p0, Lax/d3/T;->q0:Z

    .line 35
    .line 36
    invoke-static {v1, v2, v3, v4, v5}, Lax/t3/e;->i(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v1}, Landroidx/preference/TwoStatePreference;->U0(Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_42

    .line 44
    :cond_2b
    invoke-static {}, Lax/u3/b;->f()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lax/d3/T;->A0:Landroidx/preference/CheckBoxPreference;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 54
    .line 55
    iget v3, p0, Lax/d3/T;->n0:I

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    iget-boolean v5, p0, Lax/d3/T;->q0:Z

    .line 59
    .line 60
    invoke-static {v1, v2, v3, v4, v5}, Lax/t3/e;->i(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {v0, v1}, Landroidx/preference/TwoStatePreference;->U0(Z)V

    .line 65
    .line 66
    .line 67
    :goto_42
    iget-object v0, p0, Lax/d3/T;->A0:Landroidx/preference/CheckBoxPreference;

    .line 68
    .line 69
    new-instance v1, Lax/d3/T$b;

    .line 70
    .line 71
    invoke-direct {v1, p0}, Lax/d3/T$b;-><init>(Lax/d3/T;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->G0(Landroidx/preference/Preference$d;)V

    .line 75
    .line 76
    .line 77
    return-void
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

.method private B3()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 2
    .line 3
    sget-object v1, Lax/Q2/f;->z0:Lax/Q2/f;

    .line 4
    .line 5
    if-ne v0, v1, :cond_17

    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/T;->x0:Landroidx/preference/ListPreference;

    .line 8
    .line 9
    const v1, 0x7f030019

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/preference/ListPreference;->f1(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lax/d3/T;->x0:Landroidx/preference/ListPreference;

    .line 16
    .line 17
    const v1, 0x7f03001a

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/preference/ListPreference;->h1(I)V

    .line 21
    .line 22
    .line 23
    goto :goto_27

    .line 24
    :cond_17
    iget-object v0, p0, Lax/d3/T;->x0:Landroidx/preference/ListPreference;

    .line 25
    .line 26
    const v1, 0x7f03001b

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroidx/preference/ListPreference;->f1(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lax/d3/T;->x0:Landroidx/preference/ListPreference;

    .line 33
    .line 34
    const v1, 0x7f03001c

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroidx/preference/ListPreference;->h1(I)V

    .line 38
    .line 39
    .line 40
    :goto_27
    invoke-direct {p0}, Lax/d3/T;->D3()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_3e

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 51
    .line 52
    iget v2, p0, Lax/d3/T;->n0:I

    .line 53
    .line 54
    iget-object v3, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 55
    .line 56
    iget-boolean v4, p0, Lax/d3/T;->q0:Z

    .line 57
    .line 58
    invoke-static {v0, v1, v2, v3, v4}, Lax/t3/e;->j(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    goto :goto_50

    .line 63
    :cond_3e
    invoke-static {}, Lax/u3/b;->f()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v1, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 71
    .line 72
    iget v2, p0, Lax/d3/T;->n0:I

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    iget-boolean v4, p0, Lax/d3/T;->q0:Z

    .line 76
    .line 77
    invoke-static {v0, v1, v2, v3, v4}, Lax/t3/e;->j(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :goto_50
    iget-object v1, p0, Lax/d3/T;->x0:Landroidx/preference/ListPreference;

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Landroidx/preference/ListPreference;->j1(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lax/d3/T;->x0:Landroidx/preference/ListPreference;

    .line 87
    .line 88
    new-instance v1, Lax/d3/T$j;

    .line 89
    .line 90
    invoke-direct {v1, p0}, Lax/d3/T$j;-><init>(Lax/d3/T;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->G0(Landroidx/preference/Preference$d;)V

    .line 94
    .line 95
    .line 96
    return-void
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

.method private C3(Landroidx/preference/h;)V
    .registers 11

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$F;->a:Landroid/view/View;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$F;->a:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 21
    .line 22
    iget v1, p0, Lax/d3/T;->n0:I

    .line 23
    .line 24
    iget-object v3, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 25
    .line 26
    iget-boolean v4, p0, Lax/d3/T;->q0:Z

    .line 27
    .line 28
    invoke-static {v0, p1, v1, v3, v4}, Lax/t3/e;->k(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget-object v1, p0, Lax/d3/T;->r0:Lcom/voxdon/xplorer/RadioGroupPreference;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/voxdon/xplorer/RadioGroupPreference;->T0()Landroid/widget/RadioGroup;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, p0, Lax/d3/T;->s0:Landroid/widget/RadioGroup;

    .line 39
    .line 40
    if-nez v1, :cond_3b

    .line 41
    .line 42
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v0, "CRITICAL: onBindRadioGroup"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3b
    invoke-virtual {p0}, Landroidx/preference/d;->N2()Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const/4 v3, 0x0

    .line 65
    if-eqz v1, :cond_4a

    .line 66
    .line 67
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$m;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

    .line 72
    .line 73
    .line 74
    move-object v3, v4

    .line 75
    :cond_4a
    const v4, 0x7f0a04da

    .line 76
    .line 77
    .line 78
    const v5, 0x7f0a04db

    .line 79
    .line 80
    .line 81
    const v6, 0x7f0a04dc

    .line 82
    .line 83
    .line 84
    if-nez p1, :cond_62

    .line 85
    .line 86
    iget-object p1, p0, Lax/d3/T;->s0:Landroid/widget/RadioGroup;

    .line 87
    .line 88
    invoke-virtual {p1, v6}, Landroid/widget/RadioGroup;->check(I)V

    .line 89
    .line 90
    .line 91
    iput v6, p0, Lax/d3/T;->t0:I

    .line 92
    .line 93
    iget-object p1, p0, Lax/d3/T;->z0:Landroidx/preference/CheckBoxPreference;

    .line 94
    .line 95
    invoke-virtual {p1, v2}, Landroidx/preference/Preference;->N0(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_8d

    .line 99
    :cond_62
    const/4 v7, 0x2

    .line 100
    const/4 v8, 0x1

    .line 101
    if-ne p1, v7, :cond_7f

    .line 102
    .line 103
    iget-object p1, p0, Lax/d3/T;->s0:Landroid/widget/RadioGroup;

    .line 104
    .line 105
    invoke-virtual {p1, v5}, Landroid/widget/RadioGroup;->check(I)V

    .line 106
    .line 107
    .line 108
    iput v5, p0, Lax/d3/T;->t0:I

    .line 109
    .line 110
    invoke-direct {p0}, Lax/d3/T;->E3()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_79

    .line 115
    .line 116
    iget-object p1, p0, Lax/d3/T;->z0:Landroidx/preference/CheckBoxPreference;

    .line 117
    .line 118
    invoke-virtual {p1, v2}, Landroidx/preference/Preference;->N0(Z)V

    .line 119
    .line 120
    .line 121
    goto :goto_8d

    .line 122
    :cond_79
    iget-object p1, p0, Lax/d3/T;->z0:Landroidx/preference/CheckBoxPreference;

    .line 123
    .line 124
    invoke-virtual {p1, v8}, Landroidx/preference/Preference;->N0(Z)V

    .line 125
    .line 126
    .line 127
    goto :goto_8d

    .line 128
    :cond_7f
    if-ne p1, v8, :cond_8d

    .line 129
    .line 130
    iget-object p1, p0, Lax/d3/T;->s0:Landroid/widget/RadioGroup;

    .line 131
    .line 132
    invoke-virtual {p1, v4}, Landroid/widget/RadioGroup;->check(I)V

    .line 133
    .line 134
    .line 135
    iput v4, p0, Lax/d3/T;->t0:I

    .line 136
    .line 137
    iget-object p1, p0, Lax/d3/T;->z0:Landroidx/preference/CheckBoxPreference;

    .line 138
    .line 139
    invoke-virtual {p1, v2}, Landroidx/preference/Preference;->N0(Z)V

    .line 140
    .line 141
    .line 142
    :cond_8d
    :goto_8d
    iget-object p1, p0, Lax/d3/T;->s0:Landroid/widget/RadioGroup;

    .line 143
    .line 144
    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, Landroid/widget/RadioButton;

    .line 149
    .line 150
    iget-object v2, p0, Lax/d3/T;->s0:Landroid/widget/RadioGroup;

    .line 151
    .line 152
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Landroid/widget/RadioButton;

    .line 157
    .line 158
    iget-object v5, p0, Lax/d3/T;->s0:Landroid/widget/RadioGroup;

    .line 159
    .line 160
    invoke-virtual {v5, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, Landroid/widget/RadioButton;

    .line 165
    .line 166
    invoke-static {p1}, Lax/X2/Q;->o(Landroid/widget/RadioButton;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v2}, Lax/X2/Q;->o(Landroid/widget/RadioButton;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v4}, Lax/X2/Q;->o(Landroid/widget/RadioButton;)V

    .line 173
    .line 174
    .line 175
    new-instance v5, Lax/d3/T$h;

    .line 176
    .line 177
    invoke-direct {v5, p0, v0}, Lax/d3/T$h;-><init>(Lax/d3/T;Landroid/content/Context;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 187
    .line 188
    .line 189
    iget-object p1, p0, Lax/d3/T;->s0:Landroid/widget/RadioGroup;

    .line 190
    .line 191
    new-instance v2, Lax/d3/T$i;

    .line 192
    .line 193
    invoke-direct {v2, p0, v0}, Lax/d3/T$i;-><init>(Lax/d3/T;Landroid/content/Context;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v2}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 197
    .line 198
    .line 199
    if-eqz v1, :cond_d0

    .line 200
    .line 201
    new-instance p1, Lax/d3/S;

    .line 202
    .line 203
    invoke-direct {p1, v1, v3}, Lax/d3/S;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$m;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 207
    .line 208
    .line 209
    :cond_d0
    return-void
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
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method private D3()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/T;->B0:Landroidx/preference/CheckBoxPreference;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/preference/TwoStatePreference;->T0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method private E3()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/f;->g0(Lax/Q2/f;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_a
    iget-object v0, p0, Lax/d3/T;->o0:Lax/c3/K;

    .line 12
    .line 13
    iget-object v1, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lax/c3/d0;->D(Lax/c3/K;Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
    .line 20
    .line 21
.end method

.method private F3()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 2
    .line 3
    sget-object v1, Lax/Q2/f;->V0:Lax/Q2/f;

    .line 4
    .line 5
    if-ne v0, v1, :cond_19

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/preference/d;->P2()Landroidx/preference/PreferenceScreen;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Landroidx/preference/d;->O2()Landroidx/preference/g;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "settings_etc"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroidx/preference/g;->a(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_19

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/preference/PreferenceGroup;->c1(Landroidx/preference/Preference;)Z

    .line 24
    .line 25
    .line 26
    :cond_19
    return-void
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

.method private G3()V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/d3/T;->q0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_15

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/preference/d;->P2()Landroidx/preference/PreferenceScreen;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroidx/preference/d;->O2()Landroidx/preference/g;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "settings_view"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroidx/preference/g;->a(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Landroidx/preference/PreferenceGroup;->c1(Landroidx/preference/Preference;)Z

    .line 20
    .line 21
    .line 22
    :cond_15
    return-void
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

.method private H3(Z)V
    .registers 4

    .line 1
    invoke-direct {p0}, Lax/d3/T;->u3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_14

    .line 7
    .line 8
    invoke-static {}, Lax/u3/b;->f()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v1}, Lax/d3/T;->v3(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lax/d3/T;->B0:Landroidx/preference/CheckBoxPreference;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Landroidx/preference/Preference;->N0(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_14
    if-eqz p1, :cond_1a

    .line 22
    .line 23
    invoke-direct {p0, v1}, Lax/d3/T;->v3(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    iget-object p1, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {p0, p1}, Lax/d3/T;->v3(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
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
.end method

.method private I3(Landroid/content/Context;I)V
    .registers 14

    .line 1
    invoke-direct {p0}, Lax/d3/T;->D3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_35

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lax/d3/T;->C0:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 15
    .line 16
    iget v2, p0, Lax/d3/T;->n0:I

    .line 17
    .line 18
    iget-boolean v3, p0, Lax/d3/T;->q0:Z

    .line 19
    .line 20
    const-string v4, "icon_size"

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3, v4}, Lax/t3/e;->a(Landroid/content/Context;Lax/Q2/f;IZLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v6, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 26
    .line 27
    iget v7, p0, Lax/d3/T;->n0:I

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    iget-boolean v9, p0, Lax/d3/T;->q0:Z

    .line 31
    .line 32
    move-object v5, p1

    .line 33
    move v10, p2

    .line 34
    invoke-static/range {v5 .. v10}, Lax/t3/e;->m(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;ZI)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Lax/d3/T;->C0:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->z0()Landroidx/fragment/app/Fragment;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    instance-of p2, p1, Lax/a3/d;

    .line 45
    .line 46
    if-eqz p2, :cond_34

    .line 47
    .line 48
    check-cast p1, Lax/a3/d;

    .line 49
    .line 50
    invoke-virtual {p1}, Lax/a3/d;->S()V

    .line 51
    .line 52
    .line 53
    :cond_34
    return-void

    .line 54
    :cond_35
    move-object v0, p1

    .line 55
    move v5, p2

    .line 56
    iget-object v1, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 57
    .line 58
    iget v2, p0, Lax/d3/T;->n0:I

    .line 59
    .line 60
    iget-object v3, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 61
    .line 62
    iget-boolean v4, p0, Lax/d3/T;->q0:Z

    .line 63
    .line 64
    invoke-static/range {v0 .. v5}, Lax/t3/e;->m(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;ZI)V

    .line 65
    .line 66
    .line 67
    return-void
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
.end method

.method private J3(Landroid/content/Context;I)V
    .registers 14

    .line 1
    invoke-direct {p0}, Lax/d3/T;->D3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_35

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lax/d3/T;->C0:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 15
    .line 16
    iget v2, p0, Lax/d3/T;->n0:I

    .line 17
    .line 18
    iget-boolean v3, p0, Lax/d3/T;->q0:Z

    .line 19
    .line 20
    const-string v4, "view_type"

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3, v4}, Lax/t3/e;->a(Landroid/content/Context;Lax/Q2/f;IZLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v6, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 26
    .line 27
    iget v7, p0, Lax/d3/T;->n0:I

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    iget-boolean v9, p0, Lax/d3/T;->q0:Z

    .line 31
    .line 32
    move-object v5, p1

    .line 33
    move v10, p2

    .line 34
    invoke-static/range {v5 .. v10}, Lax/t3/e;->q(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;ZI)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Lax/d3/T;->C0:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->z0()Landroidx/fragment/app/Fragment;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    instance-of p2, p1, Lax/a3/d;

    .line 45
    .line 46
    if-eqz p2, :cond_34

    .line 47
    .line 48
    check-cast p1, Lax/a3/d;

    .line 49
    .line 50
    invoke-virtual {p1}, Lax/a3/d;->S()V

    .line 51
    .line 52
    .line 53
    :cond_34
    return-void

    .line 54
    :cond_35
    move-object v0, p1

    .line 55
    move v5, p2

    .line 56
    iget-object v1, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 57
    .line 58
    iget v2, p0, Lax/d3/T;->n0:I

    .line 59
    .line 60
    iget-object v3, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 61
    .line 62
    iget-boolean v4, p0, Lax/d3/T;->q0:Z

    .line 63
    .line 64
    invoke-static/range {v0 .. v5}, Lax/t3/e;->q(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;ZI)V

    .line 65
    .line 66
    .line 67
    return-void
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
.end method

.method private K3()V
    .registers 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/d3/T;->x0:Landroidx/preference/ListPreference;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/preference/ListPreference;->b1()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->M0(Ljava/lang/CharSequence;)V
    :try_end_9
    .catch Ljava/util/UnknownFormatConversionException; {:try_start_0 .. :try_end_9} :catch_9

    .line 8
    .line 9
    .line 10
    :catch_9
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
.end method

.method public static synthetic d3(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$m;)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$m;)V

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

.method static synthetic e3(Lax/d3/T;Landroidx/preference/h;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/T;->C3(Landroidx/preference/h;)V

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

.method static synthetic f3(Lax/d3/T;Landroidx/preference/h;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/T;->y3(Landroidx/preference/h;)V

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

.method static synthetic g3(Lax/d3/T;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/d3/T;->C0:Z

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

.method static synthetic h3(Lax/d3/T;)Lax/Q2/f;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/d3/T;->m0:Lax/Q2/f;

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

.method static synthetic i3(Lax/d3/T;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/d3/T;->n0:I

    .line 2
    .line 3
    return p0
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

.method static synthetic j3(Lax/d3/T;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lax/d3/T;->q0:Z

    .line 2
    .line 3
    return p0
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

.method static synthetic k3(Lax/d3/T;Z)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/T;->H3(Z)V

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

.method static synthetic l3(Lax/d3/T;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/d3/T;->w0:I

    .line 2
    .line 3
    return p0
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

.method static synthetic m3(Lax/d3/T;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/d3/T;->D3()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method static synthetic n3(Lax/d3/T;I)I
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/T;->s3(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method static synthetic o3(Lax/d3/T;Landroid/content/Context;I)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/T;->I3(Landroid/content/Context;I)V

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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
.end method

.method static synthetic p3(Lax/d3/T;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/d3/T;->t0:I

    .line 2
    .line 3
    return p0
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

.method static synthetic q3(Lax/d3/T;I)I
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/d3/T;->t3(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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

.method static synthetic r3(Lax/d3/T;Landroid/content/Context;I)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/d3/T;->J3(Landroid/content/Context;I)V

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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
.end method

.method private s3(I)I
    .registers 4

    .line 1
    const v0, 0x7f0a0254

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-ne p1, v0, :cond_7

    .line 6
    .line 7
    return v1

    .line 8
    :cond_7
    const v0, 0x7f0a0253

    .line 9
    .line 10
    .line 11
    if-ne p1, v0, :cond_e

    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    return p1

    .line 15
    :cond_e
    invoke-static {}, Lax/u3/b;->f()V

    .line 16
    .line 17
    .line 18
    return v1
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private t3(I)I
    .registers 4

    .line 1
    const v0, 0x7f0a04dc

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-ne p1, v0, :cond_7

    .line 6
    .line 7
    return v1

    .line 8
    :cond_7
    const v0, 0x7f0a04da

    .line 9
    .line 10
    .line 11
    if-ne p1, v0, :cond_e

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_e
    const v0, 0x7f0a04db

    .line 16
    .line 17
    .line 18
    if-ne p1, v0, :cond_15

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    return p1

    .line 22
    :cond_15
    invoke-static {}, Lax/u3/b;->f()V

    .line 23
    .line 24
    .line 25
    return v1
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
.end method

.method private u3()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/d3/T;->q0:Z

    .line 6
    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0
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

.method private v3(Ljava/lang/String;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/T;->r0:Lcom/voxdon/xplorer/RadioGroupPreference;

    .line 2
    .line 3
    const-string v1, "view_type"

    .line 4
    .line 5
    iget-boolean v2, p0, Lax/d3/T;->q0:Z

    .line 6
    .line 7
    invoke-static {v1, p1, v2}, Lax/t3/e;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->D0(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lax/d3/T;->u0:Lcom/voxdon/xplorer/RadioGroupPreference;

    .line 15
    .line 16
    const-string v1, "icon_size"

    .line 17
    .line 18
    iget-boolean v2, p0, Lax/d3/T;->q0:Z

    .line 19
    .line 20
    invoke-static {v1, p1, v2}, Lax/t3/e;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->D0(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lax/d3/T;->x0:Landroidx/preference/ListPreference;

    .line 28
    .line 29
    const-string v1, "sort_type"

    .line 30
    .line 31
    iget-boolean v2, p0, Lax/d3/T;->q0:Z

    .line 32
    .line 33
    invoke-static {v1, p1, v2}, Lax/t3/e;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->D0(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lax/d3/T;->y0:Landroidx/preference/CheckBoxPreference;

    .line 41
    .line 42
    const-string v1, "show_hidden"

    .line 43
    .line 44
    iget-boolean v2, p0, Lax/d3/T;->q0:Z

    .line 45
    .line 46
    invoke-static {v1, p1, v2}, Lax/t3/e;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->D0(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lax/d3/T;->z0:Landroidx/preference/CheckBoxPreference;

    .line 54
    .line 55
    const-string v1, "hide_grid_filename"

    .line 56
    .line 57
    iget-boolean v2, p0, Lax/d3/T;->q0:Z

    .line 58
    .line 59
    invoke-static {v1, p1, v2}, Lax/t3/e;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->D0(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lax/d3/T;->A0:Landroidx/preference/CheckBoxPreference;

    .line 67
    .line 68
    const-string v1, "show_thumbnails"

    .line 69
    .line 70
    iget-boolean v2, p0, Lax/d3/T;->q0:Z

    .line 71
    .line 72
    invoke-static {v1, p1, v2}, Lax/t3/e;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v0, p1}, Landroidx/preference/Preference;->D0(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void
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
.end method

.method private w3()V
    .registers 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_e

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    const-string v1, "location"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lax/Q2/f;

    .line 22
    .line 23
    iput-object v1, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 24
    .line 25
    const-string v2, "locationKey"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {v1, v2}, Lax/Q2/f;->F(Lax/Q2/f;I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput v1, p0, Lax/d3/T;->n0:I

    .line 36
    .line 37
    iget-object v2, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 38
    .line 39
    invoke-static {v2, v1}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, Lax/d3/T;->o0:Lax/c3/K;

    .line 44
    .line 45
    const-string v1, "folderPath"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iput-object v1, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 52
    .line 53
    const-string v1, "show_analysis"

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput-boolean v0, p0, Lax/d3/T;->q0:Z

    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/preference/d;->O2()Landroidx/preference/g;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v1, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 67
    .line 68
    iget v3, p0, Lax/d3/T;->n0:I

    .line 69
    .line 70
    iget-boolean v4, p0, Lax/d3/T;->q0:Z

    .line 71
    .line 72
    invoke-static {v1, v3, v4}, Lax/t3/e;->f(Lax/Q2/f;IZ)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Landroidx/preference/g;->s(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const v0, 0x7f16000a

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Landroidx/preference/d;->K2(I)V

    .line 83
    .line 84
    .line 85
    const-string v0, "apply_to_all"

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroidx/preference/d;->n(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Landroidx/preference/CheckBoxPreference;

    .line 92
    .line 93
    iput-object v0, p0, Lax/d3/T;->B0:Landroidx/preference/CheckBoxPreference;

    .line 94
    .line 95
    const-string v0, "view_type"

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Landroidx/preference/d;->n(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Lcom/voxdon/xplorer/RadioGroupPreference;

    .line 102
    .line 103
    iput-object v0, p0, Lax/d3/T;->r0:Lcom/voxdon/xplorer/RadioGroupPreference;

    .line 104
    .line 105
    const-string v0, "icon_size"

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Landroidx/preference/d;->n(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Lcom/voxdon/xplorer/RadioGroupPreference;

    .line 112
    .line 113
    iput-object v0, p0, Lax/d3/T;->u0:Lcom/voxdon/xplorer/RadioGroupPreference;

    .line 114
    .line 115
    const-string v0, "sort_type"

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Landroidx/preference/d;->n(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Landroidx/preference/ListPreference;

    .line 122
    .line 123
    iput-object v0, p0, Lax/d3/T;->x0:Landroidx/preference/ListPreference;

    .line 124
    .line 125
    const-string v0, "show_hidden"

    .line 126
    .line 127
    invoke-virtual {p0, v0}, Landroidx/preference/d;->n(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Landroidx/preference/CheckBoxPreference;

    .line 132
    .line 133
    iput-object v0, p0, Lax/d3/T;->y0:Landroidx/preference/CheckBoxPreference;

    .line 134
    .line 135
    const-string v0, "hide_grid_filename"

    .line 136
    .line 137
    invoke-virtual {p0, v0}, Landroidx/preference/d;->n(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Landroidx/preference/CheckBoxPreference;

    .line 142
    .line 143
    iput-object v0, p0, Lax/d3/T;->z0:Landroidx/preference/CheckBoxPreference;

    .line 144
    .line 145
    const-string v0, "show_thumbnails"

    .line 146
    .line 147
    invoke-virtual {p0, v0}, Landroidx/preference/d;->n(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Landroidx/preference/CheckBoxPreference;

    .line 152
    .line 153
    iput-object v0, p0, Lax/d3/T;->A0:Landroidx/preference/CheckBoxPreference;

    .line 154
    .line 155
    invoke-direct {p0}, Lax/d3/T;->u3()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_a6

    .line 160
    .line 161
    iget-object v0, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 162
    .line 163
    invoke-direct {p0, v0}, Lax/d3/T;->v3(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_ab

    .line 167
    :cond_a6
    iget-object v0, p0, Lax/d3/T;->B0:Landroidx/preference/CheckBoxPreference;

    .line 168
    .line 169
    invoke-virtual {v0, v2}, Landroidx/preference/Preference;->N0(Z)V

    .line 170
    .line 171
    .line 172
    :goto_ab
    invoke-direct {p0}, Lax/d3/T;->B3()V

    .line 173
    .line 174
    .line 175
    invoke-direct {p0}, Lax/d3/T;->z3()V

    .line 176
    .line 177
    .line 178
    invoke-direct {p0}, Lax/d3/T;->A3()V

    .line 179
    .line 180
    .line 181
    invoke-direct {p0}, Lax/d3/T;->x3()V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Lax/d3/T;->r0:Lcom/voxdon/xplorer/RadioGroupPreference;

    .line 185
    .line 186
    new-instance v1, Lax/d3/T$c;

    .line 187
    .line 188
    invoke-direct {v1, p0}, Lax/d3/T$c;-><init>(Lax/d3/T;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/RadioGroupPreference;->U0(Lcom/voxdon/xplorer/RadioGroupPreference$a;)V

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lax/d3/T;->u0:Lcom/voxdon/xplorer/RadioGroupPreference;

    .line 195
    .line 196
    new-instance v1, Lax/d3/T$d;

    .line 197
    .line 198
    invoke-direct {v1, p0}, Lax/d3/T$d;-><init>(Lax/d3/T;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v1}, Lcom/voxdon/xplorer/RadioGroupPreference;->U0(Lcom/voxdon/xplorer/RadioGroupPreference$a;)V

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lax/d3/T;->B0:Landroidx/preference/CheckBoxPreference;

    .line 205
    .line 206
    new-instance v1, Lax/d3/T$e;

    .line 207
    .line 208
    invoke-direct {v1, p0}, Lax/d3/T$e;-><init>(Lax/d3/T;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->G0(Landroidx/preference/Preference$d;)V

    .line 212
    .line 213
    .line 214
    invoke-direct {p0}, Lax/d3/T;->F3()V

    .line 215
    .line 216
    .line 217
    invoke-direct {p0}, Lax/d3/T;->G3()V

    .line 218
    .line 219
    .line 220
    return-void
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method private x3()V
    .registers 7

    .line 1
    invoke-direct {p0}, Lax/d3/T;->D3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1c

    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/T;->z0:Landroidx/preference/CheckBoxPreference;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 14
    .line 15
    iget v3, p0, Lax/d3/T;->n0:I

    .line 16
    .line 17
    iget-object v4, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 18
    .line 19
    iget-boolean v5, p0, Lax/d3/T;->q0:Z

    .line 20
    .line 21
    invoke-static {v1, v2, v3, v4, v5}, Lax/t3/e;->c(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Landroidx/preference/TwoStatePreference;->U0(Z)V

    .line 26
    .line 27
    .line 28
    goto :goto_33

    .line 29
    :cond_1c
    invoke-static {}, Lax/u3/b;->f()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lax/d3/T;->z0:Landroidx/preference/CheckBoxPreference;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 39
    .line 40
    iget v3, p0, Lax/d3/T;->n0:I

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    iget-boolean v5, p0, Lax/d3/T;->q0:Z

    .line 44
    .line 45
    invoke-static {v1, v2, v3, v4, v5}, Lax/t3/e;->c(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {v0, v1}, Landroidx/preference/TwoStatePreference;->U0(Z)V

    .line 50
    .line 51
    .line 52
    :goto_33
    iget-object v0, p0, Lax/d3/T;->z0:Landroidx/preference/CheckBoxPreference;

    .line 53
    .line 54
    new-instance v1, Lax/d3/T$k;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lax/d3/T$k;-><init>(Lax/d3/T;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->G0(Landroidx/preference/Preference$d;)V

    .line 60
    .line 61
    .line 62
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private y3(Landroidx/preference/h;)V
    .registers 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$F;->a:Landroid/view/View;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$F;->a:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 21
    .line 22
    iget v1, p0, Lax/d3/T;->n0:I

    .line 23
    .line 24
    iget-object v2, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 25
    .line 26
    iget-boolean v3, p0, Lax/d3/T;->q0:Z

    .line 27
    .line 28
    invoke-static {v0, p1, v1, v2, v3}, Lax/t3/e;->d(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget-object v1, p0, Lax/d3/T;->u0:Lcom/voxdon/xplorer/RadioGroupPreference;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/voxdon/xplorer/RadioGroupPreference;->T0()Landroid/widget/RadioGroup;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, p0, Lax/d3/T;->v0:Landroid/widget/RadioGroup;

    .line 39
    .line 40
    if-nez v1, :cond_3b

    .line 41
    .line 42
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v0, "CRITICAL: onBindRadioGroup 2"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3b
    const/4 v2, 0x4

    .line 61
    const v3, 0x7f0a0254

    .line 62
    .line 63
    .line 64
    const v4, 0x7f0a0253

    .line 65
    .line 66
    .line 67
    if-ne p1, v2, :cond_4a

    .line 68
    .line 69
    invoke-virtual {v1, v4}, Landroid/widget/RadioGroup;->check(I)V

    .line 70
    .line 71
    .line 72
    iput v4, p0, Lax/d3/T;->w0:I

    .line 73
    .line 74
    goto :goto_4f

    .line 75
    :cond_4a
    invoke-virtual {v1, v3}, Landroid/widget/RadioGroup;->check(I)V

    .line 76
    .line 77
    .line 78
    iput v3, p0, Lax/d3/T;->w0:I

    .line 79
    .line 80
    :goto_4f
    iget-object p1, p0, Lax/d3/T;->v0:Landroid/widget/RadioGroup;

    .line 81
    .line 82
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Landroid/widget/RadioButton;

    .line 87
    .line 88
    iget-object v1, p0, Lax/d3/T;->v0:Landroid/widget/RadioGroup;

    .line 89
    .line 90
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Landroid/widget/RadioButton;

    .line 95
    .line 96
    invoke-static {p1}, Lax/X2/Q;->o(Landroid/widget/RadioButton;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v1}, Lax/X2/Q;->o(Landroid/widget/RadioButton;)V

    .line 100
    .line 101
    .line 102
    new-instance v2, Lax/d3/T$f;

    .line 103
    .line 104
    invoke-direct {v2, p0, v0}, Lax/d3/T$f;-><init>(Lax/d3/T;Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lax/d3/T;->v0:Landroid/widget/RadioGroup;

    .line 114
    .line 115
    new-instance v1, Lax/d3/T$g;

    .line 116
    .line 117
    invoke-direct {v1, p0, v0}, Lax/d3/T$g;-><init>(Lax/d3/T;Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 121
    .line 122
    .line 123
    return-void
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
.end method

.method private z3()V
    .registers 7

    .line 1
    invoke-direct {p0}, Lax/d3/T;->D3()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1c

    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/T;->y0:Landroidx/preference/CheckBoxPreference;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 14
    .line 15
    iget v3, p0, Lax/d3/T;->n0:I

    .line 16
    .line 17
    iget-object v4, p0, Lax/d3/T;->p0:Ljava/lang/String;

    .line 18
    .line 19
    iget-boolean v5, p0, Lax/d3/T;->q0:Z

    .line 20
    .line 21
    invoke-static {v1, v2, v3, v4, v5}, Lax/t3/e;->h(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Landroidx/preference/TwoStatePreference;->U0(Z)V

    .line 26
    .line 27
    .line 28
    goto :goto_33

    .line 29
    :cond_1c
    invoke-static {}, Lax/u3/b;->f()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lax/d3/T;->y0:Landroidx/preference/CheckBoxPreference;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 39
    .line 40
    iget v3, p0, Lax/d3/T;->n0:I

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    iget-boolean v5, p0, Lax/d3/T;->q0:Z

    .line 44
    .line 45
    invoke-static {v1, v2, v3, v4, v5}, Lax/t3/e;->h(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {v0, v1}, Landroidx/preference/TwoStatePreference;->U0(Z)V

    .line 50
    .line 51
    .line 52
    :goto_33
    iget-object v0, p0, Lax/d3/T;->y0:Landroidx/preference/CheckBoxPreference;

    .line 53
    .line 54
    new-instance v1, Lax/d3/T$a;

    .line 55
    .line 56
    invoke-direct {v1, p0}, Lax/d3/T$a;-><init>(Lax/d3/T;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->G0(Landroidx/preference/Preference$d;)V

    .line 60
    .line 61
    .line 62
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public D1()V
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/preference/d;->P2()Landroidx/preference/PreferenceScreen;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/preference/Preference;->L()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->D1()V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public H1()V
    .registers 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->H1()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lax/d3/T;->K3()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/preference/d;->P2()Landroidx/preference/PreferenceScreen;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroidx/preference/Preference;->L()Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public T2(Landroid/os/Bundle;Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/d3/T;->w3()V

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

.method public n1(Landroid/os/Bundle;)V
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroidx/preference/d;->n1(Landroid/os/Bundle;)V

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

.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .registers 7

    .line 1
    iget-boolean p1, p0, Lax/d3/T;->C0:Z

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    goto :goto_2e

    .line 6
    :cond_5
    invoke-direct {p0}, Lax/d3/T;->K3()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->z0()Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of v0, p1, Lax/a3/d;

    .line 14
    .line 15
    if-eqz v0, :cond_2e

    .line 16
    .line 17
    invoke-direct {p0}, Lax/d3/T;->D3()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_29

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lax/d3/T;->C0:Z

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lax/d3/T;->m0:Lax/Q2/f;

    .line 31
    .line 32
    iget v2, p0, Lax/d3/T;->n0:I

    .line 33
    .line 34
    iget-boolean v3, p0, Lax/d3/T;->q0:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3, p2}, Lax/t3/e;->a(Landroid/content/Context;Lax/Q2/f;IZLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    iput-boolean p2, p0, Lax/d3/T;->C0:Z

    .line 41
    .line 42
    :cond_29
    check-cast p1, Lax/a3/d;

    .line 43
    .line 44
    invoke-virtual {p1}, Lax/a3/d;->S()V

    .line 45
    .line 46
    .line 47
    :cond_2e
    :goto_2e
    return-void
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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
.end method
