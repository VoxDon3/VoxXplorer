.class Lcom/android/ex/photo/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/ex/photo/f;-><init>(Lcom/android/ex/photo/f$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/android/ex/photo/f;


# direct methods
.method constructor <init>(Lcom/android/ex/photo/f;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/android/ex/photo/f$a;->a:Lcom/android/ex/photo/f;

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
.method public onSystemUiVisibilityChange(I)V
    .registers 4

    .line 1
    if-nez p1, :cond_27

    .line 2
    .line 3
    iget-object p1, p0, Lcom/android/ex/photo/f$a;->a:Lcom/android/ex/photo/f;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/android/ex/photo/f;->E(Lcom/android/ex/photo/f;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/16 v0, 0xf06

    .line 10
    .line 11
    if-ne p1, v0, :cond_27

    .line 12
    .line 13
    iget-object p1, p0, Lcom/android/ex/photo/f$a;->a:Lcom/android/ex/photo/f;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->O()Lcom/android/ex/photo/f$g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_27

    .line 20
    .line 21
    iget-object p1, p0, Lcom/android/ex/photo/f$a;->a:Lcom/android/ex/photo/f;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/android/ex/photo/f;->O()Lcom/android/ex/photo/f$g;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Lcom/android/ex/photo/f$g;->r()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_27

    .line 32
    .line 33
    iget-object p1, p0, Lcom/android/ex/photo/f$a;->a:Lcom/android/ex/photo/f;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {p1, v0, v1}, Lcom/android/ex/photo/f;->y0(ZZ)V

    .line 38
    .line 39
    .line 40
    :cond_27
    return-void
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
