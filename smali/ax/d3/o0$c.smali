.class Lax/d3/o0$c;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private h:Landroid/content/Context;

.field final synthetic i:Lax/d3/o0;


# direct methods
.method constructor <init>(Lax/d3/o0;Landroid/content/Context;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/d3/o0$c;->i:Lax/d3/o0;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lax/d3/o0$c;->h:Landroid/content/Context;

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
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/d3/o0$c;->w([Ljava/lang/Void;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/d3/o0$c;->x(Ljava/lang/Boolean;)V

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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Boolean;
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/o0$c;->h:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {}, Lax/w3/h;->c()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Lax/P2/a;->o(Landroid/content/Context;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected x(Ljava/lang/Boolean;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_3c

    .line 6
    .line 7
    iget-object p1, p0, Lax/d3/o0$c;->h:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {p1}, Lax/P2/a;->r(Landroid/content/Context;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_3c

    .line 14
    .line 15
    iget-object p1, p0, Lax/d3/o0$c;->i:Lax/d3/o0;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v0, 0x0

    .line 22
    if-eqz p1, :cond_29

    .line 23
    .line 24
    iget-object p1, p0, Lax/d3/o0$c;->i:Lax/d3/o0;

    .line 25
    .line 26
    invoke-static {p1}, Lax/d3/o0;->d3(Lax/d3/o0;)Landroidx/preference/PreferenceScreen;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v1, "use_custom_codec"

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroidx/preference/PreferenceGroup;->V0(Ljava/lang/CharSequence;)Landroidx/preference/Preference;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Landroidx/preference/CheckBoxPreference;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroidx/preference/TwoStatePreference;->U0(Z)V

    .line 39
    .line 40
    .line 41
    goto :goto_2e

    .line 42
    :cond_29
    iget-object p1, p0, Lax/d3/o0$c;->h:Landroid/content/Context;

    .line 43
    .line 44
    invoke-static {p1, v0}, Lax/t3/l;->n(Landroid/content/Context;Z)V

    .line 45
    .line 46
    .line 47
    :goto_2e
    iget-object p1, p0, Lax/d3/o0$c;->h:Landroid/content/Context;

    .line 48
    .line 49
    const v0, 0x7f13013e

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3c
    iget-object p1, p0, Lax/d3/o0$c;->h:Landroid/content/Context;

    .line 62
    .line 63
    invoke-static {p1}, Lax/P2/a;->m(Landroid/content/Context;)Z

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lax/d3/o0$c;->i:Lax/d3/o0;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    instance-of p1, p1, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 73
    .line 74
    if-eqz p1, :cond_56

    .line 75
    .line 76
    iget-object p1, p0, Lax/d3/o0$c;->i:Lax/d3/o0;

    .line 77
    .line 78
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->f0()Landroidx/fragment/app/f;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z3()V

    .line 85
    .line 86
    .line 87
    :cond_56
    return-void
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
