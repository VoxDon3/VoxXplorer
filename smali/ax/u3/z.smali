.class public Lax/u3/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static final b:[I

.field static c:Z

.field static d:Z

.field private static e:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/u3/z;->a:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    new-array v0, v0, [I

    .line 10
    .line 11
    sput-object v0, Lax/u3/z;->b:[I

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

.method public static A(Landroid/content/Context;)V
    .registers 3

    .line 1
    sget-object v0, Lax/u3/z;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    sget-boolean v1, Lax/u3/z;->c:Z

    .line 5
    .line 6
    if-nez v1, :cond_14

    .line 7
    .line 8
    sget-boolean v1, Lax/u3/z;->d:Z
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_12

    .line 9
    .line 10
    if-nez v1, :cond_14

    .line 11
    .line 12
    :try_start_b
    invoke-static {p0}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    sput-boolean p0, Lax/u3/z;->d:Z
    :try_end_11
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_11} :catch_14
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_b .. :try_end_11} :catch_14
    .catchall {:try_start_b .. :try_end_11} :catchall_12

    .line 17
    .line 18
    goto :goto_14

    .line 19
    :catchall_12
    move-exception p0

    .line 20
    goto :goto_16

    .line 21
    :catch_14
    :cond_14
    :goto_14
    :try_start_14
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :goto_16
    monitor-exit v0
    :try_end_17
    .catchall {:try_start_14 .. :try_end_17} :catchall_12

    .line 24
    throw p0
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
.end method

.method public static B(Landroid/app/Activity;I)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1}, Lax/u3/z;->j(I)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const v1, 0x3ecccccd    # 0.4f

    .line 18
    .line 19
    .line 20
    cmpl-float p1, p1, v1

    .line 21
    .line 22
    if-lez p1, :cond_1d

    .line 23
    .line 24
    or-int/lit16 p1, v0, 0x2000

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    and-int/lit16 p1, v0, -0x2001

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public static C(Landroid/content/Context;Landroid/view/MenuItem;I)V
    .registers 3

    .line 1
    invoke-static {p0, p2}, Lax/Q/b;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p2, p1, Lax/V/b;

    .line 6
    .line 7
    if-eqz p2, :cond_e

    .line 8
    .line 9
    check-cast p1, Lax/V/b;

    .line 10
    .line 11
    invoke-interface {p1, p0}, Lax/V/b;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    instance-of p2, p1, Lax/t/c;

    .line 16
    .line 17
    if-eqz p2, :cond_18

    .line 18
    .line 19
    check-cast p1, Lax/t/c;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Lax/t/c;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    invoke-static {}, Lax/X2/Q;->i1()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_21

    .line 30
    .line 31
    invoke-static {p1, p0}, Lax/u3/x;->a(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 32
    .line 33
    .line 34
    :cond_21
    return-void
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

.method public static D(Landroid/content/Context;II)V
    .registers 5

    .line 1
    invoke-static {p0}, Lax/u3/B;->N(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Lax/X2/Q;->b0()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_33

    .line 10
    .line 11
    if-nez v0, :cond_33

    .line 12
    .line 13
    new-instance v0, Landroid/widget/Toast;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Landroid/widget/Toast;->setDuration(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const p2, 0x7f0d0138

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {p0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const p2, 0x7f0a02f8

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_33
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 57
    .line 58
    .line 59
    return-void
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

.method public static E(Landroid/content/Context;Landroid/view/View;)V
    .registers 3

    .line 1
    :try_start_0
    const-string v0, "input_method"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInputFromInputMethod(Landroid/os/IBinder;I)V
    :try_end_13
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_13} :catch_13

    .line 18
    .line 19
    .line 20
    :catch_13
    return-void
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

.method public static F(Landroid/content/Context;)Z
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x1

    .line 4
    :goto_3
    const/4 v3, 0x5

    .line 5
    if-gt v2, v3, :cond_18

    .line 6
    .line 7
    invoke-static {p0}, Lax/u3/z;->z(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    goto :goto_18

    .line 14
    :cond_d
    if-ne v2, v3, :cond_10

    .line 15
    .line 16
    goto :goto_18

    .line 17
    :cond_10
    const-wide/16 v3, 0x64

    .line 18
    .line 19
    :try_start_12
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_15
    .catch Ljava/lang/InterruptedException; {:try_start_12 .. :try_end_15} :catch_15

    .line 20
    .line 21
    .line 22
    :catch_15
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_18
    :goto_18
    xor-int/lit8 p0, v0, 0x1

    .line 26
    .line 27
    return p0
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

.method public static a(Landroid/app/Activity;)Z
    .registers 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    if-gt v0, v1, :cond_17

    .line 6
    .line 7
    invoke-static {p0}, Lax/u3/z;->w(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_15

    .line 12
    .line 13
    invoke-static {p0}, Lax/u3/z;->b(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_13

    .line 18
    .line 19
    goto :goto_15

    .line 20
    :cond_13
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_15
    :goto_15
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_17
    invoke-static {p0}, Lax/u3/z;->x(Landroid/app/Activity;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
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

.method public static b(Landroid/content/Context;)Z
    .registers 3

    .line 1
    const-string v0, "uimode"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/app/UiModeManager;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p0, :cond_c

    .line 11
    .line 12
    return v0

    .line 13
    :cond_c
    invoke-virtual {p0}, Landroid/app/UiModeManager;->getNightMode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p0, v1, :cond_1a

    .line 19
    .line 20
    if-eqz p0, :cond_1a

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    if-ne p0, v1, :cond_19

    .line 24
    .line 25
    goto :goto_1a

    .line 26
    :cond_19
    return v0

    .line 27
    :cond_1a
    :goto_1a
    const/4 p0, 0x1

    .line 28
    return p0
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

.method public static c(Lax/n/c;)V
    .registers 4

    .line 1
    invoke-static {p0}, Lax/t3/j;->i(Landroid/content/Context;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Lax/u3/z;->w(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v0, v2, :cond_e

    .line 11
    .line 12
    if-eqz v1, :cond_e

    .line 13
    .line 14
    goto :goto_21

    .line 15
    :cond_e
    const/4 v2, 0x2

    .line 16
    if-ne v0, v2, :cond_14

    .line 17
    .line 18
    if-nez v1, :cond_14

    .line 19
    .line 20
    goto :goto_21

    .line 21
    :cond_14
    const/4 v2, -0x1

    .line 22
    if-ne v0, v2, :cond_24

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lax/u3/z;->w(Landroid/content/Context;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eq v0, v1, :cond_24

    .line 33
    .line 34
    :goto_21
    invoke-static {p0}, Lax/u3/z;->g(Lax/n/c;)V

    .line 35
    .line 36
    .line 37
    :cond_24
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
.end method

.method public static d(Landroid/graphics/Bitmap;)[B
    .registers 4

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 7
    .line 8
    const/16 v2, 0x64

    .line 9
    .line 10
    invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static e(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .registers 6

    .line 1
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_12

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_12

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_12
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-lez v0, :cond_2e

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-gtz v0, :cond_1f

    .line 30
    .line 31
    goto :goto_2e

    .line 32
    :cond_1f
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_35

    .line 47
    :cond_2e
    :goto_2e
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_35
    new-instance v1, Landroid/graphics/Canvas;

    .line 55
    .line 56
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-virtual {p0, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 72
    .line 73
    .line 74
    return-object v0
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
.end method

.method public static f(Landroid/graphics/drawable/Drawable;II)Landroid/graphics/Bitmap;
    .registers 4

    .line 1
    invoke-static {p0}, Lax/u3/z;->e(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p0, p1, p2, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
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

.method public static g(Lax/n/c;)V
    .registers 3

    .line 1
    if-nez p0, :cond_3

    .line 2
    .line 3
    return-void

    .line 4
    :cond_3
    instance-of v0, p0, Lcom/voxdon/xplorer/activity/b;

    .line 5
    .line 6
    if-eqz v0, :cond_1a

    .line 7
    .line 8
    invoke-virtual {p0}, Lax/n/c;->getDelegate()Lax/n/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lax/n/f;->f()Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const v0, 0x7f140559

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p0, v0, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    instance-of p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 28
    .line 29
    if-eqz p0, :cond_1f

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1f
    const-string p0, "?"

    .line 33
    .line 34
    invoke-static {p0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 35
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
.end method

.method public static h(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .registers 5

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
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 12
    .line 13
    .line 14
    iget p1, v0, Landroid/util/TypedValue;->resourceId:I

    .line 15
    .line 16
    invoke-static {p0, p1}, Lax/Q/b;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
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

.method public static i(Landroid/content/Context;IF)F
    .registers 5

    .line 1
    sget-object v0, Lax/u3/z;->b:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-static {p0, p1, v0}, Landroidx/appcompat/widget/L;->u(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/appcompat/widget/L;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :try_start_a
    invoke-virtual {p0, v1, p2}, Landroidx/appcompat/widget/L;->i(IF)F

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_e
    .catchall {:try_start_a .. :try_end_e} :catchall_12

    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/widget/L;->x()V

    .line 16
    .line 17
    .line 18
    return p1

    .line 19
    :catchall_12
    move-exception p1

    .line 20
    invoke-virtual {p0}, Landroidx/appcompat/widget/L;->x()V

    .line 21
    .line 22
    .line 23
    throw p1
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

.method public static j(I)F
    .registers 19

    .line 1
    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-double v0, v0

    .line 6
    const-wide v2, 0x406fe00000000000L    # 255.0

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    div-double/2addr v0, v2

    .line 12
    const-wide v4, 0x4003333333333333L    # 2.4

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide v6, 0x3ff0e147ae147ae1L    # 1.055

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const-wide v8, 0x3fac28f5c28f5c29L    # 0.055

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const-wide v10, 0x4029d70a3d70a3d7L    # 12.92

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const-wide v12, 0x3fa41c8216c61523L    # 0.03928

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    cmpg-double v14, v0, v12

    .line 38
    .line 39
    if-gez v14, :cond_2a

    .line 40
    .line 41
    div-double/2addr v0, v10

    .line 42
    goto :goto_30

    .line 43
    :cond_2a
    add-double/2addr v0, v8

    .line 44
    div-double/2addr v0, v6

    .line 45
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    :goto_30
    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->green(I)I

    .line 50
    .line 51
    .line 52
    move-result v14

    .line 53
    int-to-double v14, v14

    .line 54
    div-double/2addr v14, v2

    .line 55
    cmpg-double v16, v14, v12

    .line 56
    .line 57
    if-gez v16, :cond_3e

    .line 58
    .line 59
    div-double/2addr v14, v10

    .line 60
    :goto_3b
    move-wide/from16 v16, v2

    .line 61
    .line 62
    goto :goto_45

    .line 63
    :cond_3e
    add-double/2addr v14, v8

    .line 64
    div-double/2addr v14, v6

    .line 65
    invoke-static {v14, v15, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 66
    .line 67
    .line 68
    move-result-wide v14

    .line 69
    goto :goto_3b

    .line 70
    :goto_45
    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->blue(I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    int-to-double v2, v2

    .line 75
    div-double v2, v2, v16

    .line 76
    .line 77
    cmpg-double v16, v2, v12

    .line 78
    .line 79
    if-gez v16, :cond_52

    .line 80
    .line 81
    div-double/2addr v2, v10

    .line 82
    goto :goto_58

    .line 83
    :cond_52
    add-double/2addr v2, v8

    .line 84
    div-double/2addr v2, v6

    .line 85
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    :goto_58
    const-wide v4, 0x3fcb367a0f9096bcL    # 0.2126

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    mul-double v0, v0, v4

    .line 95
    .line 96
    const-wide v4, 0x3fe6e2eb1c432ca5L    # 0.7152

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    mul-double v14, v14, v4

    .line 102
    .line 103
    add-double/2addr v0, v14

    .line 104
    const-wide v4, 0x3fb27bb2fec56d5dL    # 0.0722

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    mul-double v2, v2, v4

    .line 110
    .line 111
    add-double/2addr v0, v2

    .line 112
    double-to-float v0, v0

    .line 113
    return v0
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

.method public static k(Landroid/content/Context;IIII)Landroid/graphics/drawable/LayerDrawable;
    .registers 5

    .line 1
    invoke-static {p0, p1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lax/U/a;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p3, :cond_15

    .line 14
    .line 15
    invoke-static {p0, p3}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    invoke-static {p1, p3}, Lax/U/a;->n(Landroid/graphics/drawable/Drawable;I)V

    .line 20
    .line 21
    .line 22
    :cond_15
    invoke-static {p0, p2}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p2}, Lax/U/a;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-eqz p4, :cond_2a

    .line 35
    .line 36
    invoke-static {p0, p4}, Lax/Q/b;->c(Landroid/content/Context;I)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p2, p0}, Lax/U/a;->n(Landroid/graphics/drawable/Drawable;I)V

    .line 41
    .line 42
    .line 43
    :cond_2a
    new-instance p0, Landroid/graphics/drawable/LayerDrawable;

    .line 44
    .line 45
    const/4 p3, 0x2

    .line 46
    new-array p3, p3, [Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    const/4 p4, 0x0

    .line 49
    aput-object p1, p3, p4

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    aput-object p2, p3, p1

    .line 53
    .line 54
    invoke-direct {p0, p3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 55
    .line 56
    .line 57
    return-object p0
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

.method public static l(Landroid/app/Activity;)I
    .registers 9

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-instance v1, Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 27
    .line 28
    .line 29
    iget p0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 30
    .line 31
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 32
    .line 33
    const/16 v2, 0x8

    .line 34
    .line 35
    const/16 v3, 0x9

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x3

    .line 39
    const/4 v6, 0x2

    .line 40
    const/4 v7, 0x1

    .line 41
    if-eqz v0, :cond_2c

    .line 42
    .line 43
    if-ne v0, v6, :cond_2e

    .line 44
    .line 45
    :cond_2c
    if-gt v1, p0, :cond_42

    .line 46
    .line 47
    :cond_2e
    if-eq v0, v7, :cond_32

    .line 48
    .line 49
    if-ne v0, v5, :cond_35

    .line 50
    .line 51
    :cond_32
    if-le p0, v1, :cond_35

    .line 52
    .line 53
    goto :goto_42

    .line 54
    :cond_35
    if-eqz v0, :cond_41

    .line 55
    .line 56
    if-eq v0, v7, :cond_40

    .line 57
    .line 58
    if-eq v0, v6, :cond_3f

    .line 59
    .line 60
    if-eq v0, v5, :cond_3e

    .line 61
    .line 62
    return v4

    .line 63
    :cond_3e
    return v3

    .line 64
    :cond_3f
    return v2

    .line 65
    :cond_40
    return v7

    .line 66
    :cond_41
    return v4

    .line 67
    :cond_42
    :goto_42
    if-eqz v0, :cond_4e

    .line 68
    .line 69
    if-eq v0, v7, :cond_4d

    .line 70
    .line 71
    if-eq v0, v6, :cond_4c

    .line 72
    .line 73
    if-eq v0, v5, :cond_4b

    .line 74
    .line 75
    return v7

    .line 76
    :cond_4b
    return v2

    .line 77
    :cond_4c
    return v3

    .line 78
    :cond_4d
    return v4

    .line 79
    :cond_4e
    return v7
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

.method public static m(Lax/c0/F0;)Lax/T/b;
    .registers 3

    .line 1
    invoke-static {}, Lax/c0/F0$m;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lax/c0/F0;->f(I)Lax/T/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Lax/c0/F0$m;->b()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0, v1}, Lax/c0/F0;->f(I)Lax/T/b;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {v0, p0}, Lax/T/b;->a(Lax/T/b;Lax/T/b;)Lax/T/b;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
    .line 22
.end method

.method public static n(Landroid/content/Context;)I
    .registers 4

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
    move-result-object p0

    .line 10
    const v1, 0x7f040116

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {p0, v1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 15
    .line 16
    .line 17
    iget p0, v0, Landroid/util/TypedValue;->data:I

    .line 18
    .line 19
    return p0
    .line 20
    .line 21
    .line 22
.end method

.method public static o(Landroid/content/Context;I)I
    .registers 4

    .line 1
    sget-object v0, Lax/u3/z;->b:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-static {p0, p1, v0}, Landroidx/appcompat/widget/L;->u(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/appcompat/widget/L;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :try_start_a
    invoke-virtual {p0, v1, v1}, Landroidx/appcompat/widget/L;->b(II)I

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_e
    .catchall {:try_start_a .. :try_end_e} :catchall_12

    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/widget/L;->x()V

    .line 16
    .line 17
    .line 18
    return p1

    .line 19
    :catchall_12
    move-exception p1

    .line 20
    invoke-virtual {p0}, Landroidx/appcompat/widget/L;->x()V

    .line 21
    .line 22
    .line 23
    throw p1
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

.method public static p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .registers 3

    .line 1
    if-eqz p1, :cond_14

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_10

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_c

    .line 8
    .line 9
    const p1, 0x7f08016d

    .line 10
    .line 11
    .line 12
    goto :goto_17

    .line 13
    :cond_c
    const p1, 0x7f08015a

    .line 14
    .line 15
    .line 16
    goto :goto_17

    .line 17
    :cond_10
    const p1, 0x7f080153

    .line 18
    .line 19
    .line 20
    goto :goto_17

    .line 21
    :cond_14
    const p1, 0x7f08015e

    .line 22
    .line 23
    .line 24
    :goto_17
    invoke-static {p0, p1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lax/U/a;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const v0, 0x7f04011e

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v0}, Lax/u3/z;->o(Landroid/content/Context;I)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p1, p0}, Lax/U/a;->n(Landroid/graphics/drawable/Drawable;I)V

    .line 44
    .line 45
    .line 46
    return-object p1
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
.end method

.method public static q(Landroid/app/Activity;)V
    .registers 3

    .line 1
    sget-boolean v0, Lax/u3/z;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_20

    .line 4
    .line 5
    invoke-static {p0}, Lax/u3/z;->w(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :try_start_8
    new-instance v1, Landroid/webkit/WebView;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/webkit/WebView;->destroy()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    sput-boolean v1, Lax/u3/z;->c:Z
    :try_end_13
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_13} :catch_14
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_8 .. :try_end_13} :catch_14
    .catch Ljava/lang/NoSuchMethodError; {:try_start_8 .. :try_end_13} :catch_14
    .catch Ljava/lang/VerifyError; {:try_start_8 .. :try_end_13} :catch_14

    .line 19
    .line 20
    goto :goto_15

    .line 21
    :catch_14
    nop

    .line 22
    :goto_15
    invoke-static {p0}, Lax/u3/z;->w(Landroid/content/Context;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eq v0, v1, :cond_20

    .line 27
    .line 28
    check-cast p0, Lax/n/c;

    .line 29
    .line 30
    invoke-static {p0}, Lax/u3/z;->g(Lax/n/c;)V

    .line 31
    .line 32
    .line 33
    :cond_20
    return-void
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

.method private static r(Landroid/content/Context;)Z
    .registers 6

    .line 1
    invoke-static {}, Lax/X2/Q;->B0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    :try_start_9
    invoke-static {}, Lax/X2/Q;->F0()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_23

    .line 15
    .line 16
    invoke-static {p0}, Lax/u3/y;->a(Landroid/content/Context;)Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_2b

    .line 21
    :catchall_14
    move-exception p0

    .line 22
    goto/16 :goto_8a

    .line 23
    .line 24
    :catch_17
    move-exception p0

    .line 25
    goto/16 :goto_81

    .line 26
    .line 27
    :catch_1a
    nop

    .line 28
    goto/16 :goto_90

    .line 29
    .line 30
    :catch_1d
    nop

    .line 31
    goto/16 :goto_96

    .line 32
    .line 33
    :catch_20
    nop

    .line 34
    goto/16 :goto_9c

    .line 35
    .line 36
    :cond_23
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :goto_2b
    if-nez p0, :cond_2e

    .line 45
    .line 46
    return v1

    .line 47
    :cond_2e
    new-instance v2, Ljava/io/File;

    .line 48
    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p0, "/app_webview/webview_data.lock"

    .line 62
    .line 63
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_4f

    .line 78
    .line 79
    return v1

    .line 80
    :cond_4f
    new-instance p0, Ljava/io/RandomAccessFile;

    .line 81
    .line 82
    const-string v3, "rw"

    .line 83
    .line 84
    invoke-direct {p0, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_56
    .catch Ljava/io/FileNotFoundException; {:try_start_9 .. :try_end_56} :catch_20
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_56} :catch_1d
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_9 .. :try_end_56} :catch_1a
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_56} :catch_17
    .catchall {:try_start_9 .. :try_end_56} :catchall_14

    .line 85
    .line 86
    .line 87
    :try_start_56
    invoke-static {p0}, Lax/u3/w;->a(Ljava/io/RandomAccessFile;)Ljava/nio/channels/FileChannel;

    .line 88
    .line 89
    .line 90
    move-result-object v2
    :try_end_5a
    .catch Ljava/io/FileNotFoundException; {:try_start_56 .. :try_end_5a} :catch_7e
    .catch Ljava/io/IOException; {:try_start_56 .. :try_end_5a} :catch_7b
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_56 .. :try_end_5a} :catch_69
    .catch Ljava/lang/RuntimeException; {:try_start_56 .. :try_end_5a} :catch_64
    .catchall {:try_start_56 .. :try_end_5a} :catchall_5f

    .line 91
    :try_start_5a
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    .line 92
    .line 93
    .line 94
    move-result-object v0
    :try_end_5e
    .catch Ljava/io/IOException; {:try_start_5a .. :try_end_5e} :catch_6c
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_5a .. :try_end_5e} :catch_69
    .catch Ljava/lang/RuntimeException; {:try_start_5a .. :try_end_5e} :catch_64
    .catchall {:try_start_5a .. :try_end_5e} :catchall_5f

    .line 95
    goto :goto_6d

    .line 96
    :catchall_5f
    move-exception v0

    .line 97
    move-object v4, v0

    .line 98
    move-object v0, p0

    .line 99
    move-object p0, v4

    .line 100
    goto :goto_8a

    .line 101
    :catch_64
    move-exception v0

    .line 102
    move-object v4, v0

    .line 103
    move-object v0, p0

    .line 104
    move-object p0, v4

    .line 105
    goto :goto_81

    .line 106
    :catch_69
    nop

    .line 107
    move-object v0, p0

    .line 108
    goto :goto_90

    .line 109
    :catch_6c
    nop

    .line 110
    :goto_6d
    if-nez v0, :cond_74

    .line 111
    .line 112
    :try_start_6f
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_72
    .catch Ljava/lang/Exception; {:try_start_6f .. :try_end_72} :catch_72

    .line 113
    .line 114
    .line 115
    :catch_72
    const/4 p0, 0x1

    .line 116
    return p0

    .line 117
    :cond_74
    :try_start_74
    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->release()V
    :try_end_77
    .catch Ljava/io/FileNotFoundException; {:try_start_74 .. :try_end_77} :catch_7e
    .catch Ljava/io/IOException; {:try_start_74 .. :try_end_77} :catch_7b
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_74 .. :try_end_77} :catch_69
    .catch Ljava/lang/RuntimeException; {:try_start_74 .. :try_end_77} :catch_64
    .catchall {:try_start_74 .. :try_end_77} :catchall_5f

    .line 118
    .line 119
    .line 120
    :try_start_77
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_7a
    .catch Ljava/lang/Exception; {:try_start_77 .. :try_end_7a} :catch_7a

    .line 121
    .line 122
    .line 123
    :catch_7a
    return v1

    .line 124
    :catch_7b
    nop

    .line 125
    move-object v0, p0

    .line 126
    goto :goto_96

    .line 127
    :catch_7e
    nop

    .line 128
    move-object v0, p0

    .line 129
    goto :goto_9c

    .line 130
    :goto_81
    :try_start_81
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_84
    .catchall {:try_start_81 .. :try_end_84} :catchall_14

    .line 131
    .line 132
    .line 133
    if-eqz v0, :cond_89

    .line 134
    .line 135
    :try_start_86
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_89
    .catch Ljava/lang/Exception; {:try_start_86 .. :try_end_89} :catch_89

    .line 136
    .line 137
    .line 138
    :catch_89
    :cond_89
    return v1

    .line 139
    :goto_8a
    if-eqz v0, :cond_8f

    .line 140
    .line 141
    :try_start_8c
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_8f
    .catch Ljava/lang/Exception; {:try_start_8c .. :try_end_8f} :catch_8f

    .line 142
    .line 143
    .line 144
    :catch_8f
    :cond_8f
    throw p0

    .line 145
    :goto_90
    if-eqz v0, :cond_95

    .line 146
    .line 147
    :try_start_92
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_95
    .catch Ljava/lang/Exception; {:try_start_92 .. :try_end_95} :catch_95

    .line 148
    .line 149
    .line 150
    :catch_95
    :cond_95
    return v1

    .line 151
    :goto_96
    if-eqz v0, :cond_9b

    .line 152
    .line 153
    :try_start_98
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_9b
    .catch Ljava/lang/Exception; {:try_start_98 .. :try_end_9b} :catch_9b

    .line 154
    .line 155
    .line 156
    :catch_9b
    :cond_9b
    return v1

    .line 157
    :goto_9c
    if-eqz v0, :cond_a1

    .line 158
    .line 159
    :try_start_9e
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_a1
    .catch Ljava/lang/Exception; {:try_start_9e .. :try_end_a1} :catch_a1

    .line 160
    .line 161
    .line 162
    :catch_a1
    :cond_a1
    return v1
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
.end method

.method public static s(Landroid/view/ViewGroup;Landroid/view/View;)Z
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_17

    .line 3
    .line 4
    if-nez p1, :cond_6

    .line 5
    .line 6
    goto :goto_17

    .line 7
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_a
    if-eq p0, p1, :cond_13

    .line 12
    .line 13
    if-eqz p1, :cond_13

    .line 14
    .line 15
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_a

    .line 20
    :cond_13
    if-ne p1, p0, :cond_17

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_17
    :goto_17
    return v0
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

.method public static t(Landroid/content/Context;)Z
    .registers 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/app/ActivityManager;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p0, :cond_c

    .line 11
    .line 12
    return v0

    .line 13
    :cond_c
    :try_start_c
    new-instance v1, Landroid/app/ActivityManager$MemoryInfo;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 19
    .line 20
    .line 21
    iget-boolean p0, v1, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z
    :try_end_16
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_16} :catch_17

    .line 22
    .line 23
    return p0

    .line 24
    :catch_17
    return v0
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
.end method

.method public static u(Landroid/content/Context;)Z
    .registers 2

    .line 1
    invoke-static {p0}, Lax/u3/z;->t(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_f

    .line 6
    .line 7
    invoke-static {p0}, Lax/u3/z;->v(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_d

    .line 12
    .line 13
    goto :goto_f

    .line 14
    :cond_d
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_f
    :goto_f
    const/4 p0, 0x1

    .line 17
    return p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static v(Landroid/content/Context;)Z
    .registers 6

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_8

    .line 7
    .line 8
    return v0

    .line 9
    :cond_8
    invoke-virtual {p0}, Ljava/io/File;->getUsableSpace()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide/32 v3, 0xa00000

    .line 14
    .line 15
    .line 16
    cmp-long p0, v1, v3

    .line 17
    .line 18
    if-gtz p0, :cond_15

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_15
    return v0
.end method

.method public static w(Landroid/content/Context;)Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 10
    .line 11
    and-int/lit8 p0, p0, 0x30

    .line 12
    .line 13
    const/16 v0, 0x20

    .line 14
    .line 15
    if-ne p0, v0, :cond_12

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_12
    const/4 p0, 0x0

    .line 20
    return p0
    .line 21
    .line 22
.end method

.method public static x(Landroid/app/Activity;)Z
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    invoke-static {p0}, Lax/u3/z;->w(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2}, Lax/u3/z;->w(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {p0}, Lax/t3/j;->i(Landroid/content/Context;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne p0, v3, :cond_1a

    .line 23
    .line 24
    if-eqz v1, :cond_1a

    .line 25
    .line 26
    return v3

    .line 27
    :cond_1a
    const/4 v4, 0x2

    .line 28
    if-ne p0, v4, :cond_20

    .line 29
    .line 30
    if-nez v1, :cond_20

    .line 31
    .line 32
    return v3

    .line 33
    :cond_20
    const/4 v4, -0x1

    .line 34
    if-ne p0, v4, :cond_26

    .line 35
    .line 36
    if-eq v2, v1, :cond_29

    .line 37
    .line 38
    return v3

    .line 39
    :cond_26
    if-nez p0, :cond_29

    .line 40
    .line 41
    return v3

    .line 42
    :cond_29
    if-eq v1, v2, :cond_2c

    .line 43
    .line 44
    return v3

    .line 45
    :cond_2c
    return v0
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

.method public static y()Z
    .registers 1

    .line 1
    sget-boolean v0, Lax/u3/z;->c:Z

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

.method private static z(Landroid/content/Context;)Z
    .registers 3

    .line 1
    sget-object v0, Lax/u3/z;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    sget-object v1, Lax/u3/z;->e:Ljava/lang/Boolean;

    .line 5
    .line 6
    if-eqz v1, :cond_12

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_12

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    monitor-exit v0

    .line 16
    return p0

    .line 17
    :catchall_10
    move-exception p0

    .line 18
    goto :goto_22

    .line 19
    :cond_12
    invoke-static {p0}, Lax/u3/z;->r(Landroid/content/Context;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sput-object p0, Lax/u3/z;->e:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    monitor-exit v0

    .line 34
    return p0

    .line 35
    :goto_22
    monitor-exit v0
    :try_end_23
    .catchall {:try_start_3 .. :try_end_23} :catchall_10

    .line 36
    throw p0
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
