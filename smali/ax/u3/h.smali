.class public Lax/u3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Landroidx/appcompat/app/a$a;
    .registers 2

    .line 1
    const v0, 0x7f140153

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lax/u3/h;->c(Landroid/content/Context;I)Landroidx/appcompat/app/a$a;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
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

.method public static b(Landroid/content/Context;)Landroidx/appcompat/app/a$a;
    .registers 2

    .line 1
    const v0, 0x7f140154

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lax/u3/h;->c(Landroid/content/Context;I)Landroidx/appcompat/app/a$a;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
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

.method private static c(Landroid/content/Context;I)Landroidx/appcompat/app/a$a;
    .registers 6

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const v2, 0x7f0402c0

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 15
    .line 16
    .line 17
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 18
    .line 19
    if-eqz v0, :cond_22

    .line 20
    .line 21
    new-instance v0, Lax/s/c;

    .line 22
    .line 23
    const v1, 0x7f140155

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0, v1}, Lax/s/c;-><init>(Landroid/content/Context;I)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lax/B6/b;

    .line 30
    .line 31
    invoke-direct {p0, v0, p1}, Lax/B6/b;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_22
    new-instance v0, Lax/s/c;

    .line 36
    .line 37
    const v1, 0x7f140152

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p0, v1}, Lax/s/c;-><init>(Landroid/content/Context;I)V

    .line 41
    .line 42
    .line 43
    new-instance p0, Lax/B6/b;

    .line 44
    .line 45
    invoke-direct {p0, v0, p1}, Lax/B6/b;-><init>(Landroid/content/Context;I)V

    .line 46
    .line 47
    .line 48
    return-object p0
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
