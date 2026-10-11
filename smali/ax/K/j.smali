.class public Lax/K/j;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Lax/c0/G;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/K/j$d;,
        Lax/K/j$c;,
        Lax/K/j$e;
    }
.end annotation


# static fields
.field public static u0:Z


# instance fields
.field A:F

.field private B:I

.field C:I

.field private D:I

.field private E:Z

.field F:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "Lax/K/g;",
            ">;"
        }
    .end annotation
.end field

.field private G:J

.field private H:F

.field I:F

.field J:F

.field private K:J

.field L:F

.field private M:Z

.field N:Z

.field private O:Lax/K/j$d;

.field P:I

.field private Q:Z

.field private R:Lax/K/b;

.field S:Z

.field T:F

.field U:F

.field V:J

.field W:F

.field private a0:Z

.field private b0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/K/h;",
            ">;"
        }
    .end annotation
.end field

.field private c0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/K/h;",
            ">;"
        }
    .end annotation
.end field

.field private d0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/K/h;",
            ">;"
        }
    .end annotation
.end field

.field private e0:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lax/K/j$d;",
            ">;"
        }
    .end annotation
.end field

.field private f0:I

.field private g0:F

.field h0:Z

.field protected i0:Z

.field j0:F

.field private k0:Z

.field private l0:Lax/K/j$c;

.field private m0:Ljava/lang/Runnable;

.field private n0:[I

.field o0:I

.field private p0:I

.field private q0:Z

.field r0:Lax/K/j$e;

.field private s0:Z

.field t0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field y:Landroid/view/animation/Interpolator;

.field z:Landroid/view/animation/Interpolator;


# direct methods
.method static synthetic B(Lax/K/j;)Lax/K/j$c;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/K/j;->l0:Lax/K/j$c;

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

.method static synthetic C(Lax/K/j;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/K/j;->D:I

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

.method static synthetic D(Lax/K/j;)I
    .registers 1

    .line 1
    iget p0, p0, Lax/K/j;->B:I

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

.method private G()V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/K/j;->O:Lax/K/j$d;

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    iget-object v0, p0, Lax/K/j;->e0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_76

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_76

    .line 14
    .line 15
    :cond_e
    iget v0, p0, Lax/K/j;->g0:F

    .line 16
    .line 17
    iget v1, p0, Lax/K/j;->I:F

    .line 18
    .line 19
    cmpl-float v0, v0, v1

    .line 20
    .line 21
    if-eqz v0, :cond_76

    .line 22
    .line 23
    iget v0, p0, Lax/K/j;->f0:I

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    const/4 v2, -0x1

    .line 27
    if-eq v0, v2, :cond_45

    .line 28
    .line 29
    iget-object v0, p0, Lax/K/j;->O:Lax/K/j$d;

    .line 30
    .line 31
    if-eqz v0, :cond_27

    .line 32
    .line 33
    iget v3, p0, Lax/K/j;->B:I

    .line 34
    .line 35
    iget v4, p0, Lax/K/j;->D:I

    .line 36
    .line 37
    invoke-interface {v0, p0, v3, v4}, Lax/K/j$d;->a(Lax/K/j;II)V

    .line 38
    .line 39
    .line 40
    :cond_27
    iget-object v0, p0, Lax/K/j;->e0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    .line 42
    if-eqz v0, :cond_43

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_2f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_43

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Lax/K/j$d;

    .line 59
    .line 60
    iget v4, p0, Lax/K/j;->B:I

    .line 61
    .line 62
    iget v5, p0, Lax/K/j;->D:I

    .line 63
    .line 64
    invoke-interface {v3, p0, v4, v5}, Lax/K/j$d;->a(Lax/K/j;II)V

    .line 65
    .line 66
    .line 67
    goto :goto_2f

    .line 68
    :cond_43
    iput-boolean v1, p0, Lax/K/j;->h0:Z

    .line 69
    .line 70
    :cond_45
    iput v2, p0, Lax/K/j;->f0:I

    .line 71
    .line 72
    iget v0, p0, Lax/K/j;->I:F

    .line 73
    .line 74
    iput v0, p0, Lax/K/j;->g0:F

    .line 75
    .line 76
    iget-object v2, p0, Lax/K/j;->O:Lax/K/j$d;

    .line 77
    .line 78
    if-eqz v2, :cond_56

    .line 79
    .line 80
    iget v3, p0, Lax/K/j;->B:I

    .line 81
    .line 82
    iget v4, p0, Lax/K/j;->D:I

    .line 83
    .line 84
    invoke-interface {v2, p0, v3, v4, v0}, Lax/K/j$d;->b(Lax/K/j;IIF)V

    .line 85
    .line 86
    .line 87
    :cond_56
    iget-object v0, p0, Lax/K/j;->e0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 88
    .line 89
    if-eqz v0, :cond_74

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :goto_5e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_74

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Lax/K/j$d;

    .line 106
    .line 107
    iget v3, p0, Lax/K/j;->B:I

    .line 108
    .line 109
    iget v4, p0, Lax/K/j;->D:I

    .line 110
    .line 111
    iget v5, p0, Lax/K/j;->I:F

    .line 112
    .line 113
    invoke-interface {v2, p0, v3, v4, v5}, Lax/K/j$d;->b(Lax/K/j;IIF)V

    .line 114
    .line 115
    .line 116
    goto :goto_5e

    .line 117
    :cond_74
    iput-boolean v1, p0, Lax/K/j;->h0:Z

    .line 118
    .line 119
    :cond_76
    return-void
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

.method private J()V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/K/j;->O:Lax/K/j$d;

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    iget-object v0, p0, Lax/K/j;->e0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_f

    .line 14
    .line 15
    :cond_e
    return-void

    .line 16
    :cond_f
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lax/K/j;->h0:Z

    .line 18
    .line 19
    iget-object v1, p0, Lax/K/j;->t0:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    :cond_18
    if-ge v0, v2, :cond_49

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    check-cast v3, Ljava/lang/Integer;

    .line 34
    .line 35
    iget-object v4, p0, Lax/K/j;->O:Lax/K/j$d;

    .line 36
    .line 37
    if-eqz v4, :cond_2d

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-interface {v4, p0, v5}, Lax/K/j$d;->c(Lax/K/j;I)V

    .line 44
    .line 45
    .line 46
    :cond_2d
    iget-object v4, p0, Lax/K/j;->e0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    .line 48
    if-eqz v4, :cond_18

    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    :goto_35
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_18

    .line 59
    .line 60
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, Lax/K/j$d;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-interface {v5, p0, v6}, Lax/K/j$d;->c(Lax/K/j;I)V

    .line 71
    .line 72
    .line 73
    goto :goto_35

    .line 74
    :cond_49
    iget-object v0, p0, Lax/K/j;->t0:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

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
.method E(F)V
    .registers 2

    .line 1
    return-void
    .line 2
    .line 3
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

.method F(Z)V
    .registers 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Lax/K/j;->K:J

    .line 4
    .line 5
    const-wide/16 v3, -0x1

    .line 6
    .line 7
    cmp-long v5, v1, v3

    .line 8
    .line 9
    if-nez v5, :cond_10

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/K/j;->getNanoTime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iput-wide v1, v0, Lax/K/j;->K:J

    .line 16
    .line 17
    :cond_10
    iget v1, v0, Lax/K/j;->J:F

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    const/high16 v3, 0x3f800000    # 1.0f

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    cmpl-float v5, v1, v4

    .line 24
    .line 25
    if-lez v5, :cond_20

    .line 26
    .line 27
    cmpg-float v5, v1, v3

    .line 28
    .line 29
    if-gez v5, :cond_20

    .line 30
    .line 31
    iput v2, v0, Lax/K/j;->C:I

    .line 32
    .line 33
    :cond_20
    iget-boolean v5, v0, Lax/K/j;->a0:Z

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    if-nez v5, :cond_32

    .line 38
    .line 39
    iget-boolean v5, v0, Lax/K/j;->N:Z

    .line 40
    .line 41
    if-eqz v5, :cond_1ff

    .line 42
    .line 43
    if-nez p1, :cond_32

    .line 44
    .line 45
    iget v5, v0, Lax/K/j;->L:F

    .line 46
    .line 47
    cmpl-float v5, v5, v1

    .line 48
    .line 49
    if-eqz v5, :cond_1ff

    .line 50
    .line 51
    :cond_32
    iget v5, v0, Lax/K/j;->L:F

    .line 52
    .line 53
    sub-float/2addr v5, v1

    .line 54
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {v0}, Lax/K/j;->getNanoTime()J

    .line 59
    .line 60
    .line 61
    move-result-wide v8

    .line 62
    iget-object v5, v0, Lax/K/j;->y:Landroid/view/animation/Interpolator;

    .line 63
    .line 64
    instance-of v10, v5, Lax/K/i;

    .line 65
    .line 66
    const v11, 0x3089705f    # 1.0E-9f

    .line 67
    .line 68
    .line 69
    if-nez v10, :cond_53

    .line 70
    .line 71
    iget-wide v12, v0, Lax/K/j;->K:J

    .line 72
    .line 73
    sub-long v12, v8, v12

    .line 74
    .line 75
    long-to-float v10, v12

    .line 76
    mul-float v10, v10, v1

    .line 77
    .line 78
    mul-float v10, v10, v11

    .line 79
    .line 80
    iget v12, v0, Lax/K/j;->H:F

    .line 81
    .line 82
    div-float/2addr v10, v12

    .line 83
    goto :goto_54

    .line 84
    :cond_53
    const/4 v10, 0x0

    .line 85
    :goto_54
    iget v12, v0, Lax/K/j;->J:F

    .line 86
    .line 87
    add-float/2addr v12, v10

    .line 88
    iget-boolean v13, v0, Lax/K/j;->M:Z

    .line 89
    .line 90
    if-eqz v13, :cond_5d

    .line 91
    .line 92
    iget v12, v0, Lax/K/j;->L:F

    .line 93
    .line 94
    :cond_5d
    cmpl-float v13, v1, v4

    .line 95
    .line 96
    if-lez v13, :cond_67

    .line 97
    .line 98
    iget v14, v0, Lax/K/j;->L:F

    .line 99
    .line 100
    cmpl-float v14, v12, v14

    .line 101
    .line 102
    if-gez v14, :cond_71

    .line 103
    .line 104
    :cond_67
    cmpg-float v14, v1, v4

    .line 105
    .line 106
    if-gtz v14, :cond_77

    .line 107
    .line 108
    iget v14, v0, Lax/K/j;->L:F

    .line 109
    .line 110
    cmpg-float v14, v12, v14

    .line 111
    .line 112
    if-gtz v14, :cond_77

    .line 113
    .line 114
    :cond_71
    iget v12, v0, Lax/K/j;->L:F

    .line 115
    .line 116
    iput-boolean v7, v0, Lax/K/j;->N:Z

    .line 117
    .line 118
    const/4 v14, 0x1

    .line 119
    goto :goto_78

    .line 120
    :cond_77
    const/4 v14, 0x0

    .line 121
    :goto_78
    iput v12, v0, Lax/K/j;->J:F

    .line 122
    .line 123
    iput v12, v0, Lax/K/j;->I:F

    .line 124
    .line 125
    iput-wide v8, v0, Lax/K/j;->K:J

    .line 126
    .line 127
    const/4 v15, 0x0

    .line 128
    if-eqz v5, :cond_e9

    .line 129
    .line 130
    if-nez v14, :cond_e9

    .line 131
    .line 132
    iget-boolean v14, v0, Lax/K/j;->Q:Z

    .line 133
    .line 134
    if-eqz v14, :cond_c9

    .line 135
    .line 136
    const p1, 0x3089705f    # 1.0E-9f

    .line 137
    .line 138
    .line 139
    iget-wide v11, v0, Lax/K/j;->G:J

    .line 140
    .line 141
    sub-long v11, v8, v11

    .line 142
    .line 143
    long-to-float v10, v11

    .line 144
    mul-float v10, v10, p1

    .line 145
    .line 146
    invoke-interface {v5, v10}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    iget-object v10, v0, Lax/K/j;->y:Landroid/view/animation/Interpolator;

    .line 151
    .line 152
    if-eqz v10, :cond_c8

    .line 153
    .line 154
    iput v5, v0, Lax/K/j;->J:F

    .line 155
    .line 156
    iput-wide v8, v0, Lax/K/j;->K:J

    .line 157
    .line 158
    instance-of v8, v10, Lax/K/i;

    .line 159
    .line 160
    if-eqz v8, :cond_e7

    .line 161
    .line 162
    check-cast v10, Lax/K/i;

    .line 163
    .line 164
    invoke-virtual {v10}, Lax/K/i;->a()F

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    iput v8, v0, Lax/K/j;->A:F

    .line 169
    .line 170
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 171
    .line 172
    .line 173
    cmpl-float v9, v8, v4

    .line 174
    .line 175
    if-lez v9, :cond_ba

    .line 176
    .line 177
    cmpl-float v9, v5, v3

    .line 178
    .line 179
    if-ltz v9, :cond_ba

    .line 180
    .line 181
    iput v3, v0, Lax/K/j;->J:F

    .line 182
    .line 183
    iput-boolean v7, v0, Lax/K/j;->N:Z

    .line 184
    .line 185
    const/high16 v5, 0x3f800000    # 1.0f

    .line 186
    .line 187
    :cond_ba
    cmpg-float v8, v8, v4

    .line 188
    .line 189
    if-gez v8, :cond_e7

    .line 190
    .line 191
    cmpg-float v8, v5, v4

    .line 192
    .line 193
    if-gtz v8, :cond_e7

    .line 194
    .line 195
    iput v4, v0, Lax/K/j;->J:F

    .line 196
    .line 197
    iput-boolean v7, v0, Lax/K/j;->N:Z

    .line 198
    .line 199
    const/4 v12, 0x0

    .line 200
    goto :goto_eb

    .line 201
    :cond_c8
    throw v15

    .line 202
    :cond_c9
    invoke-interface {v5, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    iget-object v8, v0, Lax/K/j;->y:Landroid/view/animation/Interpolator;

    .line 207
    .line 208
    instance-of v9, v8, Lax/K/i;

    .line 209
    .line 210
    if-eqz v9, :cond_dc

    .line 211
    .line 212
    check-cast v8, Lax/K/i;

    .line 213
    .line 214
    invoke-virtual {v8}, Lax/K/i;->a()F

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    iput v8, v0, Lax/K/j;->A:F

    .line 219
    .line 220
    goto :goto_e7

    .line 221
    :cond_dc
    add-float/2addr v12, v10

    .line 222
    invoke-interface {v8, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    sub-float/2addr v8, v5

    .line 227
    mul-float v8, v8, v1

    .line 228
    .line 229
    div-float/2addr v8, v10

    .line 230
    iput v8, v0, Lax/K/j;->A:F

    .line 231
    .line 232
    :cond_e7
    :goto_e7
    move v12, v5

    .line 233
    goto :goto_eb

    .line 234
    :cond_e9
    iput v10, v0, Lax/K/j;->A:F

    .line 235
    .line 236
    :goto_eb
    iget v5, v0, Lax/K/j;->A:F

    .line 237
    .line 238
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    const v8, 0x3727c5ac    # 1.0E-5f

    .line 243
    .line 244
    .line 245
    cmpl-float v5, v5, v8

    .line 246
    .line 247
    if-lez v5, :cond_fd

    .line 248
    .line 249
    sget-object v5, Lax/K/j$e;->d0:Lax/K/j$e;

    .line 250
    .line 251
    invoke-virtual {v0, v5}, Lax/K/j;->setState(Lax/K/j$e;)V

    .line 252
    .line 253
    .line 254
    :cond_fd
    if-lez v13, :cond_105

    .line 255
    .line 256
    iget v5, v0, Lax/K/j;->L:F

    .line 257
    .line 258
    cmpl-float v5, v12, v5

    .line 259
    .line 260
    if-gez v5, :cond_10f

    .line 261
    .line 262
    :cond_105
    cmpg-float v5, v1, v4

    .line 263
    .line 264
    if-gtz v5, :cond_113

    .line 265
    .line 266
    iget v5, v0, Lax/K/j;->L:F

    .line 267
    .line 268
    cmpg-float v5, v12, v5

    .line 269
    .line 270
    if-gtz v5, :cond_113

    .line 271
    .line 272
    :cond_10f
    iget v12, v0, Lax/K/j;->L:F

    .line 273
    .line 274
    iput-boolean v7, v0, Lax/K/j;->N:Z

    .line 275
    .line 276
    :cond_113
    cmpl-float v5, v12, v3

    .line 277
    .line 278
    if-gez v5, :cond_11b

    .line 279
    .line 280
    cmpg-float v5, v12, v4

    .line 281
    .line 282
    if-gtz v5, :cond_122

    .line 283
    .line 284
    :cond_11b
    iput-boolean v7, v0, Lax/K/j;->N:Z

    .line 285
    .line 286
    sget-object v5, Lax/K/j$e;->e0:Lax/K/j$e;

    .line 287
    .line 288
    invoke-virtual {v0, v5}, Lax/K/j;->setState(Lax/K/j$e;)V

    .line 289
    .line 290
    .line 291
    :cond_122
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    iput-boolean v7, v0, Lax/K/j;->a0:Z

    .line 296
    .line 297
    invoke-virtual {v0}, Lax/K/j;->getNanoTime()J

    .line 298
    .line 299
    .line 300
    move-result-wide v19

    .line 301
    iput v12, v0, Lax/K/j;->j0:F

    .line 302
    .line 303
    iget-object v8, v0, Lax/K/j;->z:Landroid/view/animation/Interpolator;

    .line 304
    .line 305
    if-nez v8, :cond_135

    .line 306
    .line 307
    move/from16 v18, v12

    .line 308
    .line 309
    goto :goto_13b

    .line 310
    :cond_135
    invoke-interface {v8, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 311
    .line 312
    .line 313
    move-result v8

    .line 314
    move/from16 v18, v8

    .line 315
    .line 316
    :goto_13b
    iget-object v8, v0, Lax/K/j;->z:Landroid/view/animation/Interpolator;

    .line 317
    .line 318
    if-eqz v8, :cond_153

    .line 319
    .line 320
    iget v9, v0, Lax/K/j;->H:F

    .line 321
    .line 322
    div-float v9, v1, v9

    .line 323
    .line 324
    add-float/2addr v9, v12

    .line 325
    invoke-interface {v8, v9}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    iput v8, v0, Lax/K/j;->A:F

    .line 330
    .line 331
    iget-object v9, v0, Lax/K/j;->z:Landroid/view/animation/Interpolator;

    .line 332
    .line 333
    invoke-interface {v9, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 334
    .line 335
    .line 336
    move-result v9

    .line 337
    sub-float/2addr v8, v9

    .line 338
    iput v8, v0, Lax/K/j;->A:F

    .line 339
    .line 340
    :cond_153
    const/4 v8, 0x0

    .line 341
    :goto_154
    if-ge v8, v5, :cond_176

    .line 342
    .line 343
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 344
    .line 345
    .line 346
    move-result-object v9

    .line 347
    iget-object v10, v0, Lax/K/j;->F:Ljava/util/HashMap;

    .line 348
    .line 349
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v10

    .line 353
    move-object/from16 v16, v10

    .line 354
    .line 355
    check-cast v16, Lax/K/g;

    .line 356
    .line 357
    if-eqz v16, :cond_173

    .line 358
    .line 359
    iget-boolean v10, v0, Lax/K/j;->a0:Z

    .line 360
    .line 361
    const/16 v21, 0x0

    .line 362
    .line 363
    move-object/from16 v17, v9

    .line 364
    .line 365
    invoke-virtual/range {v16 .. v21}, Lax/K/g;->c(Landroid/view/View;FJLax/F/c;)Z

    .line 366
    .line 367
    .line 368
    move-result v9

    .line 369
    or-int/2addr v9, v10

    .line 370
    iput-boolean v9, v0, Lax/K/j;->a0:Z

    .line 371
    .line 372
    :cond_173
    add-int/lit8 v8, v8, 0x1

    .line 373
    .line 374
    goto :goto_154

    .line 375
    :cond_176
    if-lez v13, :cond_17e

    .line 376
    .line 377
    iget v5, v0, Lax/K/j;->L:F

    .line 378
    .line 379
    cmpl-float v5, v12, v5

    .line 380
    .line 381
    if-gez v5, :cond_188

    .line 382
    .line 383
    :cond_17e
    cmpg-float v5, v1, v4

    .line 384
    .line 385
    if-gtz v5, :cond_18a

    .line 386
    .line 387
    iget v5, v0, Lax/K/j;->L:F

    .line 388
    .line 389
    cmpg-float v5, v12, v5

    .line 390
    .line 391
    if-gtz v5, :cond_18a

    .line 392
    .line 393
    :cond_188
    const/4 v5, 0x1

    .line 394
    goto :goto_18b

    .line 395
    :cond_18a
    const/4 v5, 0x0

    .line 396
    :goto_18b
    iget-boolean v8, v0, Lax/K/j;->a0:Z

    .line 397
    .line 398
    if-nez v8, :cond_19a

    .line 399
    .line 400
    iget-boolean v8, v0, Lax/K/j;->N:Z

    .line 401
    .line 402
    if-nez v8, :cond_19a

    .line 403
    .line 404
    if-eqz v5, :cond_19a

    .line 405
    .line 406
    sget-object v8, Lax/K/j$e;->e0:Lax/K/j$e;

    .line 407
    .line 408
    invoke-virtual {v0, v8}, Lax/K/j;->setState(Lax/K/j$e;)V

    .line 409
    .line 410
    .line 411
    :cond_19a
    iget-boolean v8, v0, Lax/K/j;->i0:Z

    .line 412
    .line 413
    if-eqz v8, :cond_1a1

    .line 414
    .line 415
    invoke-virtual {v0}, Lax/K/j;->requestLayout()V

    .line 416
    .line 417
    .line 418
    :cond_1a1
    iget-boolean v8, v0, Lax/K/j;->a0:Z

    .line 419
    .line 420
    xor-int/2addr v5, v6

    .line 421
    or-int/2addr v5, v8

    .line 422
    iput-boolean v5, v0, Lax/K/j;->a0:Z

    .line 423
    .line 424
    cmpg-float v8, v12, v4

    .line 425
    .line 426
    if-gtz v8, :cond_1b7

    .line 427
    .line 428
    iget v8, v0, Lax/K/j;->B:I

    .line 429
    .line 430
    if-eq v8, v2, :cond_1b7

    .line 431
    .line 432
    iget v2, v0, Lax/K/j;->C:I

    .line 433
    .line 434
    if-ne v2, v8, :cond_1b4

    .line 435
    .line 436
    goto :goto_1b7

    .line 437
    :cond_1b4
    iput v8, v0, Lax/K/j;->C:I

    .line 438
    .line 439
    throw v15

    .line 440
    :cond_1b7
    :goto_1b7
    float-to-double v8, v12

    .line 441
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 442
    .line 443
    cmpl-double v2, v8, v10

    .line 444
    .line 445
    if-ltz v2, :cond_1c8

    .line 446
    .line 447
    iget v2, v0, Lax/K/j;->C:I

    .line 448
    .line 449
    iget v8, v0, Lax/K/j;->D:I

    .line 450
    .line 451
    if-ne v2, v8, :cond_1c5

    .line 452
    .line 453
    goto :goto_1c8

    .line 454
    :cond_1c5
    iput v8, v0, Lax/K/j;->C:I

    .line 455
    .line 456
    throw v15

    .line 457
    :cond_1c8
    :goto_1c8
    if-nez v5, :cond_1e3

    .line 458
    .line 459
    iget-boolean v2, v0, Lax/K/j;->N:Z

    .line 460
    .line 461
    if-eqz v2, :cond_1cf

    .line 462
    .line 463
    goto :goto_1e3

    .line 464
    :cond_1cf
    if-lez v13, :cond_1d5

    .line 465
    .line 466
    cmpl-float v2, v12, v3

    .line 467
    .line 468
    if-eqz v2, :cond_1dd

    .line 469
    .line 470
    :cond_1d5
    cmpg-float v2, v1, v4

    .line 471
    .line 472
    if-gez v2, :cond_1e6

    .line 473
    .line 474
    cmpl-float v2, v12, v4

    .line 475
    .line 476
    if-nez v2, :cond_1e6

    .line 477
    .line 478
    :cond_1dd
    sget-object v2, Lax/K/j$e;->e0:Lax/K/j$e;

    .line 479
    .line 480
    invoke-virtual {v0, v2}, Lax/K/j;->setState(Lax/K/j$e;)V

    .line 481
    .line 482
    .line 483
    goto :goto_1e6

    .line 484
    :cond_1e3
    :goto_1e3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 485
    .line 486
    .line 487
    :cond_1e6
    :goto_1e6
    iget-boolean v2, v0, Lax/K/j;->a0:Z

    .line 488
    .line 489
    if-nez v2, :cond_1ff

    .line 490
    .line 491
    iget-boolean v2, v0, Lax/K/j;->N:Z

    .line 492
    .line 493
    if-nez v2, :cond_1ff

    .line 494
    .line 495
    if-lez v13, :cond_1f4

    .line 496
    .line 497
    cmpl-float v2, v12, v3

    .line 498
    .line 499
    if-eqz v2, :cond_1fc

    .line 500
    .line 501
    :cond_1f4
    cmpg-float v1, v1, v4

    .line 502
    .line 503
    if-gez v1, :cond_1ff

    .line 504
    .line 505
    cmpl-float v1, v12, v4

    .line 506
    .line 507
    if-nez v1, :cond_1ff

    .line 508
    .line 509
    :cond_1fc
    invoke-virtual {v0}, Lax/K/j;->I()V

    .line 510
    .line 511
    .line 512
    :cond_1ff
    iget v1, v0, Lax/K/j;->J:F

    .line 513
    .line 514
    cmpl-float v2, v1, v3

    .line 515
    .line 516
    if-ltz v2, :cond_211

    .line 517
    .line 518
    iget v1, v0, Lax/K/j;->C:I

    .line 519
    .line 520
    iget v2, v0, Lax/K/j;->D:I

    .line 521
    .line 522
    if-eq v1, v2, :cond_20c

    .line 523
    .line 524
    goto :goto_20d

    .line 525
    :cond_20c
    const/4 v6, 0x0

    .line 526
    :goto_20d
    iput v2, v0, Lax/K/j;->C:I

    .line 527
    .line 528
    :goto_20f
    move v7, v6

    .line 529
    goto :goto_220

    .line 530
    :cond_211
    cmpg-float v1, v1, v4

    .line 531
    .line 532
    if-gtz v1, :cond_220

    .line 533
    .line 534
    iget v1, v0, Lax/K/j;->C:I

    .line 535
    .line 536
    iget v2, v0, Lax/K/j;->B:I

    .line 537
    .line 538
    if-eq v1, v2, :cond_21c

    .line 539
    .line 540
    goto :goto_21d

    .line 541
    :cond_21c
    const/4 v6, 0x0

    .line 542
    :goto_21d
    iput v2, v0, Lax/K/j;->C:I

    .line 543
    .line 544
    goto :goto_20f

    .line 545
    :cond_220
    :goto_220
    iget-boolean v1, v0, Lax/K/j;->s0:Z

    .line 546
    .line 547
    or-int/2addr v1, v7

    .line 548
    iput-boolean v1, v0, Lax/K/j;->s0:Z

    .line 549
    .line 550
    if-eqz v7, :cond_22e

    .line 551
    .line 552
    iget-boolean v1, v0, Lax/K/j;->k0:Z

    .line 553
    .line 554
    if-nez v1, :cond_22e

    .line 555
    .line 556
    invoke-virtual {v0}, Lax/K/j;->requestLayout()V

    .line 557
    .line 558
    .line 559
    :cond_22e
    iget v1, v0, Lax/K/j;->J:F

    .line 560
    .line 561
    iput v1, v0, Lax/K/j;->I:F

    .line 562
    .line 563
    return-void
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method protected H()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/K/j;->O:Lax/K/j$d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_f

    .line 5
    .line 6
    iget-object v0, p0, Lax/K/j;->e0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    if-eqz v0, :cond_42

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_42

    .line 15
    .line 16
    :cond_f
    iget v0, p0, Lax/K/j;->f0:I

    .line 17
    .line 18
    const/4 v2, -0x1

    .line 19
    if-ne v0, v2, :cond_42

    .line 20
    .line 21
    iget v0, p0, Lax/K/j;->C:I

    .line 22
    .line 23
    iput v0, p0, Lax/K/j;->f0:I

    .line 24
    .line 25
    iget-object v0, p0, Lax/K/j;->t0:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_32

    .line 32
    .line 33
    iget-object v0, p0, Lax/K/j;->t0:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    sub-int/2addr v3, v1

    .line 40
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    goto :goto_33

    .line 51
    :cond_32
    const/4 v0, -0x1

    .line 52
    :goto_33
    iget v3, p0, Lax/K/j;->C:I

    .line 53
    .line 54
    if-eq v0, v3, :cond_42

    .line 55
    .line 56
    if-eq v3, v2, :cond_42

    .line 57
    .line 58
    iget-object v0, p0, Lax/K/j;->t0:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_42
    invoke-direct {p0}, Lax/K/j;->J()V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lax/K/j;->m0:Ljava/lang/Runnable;

    .line 71
    .line 72
    if-eqz v0, :cond_4c

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 75
    .line 76
    .line 77
    :cond_4c
    iget-object v0, p0, Lax/K/j;->n0:[I

    .line 78
    .line 79
    if-eqz v0, :cond_66

    .line 80
    .line 81
    iget v2, p0, Lax/K/j;->o0:I

    .line 82
    .line 83
    if-lez v2, :cond_66

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    aget v0, v0, v2

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lax/K/j;->O(I)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lax/K/j;->n0:[I

    .line 92
    .line 93
    array-length v3, v0

    .line 94
    sub-int/2addr v3, v1

    .line 95
    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    .line 97
    .line 98
    iget v0, p0, Lax/K/j;->o0:I

    .line 99
    .line 100
    sub-int/2addr v0, v1

    .line 101
    iput v0, p0, Lax/K/j;->o0:I

    .line 102
    .line 103
    :cond_66
    return-void
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

.method I()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public K(FF)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/K/j;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1c

    .line 6
    .line 7
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 8
    .line 9
    if-nez v0, :cond_11

    .line 10
    .line 11
    new-instance v0, Lax/K/j$c;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lax/K/j$c;-><init>(Lax/K/j;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 17
    .line 18
    :cond_11
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lax/K/j$c;->e(F)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lax/K/j$c;->h(F)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    invoke-virtual {p0, p1}, Lax/K/j;->setProgress(F)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lax/K/j$e;->d0:Lax/K/j$e;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lax/K/j;->setState(Lax/K/j$e;)V

    .line 35
    .line 36
    .line 37
    iput p2, p0, Lax/K/j;->A:F

    .line 38
    .line 39
    const/high16 v0, 0x3f800000    # 1.0f

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    cmpl-float p2, p2, v1

    .line 43
    .line 44
    if-eqz p2, :cond_35

    .line 45
    .line 46
    if-lez p2, :cond_30

    .line 47
    .line 48
    goto :goto_31

    .line 49
    :cond_30
    const/4 v0, 0x0

    .line 50
    :goto_31
    invoke-virtual {p0, v0}, Lax/K/j;->E(F)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_35
    cmpl-float p2, p1, v1

    .line 55
    .line 56
    if-eqz p2, :cond_48

    .line 57
    .line 58
    cmpl-float p2, p1, v0

    .line 59
    .line 60
    if-eqz p2, :cond_48

    .line 61
    .line 62
    const/high16 p2, 0x3f000000    # 0.5f

    .line 63
    .line 64
    cmpl-float p1, p1, p2

    .line 65
    .line 66
    if-lez p1, :cond_44

    .line 67
    .line 68
    goto :goto_45

    .line 69
    :cond_44
    const/4 v0, 0x0

    .line 70
    :goto_45
    invoke-virtual {p0, v0}, Lax/K/j;->E(F)V

    .line 71
    .line 72
    .line 73
    :cond_48
    return-void
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

.method public L(III)V
    .registers 5

    .line 1
    sget-object v0, Lax/K/j$e;->c0:Lax/K/j$e;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/K/j;->setState(Lax/K/j$e;)V

    .line 4
    .line 5
    .line 6
    iput p1, p0, Lax/K/j;->C:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lax/K/j;->B:I

    .line 10
    .line 11
    iput v0, p0, Lax/K/j;->D:I

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/d;

    .line 14
    .line 15
    if-eqz v0, :cond_15

    .line 16
    .line 17
    int-to-float p2, p2

    .line 18
    int-to-float p3, p3

    .line 19
    invoke-virtual {v0, p1, p2, p3}, Landroidx/constraintlayout/widget/d;->d(IFF)V

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

.method public M(II)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/K/j;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1b

    .line 6
    .line 7
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 8
    .line 9
    if-nez v0, :cond_11

    .line 10
    .line 11
    new-instance v0, Lax/K/j$c;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lax/K/j$c;-><init>(Lax/K/j;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 17
    .line 18
    :cond_11
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lax/K/j$c;->f(I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lax/K/j$c;->d(I)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    return-void
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

.method public N()V
    .registers 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/K/j;->E(F)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lax/K/j;->m0:Ljava/lang/Runnable;

    .line 8
    .line 9
    return-void
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

.method public O(I)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/K/j;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_17

    .line 6
    .line 7
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 8
    .line 9
    if-nez v0, :cond_11

    .line 10
    .line 11
    new-instance v0, Lax/K/j$c;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lax/K/j$c;-><init>(Lax/K/j;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 17
    .line 18
    :cond_11
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lax/K/j$c;->d(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    const/4 v0, -0x1

    .line 25
    invoke-virtual {p0, p1, v0, v0}, Lax/K/j;->P(III)V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public P(III)V
    .registers 5

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lax/K/j;->Q(IIII)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public Q(IIII)V
    .registers 8

    .line 1
    iget p2, p0, Lax/K/j;->C:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_5

    .line 4
    .line 5
    goto :goto_3c

    .line 6
    :cond_5
    iget p3, p0, Lax/K/j;->B:I

    .line 7
    .line 8
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-ne p3, p1, :cond_16

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lax/K/j;->E(F)V

    .line 14
    .line 15
    .line 16
    if-lez p4, :cond_3c

    .line 17
    .line 18
    int-to-float p1, p4

    .line 19
    div-float/2addr p1, v0

    .line 20
    iput p1, p0, Lax/K/j;->H:F

    .line 21
    .line 22
    return-void

    .line 23
    :cond_16
    iget p3, p0, Lax/K/j;->D:I

    .line 24
    .line 25
    const/high16 v2, 0x3f800000    # 1.0f

    .line 26
    .line 27
    if-ne p3, p1, :cond_26

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Lax/K/j;->E(F)V

    .line 30
    .line 31
    .line 32
    if-lez p4, :cond_3c

    .line 33
    .line 34
    int-to-float p1, p4

    .line 35
    div-float/2addr p1, v0

    .line 36
    iput p1, p0, Lax/K/j;->H:F

    .line 37
    .line 38
    return-void

    .line 39
    :cond_26
    iput p1, p0, Lax/K/j;->D:I

    .line 40
    .line 41
    const/4 p3, -0x1

    .line 42
    if-eq p2, p3, :cond_3d

    .line 43
    .line 44
    invoke-virtual {p0, p2, p1}, Lax/K/j;->M(II)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v2}, Lax/K/j;->E(F)V

    .line 48
    .line 49
    .line 50
    iput v1, p0, Lax/K/j;->J:F

    .line 51
    .line 52
    invoke-virtual {p0}, Lax/K/j;->N()V

    .line 53
    .line 54
    .line 55
    if-lez p4, :cond_3c

    .line 56
    .line 57
    int-to-float p1, p4

    .line 58
    div-float/2addr p1, v0

    .line 59
    iput p1, p0, Lax/K/j;->H:F

    .line 60
    .line 61
    :cond_3c
    :goto_3c
    return-void

    .line 62
    :cond_3d
    const/4 p1, 0x0

    .line 63
    iput-boolean p1, p0, Lax/K/j;->Q:Z

    .line 64
    .line 65
    iput v2, p0, Lax/K/j;->L:F

    .line 66
    .line 67
    iput v1, p0, Lax/K/j;->I:F

    .line 68
    .line 69
    iput v1, p0, Lax/K/j;->J:F

    .line 70
    .line 71
    invoke-virtual {p0}, Lax/K/j;->getNanoTime()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    iput-wide v0, p0, Lax/K/j;->K:J

    .line 76
    .line 77
    invoke-virtual {p0}, Lax/K/j;->getNanoTime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    iput-wide v0, p0, Lax/K/j;->G:J

    .line 82
    .line 83
    iput-boolean p1, p0, Lax/K/j;->M:Z

    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    iput-object p1, p0, Lax/K/j;->y:Landroid/view/animation/Interpolator;

    .line 87
    .line 88
    if-ne p4, p3, :cond_5a

    .line 89
    .line 90
    throw p1

    .line 91
    :cond_5a
    iput p3, p0, Lax/K/j;->B:I

    .line 92
    .line 93
    throw p1
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
.end method

.method public b(Landroid/view/View;IIIII[I)V
    .registers 8

    .line 1
    iget-boolean p1, p0, Lax/K/j;->S:Z

    .line 2
    .line 3
    const/4 p6, 0x0

    .line 4
    if-nez p1, :cond_9

    .line 5
    .line 6
    if-nez p2, :cond_9

    .line 7
    .line 8
    if-eqz p3, :cond_14

    .line 9
    .line 10
    :cond_9
    aget p1, p7, p6

    .line 11
    .line 12
    add-int/2addr p1, p4

    .line 13
    aput p1, p7, p6

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    aget p2, p7, p1

    .line 17
    .line 18
    add-int/2addr p2, p5

    .line 19
    aput p2, p7, p1

    .line 20
    .line 21
    :cond_14
    iput-boolean p6, p0, Lax/K/j;->S:Z

    .line 22
    .line 23
    return-void
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
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/K/j;->d0:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_18

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_a
    if-ge v3, v2, :cond_18

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    check-cast v4, Lax/K/h;

    .line 20
    .line 21
    invoke-virtual {v4, p1}, Lax/K/h;->w(Landroid/graphics/Canvas;)V

    .line 22
    .line 23
    .line 24
    goto :goto_a

    .line 25
    :cond_18
    invoke-virtual {p0, v1}, Lax/K/j;->F(Z)V

    .line 26
    .line 27
    .line 28
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method public e(Landroid/view/View;IIIII)V
    .registers 7

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public f(Landroid/view/View;Landroid/view/View;II)Z
    .registers 5

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
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
.end method

.method public getConstraintSetIds()[I
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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
.end method

.method public getCurrentState()I
    .registers 2

    .line 1
    iget v0, p0, Lax/K/j;->C:I

    .line 2
    .line 3
    return v0
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
.end method

.method public getDefinedTransitions()Ljava/util/ArrayList;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lax/K/l$a;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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
.end method

.method public getDesignTool()Lax/K/b;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/K/j;->R:Lax/K/b;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/K/b;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lax/K/b;-><init>(Lax/K/j;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/K/j;->R:Lax/K/b;

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/K/j;->R:Lax/K/b;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getEndState()I
    .registers 2

    .line 1
    iget v0, p0, Lax/K/j;->D:I

    .line 2
    .line 3
    return v0
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
.end method

.method protected getNanoTime()J
    .registers 3

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

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
.end method

.method public getProgress()F
    .registers 2

    .line 1
    iget v0, p0, Lax/K/j;->J:F

    .line 2
    .line 3
    return v0
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
.end method

.method public getScene()Lax/K/l;
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
    .line 3
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
.end method

.method public getStartState()I
    .registers 2

    .line 1
    iget v0, p0, Lax/K/j;->B:I

    .line 2
    .line 3
    return v0
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
.end method

.method public getTargetPosition()F
    .registers 2

    .line 1
    iget v0, p0, Lax/K/j;->L:F

    .line 2
    .line 3
    return v0
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
.end method

.method public getTransitionState()Landroid/os/Bundle;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/K/j$c;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lax/K/j$c;-><init>(Lax/K/j;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 13
    .line 14
    invoke-virtual {v0}, Lax/K/j$c;->c()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 18
    .line 19
    invoke-virtual {v0}, Lax/K/j$c;->b()Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
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

.method public getTransitionTimeMs()J
    .registers 3

    .line 1
    iget v0, p0, Lax/K/j;->H:F

    .line 2
    .line 3
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 4
    .line 5
    mul-float v0, v0, v1

    .line 6
    .line 7
    float-to-long v0, v0

    .line 8
    return-wide v0
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

.method public getVelocity()F
    .registers 2

    .line 1
    iget v0, p0, Lax/K/j;->A:F

    .line 2
    .line 3
    return v0
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
.end method

.method public h(Landroid/view/View;Landroid/view/View;II)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/K/j;->getNanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iput-wide p1, p0, Lax/K/j;->V:J

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lax/K/j;->W:F

    .line 9
    .line 10
    iput p1, p0, Lax/K/j;->T:F

    .line 11
    .line 12
    iput p1, p0, Lax/K/j;->U:F

    .line 13
    .line 14
    return-void
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
.end method

.method public isAttachedToWindow()Z
    .registers 2

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
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

.method public o(Landroid/view/View;I)V
    .registers 3

    .line 1
    return-void
    .line 2
    .line 3
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

.method protected onAttachedToWindow()V
    .registers 3

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_f

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lax/K/j;->p0:I

    .line 15
    .line 16
    :cond_f
    invoke-virtual {p0}, Lax/K/j;->I()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 20
    .line 21
    if-eqz v0, :cond_26

    .line 22
    .line 23
    iget-boolean v1, p0, Lax/K/j;->q0:Z

    .line 24
    .line 25
    if-eqz v1, :cond_23

    .line 26
    .line 27
    new-instance v0, Lax/K/j$a;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lax/K/j$a;-><init>(Lax/K/j;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    invoke-virtual {v0}, Lax/K/j$c;->a()V

    .line 37
    .line 38
    .line 39
    :cond_26
    return-void
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

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 2

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
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

.method protected onLayout(ZIIII)V
    .registers 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/K/j;->k0:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_4
    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V
    :try_end_7
    .catchall {:try_start_4 .. :try_end_7} :catchall_b

    .line 6
    .line 7
    .line 8
    move-object p1, p0

    .line 9
    iput-boolean v1, p1, Lax/K/j;->k0:Z

    .line 10
    .line 11
    return-void

    .line 12
    :catchall_b
    move-exception v0

    .line 13
    move-object p1, p0

    .line 14
    move-object p2, v0

    .line 15
    iput-boolean v1, p1, Lax/K/j;->k0:Z

    .line 16
    .line 17
    throw p2
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
.end method

.method protected onMeasure(II)V
    .registers 3

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

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

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .registers 5

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
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
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .registers 4

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
    .line 3
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

.method public onRtlPropertiesChanged(I)V
    .registers 2

    .line 1
    return-void
    .line 2
    .line 3
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

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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

.method public onViewAdded(Landroid/view/View;)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lax/K/h;

    .line 5
    .line 6
    if-eqz v0, :cond_5b

    .line 7
    .line 8
    check-cast p1, Lax/K/h;

    .line 9
    .line 10
    iget-object v0, p0, Lax/K/j;->e0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    if-nez v0, :cond_14

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lax/K/j;->e0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    :cond_14
    iget-object v0, p0, Lax/K/j;->e0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lax/K/h;->v()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2f

    .line 31
    .line 32
    iget-object v0, p0, Lax/K/j;->b0:Ljava/util/ArrayList;

    .line 33
    .line 34
    if-nez v0, :cond_2a

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lax/K/j;->b0:Ljava/util/ArrayList;

    .line 42
    .line 43
    :cond_2a
    iget-object v0, p0, Lax/K/j;->b0:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_2f
    invoke-virtual {p1}, Lax/K/h;->u()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_45

    .line 53
    .line 54
    iget-object v0, p0, Lax/K/j;->c0:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-nez v0, :cond_40

    .line 57
    .line 58
    new-instance v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lax/K/j;->c0:Ljava/util/ArrayList;

    .line 64
    .line 65
    :cond_40
    iget-object v0, p0, Lax/K/j;->c0:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_45
    invoke-virtual {p1}, Lax/K/h;->t()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_5b

    .line 75
    .line 76
    iget-object v0, p0, Lax/K/j;->d0:Ljava/util/ArrayList;

    .line 77
    .line 78
    if-nez v0, :cond_56

    .line 79
    .line 80
    new-instance v0, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lax/K/j;->d0:Ljava/util/ArrayList;

    .line 86
    .line 87
    :cond_56
    iget-object v0, p0, Lax/K/j;->d0:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    :cond_5b
    return-void
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

.method public onViewRemoved(Landroid/view/View;)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/K/j;->b0:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    :cond_a
    iget-object v0, p0, Lax/K/j;->c0:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-eqz v0, :cond_11

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public p(Landroid/view/View;II[II)V
    .registers 6

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method public requestLayout()V
    .registers 1

    .line 1
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

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

.method public setDebugMode(I)V
    .registers 2

    .line 1
    iput p1, p0, Lax/K/j;->P:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public setDelayedApplicationOfInitialState(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/K/j;->q0:Z

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

.method public setInteractionEnabled(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/K/j;->E:Z

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

.method public setInterpolatedProgress(F)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/K/j;->setProgress(F)V

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

.method public setOnHide(F)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/K/j;->c0:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_19

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_9
    if-ge v1, v0, :cond_19

    .line 11
    .line 12
    iget-object v2, p0, Lax/K/j;->c0:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lax/K/h;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Lax/K/h;->setProgress(F)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_9

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
.end method

.method public setOnShow(F)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/K/j;->b0:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_19

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_9
    if-ge v1, v0, :cond_19

    .line 11
    .line 12
    iget-object v2, p0, Lax/K/j;->b0:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lax/K/h;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Lax/K/h;->setProgress(F)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_9

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
.end method

.method public setProgress(F)V
    .registers 7

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v2, p1, v1

    .line 5
    .line 6
    if-ltz v2, :cond_b

    .line 7
    .line 8
    cmpl-float v3, p1, v0

    .line 9
    .line 10
    if-lez v3, :cond_12

    .line 11
    .line 12
    :cond_b
    const-string v3, "MotionLayout"

    .line 13
    .line 14
    const-string v4, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"

    .line 15
    .line 16
    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    :cond_12
    invoke-virtual {p0}, Lax/K/j;->isAttachedToWindow()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_29

    .line 24
    .line 25
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 26
    .line 27
    if-nez v0, :cond_23

    .line 28
    .line 29
    new-instance v0, Lax/K/j$c;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lax/K/j$c;-><init>(Lax/K/j;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 35
    .line 36
    :cond_23
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lax/K/j$c;->e(F)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    if-gtz v2, :cond_4c

    .line 43
    .line 44
    iget p1, p0, Lax/K/j;->J:F

    .line 45
    .line 46
    cmpl-float p1, p1, v0

    .line 47
    .line 48
    if-nez p1, :cond_3c

    .line 49
    .line 50
    iget p1, p0, Lax/K/j;->C:I

    .line 51
    .line 52
    iget v0, p0, Lax/K/j;->D:I

    .line 53
    .line 54
    if-ne p1, v0, :cond_3c

    .line 55
    .line 56
    sget-object p1, Lax/K/j$e;->d0:Lax/K/j$e;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lax/K/j;->setState(Lax/K/j$e;)V

    .line 59
    .line 60
    .line 61
    :cond_3c
    iget p1, p0, Lax/K/j;->B:I

    .line 62
    .line 63
    iput p1, p0, Lax/K/j;->C:I

    .line 64
    .line 65
    iget p1, p0, Lax/K/j;->J:F

    .line 66
    .line 67
    cmpl-float p1, p1, v1

    .line 68
    .line 69
    if-nez p1, :cond_79

    .line 70
    .line 71
    sget-object p1, Lax/K/j$e;->e0:Lax/K/j$e;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lax/K/j;->setState(Lax/K/j$e;)V

    .line 74
    .line 75
    .line 76
    goto :goto_79

    .line 77
    :cond_4c
    cmpl-float p1, p1, v0

    .line 78
    .line 79
    if-ltz p1, :cond_71

    .line 80
    .line 81
    iget p1, p0, Lax/K/j;->J:F

    .line 82
    .line 83
    cmpl-float p1, p1, v1

    .line 84
    .line 85
    if-nez p1, :cond_61

    .line 86
    .line 87
    iget p1, p0, Lax/K/j;->C:I

    .line 88
    .line 89
    iget v1, p0, Lax/K/j;->B:I

    .line 90
    .line 91
    if-ne p1, v1, :cond_61

    .line 92
    .line 93
    sget-object p1, Lax/K/j$e;->d0:Lax/K/j$e;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Lax/K/j;->setState(Lax/K/j$e;)V

    .line 96
    .line 97
    .line 98
    :cond_61
    iget p1, p0, Lax/K/j;->D:I

    .line 99
    .line 100
    iput p1, p0, Lax/K/j;->C:I

    .line 101
    .line 102
    iget p1, p0, Lax/K/j;->J:F

    .line 103
    .line 104
    cmpl-float p1, p1, v0

    .line 105
    .line 106
    if-nez p1, :cond_79

    .line 107
    .line 108
    sget-object p1, Lax/K/j$e;->e0:Lax/K/j$e;

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Lax/K/j;->setState(Lax/K/j$e;)V

    .line 111
    .line 112
    .line 113
    goto :goto_79

    .line 114
    :cond_71
    const/4 p1, -0x1

    .line 115
    iput p1, p0, Lax/K/j;->C:I

    .line 116
    .line 117
    sget-object p1, Lax/K/j$e;->d0:Lax/K/j$e;

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Lax/K/j;->setState(Lax/K/j$e;)V

    .line 120
    .line 121
    .line 122
    :cond_79
    :goto_79
    return-void
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

.method public setScene(Lax/K/l;)V
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->r()Z

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    throw p1
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

.method setStartState(I)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/K/j;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1c

    .line 6
    .line 7
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 8
    .line 9
    if-nez v0, :cond_11

    .line 10
    .line 11
    new-instance v0, Lax/K/j$c;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lax/K/j$c;-><init>(Lax/K/j;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 17
    .line 18
    :cond_11
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lax/K/j$c;->f(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lax/K/j$c;->d(I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    iput p1, p0, Lax/K/j;->C:I

    .line 30
    .line 31
    return-void
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

.method setState(Lax/K/j$e;)V
    .registers 6

    .line 1
    sget-object v0, Lax/K/j$e;->e0:Lax/K/j$e;

    .line 2
    .line 3
    if-ne p1, v0, :cond_a

    .line 4
    .line 5
    iget v1, p0, Lax/K/j;->C:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-ne v1, v2, :cond_a

    .line 9
    .line 10
    goto :goto_39

    .line 11
    :cond_a
    iget-object v1, p0, Lax/K/j;->r0:Lax/K/j$e;

    .line 12
    .line 13
    iput-object p1, p0, Lax/K/j;->r0:Lax/K/j$e;

    .line 14
    .line 15
    sget-object v2, Lax/K/j$e;->d0:Lax/K/j$e;

    .line 16
    .line 17
    if-ne v1, v2, :cond_17

    .line 18
    .line 19
    if-ne p1, v2, :cond_17

    .line 20
    .line 21
    invoke-direct {p0}, Lax/K/j;->G()V

    .line 22
    .line 23
    .line 24
    :cond_17
    sget-object v3, Lax/K/j$b;->a:[I

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    aget v1, v3, v1

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-eq v1, v3, :cond_2f

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    if-eq v1, v3, :cond_2f

    .line 37
    .line 38
    const/4 v2, 0x3

    .line 39
    if-eq v1, v2, :cond_29

    .line 40
    .line 41
    goto :goto_39

    .line 42
    :cond_29
    if-ne p1, v0, :cond_39

    .line 43
    .line 44
    invoke-virtual {p0}, Lax/K/j;->H()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2f
    if-ne p1, v2, :cond_34

    .line 49
    .line 50
    invoke-direct {p0}, Lax/K/j;->G()V

    .line 51
    .line 52
    .line 53
    :cond_34
    if-ne p1, v0, :cond_39

    .line 54
    .line 55
    invoke-virtual {p0}, Lax/K/j;->H()V

    .line 56
    .line 57
    .line 58
    :cond_39
    :goto_39
    return-void
    .line 59
    .line 60
    .line 61
.end method

.method public setTransition(I)V
    .registers 2

    .line 1
    return-void
.end method

.method protected setTransition(Lax/K/l$a;)V
    .registers 2

    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public setTransitionDuration(I)V
    .registers 3

    .line 1
    const-string p1, "MotionLayout"

    .line 2
    .line 3
    const-string v0, "MotionScene not defined"

    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
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

.method public setTransitionListener(Lax/K/j$d;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/K/j;->O:Lax/K/j$d;

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

.method public setTransitionState(Landroid/os/Bundle;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/K/j$c;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lax/K/j$c;-><init>(Lax/K/j;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 11
    .line 12
    :cond_b
    iget-object v0, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lax/K/j$c;->g(Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lax/K/j;->isAttachedToWindow()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1b

    .line 22
    .line 23
    iget-object p1, p0, Lax/K/j;->l0:Lax/K/j$c;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/K/j$c;->a()V

    .line 26
    .line 27
    .line 28
    :cond_1b
    return-void
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

.method protected t(I)V
    .registers 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/d;

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

.method public toString()Ljava/lang/String;
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lax/K/j;->B:I

    .line 11
    .line 12
    invoke-static {v0, v2}, Lax/K/a;->a(Landroid/content/Context;I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, "->"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Lax/K/j;->D:I

    .line 25
    .line 26
    invoke-static {v0, v2}, Lax/K/a;->a(Landroid/content/Context;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " (pos:"

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v0, p0, Lax/K/j;->J:F

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, " Dpos/Dt:"

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v0, p0, Lax/K/j;->A:F

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
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
